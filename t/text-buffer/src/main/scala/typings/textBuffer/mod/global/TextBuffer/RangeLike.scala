package typings.textBuffer.mod.global.TextBuffer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface that should be implemented for all "range-compatible" objects. */
trait RangeLike extends StObject {
  
  /** A Point representing the end of the Range. */
  var end: PointLike
  
  /** A Point representing the start of the Range. */
  var start: PointLike
}
object RangeLike {
  
  inline def apply(end: PointLike, start: PointLike): RangeLike = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeLike] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: PointLike): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: PointLike): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
