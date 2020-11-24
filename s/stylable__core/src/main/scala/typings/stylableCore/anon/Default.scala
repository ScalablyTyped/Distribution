package typings.stylableCore.anon

import typings.stylableCore.stylableCoreStrings.`-st-default`
import typings.stylableCore.stylableCoreStrings.`-st-extends`
import typings.stylableCore.stylableCoreStrings.`-st-from`
import typings.stylableCore.stylableCoreStrings.`-st-global`
import typings.stylableCore.stylableCoreStrings.`-st-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-named`
import typings.stylableCore.stylableCoreStrings.`-st-partial-mixin`
import typings.stylableCore.stylableCoreStrings.`-st-root`
import typings.stylableCore.stylableCoreStrings.`-st-states`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends js.Object {
  
  var default: `-st-default` = js.native
  
  var `extends`: `-st-extends` = js.native
  
  var from: `-st-from` = js.native
  
  var global: `-st-global` = js.native
  
  var mixin: `-st-mixin` = js.native
  
  var named: `-st-named` = js.native
  
  var partialMixin: `-st-partial-mixin` = js.native
  
  var root: `-st-root` = js.native
  
  var states: `-st-states` = js.native
}
object Default {
  
  @scala.inline
  def apply(
    default: `-st-default`,
    `extends`: `-st-extends`,
    from: `-st-from`,
    global: `-st-global`,
    mixin: `-st-mixin`,
    named: `-st-named`,
    partialMixin: `-st-partial-mixin`,
    root: `-st-root`,
    states: `-st-states`
  ): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], mixin = mixin.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], partialMixin = partialMixin.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: `-st-default`): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: `-st-extends`): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: `-st-from`): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: `-st-global`): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixin(value: `-st-mixin`): Self = this.set("mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: `-st-named`): Self = this.set("named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMixin(value: `-st-partial-mixin`): Self = this.set("partialMixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: `-st-root`): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: `-st-states`): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
