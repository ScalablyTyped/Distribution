package typings.webpackChunkHash

import typings.std.Plugin
import typings.webpackChunkHash.webpackChunkHashStrings.base64
import typings.webpackChunkHash.webpackChunkHashStrings.hex
import typings.webpackChunkHash.webpackChunkHashStrings.latin1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-chunk-hash", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * @default null
      * @description A callback to add more content to the resulting hash
      */
    var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ js.Any, String]] = js.undefined
    
    /**
      * @default 'md5'
      * @description The hash algorithm to use
      * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'hex'
      * @description The digest enconding to use
      * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
      */
    var digest: js.UndefOr[hex | latin1 | base64] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalHashContent(value: /* chunk */ js.Any => String): Self = StObject.set(x, "additionalHashContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdditionalHashContentUndefined: Self = StObject.set(x, "additionalHashContent", js.undefined)
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setDigest(value: hex | latin1 | base64): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    }
  }
  
  type WebpackChunkHash = Plugin
}
