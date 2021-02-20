package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rendered extends StObject {
  
  var rendered: String = js.native
}
object Rendered {
  
  @scala.inline
  def apply(rendered: String): Rendered = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  
  @scala.inline
  implicit class RenderedMutableBuilder[Self <: Rendered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
