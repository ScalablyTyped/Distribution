package typings.wegameApi

import typings.wegameApi.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSubpackageTask extends StObject {
  
  /**
    * 监听分包加载进度变化事件
    * @param callback.res.progress 分包下载进度百分比
    * @param callback.res.totalBytesWritten 已经下载的数据长度，单位 Bytes
    * @param callback.res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
    */
  def onProgressUpdate(callback: js.Function1[/* res */ Progress, Unit]): Unit
}
object LoadSubpackageTask {
  
  @scala.inline
  def apply(onProgressUpdate: js.Function1[/* res */ Progress, Unit] => Unit): LoadSubpackageTask = {
    val __obj = js.Dynamic.literal(onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[LoadSubpackageTask]
  }
  
  @scala.inline
  implicit class LoadSubpackageTaskMutableBuilder[Self <: LoadSubpackageTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnProgressUpdate(value: js.Function1[/* res */ Progress, Unit] => Unit): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1(value))
  }
}
