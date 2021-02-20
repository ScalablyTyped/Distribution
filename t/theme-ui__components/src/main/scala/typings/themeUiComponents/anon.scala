package typings.themeUiComponents

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait As[T /* <: ElementType[_] */] extends StObject {
    
    /**
      * form control to render, default Input
      */
    var as: js.UndefOr[T] = js.native
  }
  object As {
    
    @scala.inline
    def apply[T /* <: ElementType[_] */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As[_], T /* <: ElementType[_] */] (val x: Self with As[T]) extends AnyVal {
      
      @scala.inline
      def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
}
