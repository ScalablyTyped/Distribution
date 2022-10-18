package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFinderMod {
  
  @JSImport("unified-engine/lib/finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finder(input: js.Array[String | VFile], options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("finder")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[CleanResult], Any]
  
  trait CleanResult extends StObject {
    
    var files: js.Array[VFile]
    
    var oneFileMode: Boolean
  }
  object CleanResult {
    
    inline def apply(files: js.Array[VFile], oneFileMode: Boolean): CleanResult = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], oneFileMode = oneFileMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CleanResult]
    }
    
    extension [Self <: CleanResult](x: Self) {
      
      inline def setFiles(value: js.Array[VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: VFile*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setOneFileMode(value: Boolean): Self = StObject.set(x, "oneFileMode", value.asInstanceOf[js.Any])
    }
  }
  
  type GitIgnore = typings.unifiedEngine.libIgnoreMod.Ignore
  
  type Ignore = typings.unifiedEngine.libIgnoreMod.Ignore
  
  trait Options extends StObject {
    
    var cwd: String
    
    var extensions: js.Array[String]
    
    var ignore: Ignore
    
    var ignorePatterns: js.Array[String]
    
    var silentlyIgnore: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(cwd: String, extensions: js.Array[String], ignore: Ignore, ignorePatterns: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], ignorePatterns = ignorePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setIgnore(value: Ignore): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setSilentlyIgnore(value: Boolean): Self = StObject.set(x, "silentlyIgnore", value.asInstanceOf[js.Any])
      
      inline def setSilentlyIgnoreUndefined: Self = StObject.set(x, "silentlyIgnore", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var input: js.Array[String | VFile]
    
    var output: js.Array[VFile]
  }
  object Result {
    
    inline def apply(input: js.Array[String | VFile], output: js.Array[VFile]): Result = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setInput(value: js.Array[String | VFile]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: (String | VFile)*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setOutput(value: js.Array[VFile]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: VFile*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  trait SearchResults extends StObject {
    
    var ignored: js.UndefOr[Boolean] = js.undefined
    
    var stats: js.UndefOr[typings.node.nodeColonfsMod.Stats] = js.undefined
  }
  object SearchResults {
    
    inline def apply(): SearchResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchResults]
    }
    
    extension [Self <: SearchResults](x: Self) {
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setStats(value: typings.node.nodeColonfsMod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  type Stats = typings.node.fsMod.Stats
  
  type VFile = typings.vfile.mod.VFile
}
