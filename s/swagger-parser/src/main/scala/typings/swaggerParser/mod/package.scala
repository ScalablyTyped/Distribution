package typings.swaggerParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApiCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* api */ js.UndefOr[typings.openapiTypes.mod.OpenAPI.Document], 
    js.Any
  ]
  type RefsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* $refs */ js.UndefOr[typings.swaggerParser.mod.Refs], 
    js.Any
  ]
}
