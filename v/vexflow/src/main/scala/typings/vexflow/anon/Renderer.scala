package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  var font: Face = js.native
  
  var renderer: Backend = js.native
  
  var stave: Space = js.native
}
object Renderer {
  
  @scala.inline
  def apply(font: Face, renderer: Backend, stave: Space): Renderer = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], stave = stave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Face): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: Backend): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStave(value: Space): Self = StObject.set(x, "stave", value.asInstanceOf[js.Any])
  }
}
