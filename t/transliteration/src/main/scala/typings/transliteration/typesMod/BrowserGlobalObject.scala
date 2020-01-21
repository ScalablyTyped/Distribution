package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserGlobalObject extends js.Object {
  @JSName("slugify")
  var slugify_Original: SlugifyFunction = js.native
  @JSName("transl")
  var transl_Original: TransliterateFunction = js.native
  @JSName("transliterate")
  var transliterate_Original: TransliterateFunction = js.native
  def slugify(source: String): String = js.native
  def slugify(source: String, options: OptionsSlugify): String = js.native
  def transl(source: String): String = js.native
  def transl(source: String, options: OptionsTransliterate): String = js.native
  def transliterate(source: String): String = js.native
  def transliterate(source: String, options: OptionsTransliterate): String = js.native
}

