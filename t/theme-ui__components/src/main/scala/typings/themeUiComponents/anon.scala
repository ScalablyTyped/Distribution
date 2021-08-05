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
    
    inline def apply[T /* <: ElementType[js.Any] */](): As[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As[T]]
    }
    
    extension [Self <: As[?], T /* <: ElementType[js.Any] */](x: Self & As[T]) {
      
      inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    }
  }
}
