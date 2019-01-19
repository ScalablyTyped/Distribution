package typings
package validatorjsLib.validatorjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ValidatorNs {
  type AttributeFormatter = js.Function1[/* attribute */ js.Any, js.Any]
  type RegisterAsyncCallback = js.Function4[
    /* value */ java.lang.String | scala.Double | scala.Boolean, 
    /* args */ java.lang.String, 
    /* attribute */ java.lang.String, 
    /* passes */ js.Function2[
      /* success */ js.UndefOr[scala.Boolean], 
      /* message */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type RegisterCallback = js.Function3[
    /* value */ java.lang.String | scala.Double | scala.Boolean, 
    /* args */ java.lang.String, 
    /* attribute */ java.lang.String, 
    scala.Boolean
  ]
}
