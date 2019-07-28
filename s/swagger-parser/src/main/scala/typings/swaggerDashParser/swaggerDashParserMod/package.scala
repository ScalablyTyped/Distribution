package typings.swaggerDashParser

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPINs.Document
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashParserMod {
  type $RefsCallback = js.Function2[/* err */ Error | Null, /* $refs */ js.UndefOr[$Refs], js.Any]
  type ApiCallback = js.Function2[/* err */ Error | Null, /* api */ js.UndefOr[Document], js.Any]
}
