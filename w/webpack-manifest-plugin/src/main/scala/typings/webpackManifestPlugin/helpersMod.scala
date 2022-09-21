package typings.webpackManifestPlugin

import typings.std.Record
import typings.webpack.mod.Asset
import typings.webpack.mod.Chunk
import typings.webpack.mod.Compilation
import typings.webpack.mod.KnownAssetInfo
import typings.webpack.mod.Source
import typings.webpackManifestPlugin.mod.InternalOptions
import typings.webpackManifestPlugin.mod.Manifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("webpack-manifest-plugin/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateManifest(compilation: Compilation, files: js.Array[FileDescriptor], hasGenerateSeed: InternalOptions): Manifest = (^.asInstanceOf[js.Dynamic].applyDynamic("generateManifest")(compilation.asInstanceOf[js.Any], files.asInstanceOf[js.Any], hasGenerateSeed.asInstanceOf[js.Any])).asInstanceOf[Manifest]
  
  inline def reduceAssets(files: js.Array[FileDescriptor], asset: CompilationAsset, moduleAssets: Record[Any, Any]): js.Array[FileDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceAssets")(files.asInstanceOf[js.Any], asset.asInstanceOf[js.Any], moduleAssets.asInstanceOf[js.Any])).asInstanceOf[js.Array[FileDescriptor]]
  
  inline def reduceChunk(
    files: js.Array[FileDescriptor],
    chunk: Chunk,
    options: InternalOptions,
    auxiliaryFiles: Record[Any, Any]
  ): js.Array[FileDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceChunk")(files.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any], options.asInstanceOf[js.Any], auxiliaryFiles.asInstanceOf[js.Any])).asInstanceOf[js.Array[FileDescriptor]]
  
  inline def transformFiles(files: js.Array[FileDescriptor], options: InternalOptions): js.Array[FileDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFiles")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[FileDescriptor]]
  
  trait CompilationAsset
    extends StObject
       with Asset {
    
    var chunks: js.Array[Any]
    
    @JSName("info")
    var info_CompilationAsset: CompilationAssetInfo
  }
  object CompilationAsset {
    
    inline def apply(chunks: js.Array[Any], info: CompilationAssetInfo, name: String, source: Source): CompilationAsset = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationAsset]
    }
    
    extension [Self <: CompilationAsset](x: Self) {
      
      inline def setChunks(value: js.Array[Any]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: Any*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setInfo(value: CompilationAssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait CompilationAssetInfo
    extends StObject
       with KnownAssetInfo {
    
    @JSName("sourceFilename")
    var sourceFilename_CompilationAssetInfo: String
  }
  object CompilationAssetInfo {
    
    inline def apply(sourceFilename: String): CompilationAssetInfo = {
      val __obj = js.Dynamic.literal(sourceFilename = sourceFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationAssetInfo]
    }
    
    extension [Self <: CompilationAssetInfo](x: Self) {
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileDescriptor extends StObject {
    
    var chunk: js.UndefOr[Chunk] = js.undefined
    
    var isAsset: Boolean
    
    var isChunk: Boolean
    
    var isInitial: Boolean
    
    var isModuleAsset: Boolean
    
    var name: String
    
    var path: String
  }
  object FileDescriptor {
    
    inline def apply(
      isAsset: Boolean,
      isChunk: Boolean,
      isInitial: Boolean,
      isModuleAsset: Boolean,
      name: String,
      path: String
    ): FileDescriptor = {
      val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDescriptor]
    }
    
    extension [Self <: FileDescriptor](x: Self) {
      
      inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setIsAsset(value: Boolean): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
      
      inline def setIsChunk(value: Boolean): Self = StObject.set(x, "isChunk", value.asInstanceOf[js.Any])
      
      inline def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
      
      inline def setIsModuleAsset(value: Boolean): Self = StObject.set(x, "isModuleAsset", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
