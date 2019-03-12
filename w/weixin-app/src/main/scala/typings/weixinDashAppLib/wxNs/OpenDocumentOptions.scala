package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文件路径，可通过 downFile 获得
  		 */
  var filePath: java.lang.String
  /**
  		 * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
  		 */
  var fileType: js.UndefOr[
    weixinDashAppLib.weixinDashAppLibStrings.doc | weixinDashAppLib.weixinDashAppLibStrings.xls | weixinDashAppLib.weixinDashAppLibStrings.ppt | weixinDashAppLib.weixinDashAppLibStrings.pdf | weixinDashAppLib.weixinDashAppLibStrings.docx | weixinDashAppLib.weixinDashAppLibStrings.xlsx | weixinDashAppLib.weixinDashAppLibStrings.pptx
  ] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    fileType: weixinDashAppLib.weixinDashAppLibStrings.doc | weixinDashAppLib.weixinDashAppLibStrings.xls | weixinDashAppLib.weixinDashAppLibStrings.ppt | weixinDashAppLib.weixinDashAppLibStrings.pdf | weixinDashAppLib.weixinDashAppLibStrings.docx | weixinDashAppLib.weixinDashAppLibStrings.xlsx | weixinDashAppLib.weixinDashAppLibStrings.pptx = null,
    success: js.Any => scala.Unit = null
  ): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

