package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parser options for asset modules.
  */
trait AssetParserOptions extends StObject {
  
  /**
  	 * The condition for inlining the asset as DataUrl.
  	 */
  var dataUrlCondition: js.UndefOr[
    AssetParserDataUrlOptions | (js.Function2[/* source */ String | Buffer, /* context */ Filename, Boolean])
  ] = js.undefined
}
object AssetParserOptions {
  
  inline def apply(): AssetParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetParserOptions]
  }
  
  extension [Self <: AssetParserOptions](x: Self) {
    
    inline def setDataUrlCondition(
      value: AssetParserDataUrlOptions | (js.Function2[/* source */ String | Buffer, /* context */ Filename, Boolean])
    ): Self = StObject.set(x, "dataUrlCondition", value.asInstanceOf[js.Any])
    
    inline def setDataUrlConditionFunction2(value: (/* source */ String | Buffer, /* context */ Filename) => Boolean): Self = StObject.set(x, "dataUrlCondition", js.Any.fromFunction2(value))
    
    inline def setDataUrlConditionUndefined: Self = StObject.set(x, "dataUrlCondition", js.undefined)
  }
}
