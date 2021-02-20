package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bpm extends StObject {
  
  var bpm: Double = js.native
  
  var dots: Double = js.native
  
  var duration: String = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Bpm {
  
  @scala.inline
  def apply(bpm: Double, dots: Double, duration: String): Bpm = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bpm]
  }
  
  @scala.inline
  implicit class BpmMutableBuilder[Self <: Bpm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBpm(value: Double): Self = StObject.set(x, "bpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
