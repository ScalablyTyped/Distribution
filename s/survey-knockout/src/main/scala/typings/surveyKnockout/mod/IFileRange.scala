package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileRange extends StObject {
  
  var end: IFilePosition
  
  var start: IFilePosition
}
object IFileRange {
  
  inline def apply(end: IFilePosition, start: IFilePosition): IFileRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRange]
  }
  
  extension [Self <: IFileRange](x: Self) {
    
    inline def setEnd(value: IFilePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: IFilePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
