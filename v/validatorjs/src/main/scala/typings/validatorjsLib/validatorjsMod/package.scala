package typings
package validatorjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validatorjsMod {
  type AttributeFormatter = js.Function1[/* attribute */ js.Any, js.Any]
  type AttributeNames = org.scalablytyped.runtime.StringDictionary[java.lang.String]
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
  type TypeCheckingRule = org.scalablytyped.runtime.StringDictionary[js.Array[js.Any]]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}
