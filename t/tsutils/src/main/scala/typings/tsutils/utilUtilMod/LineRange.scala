package typings.tsutils.utilUtilMod

import typings.typescript.mod.TextRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineRange extends TextRange {
  
  var contentLength: Double = js.native
}
object LineRange {
  
  @scala.inline
  def apply(contentLength: Double, end: Double, pos: Double): LineRange = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineRange]
  }
  
  @scala.inline
  implicit class LineRangeMutableBuilder[Self <: LineRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
  }
}
