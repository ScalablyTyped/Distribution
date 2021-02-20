package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The types of timeline markers supported by the MediaPlayer.
  **/
@js.native
trait MarkerType extends StObject {
  
  var advertisement: String = js.native
  
  var chapter: String = js.native
  
  var custom: String = js.native
}
object MarkerType {
  
  @scala.inline
  def apply(advertisement: String, chapter: String, custom: String): MarkerType = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], chapter = chapter.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerType]
  }
  
  @scala.inline
  implicit class MarkerTypeMutableBuilder[Self <: MarkerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisement(value: String): Self = StObject.set(x, "advertisement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChapter(value: String): Self = StObject.set(x, "chapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
  }
}
