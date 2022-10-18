package typings.uifabricUtilities

import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseComponentDottypesMod {
  
  trait IBaseProps[T] extends StObject {
    
    var componentRef: js.UndefOr[IRefObject[T]] = js.undefined
  }
  object IBaseProps {
    
    inline def apply[T](): IBaseProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseProps[T]]
    }
    
    extension [Self <: IBaseProps[?], T](x: Self & IBaseProps[T]) {
      
      inline def setComponentRef(value: IRefObject[T]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ T | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    }
  }
}
