package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineConfig[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TTypesMeta]
  extends StObject
     with StateNodeConfig[NoInfer[TContext], TStateSchema, NoInfer[TEvent], TAction] {
  
  /**
    * The initial context (extended state)
    */
  var context: js.UndefOr[LowInfer[TContext | js.Function0[TContext]]] = js.undefined
  
  var schema: js.UndefOr[MachineSchema[TContext, TEvent, TServiceMap]] = js.undefined
  
  var tsTypes: js.UndefOr[TTypesMeta] = js.undefined
  
  /**
    * The machine's own version.
    */
  var version: js.UndefOr[String] = js.undefined
}
object MachineConfig {
  
  inline def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TTypesMeta](): MachineConfig[TContext, TStateSchema, TEvent, TAction, TServiceMap, TTypesMeta] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineConfig[TContext, TStateSchema, TEvent, TAction, TServiceMap, TTypesMeta]]
  }
  
  extension [Self <: MachineConfig[?, ?, ?, ?, ?, ?], TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */, TServiceMap /* <: ServiceMap */, TTypesMeta](x: Self & (MachineConfig[TContext, TStateSchema, TEvent, TAction, TServiceMap, TTypesMeta])) {
    
    inline def setContext(value: LowInfer[TContext | js.Function0[TContext]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextFunction0(value: () => TContext): Self = StObject.set(x, "context", js.Any.fromFunction0(value))
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setSchema(value: MachineSchema[TContext, TEvent, TServiceMap]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTsTypes(value: TTypesMeta): Self = StObject.set(x, "tsTypes", value.asInstanceOf[js.Any])
    
    inline def setTsTypesUndefined: Self = StObject.set(x, "tsTypes", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
