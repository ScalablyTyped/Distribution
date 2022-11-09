package typings.vueReactivityTransform

import typings.babelParser.mod.ParserPlugin
import typings.babelTypes.mod.ImportDefaultSpecifier_
import typings.babelTypes.mod.ImportNamespaceSpecifier_
import typings.babelTypes.mod.ImportSpecifier_
import typings.babelTypes.mod.Program_
import typings.magicString.mod.SourceMap
import typings.magicString.mod.default
import typings.std.Record
import typings.vueReactivityTransform.anon.Default
import typings.vueReactivityTransform.anon.ImportedHelpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/reactivity-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldTransform(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldTransform")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transform(src: String): RefTransformResults = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any]).asInstanceOf[RefTransformResults]
  inline def transform(src: String, param1: RefTransformOptions): RefTransformResults = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RefTransformResults]
  
  inline def transformAST(ast: Program_, s: default): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(ast: Program_, s: default, offset: Double): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(ast: Program_, s: default, offset: Double, knownRefs: js.Array[String]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(
    ast: Program_,
    s: default,
    offset: Double,
    knownRefs: js.Array[String],
    knownProps: Record[String, Default]
  ): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(ast: Program_, s: default, offset: Double, knownRefs: Unit, knownProps: Record[String, Default]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(ast: Program_, s: default, offset: Unit, knownRefs: js.Array[String]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(
    ast: Program_,
    s: default,
    offset: Unit,
    knownRefs: js.Array[String],
    knownProps: Record[String, Default]
  ): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  inline def transformAST(ast: Program_, s: default, offset: Unit, knownRefs: Unit, knownProps: Record[String, Default]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
  
  trait ImportBinding extends StObject {
    
    var imported: String
    
    var local: String
    
    var source: String
    
    var specifier: ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_
  }
  object ImportBinding {
    
    inline def apply(
      imported: String,
      local: String,
      source: String,
      specifier: ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_
    ): ImportBinding = {
      val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportBinding]
    }
    
    extension [Self <: ImportBinding](x: Self) {
      
      inline def setImported(value: String): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSpecifier(value: ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefTransformOptions extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var importHelpersFrom: js.UndefOr[String] = js.undefined
    
    var parserPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object RefTransformOptions {
    
    inline def apply(): RefTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefTransformOptions]
    }
    
    extension [Self <: RefTransformOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setImportHelpersFrom(value: String): Self = StObject.set(x, "importHelpersFrom", value.asInstanceOf[js.Any])
      
      inline def setImportHelpersFromUndefined: Self = StObject.set(x, "importHelpersFrom", js.undefined)
      
      inline def setParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "parserPlugins", value.asInstanceOf[js.Any])
      
      inline def setParserPluginsUndefined: Self = StObject.set(x, "parserPlugins", js.undefined)
      
      inline def setParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "parserPlugins", js.Array(value*))
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  trait RefTransformResults extends StObject {
    
    var code: String
    
    var importedHelpers: js.Array[String]
    
    var map: SourceMap | Null
    
    var rootRefs: js.Array[String]
  }
  object RefTransformResults {
    
    inline def apply(code: String, importedHelpers: js.Array[String], rootRefs: js.Array[String]): RefTransformResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], importedHelpers = importedHelpers.asInstanceOf[js.Any], rootRefs = rootRefs.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[RefTransformResults]
    }
    
    extension [Self <: RefTransformResults](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setImportedHelpers(value: js.Array[String]): Self = StObject.set(x, "importedHelpers", value.asInstanceOf[js.Any])
      
      inline def setImportedHelpersVarargs(value: String*): Self = StObject.set(x, "importedHelpers", js.Array(value*))
      
      inline def setMap(value: SourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setRootRefs(value: js.Array[String]): Self = StObject.set(x, "rootRefs", value.asInstanceOf[js.Any])
      
      inline def setRootRefsVarargs(value: String*): Self = StObject.set(x, "rootRefs", js.Array(value*))
    }
  }
}
