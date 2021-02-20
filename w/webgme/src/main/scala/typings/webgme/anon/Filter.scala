package typings.webgme.anon

import typings.webgme.GmeCommon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  var filter: js.Array[Path] = js.native
}
object Filter {
  
  @scala.inline
  def apply(filter: js.Array[Path]): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Array[Path]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVarargs(value: Path*): Self = StObject.set(x, "filter", js.Array(value :_*))
  }
}
