package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter for [setMarker](Titanium.UI.ListView.setMarker) and [addMarker](Titanium.UI.ListView.addMarker) methods.
  */
@js.native
trait ListViewMarkerProps extends StObject {
  
  /**
    * The itemIndex of the reference item.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  
  /**
    * The sectionIndex of the reference item.
    */
  var sectionIndex: js.UndefOr[Double] = js.native
}
object ListViewMarkerProps {
  
  @scala.inline
  def apply(): ListViewMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMarkerProps]
  }
  
  @scala.inline
  implicit class ListViewMarkerPropsMutableBuilder[Self <: ListViewMarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndexUndefined: Self = StObject.set(x, "sectionIndex", js.undefined)
  }
}
