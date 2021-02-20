package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[String] = js.native
}
object MachineConfig {
  
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](): MachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class MachineConfigMutableBuilder[Self <: MachineConfig[_, _, _], TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (MachineConfig[TContext, TStateSchema, TEvent])) extends AnyVal {
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
