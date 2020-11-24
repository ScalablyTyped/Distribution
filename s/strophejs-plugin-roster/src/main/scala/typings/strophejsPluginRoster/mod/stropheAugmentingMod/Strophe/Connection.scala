package typings.strophejsPluginRoster.mod.stropheAugmentingMod.Strophe

import typings.strophejsPluginRoster.mod.StropheRosterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  var roster: StropheRosterPlugin = js.native
}
object Connection {
  
  @scala.inline
  def apply(roster: StropheRosterPlugin): Connection = {
    val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoster(value: StropheRosterPlugin): Self = this.set("roster", value.asInstanceOf[js.Any])
  }
}
