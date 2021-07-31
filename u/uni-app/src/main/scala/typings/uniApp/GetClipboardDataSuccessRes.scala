package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClipboardDataSuccessRes extends StObject {
  
  /**
    * 剪贴板的内容
    */
  var data: js.UndefOr[String] = js.undefined
}
object GetClipboardDataSuccessRes {
  
  @scala.inline
  def apply(): GetClipboardDataSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardDataSuccessRes]
  }
  
  @scala.inline
  implicit class GetClipboardDataSuccessResMutableBuilder[Self <: GetClipboardDataSuccessRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
