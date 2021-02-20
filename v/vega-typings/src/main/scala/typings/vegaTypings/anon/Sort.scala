package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sort extends StObject {
  
  var sort: js.UndefOr[SortField] = js.native
}
object Sort {
  
  @scala.inline
  def apply(): Sort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit class SortMutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
