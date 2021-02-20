package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogList extends TYFlatListData {
  
  @JSName("title")
  var title_DialogList: String = js.native
}
object DialogList {
  
  @scala.inline
  def apply(title: String): DialogList = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogList]
  }
  
  @scala.inline
  implicit class DialogListMutableBuilder[Self <: DialogList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
