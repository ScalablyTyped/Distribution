package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorContext extends js.Object {
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def clear(): scala.Unit = js.native
  def clear(options: EditorContextClearOptions): scala.Unit = js.native
  /**
    * 修改样式
    */
  def format(): scala.Unit = js.native
  def format(name: java.lang.String): scala.Unit = js.native
  def format(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def getContents(): scala.Unit = js.native
  def getContents(options: EditorContextGetContentsOptions): scala.Unit = js.native
  /**
    * 插入分割线
    */
  def insertDivider(): scala.Unit = js.native
  /**
    * 获取节点的相关信息，需要获取的字段在fields中指定
    */
  def insertImage(): scala.Unit = js.native
  def insertImage(options: EditorContextInsertImageOptions): scala.Unit = js.native
  /**
    * 添加节点的 Context 对象查询请求
    */
  def insertText(): scala.Unit = js.native
  def insertText(options: EditorContextInsertTextOptions): scala.Unit = js.native
  /**
    * 撤销
    */
  def redo(): scala.Unit = js.native
  def redo(options: EditorContextRedoOptions): scala.Unit = js.native
  /**
    * 清除当前选区的样式
    */
  def removeFormat(): scala.Unit = js.native
  def removeFormat(options: EditorContextRemoveFormatOptions): scala.Unit = js.native
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def setContents(): scala.Unit = js.native
  def setContents(options: EditorContextSetContentsOptions): scala.Unit = js.native
  /**
    * 撤销
    */
  def undo(): scala.Unit = js.native
  def undo(options: EditorContextUndoOptions): scala.Unit = js.native
}

