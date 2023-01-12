package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualityChangeEvent extends StObject {
  
  var quality: VimeoVideoQuality
}
object QualityChangeEvent {
  
  inline def apply(quality: VimeoVideoQuality): QualityChangeEvent = {
    val __obj = js.Dynamic.literal(quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualityChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QualityChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: VimeoVideoQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
