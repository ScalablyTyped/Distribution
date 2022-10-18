package typings.tabris.anon

import typings.tabris.mod.ListenersKeysOf
import typings.tabris.tabrisStrings.Asterisk
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.strict
import typings.tabris.tabrisStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12`[Target] extends StObject {
  
  var mode: js.UndefOr[default | strict] = js.undefined
  
  var trigger: js.UndefOr[ListenersKeysOf[Target] | update | Asterisk | js.Symbol] = js.undefined
}
object `12` {
  
  inline def apply[Target](): `12`[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`[Target]]
  }
  
  extension [Self <: `12`[?], Target](x: Self & `12`[Target]) {
    
    inline def setMode(value: default | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setTrigger(value: ListenersKeysOf[Target] | update | Asterisk | js.Symbol): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
