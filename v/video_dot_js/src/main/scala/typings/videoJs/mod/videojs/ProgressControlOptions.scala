package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressControlOptions
  extends StObject
     with ComponentOptions {
  
  var seekBar: js.UndefOr[Boolean] = js.undefined
}
object ProgressControlOptions {
  
  inline def apply(): ProgressControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressControlOptions] (val x: Self) extends AnyVal {
    
    inline def setSeekBar(value: Boolean): Self = StObject.set(x, "seekBar", value.asInstanceOf[js.Any])
    
    inline def setSeekBarUndefined: Self = StObject.set(x, "seekBar", js.undefined)
  }
}
