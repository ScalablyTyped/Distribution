package typings.webpackSubresourceIntegrity

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.std.Set
import typings.webpack.mod.Chunk
import typings.webpack.mod.Compilation
import typings.webpack.mod.Source
import typings.webpackSubresourceIntegrity.anon.AssetsHWPAssets
import typings.webpackSubresourceIntegrity.anon.HeadTags
import typings.webpackSubresourceIntegrity.distMjsReporterMod.Reporter
import typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject
import typings.webpackSubresourceIntegrity.distMjsTypesMod.SubresourceIntegrityPluginResolvedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsPluginMod {
  
  @JSImport("webpack-subresource-integrity/dist/mjs/plugin", "Plugin")
  @js.native
  open class Plugin protected () extends StObject {
    def this(compilation: Compilation, options: SubresourceIntegrityPluginResolvedOptions, reporter: Reporter) = this()
    
    /**
      * @internal
      */
    def addAttribute(elName: String, source: String): String = js.native
    
    /**
      * @internal
      */
    def addMissingIntegrityHashes(assets: Record[String, Source]): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var assetIntegrity: Any = js.native
    
    /**
      * @internal
      */
    def beforeRuntimeRequirements(): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var chunkManifest: Any = js.native
    
    /**
      * @internal
      */
    /* private */ val compilation: Any = js.native
    
    def getChildChunksToAddToChunkManifest(chunk: Chunk): Set[Chunk] = js.native
    
    /**
      * @internal
      */
    /* private */ var getIntegrityChecksumForAsset: Any = js.native
    
    def handleHwpBodyTags(param0: HeadTags): Unit = js.native
    
    def handleHwpPluginArgs(param0: AssetsHWPAssets): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var hashByPlaceholder: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var hwpAssetPath: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var hwpPublicPath: Any = js.native
    
    /**
      * @internal
      */
    /* private */ val options: Any = js.native
    
    /**
      * @internal
      */
    def processAssets(assets: Record[String, Source]): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var processChunk: Any = js.native
    
    /* private */ var processChunkAssets: Any = js.native
    
    /**
      * @internal
      */
    def processTag(tag: HtmlTagObject): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var replaceAsset: Any = js.native
    
    /**
      * @internal
      */
    /* private */ val reporter: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var sortedSccChunks: Any = js.native
    
    def updateHash(input: js.Array[Buffer], oldHash: String): js.UndefOr[String] = js.native
    
    /* private */ var warnAboutLongTermCaching: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var warnIfHotUpdate: Any = js.native
  }
}
