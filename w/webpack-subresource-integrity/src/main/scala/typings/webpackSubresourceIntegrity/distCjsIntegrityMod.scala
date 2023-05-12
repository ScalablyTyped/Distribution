package typings.webpackSubresourceIntegrity

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsIntegrityMod {
  
  @JSImport("webpack-subresource-integrity/dist/cjs/integrity", "AssetIntegrity")
  @js.native
  open class AssetIntegrity protected () extends StObject {
    def this(hashFuncNames: js.Array[String]) = this()
    
    /**
      * @internal
      */
    /* private */ var assetIntegrity: Any = js.native
    
    def get(assetKey: String): js.UndefOr[String] = js.native
    
    def has(assetKey: String): Boolean = js.native
    
    var hashFuncNames: js.Array[String] = js.native
    
    /**
      * @internal
      */
    /* private */ var inverseAssetIntegrity: Any = js.native
    
    def update(assetKey: String, integrity: String): String = js.native
    
    def updateFromSource(assetKey: String, source: String): String = js.native
    def updateFromSource(assetKey: String, source: Buffer): String = js.native
    
    def updateHash(input: js.Array[Buffer], oldHash: String): js.UndefOr[String] = js.native
  }
}
