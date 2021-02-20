package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Escape extends StObject {
  
  var escape: Boolean = js.native
}
object Escape {
  
  @scala.inline
  def apply(escape: Boolean): Escape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escape]
  }
  
  @scala.inline
  implicit class EscapeMutableBuilder[Self <: Escape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
