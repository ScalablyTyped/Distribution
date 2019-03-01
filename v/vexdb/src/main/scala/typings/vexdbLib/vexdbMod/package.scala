package typings
package vexdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vexdbMod {
  type LiveRequestObject[T] = T with vexdbLib.Anon_Prefetch
  type NumberRequest = scala.Double | js.Array[scala.Double] | NumberRequestValidatorFunction
  type NumberRequestValidatorFunction = js.Function2[
    /* itemValue */ scala.Double, 
    /* item */ ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type StringRequest = java.lang.String | js.Array[java.lang.String] | stdLib.RegExp | StringRequestValidatorFunction
  type StringRequestValidatorFunction = js.Function2[
    /* itemValue */ java.lang.String, 
    /* item */ ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
}
