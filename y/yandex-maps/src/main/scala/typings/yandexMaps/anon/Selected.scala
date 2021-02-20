package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selected extends StObject {
  
  var selected: js.UndefOr[Boolean] = js.native
}
object Selected {
  
  @scala.inline
  def apply(): Selected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selected]
  }
  
  @scala.inline
  implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
