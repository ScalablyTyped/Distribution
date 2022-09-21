package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Restore extends StObject {
  
  def restore(): Unit
}
object Restore {
  
  inline def apply(restore: () => Unit): Restore = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore))
    __obj.asInstanceOf[Restore]
  }
  
  extension [Self <: Restore](x: Self) {
    
    inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
  }
}
