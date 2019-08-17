package typings.validatorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validatorjsMod {
  import org.scalablytyped.runtime.StringDictionary

  type AttributeFormatter = js.Function1[/* attribute */ js.Any, js.Any]
  type AttributeNames = StringDictionary[String]
  type RegisterAsyncCallback = js.Function4[
    /* value */ String | Double | Boolean, 
    /* args */ String, 
    /* attribute */ String, 
    /* passes */ js.Function2[/* success */ js.UndefOr[Boolean], /* message */ js.UndefOr[String], Unit], 
    Unit
  ]
  type RegisterCallback = js.Function3[
    /* value */ String | Double | Boolean, 
    /* args */ String, 
    /* attribute */ String, 
    Boolean
  ]
  type TypeCheckingRule = StringDictionary[js.Array[js.Any]]
  type ValidationErrors = StringDictionary[js.Array[String]]
}
