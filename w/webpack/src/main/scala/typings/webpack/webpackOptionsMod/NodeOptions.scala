package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import typings.webpack.webpackStrings.empty
import typings.webpack.webpackStrings.mock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOptions
  extends StObject
     with /**
	 * Include a polyfill for the node.js module
	 */
/* k */ StringDictionary[`false` | `true` | mock | empty] {
  
  /**
  	 * Include a polyfill for the 'Buffer' variable
  	 */
  var Buffer: js.UndefOr[`false` | `true` | mock] = js.undefined
  
  /**
  	 * Include a polyfill for the '__dirname' variable
  	 */
  var __dirname: js.UndefOr[`false` | `true` | mock] = js.undefined
  
  /**
  	 * Include a polyfill for the '__filename' variable
  	 */
  var __filename: js.UndefOr[`false` | `true` | mock] = js.undefined
  
  /**
  	 * Include a polyfill for the 'console' variable
  	 */
  var console: js.UndefOr[`false` | `true` | mock] = js.undefined
  
  /**
  	 * Include a polyfill for the 'global' variable
  	 */
  var global: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Include a polyfill for the 'process' variable
  	 */
  var process: js.UndefOr[`false` | `true` | mock] = js.undefined
}
object NodeOptions {
  
  inline def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  extension [Self <: NodeOptions](x: Self) {
    
    inline def setBuffer(value: `false` | `true` | mock): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "Buffer", js.undefined)
    
    inline def setConsole(value: `false` | `true` | mock): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
    
    inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setProcess(value: `false` | `true` | mock): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def set__dirname(value: `false` | `true` | mock): Self = StObject.set(x, "__dirname", value.asInstanceOf[js.Any])
    
    inline def set__dirnameUndefined: Self = StObject.set(x, "__dirname", js.undefined)
    
    inline def set__filename(value: `false` | `true` | mock): Self = StObject.set(x, "__filename", value.asInstanceOf[js.Any])
    
    inline def set__filenameUndefined: Self = StObject.set(x, "__filename", js.undefined)
  }
}
