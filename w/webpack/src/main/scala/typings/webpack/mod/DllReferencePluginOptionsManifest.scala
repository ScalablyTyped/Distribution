package typings.webpack.mod

import typings.webpack.webpackStrings.`amd-require`
import typings.webpack.webpackStrings.`commonjs-module`
import typings.webpack.webpackStrings.`this`
import typings.webpack.webpackStrings.`var`
import typings.webpack.webpackStrings.amd
import typings.webpack.webpackStrings.assign
import typings.webpack.webpackStrings.commonjs
import typings.webpack.webpackStrings.commonjs2
import typings.webpack.webpackStrings.global
import typings.webpack.webpackStrings.jsonp
import typings.webpack.webpackStrings.system
import typings.webpack.webpackStrings.umd
import typings.webpack.webpackStrings.umd2
import typings.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing content, name and type.
  */
trait DllReferencePluginOptionsManifest extends StObject {
  
  /**
  	 * The mappings from request to module info.
  	 */
  var content: DllReferencePluginOptionsContent
  
  /**
  	 * The name where the dll is exposed (external name).
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * The type how the dll is exposed (external type).
  	 */
  var `type`: js.UndefOr[
    `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.undefined
}
object DllReferencePluginOptionsManifest {
  
  inline def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllReferencePluginOptionsManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DllReferencePluginOptionsManifest] (val x: Self) extends AnyVal {
    
    inline def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(
      value: `var` | assign | `this` | window | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
