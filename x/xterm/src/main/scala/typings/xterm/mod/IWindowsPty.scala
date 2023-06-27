package typings.xterm.mod

import typings.xterm.xtermStrings.conpty
import typings.xterm.xtermStrings.winpty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWindowsPty extends StObject {
  
  /**
    * What pty emulation backend is being used.
    */
  var backend: js.UndefOr[conpty | winpty] = js.undefined
  
  /**
    * The Windows build version (eg. 19045)
    */
  var buildNumber: js.UndefOr[Double] = js.undefined
}
object IWindowsPty {
  
  inline def apply(): IWindowsPty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowsPty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWindowsPty] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: conpty | winpty): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    
    inline def setBuildNumber(value: Double): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
  }
}
