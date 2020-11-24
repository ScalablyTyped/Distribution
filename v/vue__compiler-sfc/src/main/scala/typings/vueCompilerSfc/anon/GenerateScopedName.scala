package typings.vueCompilerSfc.anon

import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCase
import typings.vueCompilerSfc.vueCompilerSfcStrings.camelCaseOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashes
import typings.vueCompilerSfc.vueCompilerSfcStrings.dashesOnly
import typings.vueCompilerSfc.vueCompilerSfcStrings.global
import typings.vueCompilerSfc.vueCompilerSfcStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateScopedName extends js.Object {
  
  var generateScopedName: js.UndefOr[
    String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])
  ] = js.native
  
  var globalModulePaths: js.UndefOr[js.Array[String]] = js.native
  
  var hashPrefix: js.UndefOr[String] = js.native
  
  var localsConvention: js.UndefOr[camelCase | camelCaseOnly | dashes | dashesOnly] = js.native
  
  var scopeBehaviour: js.UndefOr[global | local] = js.native
}
object GenerateScopedName {
  
  @scala.inline
  def apply(): GenerateScopedName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateScopedName]
  }
  
  @scala.inline
  implicit class GenerateScopedNameOps[Self <: GenerateScopedName] (val x: Self) extends AnyVal {
    
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
    def setGenerateScopedNameFunction3(value: (/* name */ String, /* filename */ String, /* css */ String) => String): Self = this.set("generateScopedName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGenerateScopedName(value: String | (js.Function3[/* name */ String, /* filename */ String, /* css */ String, String])): Self = this.set("generateScopedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateScopedName: Self = this.set("generateScopedName", js.undefined)
    
    @scala.inline
    def setGlobalModulePathsVarargs(value: String*): Self = this.set("globalModulePaths", js.Array(value :_*))
    
    @scala.inline
    def setGlobalModulePaths(value: js.Array[String]): Self = this.set("globalModulePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalModulePaths: Self = this.set("globalModulePaths", js.undefined)
    
    @scala.inline
    def setHashPrefix(value: String): Self = this.set("hashPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashPrefix: Self = this.set("hashPrefix", js.undefined)
    
    @scala.inline
    def setLocalsConvention(value: camelCase | camelCaseOnly | dashes | dashesOnly): Self = this.set("localsConvention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalsConvention: Self = this.set("localsConvention", js.undefined)
    
    @scala.inline
    def setScopeBehaviour(value: global | local): Self = this.set("scopeBehaviour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeBehaviour: Self = this.set("scopeBehaviour", js.undefined)
  }
}
