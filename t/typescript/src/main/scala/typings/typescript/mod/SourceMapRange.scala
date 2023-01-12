package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapRange
  extends StObject
     with TextRange {
  
  var source: js.UndefOr[SourceMapSource] = js.undefined
}
object SourceMapRange {
  
  inline def apply(end: Double, pos: Double): SourceMapRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceMapRange] (val x: Self) extends AnyVal {
    
    inline def setSource(value: SourceMapSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
