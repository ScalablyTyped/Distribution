package typings.wordpressDeprecated.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/deprecated", JSImport.Default)
@js.native
object default extends js.Object {
  
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
  def apply(feature: String): Unit = js.native
  def apply(feature: String, options: DeprecatedOptions): Unit = js.native
}
