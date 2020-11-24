package typings.webcomponentsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomElementsPolyfill extends js.Object {
  
  var flags: js.Any = js.native
  
  var hasNative: Boolean = js.native
  
  var ready: Boolean = js.native
  
  var useNative: Boolean = js.native
}
object CustomElementsPolyfill {
  
  @scala.inline
  def apply(flags: js.Any, hasNative: Boolean, ready: Boolean, useNative: Boolean): CustomElementsPolyfill = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], hasNative = hasNative.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomElementsPolyfill]
  }
  
  @scala.inline
  implicit class CustomElementsPolyfillOps[Self <: CustomElementsPolyfill] (val x: Self) extends AnyVal {
    
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
    def setFlags(value: js.Any): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNative(value: Boolean): Self = this.set("hasNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
  }
}
