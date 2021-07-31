package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeDefinition[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActivityDefinition[TContext, TEvent] {
  
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent, js.Any]) | (PropertyMapper[TContext, TEvent, js.Any])] = js.undefined
  
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String | InvokeSourceDefinition
}
object InvokeDefinition {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](id: String, src: String | InvokeSourceDefinition, `type`: String): InvokeDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class InvokeDefinitionMutableBuilder[Self <: InvokeDefinition[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (InvokeDefinition[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setAutoForward(value: Boolean): Self = StObject.set(x, "autoForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoForwardUndefined: Self = StObject.set(x, "autoForward", js.undefined)
    
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, js.Any]) | (PropertyMapper[TContext, TEvent, js.Any])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => js.Any): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    @scala.inline
    def setSrc(value: String | InvokeSourceDefinition): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
