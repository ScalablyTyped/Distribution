package typings.twineSugarcube.uiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadScreenAPI extends js.Object {
  
  /**
    * Acquires a loading screen lock and returns its ID. Displays the loading screen, if necessary.
    * @since 2.15.0
    */
  def lock(): Double = js.native
  
  /**
    * Releases the loading screen lock with the given ID. Hides the loading screen, if no other locks exist.
    * @param lockId The loading screen lock ID.
    * @since 2.15.0
    * @example
    * var lockId = LoadScreen.lock();
    * // Do something whose timing is unpredictable that should be hidden by the loading screen
    * LoadScreen.unlock(lockId);
    */
  def unlock(lockId: Double): Unit = js.native
}
object LoadScreenAPI {
  
  @scala.inline
  def apply(lock: () => Double, unlock: Double => Unit): LoadScreenAPI = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction1(unlock))
    __obj.asInstanceOf[LoadScreenAPI]
  }
  
  @scala.inline
  implicit class LoadScreenAPIOps[Self <: LoadScreenAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLock(value: () => Double): Self = this.set("lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlock(value: Double => Unit): Self = this.set("unlock", js.Any.fromFunction1(value))
  }
}
