package typings.typedoc

import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsMod.Options
import typings.typedoc.typedocStrings.expand
import typings.typedoc.typedocStrings.packages
import typings.typedoc.typedocStrings.resolve
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointMod {
  
  @JSImport("typedoc/dist/lib/utils/entry-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[keyof { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.resolve
    - typings.typedoc.typedocStrings.expand
    - typings.typedoc.typedocStrings.packages
  */
  trait EntryPointStrategy extends StObject
  object EntryPointStrategy {
    
    /**
      * The default behavior in v0.21 and earlier. Behaves like the resolve behavior, but will recursively
      * expand directories into an entry point for each file within the directory.
      */
    @JSImport("typedoc/dist/lib/utils/entry-point", "EntryPointStrategy.Expand")
    @js.native
    val Expand: expand = js.native
    
    /**
      * Alternative resolution mode useful for monorepos. With this mode, TypeDoc will look for a package.json
      * and tsconfig.json under each provided entry point. The `main` field of each package will be documented.
      */
    @JSImport("typedoc/dist/lib/utils/entry-point", "EntryPointStrategy.Packages")
    @js.native
    val Packages: packages = js.native
    
    /**
      * The default behavior in v0.22+, expects all provided entry points as being part of a single program.
      * Any directories included in the entry point list will result in `dir/index.([cm][tj]s|[tj]sx?)` being used.
      */
    @JSImport("typedoc/dist/lib/utils/entry-point", "EntryPointStrategy.Resolve")
    @js.native
    val Resolve: resolve = js.native
  }
  
  inline def getEntryPoints(logger: Logger, options: Options): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getExpandedEntryPointsForPaths(logger: Logger, inputFiles: js.Array[String], options: Options): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  inline def getExpandedEntryPointsForPaths(logger: Logger, inputFiles: js.Array[String], options: Options, programs: js.Array[Program]): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], programs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getWatchEntryPoints(logger: Logger, options: Options, program: Program): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWatchEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  trait DocumentationEntryPoint extends StObject {
    
    var displayName: String
    
    var program: Program
    
    var readmeFile: js.UndefOr[String] = js.undefined
    
    var sourceFile: SourceFile
    
    var version: js.UndefOr[String] = js.undefined
  }
  object DocumentationEntryPoint {
    
    inline def apply(displayName: String, program: Program, sourceFile: SourceFile): DocumentationEntryPoint = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationEntryPoint]
    }
    
    extension [Self <: DocumentationEntryPoint](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setReadmeFile(value: String): Self = StObject.set(x, "readmeFile", value.asInstanceOf[js.Any])
      
      inline def setReadmeFileUndefined: Self = StObject.set(x, "readmeFile", js.undefined)
      
      inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
