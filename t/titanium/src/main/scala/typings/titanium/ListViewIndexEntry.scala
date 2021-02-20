package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object that represents an index entry in a `ListView`.
  */
@js.native
trait ListViewIndexEntry extends StObject {
  
  /**
    * Section index associated with this title.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Title to display in the index bar.
    */
  var title: js.UndefOr[String] = js.native
}
object ListViewIndexEntry {
  
  @scala.inline
  def apply(): ListViewIndexEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewIndexEntry]
  }
  
  @scala.inline
  implicit class ListViewIndexEntryMutableBuilder[Self <: ListViewIndexEntry] (val x: Self) extends AnyVal {
    
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
