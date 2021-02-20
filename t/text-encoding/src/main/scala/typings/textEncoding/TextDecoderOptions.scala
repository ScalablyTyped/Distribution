package typings.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderOptions extends StObject {
  
  var stream: js.UndefOr[Boolean] = js.native
}
object TextDecoderOptions {
  
  @scala.inline
  def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  
  @scala.inline
  implicit class TextDecoderOptionsMutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
