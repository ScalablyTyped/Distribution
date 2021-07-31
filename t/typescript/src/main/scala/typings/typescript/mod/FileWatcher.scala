package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileWatcher extends StObject {
  
  def close(): Unit
}
object FileWatcher {
  
  @scala.inline
  def apply(close: () => Unit): FileWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[FileWatcher]
  }
  
  @scala.inline
  implicit class FileWatcherMutableBuilder[Self <: FileWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
