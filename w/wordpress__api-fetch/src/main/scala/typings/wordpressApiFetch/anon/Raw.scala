package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Raw extends StObject {
  
  var raw: String = js.native
  
  var rendered: String = js.native
}
object Raw {
  
  @scala.inline
  def apply(raw: String, rendered: String): Raw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raw]
  }
  
  @scala.inline
  implicit class RawMutableBuilder[Self <: Raw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
