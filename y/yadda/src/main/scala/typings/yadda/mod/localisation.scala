package typings.yadda.mod

import org.scalablytyped.runtime.TopLevel
import typings.yadda.languageMod.Vocabulary
import typings.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "localisation")
@js.native
object localisation extends js.Object {
  @js.native
  class Language[TLibrary /* <: typings.yadda.languageMod.Library */] protected ()
    extends typings.yadda.libMod.localisation.Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  object Chinese
    extends TopLevel[^[typings.yadda.chineseMod.Library]]
  
  @js.native
  object Dutch
    extends TopLevel[^[typings.yadda.dutchMod.Library]]
  
  @js.native
  object English
    extends TopLevel[^[typings.yadda.englishMod.Library]]
  
  @js.native
  object French
    extends TopLevel[^[typings.yadda.frenchMod.Library]]
  
  @js.native
  object German
    extends TopLevel[^[typings.yadda.germanMod.Library]]
  
  @js.native
  object Norwegian
    extends TopLevel[^[typings.yadda.norwegianMod.Library]]
  
  @js.native
  object Pirate
    extends TopLevel[^[typings.yadda.pirateMod.Library]]
  
  @js.native
  object Polish
    extends TopLevel[^[typings.yadda.polishMod.Library]]
  
  @js.native
  object Portuguese
    extends TopLevel[^[typings.yadda.portugueseMod.Library]]
  
  @js.native
  object Russian
    extends TopLevel[^[typings.yadda.russianMod.Library]]
  
  @js.native
  object Spanish
    extends TopLevel[^[typings.yadda.spanishMod.Library]]
  
  @js.native
  object Ukrainian
    extends TopLevel[^[typings.yadda.ukrainianMod.Library]]
  
  @js.native
  object default
    extends TopLevel[^[typings.yadda.englishMod.Library]]
  
}

