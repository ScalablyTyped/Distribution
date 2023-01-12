package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  var font: Face
  
  var renderer: Backend
  
  var stave: Space
}
object Renderer {
  
  inline def apply(font: Face, renderer: Backend, stave: Space): Renderer = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], stave = stave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Face): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Backend): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setStave(value: Space): Self = StObject.set(x, "stave", value.asInstanceOf[js.Any])
  }
}
