package typings.tsutils.utilUtilMod

import typings.typescript.mod.TextRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineRange
  extends StObject
     with TextRange {
  
  var contentLength: Double
}
object LineRange {
  
  inline def apply(contentLength: Double, end: Double, pos: Double): LineRange = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineRange]
  }
  
  extension [Self <: LineRange](x: Self) {
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
  }
}
