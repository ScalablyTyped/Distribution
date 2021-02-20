package typings.titanium

import typings.titanium.Titanium.UI.ListSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The arguments for the <Titanium.UI.ListView.itemsselected> event.
  */
@js.native
trait SelectedItem extends StObject {
  
  /**
    * Item index.
    */
  var itemIndex: js.UndefOr[Double] = js.native
  
  /**
    * List section if the item is contained in a list section.
    */
  var section: js.UndefOr[ListSection] = js.native
  
  /**
    * Section index.
    */
  var sectionIndex: js.UndefOr[Double] = js.native
}
object SelectedItem {
  
  @scala.inline
  def apply(): SelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItem]
  }
  
  @scala.inline
  implicit class SelectedItemMutableBuilder[Self <: SelectedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
    
    @scala.inline
    def setSection(value: ListSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndexUndefined: Self = StObject.set(x, "sectionIndex", js.undefined)
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
