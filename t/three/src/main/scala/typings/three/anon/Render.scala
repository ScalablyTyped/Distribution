package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Render extends StObject {
  
  var render: Faces
}
object Render {
  
  inline def apply(render: Faces): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  extension [Self <: Render](x: Self) {
    
    inline def setRender(value: Faces): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
