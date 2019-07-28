package typings.yadda.libLocalisationMod

import typings.yadda.libLocalisationLanguageMod.Library
import typings.yadda.libLocalisationLanguageMod.Vocabulary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/localisation", "Language")
@js.native
class Language[TLibrary /* <: Library */] protected ()
  extends typings.yadda.libLocalisationLanguageMod.^[TLibrary] {
  def this(name: String, vocabulary: Vocabulary) = this()
}

