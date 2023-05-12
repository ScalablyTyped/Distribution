package typings.webpackSubresourceIntegrity

import typings.std.Map
import typings.std.Set
import typings.webpack.mod.Chunk
import typings.webpack.mod.RuntimeModule
import typings.webpackSubresourceIntegrity.distMjsTypesMod.StronglyConnectedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsManifestMod {
  
  @JSImport("webpack-subresource-integrity/dist/mjs/manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webpack-subresource-integrity/dist/mjs/manifest", "AddLazySriRuntimeModule")
  @js.native
  open class AddLazySriRuntimeModule protected () extends RuntimeModule {
    def this(sriHashes: Any, chunkName: String) = this()
    def this(sriHashes: Any, chunkName: Double) = this()
    
    /* private */ var sriHashes: Any = js.native
  }
  
  inline def getChunkToManifestMap(chunks: js.Iterable[Chunk]): js.Tuple2[
    /* sortedVertices */ js.Array[StronglyConnectedComponent[Chunk]], 
    /* chunkManifest */ Map[Chunk, Set[Chunk]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChunkToManifestMap")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    /* sortedVertices */ js.Array[StronglyConnectedComponent[Chunk]], 
    /* chunkManifest */ Map[Chunk, Set[Chunk]]
  ]]
}
