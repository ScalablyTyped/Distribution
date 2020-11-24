package typings.transliteration.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserGlobalObject extends js.Object {
  
  def slugify(source: String): String = js.native
  def slugify(source: String, options: OptionsSlugify): String = js.native
  @JSName("slugify")
  var slugify_Original: SlugifyFunction = js.native
  
  def transl(source: String): String = js.native
  def transl(source: String, options: OptionsTransliterate): String = js.native
  @JSName("transl")
  var transl_Original: TransliterateFunction = js.native
  
  def transliterate(source: String): String = js.native
  def transliterate(source: String, options: OptionsTransliterate): String = js.native
  @JSName("transliterate")
  var transliterate_Original: TransliterateFunction = js.native
}
