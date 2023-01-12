package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generator options for asset/inline modules.
  */
trait AssetInlineGeneratorOptions extends StObject {
  
  /**
  	 * The options for data url generator.
  	 */
  var dataUrl: js.UndefOr[
    AssetGeneratorDataUrlOptions | (js.Function2[/* source */ String | Buffer, /* context */ Filename, String])
  ] = js.undefined
}
object AssetInlineGeneratorOptions {
  
  inline def apply(): AssetInlineGeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetInlineGeneratorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetInlineGeneratorOptions] (val x: Self) extends AnyVal {
    
    inline def setDataUrl(
      value: AssetGeneratorDataUrlOptions | (js.Function2[/* source */ String | Buffer, /* context */ Filename, String])
    ): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setDataUrlFunction2(value: (/* source */ String | Buffer, /* context */ Filename) => String): Self = StObject.set(x, "dataUrl", js.Any.fromFunction2(value))
    
    inline def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
  }
}
