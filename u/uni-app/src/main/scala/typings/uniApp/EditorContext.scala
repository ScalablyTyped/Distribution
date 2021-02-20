package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorContext extends StObject {
  
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def clear(): Unit = js.native
  def clear(options: EditorContextClearOptions): Unit = js.native
  
  /**
    * 修改样式
    */
  def format(): Unit = js.native
  def format(name: js.UndefOr[scala.Nothing], value: String): Unit = js.native
  def format(name: String): Unit = js.native
  def format(name: String, value: String): Unit = js.native
  
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def getContents(): Unit = js.native
  def getContents(options: EditorContextGetContentsOptions): Unit = js.native
  
  /**
    * 插入分割线
    */
  def insertDivider(): Unit = js.native
  
  /**
    * 获取节点的相关信息，需要获取的字段在fields中指定
    */
  def insertImage(): Unit = js.native
  def insertImage(options: EditorContextInsertImageOptions): Unit = js.native
  
  /**
    * 添加节点的 Context 对象查询请求
    */
  def insertText(): Unit = js.native
  def insertText(options: EditorContextInsertTextOptions): Unit = js.native
  
  /**
    * 撤销
    */
  def redo(): Unit = js.native
  def redo(options: EditorContextRedoOptions): Unit = js.native
  
  /**
    * 清除当前选区的样式
    */
  def removeFormat(): Unit = js.native
  def removeFormat(options: EditorContextRemoveFormatOptions): Unit = js.native
  
  /**
    * 初始化编辑器内容，hmlt和delta同时存在时仅delta生效
    */
  def setContents(): Unit = js.native
  def setContents(options: EditorContextSetContentsOptions): Unit = js.native
  
  /**
    * 撤销
    */
  def undo(): Unit = js.native
  def undo(options: EditorContextUndoOptions): Unit = js.native
}
