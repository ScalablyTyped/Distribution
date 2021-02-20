package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the index bar is clicked by the user.
  */
@js.native
trait TableViewIndexclickEvent extends TableViewBaseEvent {
  
  /**
    * The index number clicked.
    */
  var index: Double = js.native
  
  /**
    * The title of the index clicked.
    */
  var title: String = js.native
}
object TableViewIndexclickEvent {
  
  @scala.inline
  def apply(index: Double, source: TableView, title: String): TableViewIndexclickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableViewIndexclickEvent]
  }
  
  @scala.inline
  implicit class TableViewIndexclickEventMutableBuilder[Self <: TableViewIndexclickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
