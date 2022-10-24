package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLiveRegionLiveRegionDottypesMod {
  
  trait LiveRegionProps extends StObject {
    
    /** Specifies a CSS class name to be appended to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Applies a data-hook HTML attribute that can be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object LiveRegionProps {
    
    inline def apply(): LiveRegionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiveRegionProps]
    }
    
    extension [Self <: LiveRegionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
  
  trait LiveRegionRefType extends StObject {
    
    def broadcast(param0: LiveRegionState): Unit
  }
  object LiveRegionRefType {
    
    inline def apply(broadcast: LiveRegionState => Unit): LiveRegionRefType = {
      val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction1(broadcast))
      __obj.asInstanceOf[LiveRegionRefType]
    }
    
    extension [Self <: LiveRegionRefType](x: Self) {
      
      inline def setBroadcast(value: LiveRegionState => Unit): Self = StObject.set(x, "broadcast", js.Any.fromFunction1(value))
    }
  }
  
  trait LiveRegionState extends StObject {
    
    var message: String
    
    var role: js.UndefOr[String] = js.undefined
  }
  object LiveRegionState {
    
    inline def apply(message: String): LiveRegionState = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveRegionState]
    }
    
    extension [Self <: LiveRegionState](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
