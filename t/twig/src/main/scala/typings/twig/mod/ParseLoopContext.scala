package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseLoopContext extends StObject {
  
  var first: Boolean
  
  var index: Double
  
  var index0: Double
  
  var last: Boolean
  
  var length: Double
  
  var parent: ParseContext
  
  var revindex: Double
  
  var revindex0: Double
}
object ParseLoopContext {
  
  inline def apply(
    first: Boolean,
    index: Double,
    index0: Double,
    last: Boolean,
    length: Double,
    parent: ParseContext,
    revindex: Double,
    revindex0: Double
  ): ParseLoopContext = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], index0 = index0.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], revindex = revindex.asInstanceOf[js.Any], revindex0 = revindex0.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLoopContext]
  }
  
  extension [Self <: ParseLoopContext](x: Self) {
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndex0(value: Double): Self = StObject.set(x, "index0", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ParseContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRevindex(value: Double): Self = StObject.set(x, "revindex", value.asInstanceOf[js.Any])
    
    inline def setRevindex0(value: Double): Self = StObject.set(x, "revindex0", value.asInstanceOf[js.Any])
  }
}
