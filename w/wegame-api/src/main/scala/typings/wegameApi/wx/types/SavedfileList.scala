package typings.wegameApi.wx.types

import typings.wegameApi.anon.CreateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedfileList extends StObject {
  
  var fileList: CreateTime = js.native
}
object SavedfileList {
  
  @scala.inline
  def apply(fileList: CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedfileList]
  }
  
  @scala.inline
  implicit class SavedfileListMutableBuilder[Self <: SavedfileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileList(value: CreateTime): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
