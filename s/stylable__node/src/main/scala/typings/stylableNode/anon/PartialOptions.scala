package typings.stylableNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/node.@stylable/node/cjs/require-hook.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.native
  
  var ignoreJSModules: js.UndefOr[Boolean] = js.native
  
  var matcher: js.UndefOr[js.Function1[/* filename */ String, Boolean]] = js.native
  
  var runtimePath: js.UndefOr[String] = js.native
  
  var stylableConfig: js.UndefOr[PartialStylableConfig] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = this.set("afterCompile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterCompile: Self = this.set("afterCompile", js.undefined)
    
    @scala.inline
    def setIgnoreJSModules(value: Boolean): Self = this.set("ignoreJSModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreJSModules: Self = this.set("ignoreJSModules", js.undefined)
    
    @scala.inline
    def setMatcher(value: /* filename */ String => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    
    @scala.inline
    def setRuntimePath(value: String): Self = this.set("runtimePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimePath: Self = this.set("runtimePath", js.undefined)
    
    @scala.inline
    def setStylableConfig(value: PartialStylableConfig): Self = this.set("stylableConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylableConfig: Self = this.set("stylableConfig", js.undefined)
  }
}
