package typings.vueDocgenApi.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pug.mod.Options
import typings.vueDocgenApi.parseScriptMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocGenOptions extends js.Object {
  
  /**
    * Handlers that will be added at the end of the script analysis
    */
  var addScriptHandlers: js.UndefOr[js.Array[Handler]] = js.native
  
  /**
    * Handlers that will be added at the end of the template analysis
    */
  var addTemplateHandlers: js.UndefOr[js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]] = js.native
  
  /**
    * What alias should be replaced in requires and imports
    */
  var alias: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Does parsed components use jsx?
    * @default true - if you do not disable it, babel will fail with `(<any>window).$`
    */
  var jsx: js.UndefOr[Boolean] = js.native
  
  /**
    * What directories should be searched when resolving modules
    */
  var modules: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Which exported variables should be looked at
    * @default undefined - means treat all exports
    */
  var nameFilter: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * all pug options passed to the pug compiler if you use it
    */
  var pugOptions: js.UndefOr[Options] = js.native
  
  /**
    * Handlers that will replace the main script analysis
    */
  var scriptHandlers: js.UndefOr[js.Array[Handler]] = js.native
  
  /**
    * Handlers that will replace the extend and mixins analyzer
    * They will be run before the main component analysis to avoid bleeding onto the main
    */
  var scriptPreHandlers: js.UndefOr[js.Array[Handler]] = js.native
  
  /**
    * Handlers that will replace the template analysis
    */
  var templateHandlers: js.UndefOr[js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]] = js.native
  
  /**
    * Should extended components be parsed?
    * @default `fullFilePath=>!/[\\/]node_modules[\\/]/.test(fullFilePath)`
    */
  var validExtends: js.UndefOr[js.Function1[/* fullFilePath */ String, Boolean]] = js.native
}
object DocGenOptions {
  
  @scala.inline
  def apply(): DocGenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocGenOptions]
  }
  
  @scala.inline
  implicit class DocGenOptionsOps[Self <: DocGenOptions] (val x: Self) extends AnyVal {
    
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
    def setAddScriptHandlersVarargs(value: Handler*): Self = this.set("addScriptHandlers", js.Array(value :_*))
    
    @scala.inline
    def setAddScriptHandlers(value: js.Array[Handler]): Self = this.set("addScriptHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddScriptHandlers: Self = this.set("addScriptHandlers", js.undefined)
    
    @scala.inline
    def setAddTemplateHandlersVarargs(value: typings.vueDocgenApi.parseTemplateMod.Handler*): Self = this.set("addTemplateHandlers", js.Array(value :_*))
    
    @scala.inline
    def setAddTemplateHandlers(value: js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]): Self = this.set("addTemplateHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddTemplateHandlers: Self = this.set("addTemplateHandlers", js.undefined)
    
    @scala.inline
    def setAlias(value: StringDictionary[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setJsx(value: Boolean): Self = this.set("jsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: String*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[String]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setNameFilterVarargs(value: String*): Self = this.set("nameFilter", js.Array(value :_*))
    
    @scala.inline
    def setNameFilter(value: js.Array[String]): Self = this.set("nameFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFilter: Self = this.set("nameFilter", js.undefined)
    
    @scala.inline
    def setPugOptions(value: Options): Self = this.set("pugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePugOptions: Self = this.set("pugOptions", js.undefined)
    
    @scala.inline
    def setScriptHandlersVarargs(value: Handler*): Self = this.set("scriptHandlers", js.Array(value :_*))
    
    @scala.inline
    def setScriptHandlers(value: js.Array[Handler]): Self = this.set("scriptHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptHandlers: Self = this.set("scriptHandlers", js.undefined)
    
    @scala.inline
    def setScriptPreHandlersVarargs(value: Handler*): Self = this.set("scriptPreHandlers", js.Array(value :_*))
    
    @scala.inline
    def setScriptPreHandlers(value: js.Array[Handler]): Self = this.set("scriptPreHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPreHandlers: Self = this.set("scriptPreHandlers", js.undefined)
    
    @scala.inline
    def setTemplateHandlersVarargs(value: typings.vueDocgenApi.parseTemplateMod.Handler*): Self = this.set("templateHandlers", js.Array(value :_*))
    
    @scala.inline
    def setTemplateHandlers(value: js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]): Self = this.set("templateHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateHandlers: Self = this.set("templateHandlers", js.undefined)
    
    @scala.inline
    def setValidExtends(value: /* fullFilePath */ String => Boolean): Self = this.set("validExtends", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidExtends: Self = this.set("validExtends", js.undefined)
  }
}
