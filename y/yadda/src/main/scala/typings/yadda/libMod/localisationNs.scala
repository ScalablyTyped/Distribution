package typings.yadda.libMod

import typings.yadda.libLocalisationLanguageMod.Vocabulary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "localisation")
@js.native
object localisationNs extends js.Object {
  @js.native
  class Language[TLibrary /* <: typings.yadda.libLocalisationLanguageMod.Library */] protected ()
    extends typings.yadda.libLocalisationMod.Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  val Chinese: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationChineseMod.Library] = js.native
  val Dutch: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationDutchMod.Library] = js.native
  val English: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library] = js.native
  val French: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationFrenchMod.Library] = js.native
  val German: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationGermanMod.Library] = js.native
  val Norwegian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationNorwegianMod.Library] = js.native
  val Pirate: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPirateMod.Library] = js.native
  val Polish: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPolishMod.Library] = js.native
  val Portuguese: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPortugueseMod.Library] = js.native
  val Russian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationRussianMod.Library] = js.native
  val Spanish: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationSpanishMod.Library] = js.native
  val Ukrainian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationUkrainianMod.Library] = js.native
  val default: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library] = js.native
}

