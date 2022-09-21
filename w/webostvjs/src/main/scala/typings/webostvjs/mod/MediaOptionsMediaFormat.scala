package typings.webostvjs.mod

import typings.webostvjs.webostvjsStrings.audio
import typings.webostvjs.webostvjsStrings.audio_test
import typings.webostvjs.webostvjsStrings.video
import typings.webostvjs.webostvjsStrings.video_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptionsMediaFormat extends StObject {
  
  /**
    * The string that sets media type. The default value is video.
    */
  var `type`: audio | video | video_only | audio_test
}
object MediaOptionsMediaFormat {
  
  inline def apply(`type`: audio | video | video_only | audio_test): MediaOptionsMediaFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaOptionsMediaFormat]
  }
  
  extension [Self <: MediaOptionsMediaFormat](x: Self) {
    
    inline def setType(value: audio | video | video_only | audio_test): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
