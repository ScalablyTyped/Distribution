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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: `-st-default`
  
  var `extends`: `-st-extends`
  
  var from: `-st-from`
  
  var global: `-st-global`
  
  var mixin: `-st-mixin`
  
  var named: `-st-named`
  
  var partialMixin: `-st-partial-mixin`
  
  var root: `-st-root`
  
  var states: `-st-states`
}
object Default {
  
  @scala.inline
  def apply(): Default = {
    val __obj = js.Dynamic.literal(default = "-st-default", from = "-st-from", global = "-st-global", mixin = "-st-mixin", named = "-st-named", partialMixin = "-st-partial-mixin", root = "-st-root", states = "-st-states")
    __obj.updateDynamic("extends")("-st-extends")
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: `-st-default`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: `-st-extends`): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: `-st-from`): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobal(value: `-st-global`): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixin(value: `-st-mixin`): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: `-st-named`): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMixin(value: `-st-partial-mixin`): Self = StObject.set(x, "partialMixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: `-st-root`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: `-st-states`): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
