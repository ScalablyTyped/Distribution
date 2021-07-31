package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.parseMod.SFCDescriptor
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.condense
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.line
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.preserve
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ErrorWithRange extends StObject {
    
    var end: Double
    
    var msg: String
    
    var start: Double
  }
  object ErrorWithRange {
    
    @scala.inline
    def apply(end: Double, msg: String, start: Double): ErrorWithRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithRange]
    }
    
    @scala.inline
    implicit class ErrorWithRangeMutableBuilder[Self <: ErrorWithRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawSourceMap
    extends StObject
       with StartOfSourceMap {
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: String
  }
  object RawSourceMap {
    
    @scala.inline
    def apply(mappings: String, names: js.Array[String], sources: js.Array[String], version: String): RawSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawSourceMap]
    }
    
    @scala.inline
    implicit class RawSourceMapMutableBuilder[Self <: RawSourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartOfSourceMap extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var sourceRoot: js.UndefOr[String] = js.undefined
  }
  object StartOfSourceMap {
    
    @scala.inline
    def apply(): StartOfSourceMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOfSourceMap]
    }
    
    @scala.inline
    implicit class StartOfSourceMapMutableBuilder[Self <: StartOfSourceMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  @js.native
  trait VueTemplateCompiler extends StObject {
    
    def compile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
    
    def parseComponent(source: String): SFCDescriptor = js.native
    def parseComponent(source: String, options: js.Any): SFCDescriptor = js.native
    
    def ssrCompile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
  }
  
  trait VueTemplateCompilerOptions extends StObject {
    
    var directives: js.UndefOr[StringDictionary[js.Function]] = js.undefined
    
    var modules: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var outputSourceRange: js.UndefOr[Boolean] = js.undefined
    
    var whitespace: js.UndefOr[preserve | condense] = js.undefined
  }
  object VueTemplateCompilerOptions {
    
    @scala.inline
    def apply(): VueTemplateCompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueTemplateCompilerOptions]
    }
    
    @scala.inline
    implicit class VueTemplateCompilerOptionsMutableBuilder[Self <: VueTemplateCompilerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectives(value: StringDictionary[js.Function]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
      
      @scala.inline
      def setModules(value: js.Array[js.Object]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setModulesVarargs(value: js.Object*): Self = StObject.set(x, "modules", js.Array(value :_*))
      
      @scala.inline
      def setOutputSourceRange(value: Boolean): Self = StObject.set(x, "outputSourceRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSourceRangeUndefined: Self = StObject.set(x, "outputSourceRange", js.undefined)
      
      @scala.inline
      def setWhitespace(value: preserve | condense): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  trait VueTemplateCompilerParseOptions extends StObject {
    
    var pad: js.UndefOr[line | space] = js.undefined
  }
  object VueTemplateCompilerParseOptions {
    
    @scala.inline
    def apply(): VueTemplateCompilerParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueTemplateCompilerParseOptions]
    }
    
    @scala.inline
    implicit class VueTemplateCompilerParseOptionsMutableBuilder[Self <: VueTemplateCompilerParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPad(value: line | space): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    }
  }
  
  trait VueTemplateCompilerResults extends StObject {
    
    var ast: js.UndefOr[js.Object] = js.undefined
    
    var errors: js.Array[String | ErrorWithRange]
    
    var render: String
    
    var staticRenderFns: js.Array[String]
    
    var tips: js.Array[String | ErrorWithRange]
  }
  object VueTemplateCompilerResults {
    
    @scala.inline
    def apply(
      errors: js.Array[String | ErrorWithRange],
      render: String,
      staticRenderFns: js.Array[String],
      tips: js.Array[String | ErrorWithRange]
    ): VueTemplateCompilerResults = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueTemplateCompilerResults]
    }
    
    @scala.inline
    implicit class VueTemplateCompilerResultsMutableBuilder[Self <: VueTemplateCompilerResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: js.Object): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setErrors(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[String]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: String*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
      
      @scala.inline
      def setTips(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "tips", js.Array(value :_*))
    }
  }
}
