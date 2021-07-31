package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends StObject {
  
  /**
    * 中断上传任务
    */
  def abort(): Unit = js.native
  
  /**
    * 监听上传进度变化
    */
  def onProgressUpdate(): Unit = js.native
  def onProgressUpdate(callback: js.Function1[/* result */ OnProgressUpdateResult, Unit]): Unit = js.native
}
