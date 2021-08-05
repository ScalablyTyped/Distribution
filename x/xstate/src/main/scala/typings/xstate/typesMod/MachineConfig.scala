package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineConfig[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */]
  extends StObject
     with StateNodeConfig[TContext, TStateSchema, TEvent] {
  
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MachineConfig {
  
  inline def apply[TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](): MachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent]]
  }
  
  extension [Self <: MachineConfig[?, ?, ?], TContext, TStateSchema /* <: StateSchema[js.Any] */, TEvent /* <: EventObject */](x: Self & (MachineConfig[TContext, TStateSchema, TEvent])) {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
