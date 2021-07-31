package typings.themeUiComponents

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As[T /* <: ElementType[js.Any] */] extends StObject {
    
    /**
      * form control to render, default Input
      */
    var as: js.UndefOr[T] = js.undefined
  }
  object As {
    
    @scala.inline
    def apply[T /* <: ElementType[js.Any] */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As[?], T /* <: ElementType[js.Any] */] (val x: Self & As[T]) extends AnyVal {
      
      @scala.inline
      def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
}
