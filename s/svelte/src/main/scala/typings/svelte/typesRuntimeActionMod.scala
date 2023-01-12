package typings.svelte

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeActionMod {
  
  type Action[Element, Parameter, Attributes /* <: Record[String, Any] */] = js.Function2[
    /* node */ Element, 
    /* parameter */ js.UndefOr[Parameter], 
    Unit | (ActionReturn[Parameter, Attributes])
  ]
  
  trait ActionReturn[Parameter, Attributes /* <: Record[String, Any] */] extends StObject {
    
    /**
      * ### DO NOT USE THIS
      * This exists solely for type-checking and has no effect at runtime.
      * Set this through the `Attributes` generic instead.
      */
    @JSName("$$_attributes")
    var DollarDollar_attributes: js.UndefOr[Attributes] = js.undefined
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var update: js.UndefOr[js.Function1[/* parameter */ Parameter, Unit]] = js.undefined
  }
  object ActionReturn {
    
    inline def apply[Parameter, Attributes /* <: Record[String, Any] */](): ActionReturn[Parameter, Attributes] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionReturn[Parameter, Attributes]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionReturn[?, ?], Parameter, Attributes /* <: Record[String, Any] */] (val x: Self & (ActionReturn[Parameter, Attributes])) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDollarDollar_attributes(value: Attributes): Self = StObject.set(x, "$$_attributes", value.asInstanceOf[js.Any])
      
      inline def setDollarDollar_attributesUndefined: Self = StObject.set(x, "$$_attributes", js.undefined)
      
      inline def setUpdate(value: /* parameter */ Parameter => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
