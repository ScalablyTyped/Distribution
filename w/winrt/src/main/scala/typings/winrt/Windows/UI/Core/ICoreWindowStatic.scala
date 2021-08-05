package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreWindowStatic extends StObject {
  
  def getForCurrentThread(): CoreWindow
}
object ICoreWindowStatic {
  
  inline def apply(getForCurrentThread: () => CoreWindow): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal(getForCurrentThread = js.Any.fromFunction0(getForCurrentThread))
    __obj.asInstanceOf[ICoreWindowStatic]
  }
  
  extension [Self <: ICoreWindowStatic](x: Self) {
    
    inline def setGetForCurrentThread(value: () => CoreWindow): Self = StObject.set(x, "getForCurrentThread", js.Any.fromFunction0(value))
  }
}
