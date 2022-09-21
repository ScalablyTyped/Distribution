package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ExceptionPathSegment represents a segment in a path that is used to match leafs or nodes in a tree of exceptions.
		If a segment consists of more than one name, it matches the names provided if `negate` is false or missing, or it matches anything except the names provided if `negate` is true.
	*/
trait ExceptionPathSegment extends StObject {
  
  /** Depending on the value of `negate` the names that should match or not match. */
  var names: js.Array[String]
  
  /** If false or missing this segment matches the names provided, otherwise it matches anything except the names provided. */
  var negate: js.UndefOr[Boolean] = js.undefined
}
object ExceptionPathSegment {
  
  inline def apply(names: js.Array[String]): ExceptionPathSegment = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionPathSegment]
  }
  
  extension [Self <: ExceptionPathSegment](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
  }
}
