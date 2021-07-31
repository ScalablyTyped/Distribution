package typings.tabris.anon

import typings.tabris.mod.ListenersKeysOf
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.strict
import typings.tabris.tabrisStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[Target] extends StObject {
  
  var mode: js.UndefOr[default | strict] = js.undefined
  
  var trigger: js.UndefOr[ListenersKeysOf[Target] | update | js.Symbol] = js.undefined
}
object `9` {
  
  @scala.inline
  def apply[Target](): `9`[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`[Target]]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`[?], Target] (val x: Self & `9`[Target]) extends AnyVal {
    
    @scala.inline
    def setMode(value: default | strict): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTrigger(value: ListenersKeysOf[Target] | update | js.Symbol): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
