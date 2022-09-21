package typings.webpack.mod

import typings.webpack.webpackStrings.`eval-only`
import typings.webpack.webpackStrings.`warn-mock`
import typings.webpack.webpackStrings.mock
import typings.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for node compatibility features.
  */
trait NodeOptions
  extends StObject
     with NodeWebpackOptions {
  
  /**
  	 * Include a polyfill for the '__dirname' variable.
  	 */
  var __dirname: js.UndefOr[Boolean | `warn-mock` | mock | `eval-only`] = js.undefined
  
  /**
  	 * Include a polyfill for the '__filename' variable.
  	 */
  var __filename: js.UndefOr[Boolean | `warn-mock` | mock | `eval-only`] = js.undefined
  
  /**
  	 * Include a polyfill for the 'global' variable.
  	 */
  var global: js.UndefOr[Boolean | warn] = js.undefined
}
object NodeOptions {
  
  inline def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  extension [Self <: NodeOptions](x: Self) {
    
    inline def setGlobal(value: Boolean | warn): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def set__dirname(value: Boolean | `warn-mock` | mock | `eval-only`): Self = StObject.set(x, "__dirname", value.asInstanceOf[js.Any])
    
    inline def set__dirnameUndefined: Self = StObject.set(x, "__dirname", js.undefined)
    
    inline def set__filename(value: Boolean | `warn-mock` | mock | `eval-only`): Self = StObject.set(x, "__filename", value.asInstanceOf[js.Any])
    
    inline def set__filenameUndefined: Self = StObject.set(x, "__filename", js.undefined)
  }
}
