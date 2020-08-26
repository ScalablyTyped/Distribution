package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorContext extends js.Object {
  /** [EditorContext.blur(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.blur.html)
    *
    * 编辑器失焦，同时收起键盘。
    *
    * 最低基础库： `2.8.3` */
  def blur(): Unit = js.native
  def blur(option: BlurOption): Unit = js.native
  /** [EditorContext.clear(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.clear.html)
    *
    * 清空编辑器内容
    *
    * 最低基础库： `2.7.0` */
  def clear(): Unit = js.native
  def clear(option: ClearOption): Unit = js.native
  /** [EditorContext.format(string name, string value)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.format.html)
    *
    * 修改样式
    *
    * ****
    *
    * ## 支持设置的样式列表
    * | name                                                      | value                           | verson |
    * | --------------------------------------------------------- | ------------------------------- | ------ |
    * | bold                                                      |                                 | 2.7.0  |
    * | italic                                                    |                                 | 2.7.0  |
    * | underline                                                 |                                 | 2.7.0  |
    * | strike                                                    |                                 | 2.7.0  |
    * | ins                                                       |                                 | 2.7.0  |
    * | script                                                    | sub / super                     | 2.7.0  |
    * | header                                                    | H1 / H2 / h3 / H4 / h5 /  H6    | 2.7.0  |
    * | align                                                     | left / center / right / justify | 2.7.0  |
    * | direction                                                 | rtl                             | 2.7.0  |
    * | indent                                                    | -1 / +1                         | 2.7.0  |
    * | list                                                      | ordered / bullet / check        | 2.7.0  |
    * | color                                                     | hex color                       | 2.7.0  |
    * | backgroundColor                                           | hex color                       | 2.7.0  |
    * | margin/marginTop/marginBottom/marginLeft/marginRight      | css style                       | 2.7.0  |
    * | padding/paddingTop/paddingBottom/paddingLeft/paddingRight | css style                       | 2.7.0  |
    * | font/fontSize/fontStyle/fontVariant/fontWeight/fontFamily | css style                       | 2.7.0  |
    * | lineHeight                                                | css style                       | 2.7.0  |
    * | letterSpacing                                             | css style                       | 2.7.0  |
    * | textDecoration                                            | css style                       | 2.7.0  |
    * | textIndent                                                | css style                       | 2.8.0  |
    * | wordWrap                                                  | css style                       | 2.10.2 |
    * | wordBreak                                                 | css style                       | 2.10.2 |
    * | whiteSpace                                                | css style                       | 2.10.2 |
    *
    * 对已经应用样式的选区设置会取消样式。css style 表示 css 中规定的允许值。
    *
    * 最低基础库： `2.7.0` */
  def format(/** 属性 */
  name: String): Unit = js.native
  def format(/** 属性 */
  name: String, /** 值 */
  value: String): Unit = js.native
  /** [EditorContext.getContents(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.getContents.html)
    *
    * 获取编辑器内容
    *
    * 最低基础库： `2.7.0` */
  def getContents(): Unit = js.native
  def getContents(option: GetContentsOption): Unit = js.native
  /** [EditorContext.getSelectionText(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.getSelectionText.html)
    *
    * 获取编辑器已选区域内的纯文本内容。当编辑器失焦或未选中一段区间时，返回内容为空。
    *
    * 最低基础库： `2.10.2` */
  def getSelectionText(): Unit = js.native
  def getSelectionText(option: GetSelectionTextOption): Unit = js.native
  /** [EditorContext.insertDivider(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.insertDivider.html)
    *
    * 插入分割线
    *
    * 最低基础库： `2.7.0` */
  def insertDivider(): Unit = js.native
  def insertDivider(option: InsertDividerOption): Unit = js.native
  /** [EditorContext.insertImage(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.insertImage.html)
  *
  * 插入图片。
  *
  * 地址为临时文件时，获取的编辑器html格式内容中 <img> 标签增加属性 data-local，delta 格式内容中图片 attributes 属性增加 data-local 字段，该值为传入的临时文件地址。
  *
  * 开发者可选择在提交阶段上传图片到服务器，获取到网络地址后进行替换。替换时对于html内容应替换掉 <img> 的 src 值，对于 delta 内容应替换掉 `insert { image: abc }` 值。
  *
  * **示例代码**
  *
  *
  * ```javascript
  this.editorCtx.insertImage({
    src: 'xx',
    width: '100px',
    height: '50px',
    extClass: className
  })
  ```
  *
  * 最低基础库： `2.7.0` */
  def insertImage(option: InsertImageOption): Unit = js.native
  /** [EditorContext.insertText(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.insertText.html)
    *
    * 覆盖当前选区，设置一段文本
    *
    * 最低基础库： `2.7.0` */
  def insertText(option: InsertTextOption): Unit = js.native
  /** [EditorContext.redo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.redo.html)
    *
    * 恢复
    *
    * 最低基础库： `2.7.0` */
  def redo(): Unit = js.native
  def redo(option: RedoOption): Unit = js.native
  /** [EditorContext.removeFormat(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.removeFormat.html)
    *
    * 清除当前选区的样式
    *
    * 最低基础库： `2.7.0` */
  def removeFormat(): Unit = js.native
  def removeFormat(option: RemoveFormatOption): Unit = js.native
  /** [EditorContext.scrollIntoView()](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.scrollIntoView.html)
    *
    * 使得编辑器光标处滚动到窗口可视区域内。
    *
    * 最低基础库： `2.8.3` */
  def scrollIntoView(): Unit = js.native
  /** [EditorContext.setContents(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.setContents.html)
    *
    * 初始化编辑器内容，html和delta同时存在时仅delta生效
    *
    * 最低基础库： `2.7.0` */
  def setContents(option: SetContentsOption): Unit = js.native
  /** [EditorContext.undo(Object object)](https://developers.weixin.qq.com/miniprogram/dev/api/media/editor/EditorContext.undo.html)
    *
    * 撤销
    *
    * 最低基础库： `2.7.0` */
  def undo(): Unit = js.native
  def undo(option: UndoOption): Unit = js.native
}

