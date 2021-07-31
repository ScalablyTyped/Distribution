package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beatvalue extends StObject {
  
  var beat_value: js.UndefOr[Double] = js.undefined
  
  var num_beats: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
}
object Beatvalue {
  
  @scala.inline
  def apply(): Beatvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beatvalue]
  }
  
  @scala.inline
  implicit class BeatvalueMutableBuilder[Self <: Beatvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeat_value(value: Double): Self = StObject.set(x, "beat_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeat_valueUndefined: Self = StObject.set(x, "beat_value", js.undefined)
    
    @scala.inline
    def setNum_beats(value: Double): Self = StObject.set(x, "num_beats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_beatsUndefined: Self = StObject.set(x, "num_beats", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
