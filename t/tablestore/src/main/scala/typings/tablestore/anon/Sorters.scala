package typings.tablestore.anon

import typings.tablestore.mod.Sorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorters extends StObject {
  
  var sorters: js.Array[Sorter]
}
object Sorters {
  
  inline def apply(sorters: js.Array[Sorter]): Sorters = {
    val __obj = js.Dynamic.literal(sorters = sorters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sorters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorters] (val x: Self) extends AnyVal {
    
    inline def setSorters(value: js.Array[Sorter]): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersVarargs(value: Sorter*): Self = StObject.set(x, "sorters", js.Array(value*))
  }
}
