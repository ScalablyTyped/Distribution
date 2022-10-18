package typings.vscodeLanguageserver.anon

import typings.vscodeLanguageserver.libCommonServerMod.RemoteWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var window: RemoteWindow
}
object Window {
  
  inline def apply(window: RemoteWindow): Window = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setWindow(value: RemoteWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
