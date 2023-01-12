package typings.wordpressDeprecated

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Logs a message to notify developers about a deprecated feature.
    *
    * @param feature             Name of the deprecated feature.
    * @param [options]           Additional options.
    *
    * @example
    * ```js
    * import deprecated from '@wordpress/deprecated';
    *
    * deprecated( 'Eating meat', {
    *     version: 'the future',
    *     alternative: 'vegetables',
    *     plugin: 'the earth',
    *     hint: 'You may find it beneficial to transition gradually.',
    * } );
    *
    * // Logs: 'Eating meat is deprecated and will be removed from the earth in the future. Please use vegetables instead. Note: You may find it beneficial to transition gradually.'
    * ```
    */
  inline def default(feature: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(feature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(feature: String, options: DeprecatedOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(feature.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@wordpress/deprecated", "logged")
  @js.native
  val logged: Record[String, js.UndefOr[Boolean]] = js.native
  
  trait DeprecatedOptions extends StObject {
    
    /**
      * Feature to use instead.
      */
    var alternative: js.UndefOr[String] = js.undefined
    
    /**
      * Additional message to help transition away from the deprecated feature.
      */
    var hint: js.UndefOr[String] = js.undefined
    
    /**
      * Link to documentation.
      */
    var link: js.UndefOr[String] = js.undefined
    
    /**
      * Plugin name if it's a plugin feature.
      */
    var plugin: js.UndefOr[String] = js.undefined
    
    /**
      * Version in which the feature will be removed.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object DeprecatedOptions {
    
    inline def apply(): DeprecatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
      
      inline def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
