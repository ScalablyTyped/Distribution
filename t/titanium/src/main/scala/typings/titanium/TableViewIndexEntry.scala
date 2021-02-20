package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object that represents an index entry in a `TableView`.
  */
@js.native
trait TableViewIndexEntry extends StObject {
  
  /**
    * Row index associated with this item.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Title to display in the index bar for this item.
    */
  var title: js.UndefOr[String] = js.native
}
object TableViewIndexEntry {
  
  @scala.inline
  def apply(): TableViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableViewIndexEntry]
  }
  
  @scala.inline
  implicit class TableViewIndexEntryMutableBuilder[Self <: TableViewIndexEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
