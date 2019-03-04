package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  var source: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.view | vegaDashTypingsLib.vegaDashTypingsLibStrings.scope
  ] = js.undefined
  var `type`: vegaDashTypingsLib.typesSpecStreamMod.EventType
}

object Anon_Scope {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.typesSpecStreamMod.EventType,
    source: vegaDashTypingsLib.vegaDashTypingsLibStrings.view | vegaDashTypingsLib.vegaDashTypingsLibStrings.scope = null
  ): Anon_Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scope]
  }
}

