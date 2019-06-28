package typings
package swaggerDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circular extends js.Object {
  /**
    * Determines whether circular `$ref` pointers are handled.
    *
    * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
    *
    * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
    */
  var circular: js.UndefOr[scala.Boolean | swaggerDashParserLib.swaggerDashParserLibStrings.ignore] = js.undefined
}

object Anon_Circular {
  @scala.inline
  def apply(circular: scala.Boolean | swaggerDashParserLib.swaggerDashParserLibStrings.ignore = null): Anon_Circular = {
    val __obj = js.Dynamic.literal()
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Circular]
  }
}

