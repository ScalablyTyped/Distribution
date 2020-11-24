package typings.stylableNode.requireHookMod

import typings.stylableNode.anon.PartialStylableConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var afterCompile: js.UndefOr[js.Function2[/* code */ String, /* filename */ String, String]] = js.native
  
  var ignoreJSModules: js.UndefOr[Boolean] = js.native
  
  def matcher(filename: String): Boolean = js.native
  
  var runtimePath: js.UndefOr[String] = js.native
  
  var stylableConfig: PartialStylableConfig = js.native
}
object Options {
  
  @scala.inline
  def apply(matcher: String => Boolean, stylableConfig: PartialStylableConfig): Options = {
    val __obj = js.Dynamic.literal(matcher = js.Any.fromFunction1(matcher), stylableConfig = stylableConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setMatcher(value: String => Boolean): Self = this.set("matcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylableConfig(value: PartialStylableConfig): Self = this.set("stylableConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCompile(value: (/* code */ String, /* filename */ String) => String): Self = this.set("afterCompile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterCompile: Self = this.set("afterCompile", js.undefined)
    
    @scala.inline
    def setIgnoreJSModules(value: Boolean): Self = this.set("ignoreJSModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreJSModules: Self = this.set("ignoreJSModules", js.undefined)
    
    @scala.inline
    def setRuntimePath(value: String): Self = this.set("runtimePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimePath: Self = this.set("runtimePath", js.undefined)
  }
}
