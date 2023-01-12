package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for data url generation.
  */
trait AssetGeneratorDataUrlOptions extends StObject {
  
  /**
  	 * Asset encoding (defaults to base64).
  	 */
  var encoding: js.UndefOr[`false` | base64] = js.undefined
  
  /**
  	 * Asset mimetype (getting from file extension by default).
  	 */
  var mimetype: js.UndefOr[String] = js.undefined
}
object AssetGeneratorDataUrlOptions {
  
  inline def apply(): AssetGeneratorDataUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetGeneratorDataUrlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetGeneratorDataUrlOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: `false` | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
  }
}
