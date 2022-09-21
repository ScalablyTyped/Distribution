package typings.webpackChunkHash

import typings.webpack.mod.Plugin
import typings.webpackChunkHash.webpackChunkHashStrings.base64
import typings.webpackChunkHash.webpackChunkHashStrings.hex
import typings.webpackChunkHash.webpackChunkHashStrings.latin1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("webpack-chunk-hash", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: WebpackChunkHashPluginOptions) = this()
  }
  
  type WebpackChunkHash = Plugin
  
  trait WebpackChunkHashPluginOptions extends StObject {
    
    /**
      * A callback to add more content to the resulting hash
      */
    var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ Any, String]] = js.undefined
    
    /**
      * Which algorithm to use. Defaults to 'md5'.
      * See https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    /**
      * Which digest to use. Defaults to 'hex'.
      * See https://nodejs.org/api/crypto.html#crypto_hash_digest_encoding
      */
    var digest: js.UndefOr[hex | latin1 | base64] = js.undefined
  }
  object WebpackChunkHashPluginOptions {
    
    inline def apply(): WebpackChunkHashPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackChunkHashPluginOptions]
    }
    
    extension [Self <: WebpackChunkHashPluginOptions](x: Self) {
      
      inline def setAdditionalHashContent(value: /* chunk */ Any => String): Self = StObject.set(x, "additionalHashContent", js.Any.fromFunction1(value))
      
      inline def setAdditionalHashContentUndefined: Self = StObject.set(x, "additionalHashContent", js.undefined)
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDigest(value: hex | latin1 | base64): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    }
  }
}
