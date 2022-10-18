package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultEncodingOptions extends StObject {
  
  /**
    * **NOTE:** use the H.264 video codec
    * @default 'libx264'
    */
  @JSName("c:v")
  var cColonv: String
  
  /**
    * **NOTE:** use stdin as a source
    * @default 'pipe:0'
    */
  var i: String
  
  /**
    * **NOTE:** use the yuv420p pixel format (the most widely supported)
    * @default 'yuv420p'
    */
  var pix_fmt: String
  
  /**
    * **NOTE:** use the `ultrafast` compression preset
    * @default 'ultrafast'
    */
  var preset: String
  
  /**
    * Specifies a custom frame rate (FPS).
    * @default 30
    */
  var r: Double
  
  /**
    * **NOTE:** use the time when a frame is read from the source as its timestamp
    *
    * **IMPORTANT:** must be specified before configuring the source
    * @default 1
    */
  var use_wallclock_as_timestamps: Double
  
  /**
    * **NOTE:** scale input frames to make the frame height divisible by 2 (yuv420p's requirement)
    * @default 'scale=trunc(iw/2)*2:trunc(ih/2)*2'
    */
  var vf: String
  
  /**
    * **NOTE:** overwrite output files without asking for a confirmation
    * @default true
    */
  var y: Boolean
}
object DefaultEncodingOptions {
  
  inline def apply(
    cColonv: String,
    i: String,
    pix_fmt: String,
    preset: String,
    r: Double,
    use_wallclock_as_timestamps: Double,
    vf: String,
    y: Boolean
  ): DefaultEncodingOptions = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], pix_fmt = pix_fmt.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], use_wallclock_as_timestamps = use_wallclock_as_timestamps.asInstanceOf[js.Any], vf = vf.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("c:v")(cColonv.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultEncodingOptions]
  }
  
  extension [Self <: DefaultEncodingOptions](x: Self) {
    
    inline def setCColonv(value: String): Self = StObject.set(x, "c:v", value.asInstanceOf[js.Any])
    
    inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    inline def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setUse_wallclock_as_timestamps(value: Double): Self = StObject.set(x, "use_wallclock_as_timestamps", value.asInstanceOf[js.Any])
    
    inline def setVf(value: String): Self = StObject.set(x, "vf", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
