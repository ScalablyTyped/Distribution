package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typings.pug.mod.Options
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseScriptMod.Handler
import typings.vueDocgenApi.vueDocgenApiStrings.js_
import typings.vueDocgenApi.vueDocgenApiStrings.ts
import typings.vueInbrowserCompilerUtils.typesMod.Descriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("vue-docgen-api/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseFile(opt: ParseOptions): js.Promise[js.Array[default]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[default]]]
  @scala.inline
  def parseFile(opt: ParseOptions, documentation: default): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(opt.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  
  @scala.inline
  def parseSource(source: String, opt: ParseOptions): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSource")(source.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  @scala.inline
  def parseSource(source: String, opt: ParseOptions, documentation: default): js.Promise[js.Array[default]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSource")(source.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[default]]]
  
  trait DocGenOptions extends StObject {
    
    /**
      * Handlers that will be added at the end of the script analysis
      */
    var addScriptHandlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    /**
      * Handlers that will be added at the end of the template analysis
      */
    var addTemplateHandlers: js.UndefOr[js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]] = js.undefined
    
    /**
      * What alias should be replaced in requires and imports
      */
    var alias: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Does parsed components use jsx?
      * @default true - if you do not disable it, babel will fail with `(<any>window).$`
      */
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What directories should be searched when resolving modules
      */
    var modules: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Which exported variables should be looked at
      * @default undefined - means treat all exports
      */
    var nameFilter: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * all pug options passed to the pug compiler if you use it
      */
    var pugOptions: js.UndefOr[Options] = js.undefined
    
    /**
      * Handlers that will replace the main script analysis
      */
    var scriptHandlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    /**
      * Handlers that will replace the extend and mixins analyzer
      * They will be run before the main component analysis to avoid bleeding onto the main
      */
    var scriptPreHandlers: js.UndefOr[js.Array[Handler]] = js.undefined
    
    /**
      * Handlers that will replace the template analysis
      */
    var templateHandlers: js.UndefOr[js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]] = js.undefined
    
    /**
      * Should extended components be parsed?
      * @default `fullFilePath=>!/[\\/]node_modules[\\/]/.test(fullFilePath)`
      */
    var validExtends: js.UndefOr[js.Function1[/* fullFilePath */ String, Boolean]] = js.undefined
  }
  object DocGenOptions {
    
    @scala.inline
    def apply(): DocGenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocGenOptions]
    }
    
    @scala.inline
    implicit class DocGenOptionsMutableBuilder[Self <: DocGenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddScriptHandlers(value: js.Array[Handler]): Self = StObject.set(x, "addScriptHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddScriptHandlersUndefined: Self = StObject.set(x, "addScriptHandlers", js.undefined)
      
      @scala.inline
      def setAddScriptHandlersVarargs(value: Handler*): Self = StObject.set(x, "addScriptHandlers", js.Array(value :_*))
      
      @scala.inline
      def setAddTemplateHandlers(value: js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]): Self = StObject.set(x, "addTemplateHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddTemplateHandlersUndefined: Self = StObject.set(x, "addTemplateHandlers", js.undefined)
      
      @scala.inline
      def setAddTemplateHandlersVarargs(value: typings.vueDocgenApi.parseTemplateMod.Handler*): Self = StObject.set(x, "addTemplateHandlers", js.Array(value :_*))
      
      @scala.inline
      def setAlias(value: StringDictionary[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      @scala.inline
      def setNameFilter(value: js.Array[String]): Self = StObject.set(x, "nameFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFilterUndefined: Self = StObject.set(x, "nameFilter", js.undefined)
      
      @scala.inline
      def setNameFilterVarargs(value: String*): Self = StObject.set(x, "nameFilter", js.Array(value :_*))
      
      @scala.inline
      def setPugOptions(value: Options): Self = StObject.set(x, "pugOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPugOptionsUndefined: Self = StObject.set(x, "pugOptions", js.undefined)
      
      @scala.inline
      def setScriptHandlers(value: js.Array[Handler]): Self = StObject.set(x, "scriptHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptHandlersUndefined: Self = StObject.set(x, "scriptHandlers", js.undefined)
      
      @scala.inline
      def setScriptHandlersVarargs(value: Handler*): Self = StObject.set(x, "scriptHandlers", js.Array(value :_*))
      
      @scala.inline
      def setScriptPreHandlers(value: js.Array[Handler]): Self = StObject.set(x, "scriptPreHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPreHandlersUndefined: Self = StObject.set(x, "scriptPreHandlers", js.undefined)
      
      @scala.inline
      def setScriptPreHandlersVarargs(value: Handler*): Self = StObject.set(x, "scriptPreHandlers", js.Array(value :_*))
      
      @scala.inline
      def setTemplateHandlers(value: js.Array[typings.vueDocgenApi.parseTemplateMod.Handler]): Self = StObject.set(x, "templateHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateHandlersUndefined: Self = StObject.set(x, "templateHandlers", js.undefined)
      
      @scala.inline
      def setTemplateHandlersVarargs(value: typings.vueDocgenApi.parseTemplateMod.Handler*): Self = StObject.set(x, "templateHandlers", js.Array(value :_*))
      
      @scala.inline
      def setValidExtends(value: /* fullFilePath */ String => Boolean): Self = StObject.set(x, "validExtends", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidExtendsUndefined: Self = StObject.set(x, "validExtends", js.undefined)
    }
  }
  
  trait ParseOptions
    extends StObject
       with DocGenOptions
       with Descriptor {
    
    var filePath: String
    
    /**
      * In what language is the component written
      * @default undefined - let the system decide
      */
    var lang: js.UndefOr[ts | js_] = js.undefined
    
    @JSName("validExtends")
    def validExtends_MParseOptions(fullFilePath: String): Boolean
  }
  object ParseOptions {
    
    @scala.inline
    def apply(filePath: String, validExtends: String => Boolean): ParseOptions = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], validExtends = js.Any.fromFunction1(validExtends))
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: ts | js_): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setValidExtends(value: String => Boolean): Self = StObject.set(x, "validExtends", js.Any.fromFunction1(value))
    }
  }
}
