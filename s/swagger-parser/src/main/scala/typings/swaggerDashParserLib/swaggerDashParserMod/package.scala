package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashParserMod {
  type $RefsCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type ApiCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* api */ js.UndefOr[openapiDashTypesLib.openapiDashTypesMod.OpenAPINs.Document], 
    js.Any
  ]
}
