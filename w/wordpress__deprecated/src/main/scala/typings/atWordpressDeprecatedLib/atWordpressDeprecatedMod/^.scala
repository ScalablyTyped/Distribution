package typings
package atWordpressDeprecatedLib.atWordpressDeprecatedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/deprecated", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val logged: stdLib.Record[java.lang.String, js.UndefOr[scala.Boolean]] = js.native
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
    * 	version: 'the future',
    * 	alternative: 'vegetables',
    * 	plugin: 'the earth',
    * 	hint: 'You may find it beneficial to transition gradually.',
    * } );
    *
    * // Logs: 'Eating meat is deprecated and will be removed from the earth in the future. Please use vegetables instead. Note: You may find it beneficial to transition gradually.'
    * ```
    */
  def default(feature: java.lang.String): scala.Unit = js.native
  def default(feature: java.lang.String, options: DeprecatedOptions): scala.Unit = js.native
}

