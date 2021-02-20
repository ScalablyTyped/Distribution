package typings.wordpressDeprecated

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("@wordpress/deprecated", JSImport.Default)
  @js.native
  def default(feature: String): Unit = js.native
  @JSImport("@wordpress/deprecated", JSImport.Default)
  @js.native
  def default(feature: String, options: DeprecatedOptions): Unit = js.native
  
  @JSImport("@wordpress/deprecated", "logged")
  @js.native
  val logged: Record[String, js.UndefOr[Boolean]] = js.native
  
  @js.native
  trait DeprecatedOptions extends StObject {
    
    /**
      * Feature to use instead.
      */
    var alternative: js.UndefOr[String] = js.native
    
    /**
      * Additional message to help transition away from the deprecated feature.
      */
    var hint: js.UndefOr[String] = js.native
    
    /**
      * Link to documentation.
      */
    var link: js.UndefOr[String] = js.native
    
    /**
      * Plugin name if it's a plugin feature.
      */
    var plugin: js.UndefOr[String] = js.native
    
    /**
      * Version in which the feature will be removed.
      */
    var version: js.UndefOr[String] = js.native
  }
  object DeprecatedOptions {
    
    @scala.inline
    def apply(): DeprecatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    @scala.inline
    implicit class DeprecatedOptionsMutableBuilder[Self <: DeprecatedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternative(value: String): Self = StObject.set(x, "alternative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternativeUndefined: Self = StObject.set(x, "alternative", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
