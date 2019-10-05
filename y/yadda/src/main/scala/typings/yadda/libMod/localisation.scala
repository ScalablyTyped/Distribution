package typings.yadda.libMod

import org.scalablytyped.runtime.TopLevel
import typings.yadda.libLocalisationLanguageMod.Vocabulary
import typings.yadda.libLocalisationLanguageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "localisation")
@js.native
object localisation extends js.Object {
  @js.native
  class Language[TLibrary /* <: typings.yadda.libLocalisationLanguageMod.Library */] protected ()
    extends typings.yadda.libLocalisationMod.Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  object Chinese
    extends TopLevel[^[typings.yadda.libLocalisationChineseMod.Library]]
  
  @js.native
  object Dutch
    extends TopLevel[^[typings.yadda.libLocalisationDutchMod.Library]]
  
  @js.native
  object English
    extends TopLevel[^[typings.yadda.libLocalisationEnglishMod.Library]]
  
  @js.native
  object French
    extends TopLevel[^[typings.yadda.libLocalisationFrenchMod.Library]]
  
  @js.native
  object German
    extends TopLevel[^[typings.yadda.libLocalisationGermanMod.Library]]
  
  @js.native
  object Norwegian
    extends TopLevel[^[typings.yadda.libLocalisationNorwegianMod.Library]]
  
  @js.native
  object Pirate
    extends TopLevel[^[typings.yadda.libLocalisationPirateMod.Library]]
  
  @js.native
  object Polish
    extends TopLevel[^[typings.yadda.libLocalisationPolishMod.Library]]
  
  @js.native
  object Portuguese
    extends TopLevel[^[typings.yadda.libLocalisationPortugueseMod.Library]]
  
  @js.native
  object Russian
    extends TopLevel[^[typings.yadda.libLocalisationRussianMod.Library]]
  
  @js.native
  object Spanish
    extends TopLevel[^[typings.yadda.libLocalisationSpanishMod.Library]]
  
  @js.native
  object Ukrainian
    extends TopLevel[^[typings.yadda.libLocalisationUkrainianMod.Library]]
  
  @js.native
  object default
    extends TopLevel[^[typings.yadda.libLocalisationEnglishMod.Library]]
  
}

