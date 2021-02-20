package typings.uifabricUtilities

import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseComponentTypesMod {
  
  @js.native
  trait IBaseProps[T] extends StObject {
    
    var componentRef: js.UndefOr[IRefObject[T]] = js.native
  }
  object IBaseProps {
    
    @scala.inline
    def apply[T](): IBaseProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseProps[T]]
    }
    
    @scala.inline
    implicit class IBasePropsMutableBuilder[Self <: IBaseProps[_], T] (val x: Self with IBaseProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[T]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ T | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    }
  }
}
