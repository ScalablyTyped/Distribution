package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRange extends StObject {
  
  var end: Double
  
  var pos: Double
}
object TextRange {
  
  @scala.inline
  def apply(end: Double, pos: Double): TextRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRange]
  }
  
  @scala.inline
  implicit class TextRangeMutableBuilder[Self <: TextRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
