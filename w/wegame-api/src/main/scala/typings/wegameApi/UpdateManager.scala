package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManager extends StObject {
  
  /**
    * 应用更新包并重启
    */
  def applyUpdate(): Unit
  
  /**
    * 监听检查更新结果回调
    */
  def onCheckForUpdate(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听更新包下载失败回调
    */
  def onUpdateFailed(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听更新包下载成功回调
    */
  def onUpdateReady(callback: js.Function0[Unit]): Unit
}
object UpdateManager {
  
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function0[Unit] => Unit,
    onUpdateFailed: js.Function0[Unit] => Unit,
    onUpdateReady: js.Function0[Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  
  @scala.inline
  implicit class UpdateManagerMutableBuilder[Self <: UpdateManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyUpdate(value: () => Unit): Self = StObject.set(x, "applyUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCheckForUpdate(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onCheckForUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateFailed(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onUpdateFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUpdateReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onUpdateReady", js.Any.fromFunction1(value))
  }
}
