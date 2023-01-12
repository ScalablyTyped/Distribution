package typings.webpackValidator

import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Validate your webpack configs with joi
    */
  inline def apply(config: Configuration): Configuration = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  /**
    * Validate your webpack configs with joi
    */
  inline def apply(config: Configuration, options: ValidationOptions): Configuration = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Configuration]
  
  @JSImport("webpack-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ValidationOptions extends StObject {
    
    var `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.undefined
    
    var `loader-prefer-include`: js.UndefOr[Boolean] = js.undefined
    
    var `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.undefined
  }
  object ValidationOptions {
    
    inline def apply(): ValidationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationOptions] (val x: Self) extends AnyVal {
      
      inline def `setLoader-enforce-include-or-exclude`(value: Boolean): Self = StObject.set(x, "loader-enforce-include-or-exclude", value.asInstanceOf[js.Any])
      
      inline def `setLoader-enforce-include-or-excludeUndefined`: Self = StObject.set(x, "loader-enforce-include-or-exclude", js.undefined)
      
      inline def `setLoader-prefer-include`(value: Boolean): Self = StObject.set(x, "loader-prefer-include", value.asInstanceOf[js.Any])
      
      inline def `setLoader-prefer-includeUndefined`: Self = StObject.set(x, "loader-prefer-include", js.undefined)
      
      inline def `setNo-root-files-node-modules-nameclash`(value: Boolean): Self = StObject.set(x, "no-root-files-node-modules-nameclash", value.asInstanceOf[js.Any])
      
      inline def `setNo-root-files-node-modules-nameclashUndefined`: Self = StObject.set(x, "no-root-files-node-modules-nameclash", js.undefined)
    }
  }
}
