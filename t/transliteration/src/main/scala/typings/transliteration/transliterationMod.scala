package typings.transliteration

import typings.transliteration.distNodeSrcTypesMod.SlugifyFunction
import typings.transliteration.distNodeSrcTypesMod.TransliterateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transliteration", JSImport.Namespace)
@js.native
object transliterationMod extends js.Object {
  val slugify: SlugifyFunction = js.native
  val transliterate: TransliterateFunction = js.native
}

