package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestObjectsMod {
  type NumberRequest = scala.Double | js.Array[scala.Double] | typings.vexdb.requestObjectsMod.NumberRequestValidatorFunction
  type NumberRequestValidatorFunction = js.Function2[
    /* itemValue */ scala.Double, 
    /* item */ typings.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type StringRequest = java.lang.String | js.Array[java.lang.String] | typings.std.RegExp | typings.vexdb.requestObjectsMod.StringRequestValidatorFunction
  type StringRequestValidatorFunction = js.Function2[
    /* itemValue */ java.lang.String, 
    /* item */ typings.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
}
