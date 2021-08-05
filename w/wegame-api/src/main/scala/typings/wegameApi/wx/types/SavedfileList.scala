package typings.wegameApi.wx.types

import typings.wegameApi.anon.CreateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedfileList extends StObject {
  
  var fileList: CreateTime
}
object SavedfileList {
  
  inline def apply(fileList: CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedfileList]
  }
  
  extension [Self <: SavedfileList](x: Self) {
    
    inline def setFileList(value: CreateTime): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
