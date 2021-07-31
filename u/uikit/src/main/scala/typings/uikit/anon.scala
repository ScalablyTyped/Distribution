package typings.uikit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var cancel: String
    
    var ok: String
  }
  object Cancel {
    
    @scala.inline
    def apply(cancel: String, ok: String): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait Svg extends StObject {
    
    var svg: js.Promise[js.Any]
  }
  object Svg {
    
    @scala.inline
    def apply(svg: js.Promise[js.Any]): Svg = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    @scala.inline
    implicit class SvgMutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSvg(value: js.Promise[js.Any]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
