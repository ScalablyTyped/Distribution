package typings.toastifyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ShowToast extends StObject {
    
    def showToast(): Unit
  }
  object ShowToast {
    
    @scala.inline
    def apply(showToast: () => Unit): ShowToast = {
      val __obj = js.Dynamic.literal(showToast = js.Any.fromFunction0(showToast))
      __obj.asInstanceOf[ShowToast]
    }
    
    @scala.inline
    implicit class ShowToastMutableBuilder[Self <: ShowToast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowToast(value: () => Unit): Self = StObject.set(x, "showToast", js.Any.fromFunction0(value))
    }
  }
}
