package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.LanguageTranslations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "addLanguage")
@js.native
object addLanguage extends js.Object {
  /**
  	 * Adding languages so that they're available to all players.
  	 * Example: `addLanguage('es', { 'Hello': 'Hola' });`
  	 *
  	 * @param code
  	 *        The language code or dictionary property
  	 *
  	 * @param data
  	 *        The data values to be translated
  	 *
  	 * @return The resulting language dictionary object
  	 */
  def apply(code: String, data: LanguageTranslations): LanguageTranslations = js.native
}

