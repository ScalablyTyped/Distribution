package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOptions extends StObject {
  
  /**
    * Specifies whether to record only failed tests.
    */
  var failedOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the path to the FFmpeg codec executable.
    */
  var ffmpegPath: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom pattern that defines how TestCafe composes the relative path to a video file.
    */
  var pathPattern: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to save the entire recording as a single file.
    */
  var singleFile: js.UndefOr[Boolean] = js.undefined
}
object VideoOptions {
  
  inline def apply(): VideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOptions]
  }
  
  extension [Self <: VideoOptions](x: Self) {
    
    inline def setFailedOnly(value: Boolean): Self = StObject.set(x, "failedOnly", value.asInstanceOf[js.Any])
    
    inline def setFailedOnlyUndefined: Self = StObject.set(x, "failedOnly", js.undefined)
    
    inline def setFfmpegPath(value: String): Self = StObject.set(x, "ffmpegPath", value.asInstanceOf[js.Any])
    
    inline def setFfmpegPathUndefined: Self = StObject.set(x, "ffmpegPath", js.undefined)
    
    inline def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    inline def setPathPatternUndefined: Self = StObject.set(x, "pathPattern", js.undefined)
    
    inline def setSingleFile(value: Boolean): Self = StObject.set(x, "singleFile", value.asInstanceOf[js.Any])
    
    inline def setSingleFileUndefined: Self = StObject.set(x, "singleFile", js.undefined)
  }
}
