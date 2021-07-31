package typings.webpack

import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashedModuleIdsPluginMod {
  
  trait HashedModuleIdsPluginOptions extends StObject {
    
    /**
    	 * The context directory for creating names.
    	 */
    var context: js.UndefOr[String] = js.undefined
    
    /**
    	 * The encoding to use when generating the hash, defaults to 'base64'. All encodings from Node.JS' hash.digest are supported.
    	 */
    var hashDigest: js.UndefOr[hex | latin1 | base64] = js.undefined
    
    /**
    	 * The prefix length of the hash digest to use, defaults to 4.
    	 */
    var hashDigestLength: js.UndefOr[Double] = js.undefined
    
    /**
    	 * The hashing algorithm to use, defaults to 'md5'. All functions from Node.JS' crypto.createHash are supported.
    	 */
    var hashFunction: js.UndefOr[String] = js.undefined
  }
  object HashedModuleIdsPluginOptions {
    
    @scala.inline
    def apply(): HashedModuleIdsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashedModuleIdsPluginOptions]
    }
    
    @scala.inline
    implicit class HashedModuleIdsPluginOptionsMutableBuilder[Self <: HashedModuleIdsPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setHashDigest(value: hex | latin1 | base64): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashDigestLength(value: Double): Self = StObject.set(x, "hashDigestLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashDigestLengthUndefined: Self = StObject.set(x, "hashDigestLength", js.undefined)
      
      @scala.inline
      def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
      
      @scala.inline
      def setHashFunction(value: String): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    }
  }
}
