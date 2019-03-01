package typings
package swaggerDashParserLib.swaggerDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[swaggerDashParserLib.Anon_Circular] = js.undefined
  var allow: js.UndefOr[swaggerDashParserLib.Anon_Empty] = js.undefined
  var cache: js.UndefOr[swaggerDashParserLib.Anon_Fs] = js.undefined
  var validate: js.UndefOr[swaggerDashParserLib.Anon_Schema] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    $ref: swaggerDashParserLib.Anon_Circular = null,
    allow: swaggerDashParserLib.Anon_Empty = null,
    cache: swaggerDashParserLib.Anon_Fs = null,
    validate: swaggerDashParserLib.Anon_Schema = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Options]
  }
}

