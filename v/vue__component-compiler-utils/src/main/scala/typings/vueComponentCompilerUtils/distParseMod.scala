package typings.vueComponentCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.distTypesMod.RawSourceMap
import typings.vueComponentCompilerUtils.distTypesMod.VueTemplateCompiler
import typings.vueComponentCompilerUtils.distTypesMod.VueTemplateCompilerParseOptions
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  @JSImport("@vue/component-compiler-utils/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(options: ParseOptions): SFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[SFCDescriptor]
  
  trait ParseOptions extends StObject {
    
    var compiler: VueTemplateCompiler
    
    var compilerParseOptions: js.UndefOr[VueTemplateCompilerParseOptions] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var needMap: js.UndefOr[Boolean] = js.undefined
    
    var source: String
    
    var sourceRoot: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(compiler: VueTemplateCompiler, source: String): ParseOptions = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerParseOptions(value: VueTemplateCompilerParseOptions): Self = StObject.set(x, "compilerParseOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerParseOptionsUndefined: Self = StObject.set(x, "compilerParseOptions", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setNeedMap(value: Boolean): Self = StObject.set(x, "needMap", value.asInstanceOf[js.Any])
      
      inline def setNeedMapUndefined: Self = StObject.set(x, "needMap", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
  
  trait SFCBlock
    extends StObject
       with SFCCustomBlock {
    
    var lang: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String | Boolean] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object SFCBlock {
    
    inline def apply(
      attrs: StringDictionary[String | `true`],
      content: String,
      end: Double,
      start: Double,
      `type`: String
    ): SFCBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCBlock] (val x: Self) extends AnyVal {
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setModule(value: String | Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait SFCCustomBlock extends StObject {
    
    var attrs: StringDictionary[String | `true`]
    
    var content: String
    
    var end: Double
    
    var map: js.UndefOr[RawSourceMap] = js.undefined
    
    var start: Double
    
    var `type`: String
  }
  object SFCCustomBlock {
    
    inline def apply(
      attrs: StringDictionary[String | `true`],
      content: String,
      end: Double,
      start: Double,
      `type`: String
    ): SFCCustomBlock = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFCCustomBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCCustomBlock] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: StringDictionary[String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFCDescriptor extends StObject {
    
    var customBlocks: js.Array[SFCCustomBlock]
    
    var script: SFCBlock | Null
    
    var styles: js.Array[SFCBlock]
    
    var template: SFCBlock | Null
  }
  object SFCDescriptor {
    
    inline def apply(customBlocks: js.Array[SFCCustomBlock], styles: js.Array[SFCBlock]): SFCDescriptor = {
      val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], script = null, template = null)
      __obj.asInstanceOf[SFCDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
      
      inline def setCustomBlocks(value: js.Array[SFCCustomBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
      
      inline def setCustomBlocksVarargs(value: SFCCustomBlock*): Self = StObject.set(x, "customBlocks", js.Array(value*))
      
      inline def setScript(value: SFCBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setStyles(value: js.Array[SFCBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: SFCBlock*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTemplate(value: SFCBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateNull: Self = StObject.set(x, "template", null)
    }
  }
}
