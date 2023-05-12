package typings.vueCompilerSfc

import typings.babelParser.mod.ParserPlugin
import typings.babelTypes.mod.Comment
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.RestElement_
import typings.babelTypes.mod.SourceLocation
import typings.babelTypes.mod.TSModuleDeclaration_
import typings.babelTypes.mod.TSTypeAnnotation_
import typings.babelTypes.mod.TSTypeParameterDeclaration_
import typings.sourceMapJs.mod.RawSourceMap
import typings.std.Record
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerSfc.mod.AssetURLOptions
import typings.vueCompilerSfc.mod.AssetURLTagConfig
import typings.vueCompilerSfc.mod.TemplateCompiler
import typings.vueCompilerSfc.mod.TypeScope
import typings.vueCompilerSfc.mod.WithScope
import typings.vueCompilerSfc.vueCompilerSfcStrings.TSMethodSignature
import typings.vueCompilerSfc.vueCompilerSfcStrings.TSPropertySignature
import typings.vueCompilerSfc.vueCompilerSfcStrings.get
import typings.vueCompilerSfc.vueCompilerSfcStrings.method
import typings.vueCompilerSfc.vueCompilerSfcStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  // public prop key
  trait Default extends StObject {
    
    var default: js.UndefOr[Expression] = js.undefined
    
    var local: String
  }
  object Default {
    
    inline def apply(local: String): Default = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Expression): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileExists extends StObject {
    
    def fileExists(file: String): Boolean
    
    def readFile(file: String): js.UndefOr[String]
  }
  object FileExists {
    
    inline def apply(fileExists: String => Boolean, readFile: String => js.UndefOr[String]): FileExists = {
      val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
      __obj.asInstanceOf[FileExists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileExists] (val x: Self) extends AnyVal {
      
      inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    }
  }
  
  trait Ns extends StObject {
    
    var _ns: js.UndefOr[TSModuleDeclaration_ & WithScope] = js.undefined
  }
  object Ns {
    
    inline def apply(): Ns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ns] (val x: Self) extends AnyVal {
      
      inline def set_ns(value: TSModuleDeclaration_ & WithScope): Self = StObject.set(x, "_ns", value.asInstanceOf[js.Any])
      
      inline def set_nsUndefined: Self = StObject.set(x, "_ns", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@vue/compiler-sfc.@vue/compiler-sfc.SFCScriptCompileOptions> */
  trait PartialSFCScriptCompileOp extends StObject {
    
    var babelParserPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
    
    var defineModel: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[FileExists] = js.undefined
    
    var genDefaultAs: js.UndefOr[String] = js.undefined
    
    var globalTypeFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var hoistStatic: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inlineTemplate: js.UndefOr[Boolean] = js.undefined
    
    var isProd: js.UndefOr[Boolean] = js.undefined
    
    var propsDestructure: js.UndefOr[Boolean] = js.undefined
    
    var reactivityTransform: js.UndefOr[Boolean] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var templateOptions: js.UndefOr[PartialSFCTemplateCompile] = js.undefined
  }
  object PartialSFCScriptCompileOp {
    
    inline def apply(): PartialSFCScriptCompileOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSFCScriptCompileOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSFCScriptCompileOp] (val x: Self) extends AnyVal {
      
      inline def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
      
      inline def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
      
      inline def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "babelParserPlugins", js.Array(value*))
      
      inline def setDefineModel(value: Boolean): Self = StObject.set(x, "defineModel", value.asInstanceOf[js.Any])
      
      inline def setDefineModelUndefined: Self = StObject.set(x, "defineModel", js.undefined)
      
      inline def setFs(value: FileExists): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGenDefaultAs(value: String): Self = StObject.set(x, "genDefaultAs", value.asInstanceOf[js.Any])
      
      inline def setGenDefaultAsUndefined: Self = StObject.set(x, "genDefaultAs", js.undefined)
      
      inline def setGlobalTypeFiles(value: js.Array[String]): Self = StObject.set(x, "globalTypeFiles", value.asInstanceOf[js.Any])
      
      inline def setGlobalTypeFilesUndefined: Self = StObject.set(x, "globalTypeFiles", js.undefined)
      
      inline def setGlobalTypeFilesVarargs(value: String*): Self = StObject.set(x, "globalTypeFiles", js.Array(value*))
      
      inline def setHoistStatic(value: Boolean): Self = StObject.set(x, "hoistStatic", value.asInstanceOf[js.Any])
      
      inline def setHoistStaticUndefined: Self = StObject.set(x, "hoistStatic", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
      
      inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
      
      inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
      
      inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
      
      inline def setPropsDestructure(value: Boolean): Self = StObject.set(x, "propsDestructure", value.asInstanceOf[js.Any])
      
      inline def setPropsDestructureUndefined: Self = StObject.set(x, "propsDestructure", js.undefined)
      
      inline def setReactivityTransform(value: Boolean): Self = StObject.set(x, "reactivityTransform", value.asInstanceOf[js.Any])
      
      inline def setReactivityTransformUndefined: Self = StObject.set(x, "reactivityTransform", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTemplateOptions(value: PartialSFCTemplateCompile): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
      
      inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@vue/compiler-sfc.@vue/compiler-sfc.SFCTemplateCompileOptions> */
  trait PartialSFCTemplateCompile extends StObject {
    
    var compiler: js.UndefOr[TemplateCompiler] = js.undefined
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inMap: js.UndefOr[RawSourceMap] = js.undefined
    
    var isProd: js.UndefOr[Boolean] = js.undefined
    
    var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, Any]] = js.undefined
    
    var preprocessLang: js.UndefOr[String] = js.undefined
    
    var preprocessOptions: js.UndefOr[Any] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var slotted: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
    
    var ssrCssVars: js.UndefOr[js.Array[String]] = js.undefined
    
    var transformAssetUrls: js.UndefOr[AssetURLOptions | AssetURLTagConfig | Boolean] = js.undefined
  }
  object PartialSFCTemplateCompile {
    
    inline def apply(): PartialSFCTemplateCompile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSFCTemplateCompile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSFCTemplateCompile] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: TemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInMap(value: RawSourceMap): Self = StObject.set(x, "inMap", value.asInstanceOf[js.Any])
      
      inline def setInMapUndefined: Self = StObject.set(x, "inMap", js.undefined)
      
      inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
      
      inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
      
      inline def setPreprocessCustomRequire(value: /* id */ String => Any): Self = StObject.set(x, "preprocessCustomRequire", js.Any.fromFunction1(value))
      
      inline def setPreprocessCustomRequireUndefined: Self = StObject.set(x, "preprocessCustomRequire", js.undefined)
      
      inline def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
      
      inline def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
      
      inline def setPreprocessOptions(value: Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
      
      inline def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setSlotted(value: Boolean): Self = StObject.set(x, "slotted", value.asInstanceOf[js.Any])
      
      inline def setSlottedUndefined: Self = StObject.set(x, "slotted", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrCssVars(value: js.Array[String]): Self = StObject.set(x, "ssrCssVars", value.asInstanceOf[js.Any])
      
      inline def setSsrCssVarsUndefined: Self = StObject.set(x, "ssrCssVars", js.undefined)
      
      inline def setSsrCssVarsVarargs(value: String*): Self = StObject.set(x, "ssrCssVars", js.Array(value*))
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
      
      inline def setTransformAssetUrls(value: AssetURLOptions | AssetURLTagConfig | Boolean): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
    }
  }
  
  trait ResolvedElements extends StObject {
    
    var _resolvedElements: js.UndefOr[typings.vueCompilerSfc.mod.ResolvedElements] = js.undefined
  }
  object ResolvedElements {
    
    inline def apply(): ResolvedElements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolvedElements]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedElements] (val x: Self) extends AnyVal {
      
      inline def set_resolvedElements(value: typings.vueCompilerSfc.mod.ResolvedElements): Self = StObject.set(x, "_resolvedElements", value.asInstanceOf[js.Any])
      
      inline def set_resolvedElementsUndefined: Self = StObject.set(x, "_resolvedElements", js.undefined)
    }
  }
  
  /* Inlined @babel/types.@babel/types.TSMethodSignature & {  _ownerScope :@vue/compiler-sfc.@vue/compiler-sfc.TypeScope} */
  trait TSMethodSignatureownerSco extends StObject {
    
    var _ownerScope: TypeScope
    
    var computed: Boolean
    
    var end: Double | Null
    
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    var innerComments: js.Array[Comment] | Null
    
    var key: Expression
    
    var kind: method | get | set
    
    var leadingComments: js.Array[Comment] | Null
    
    var loc: SourceLocation | Null
    
    var optional: Boolean | Null
    
    var parameters: js.Array[Identifier_ | RestElement_]
    
    var start: Double | Null
    
    var trailingComments: js.Array[Comment] | Null
    
    var `type`: TSMethodSignature
    
    var typeAnnotation: TSTypeAnnotation_ | Null
    
    var typeParameters: TSTypeParameterDeclaration_ | Null
  }
  object TSMethodSignatureownerSco {
    
    inline def apply(
      _ownerScope: TypeScope,
      computed: Boolean,
      key: Expression,
      kind: method | get | set,
      parameters: js.Array[Identifier_ | RestElement_]
    ): TSMethodSignatureownerSco = {
      val __obj = js.Dynamic.literal(_ownerScope = _ownerScope.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
      __obj.updateDynamic("type")("TSMethodSignature")
      __obj.asInstanceOf[TSMethodSignatureownerSco]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TSMethodSignatureownerSco] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
      
      inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
      
      inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
      
      inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: method | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalNull: Self = StObject.set(x, "optional", null)
      
      inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
      
      inline def setType(value: TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
      
      inline def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
      
      inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
      
      inline def set_ownerScope(value: TypeScope): Self = StObject.set(x, "_ownerScope", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @babel/types.@babel/types.TSPropertySignature & {  _ownerScope :@vue/compiler-sfc.@vue/compiler-sfc.TypeScope} */
  trait TSPropertySignatureownerS extends StObject {
    
    var _ownerScope: TypeScope
    
    var computed: Boolean
    
    var end: Double | Null
    
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    var initializer: Expression | Null
    
    var innerComments: js.Array[Comment] | Null
    
    var key: Expression
    
    var kind: get | set
    
    var leadingComments: js.Array[Comment] | Null
    
    var loc: SourceLocation | Null
    
    var optional: Boolean | Null
    
    var readonly: Boolean | Null
    
    var start: Double | Null
    
    var trailingComments: js.Array[Comment] | Null
    
    var `type`: TSPropertySignature
    
    var typeAnnotation: TSTypeAnnotation_ | Null
  }
  object TSPropertySignatureownerS {
    
    inline def apply(_ownerScope: TypeScope, computed: Boolean, key: Expression, kind: get | set): TSPropertySignatureownerS = {
      val __obj = js.Dynamic.literal(_ownerScope = _ownerScope.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
      __obj.updateDynamic("type")("TSPropertySignature")
      __obj.asInstanceOf[TSPropertySignatureownerS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TSPropertySignatureownerS] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndNull: Self = StObject.set(x, "end", null)
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
      
      inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
      
      inline def setInnerComments(value: js.Array[Comment]): Self = StObject.set(x, "innerComments", value.asInstanceOf[js.Any])
      
      inline def setInnerCommentsNull: Self = StObject.set(x, "innerComments", null)
      
      inline def setInnerCommentsVarargs(value: Comment*): Self = StObject.set(x, "innerComments", js.Array(value*))
      
      inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLeadingComments(value: js.Array[Comment]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
      
      inline def setLeadingCommentsNull: Self = StObject.set(x, "leadingComments", null)
      
      inline def setLeadingCommentsVarargs(value: Comment*): Self = StObject.set(x, "leadingComments", js.Array(value*))
      
      inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocNull: Self = StObject.set(x, "loc", null)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalNull: Self = StObject.set(x, "optional", null)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setTrailingComments(value: js.Array[Comment]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommentsNull: Self = StObject.set(x, "trailingComments", null)
      
      inline def setTrailingCommentsVarargs(value: Comment*): Self = StObject.set(x, "trailingComments", js.Array(value*))
      
      inline def setType(value: TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
      
      inline def set_ownerScope(value: TypeScope): Self = StObject.set(x, "_ownerScope", value.asInstanceOf[js.Any])
    }
  }
}
