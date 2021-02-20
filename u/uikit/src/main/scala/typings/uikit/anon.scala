package typings.uikit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel extends StObject {
    
    var cancel: String = js.native
    
    var ok: String = js.native
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
  
  @js.native
  trait Svg extends StObject {
    
    var svg: js.Promise[_] = js.native
  }
  object Svg {
    
    @scala.inline
    def apply(svg: js.Promise[_]): Svg = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    @scala.inline
    implicit class SvgMutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSvg(value: js.Promise[_]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
