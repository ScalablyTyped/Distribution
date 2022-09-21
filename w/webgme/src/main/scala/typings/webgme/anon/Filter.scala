package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.Array[Path]
}
object Filter {
  
  inline def apply(filter: js.Array[Path]): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: js.Array[Path]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: Path*): Self = StObject.set(x, "filter", js.Array(value*))
  }
}
