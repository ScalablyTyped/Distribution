package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashedModuleIdsPluginOptions extends StObject {
  
  /**
  	 * The context directory for creating names.
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * The encoding to use when generating the hash, defaults to 'base64'. All encodings from Node.JS' hash.digest are supported.
  	 */
  var hashDigest: js.UndefOr[latin1 | hex | base64] = js.undefined
  
  /**
  	 * The prefix length of the hash digest to use, defaults to 4.
  	 */
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  
  /**
  	 * The hashing algorithm to use, defaults to 'md4'. All functions from Node.JS' crypto.createHash are supported.
  	 */
  var hashFunction: js.UndefOr[String | Instantiable0[Hash]] = js.undefined
}
object HashedModuleIdsPluginOptions {
  
  inline def apply(): HashedModuleIdsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashedModuleIdsPluginOptions]
  }
  
  extension [Self <: HashedModuleIdsPluginOptions](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHashDigest(value: latin1 | hex | base64): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLength(value: Double): Self = StObject.set(x, "hashDigestLength", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLengthUndefined: Self = StObject.set(x, "hashDigestLength", js.undefined)
    
    inline def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
    
    inline def setHashFunction(value: String | Instantiable0[Hash]): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
  }
}
