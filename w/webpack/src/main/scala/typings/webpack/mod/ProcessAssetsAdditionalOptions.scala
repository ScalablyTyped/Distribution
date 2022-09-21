package typings.webpack.mod

import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessAssetsAdditionalOptions extends StObject {
  
  var additionalAssets: js.UndefOr[`true` | js.Function] = js.undefined
}
object ProcessAssetsAdditionalOptions {
  
  inline def apply(): ProcessAssetsAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessAssetsAdditionalOptions]
  }
  
  extension [Self <: ProcessAssetsAdditionalOptions](x: Self) {
    
    inline def setAdditionalAssets(value: `true` | js.Function): Self = StObject.set(x, "additionalAssets", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAssetsUndefined: Self = StObject.set(x, "additionalAssets", js.undefined)
  }
}
