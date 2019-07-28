package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecStreamMod.EventType
import typings.vegaDashTypings.vegaDashTypingsStrings.scope
import typings.vegaDashTypings.vegaDashTypingsStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scope extends js.Object {
  var source: js.UndefOr[view | scope] = js.undefined
  var `type`: EventType
}

object Anon_Scope {
  @scala.inline
  def apply(`type`: EventType, source: view | scope = null): Anon_Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Scope]
  }
}

