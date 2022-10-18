package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<testcafe.testcafe.<global>.DefaultEncodingOptions> */
trait VideoEncodingOptions
  extends StObject
     with /**
  * https://ffmpeg.org/ffmpeg.html#Options
  *
  * custom ffmpeg options
  */
/* option */ StringDictionary[Any] {
  
  /**
    * Specifies the video's aspect ratio.
    *
    * Can be set to '4:3', '16:9', etc.
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  @JSName("c:v")
  var cColonv: js.UndefOr[String] = js.undefined
  
  var i: js.UndefOr[String] = js.undefined
  
  var pix_fmt: js.UndefOr[String] = js.undefined
  
  var preset: js.UndefOr[String] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var use_wallclock_as_timestamps: js.UndefOr[Double] = js.undefined
  
  var vf: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[Boolean] = js.undefined
}
object VideoEncodingOptions {
  
  inline def apply(): VideoEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncodingOptions]
  }
  
  extension [Self <: VideoEncodingOptions](x: Self) {
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setCColonv(value: String): Self = StObject.set(x, "c:v", value.asInstanceOf[js.Any])
    
    inline def setCColonvUndefined: Self = StObject.set(x, "c:v", js.undefined)
    
    inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
    
    inline def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
    
    inline def setPix_fmtUndefined: Self = StObject.set(x, "pix_fmt", js.undefined)
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setUse_wallclock_as_timestamps(value: Double): Self = StObject.set(x, "use_wallclock_as_timestamps", value.asInstanceOf[js.Any])
    
    inline def setUse_wallclock_as_timestampsUndefined: Self = StObject.set(x, "use_wallclock_as_timestamps", js.undefined)
    
    inline def setVf(value: String): Self = StObject.set(x, "vf", value.asInstanceOf[js.Any])
    
    inline def setVfUndefined: Self = StObject.set(x, "vf", js.undefined)
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
