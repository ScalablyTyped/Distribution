package typings.swcCore

import org.scalablytyped.runtime.StringDictionary
import typings.swcCore.anon.FileName
import typings.swcCore.anon.IsModule
import typings.swcCore.anon.Target
import typings.swcCore.spackMod.BundleInput
import typings.swcCore.typesMod.JsMinifyOptions
import typings.swcCore.typesMod.Module
import typings.swcCore.typesMod.Options
import typings.swcCore.typesMod.Output
import typings.swcCore.typesMod.ParseOptions
import typings.swcCore.typesMod.Plugin
import typings.swcCore.typesMod.Program
import typings.swcCore.typesMod.Script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@swc/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@swc/core", "Compiler")
  @js.native
  open class Compiler () extends StObject {
    
    def bundle(): js.Promise[StringDictionary[Output]] = js.native
    def bundle(options: String): js.Promise[StringDictionary[Output]] = js.native
    def bundle(options: BundleInput): js.Promise[StringDictionary[Output]] = js.native
    
    /* private */ var fallbackBindingsPluginWarningDisplayed: Any = js.native
    
    def minify(src: String): js.Promise[Output] = js.native
    def minify(src: String, opts: JsMinifyOptions): js.Promise[Output] = js.native
    
    def minifySync(src: String): Output = js.native
    def minifySync(src: String, opts: JsMinifyOptions): Output = js.native
    
    def parse(src: String): js.Promise[Module] = js.native
    def parse(src: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = js.native
    def parse(src: String, options: Unit, filename: String): js.Promise[Module] = js.native
    def parse(src: String, options: ParseOptions, filename: String): js.Promise[Module] = js.native
    
    def parseFile(path: String): js.Promise[Module] = js.native
    def parseFile(path: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = js.native
    
    def parseFileSync(path: String): Module = js.native
    def parseFileSync(path: String, options: ParseOptions & IsModule): Script = js.native
    @JSName("parseFileSync")
    def parseFileSync_Module(path: String, options: ParseOptions): Module = js.native
    
    def parseSync(src: String): Module = js.native
    def parseSync(src: String, options: ParseOptions & IsModule): Script = js.native
    def parseSync(src: String, options: Unit, filename: String): Module = js.native
    def parseSync(src: String, options: ParseOptions, filename: String): Module = js.native
    @JSName("parseSync")
    def parseSync_Module(src: String, options: ParseOptions): Module = js.native
    
    /**
      * Note: this method should be invoked on the compiler instance used
      *  for `parse()` / `parseSync()`.
      */
    def print(m: Program): js.Promise[Output] = js.native
    def print(m: Program, options: Options): js.Promise[Output] = js.native
    
    /**
      * Note: this method should be invoked on the compiler instance used
      *  for `parse()` / `parseSync()`.
      */
    def printSync(m: Program): Output = js.native
    def printSync(m: Program, options: Options): Output = js.native
    
    def transform(src: String): js.Promise[Output] = js.native
    def transform(src: String, options: Options): js.Promise[Output] = js.native
    def transform(src: Program): js.Promise[Output] = js.native
    def transform(src: Program, options: Options): js.Promise[Output] = js.native
    
    def transformFile(path: String): js.Promise[Output] = js.native
    def transformFile(path: String, options: Options): js.Promise[Output] = js.native
    
    def transformFileSync(path: String): Output = js.native
    def transformFileSync(path: String, options: Options): Output = js.native
    
    def transformSync(src: String): Output = js.native
    def transformSync(src: String, options: Options): Output = js.native
    def transformSync(src: Program): Output = js.native
    def transformSync(src: Program, options: Options): Output = js.native
  }
  
  @JSImport("@swc/core", "DEFAULT_EXTENSIONS")
  @js.native
  val DEFAULT_EXTENSIONS: js.Array[String] = js.native
  
  inline def bundle(): js.Promise[StringDictionary[Output]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")().asInstanceOf[js.Promise[StringDictionary[Output]]]
  inline def bundle(options: String): js.Promise[StringDictionary[Output]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StringDictionary[Output]]]
  inline def bundle(options: BundleInput): js.Promise[StringDictionary[Output]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StringDictionary[Output]]]
  
  inline def experimentalRegisterGlobalTraceConfig(traceConfig: FileName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__experimental_registerGlobalTraceConfig")(traceConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getBinaryMetadata(): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryMetadata")().asInstanceOf[Target]
  
  inline def minify(src: String): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
  inline def minify(src: String, opts: JsMinifyOptions): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  
  inline def minifySync(src: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("minifySync")(src.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def minifySync(src: String, opts: JsMinifyOptions): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("minifySync")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  inline def parse(src: String): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  inline def parse(src: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Script]]
  
  inline def parseFile(path: String): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  inline def parseFile(path: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Script]]
  
  inline def parseFileSync(path: String): Module = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Module]
  inline def parseFileSync(path: String, options: ParseOptions & IsModule): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def parseFileSync_Module(path: String, options: ParseOptions): Module = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Module]
  
  inline def parseSync(src: String): Module = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any]).asInstanceOf[Module]
  inline def parseSync(src: String, options: ParseOptions & IsModule): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Script]
  
  inline def parseSync_Module(src: String, options: ParseOptions): Module = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Module]
  
  inline def plugins(ps: js.Array[Plugin]): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("plugins")(ps.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  inline def print(m: Program): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(m.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
  inline def print(m: Program, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(m.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  
  inline def printSync(m: Program): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("printSync")(m.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def printSync(m: Program, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("printSync")(m.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  inline def transform(src: String): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
  inline def transform(src: String, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  inline def transform(src: Program): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
  inline def transform(src: Program, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  
  inline def transformFile(path: String): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
  inline def transformFile(path: String, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
  
  inline def transformFileSync(path: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def transformFileSync(path: String, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  inline def transformSync(src: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def transformSync(src: String, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  inline def transformSync(src: Program): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def transformSync(src: Program, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  @JSImport("@swc/core", "version")
  @js.native
  val version: Any = js.native
}
