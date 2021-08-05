package typings.tabris.anon

import typings.tabris.mod.ListenersKeysOf
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.strict
import typings.tabris.tabrisStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode[Target] extends StObject {
  
  var mode: js.UndefOr[default | strict] = js.undefined
  
  var trigger: js.UndefOr[ListenersKeysOf[Target] | update | js.Symbol] = js.undefined
}
object Mode {
  
  inline def apply[Target](): Mode[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode[Target]]
  }
  
  extension [Self <: Mode[?], Target](x: Self & Mode[Target]) {
    
    inline def setMode(value: default | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTrigger(value: ListenersKeysOf[Target] | update | js.Symbol): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
