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

