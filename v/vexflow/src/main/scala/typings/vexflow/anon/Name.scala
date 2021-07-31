package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var bpm: Double
  
  var dots: Boolean
  
  var duration: String
  
  var name: js.UndefOr[String] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(bpm: Double, dots: Boolean, duration: String): Name = {
    val __obj = js.Dynamic.literal(bpm = bpm.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBpm(value: Double): Self = StObject.set(x, "bpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
