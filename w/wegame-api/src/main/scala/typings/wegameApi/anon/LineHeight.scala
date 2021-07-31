package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var lineHeight: Double
}
object LineHeight {
  
  @scala.inline
  def apply(lineHeight: Double): LineHeight = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  @scala.inline
  implicit class LineHeightMutableBuilder[Self <: LineHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
