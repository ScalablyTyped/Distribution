package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.doc
import typings.wechatMiniprogram.wechatMiniprogramStrings.docx
import typings.wechatMiniprogram.wechatMiniprogramStrings.pdf
import typings.wechatMiniprogram.wechatMiniprogramStrings.ppt
import typings.wechatMiniprogram.wechatMiniprogramStrings.pptx
import typings.wechatMiniprogram.wechatMiniprogramStrings.xls
import typings.wechatMiniprogram.wechatMiniprogramStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDocumentOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[OpenDocumentCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[OpenDocumentFailCallback] = js.undefined
  
  /** 文件路径 (本地路径) ，可通过 downloadFile 获得 */
  var filePath: String
  
  /** 文件类型，指定文件类型打开文件
    *
    * 可选值：
    * - 'doc': doc 格式;
    * - 'docx': docx 格式;
    * - 'xls': xls 格式;
    * - 'xlsx': xlsx 格式;
    * - 'ppt': ppt 格式;
    * - 'pptx': pptx 格式;
    * - 'pdf': pdf 格式;
    *
    * 最低基础库： `1.4.0` */
  var fileType: js.UndefOr[doc | docx | xls | xlsx | ppt | pptx | pdf] = js.undefined
  
  /** 是否显示右上角菜单
    *
    * 最低基础库： `2.11.0` */
  var showMenu: js.UndefOr[Boolean] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[OpenDocumentSuccessCallback] = js.undefined
}
object OpenDocumentOption {
  
  @scala.inline
  def apply(filePath: String): OpenDocumentOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOption]
  }
  
  @scala.inline
  implicit class OpenDocumentOptionMutableBuilder[Self <: OpenDocumentOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: doc | docx | xls | xlsx | ppt | pptx | pdf): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMenuUndefined: Self = StObject.set(x, "showMenu", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
