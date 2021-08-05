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
    
    inline def apply(cancel: String, ok: String): Cancel = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    }
  }
  
  trait Svg extends StObject {
    
    var svg: js.Promise[js.Any]
  }
  object Svg {
    
    inline def apply(svg: js.Promise[js.Any]): Svg = {
      val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    extension [Self <: Svg](x: Self) {
      
      inline def setSvg(value: js.Promise[js.Any]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
}
