package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Render extends StObject {
  
  var render: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Render {
  
  inline def apply(render: Requireable[js.Function1[/* repeated */ Any, Any]]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  extension [Self <: Render](x: Self) {
    
    inline def setRender(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
