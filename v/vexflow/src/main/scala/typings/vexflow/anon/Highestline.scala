package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highestline extends StObject {
  
  var highest_line: Double
  
  var lowest_line: Double
  
  var y_bottom: Double
  
  var y_top: Double
}
object Highestline {
  
  @scala.inline
  def apply(highest_line: Double, lowest_line: Double, y_bottom: Double, y_top: Double): Highestline = {
    val __obj = js.Dynamic.literal(highest_line = highest_line.asInstanceOf[js.Any], lowest_line = lowest_line.asInstanceOf[js.Any], y_bottom = y_bottom.asInstanceOf[js.Any], y_top = y_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highestline]
  }
  
  @scala.inline
  implicit class HighestlineMutableBuilder[Self <: Highestline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighest_line(value: Double): Self = StObject.set(x, "highest_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowest_line(value: Double): Self = StObject.set(x, "lowest_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_bottom(value: Double): Self = StObject.set(x, "y_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_top(value: Double): Self = StObject.set(x, "y_top", value.asInstanceOf[js.Any])
  }
}
