package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Harsh extends StObject {
  
  var harsh: Boolean = js.native
  
  var wave_girth: Double = js.native
  
  var wave_height: Double = js.native
  
  var wave_width: Double = js.native
}
object Harsh {
  
  @scala.inline
  def apply(harsh: Boolean, wave_girth: Double, wave_height: Double, wave_width: Double): Harsh = {
    val __obj = js.Dynamic.literal(harsh = harsh.asInstanceOf[js.Any], wave_girth = wave_girth.asInstanceOf[js.Any], wave_height = wave_height.asInstanceOf[js.Any], wave_width = wave_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Harsh]
  }
  
  @scala.inline
  implicit class HarshMutableBuilder[Self <: Harsh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHarsh(value: Boolean): Self = StObject.set(x, "harsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWave_girth(value: Double): Self = StObject.set(x, "wave_girth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWave_height(value: Double): Self = StObject.set(x, "wave_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWave_width(value: Double): Self = StObject.set(x, "wave_width", value.asInstanceOf[js.Any])
  }
}
