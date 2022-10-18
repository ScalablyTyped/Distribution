package typings.yadda

import org.scalablytyped.runtime.Shortcut
import typings.yadda.libLocalisationEnglishMod.Library
import typings.yadda.libLocalisationLanguageMod.Vocabulary
import typings.yadda.libLocalisationLanguageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocalisationMod {
  
  object default extends Shortcut {
    
    @JSImport("yadda/lib/localisation", JSImport.Default)
    @js.native
    val ^ : typings.yadda.libLocalisationLanguageMod.^[Library] = js.native
    
    type _To = typings.yadda.libLocalisationLanguageMod.^[Library]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: typings.yadda.libLocalisationLanguageMod.^[Library] = ^
  }
  
  @JSImport("yadda/lib/localisation", "Chinese")
  @js.native
  val Chinese: ^[typings.yadda.libLocalisationChineseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Dutch")
  @js.native
  val Dutch: ^[typings.yadda.libLocalisationDutchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "English")
  @js.native
  val English: ^[Library] = js.native
  
  @JSImport("yadda/lib/localisation", "French")
  @js.native
  val French: ^[typings.yadda.libLocalisationFrenchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "German")
  @js.native
  val German: ^[typings.yadda.libLocalisationGermanMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Language")
  @js.native
  open class Language[TLibrary /* <: typings.yadda.libLocalisationLanguageMod.Library */] protected () extends ^[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @JSImport("yadda/lib/localisation", "Norwegian")
  @js.native
  val Norwegian: ^[typings.yadda.libLocalisationNorwegianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Pirate")
  @js.native
  val Pirate: ^[typings.yadda.libLocalisationPirateMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Polish")
  @js.native
  val Polish: ^[typings.yadda.libLocalisationPolishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Portuguese")
  @js.native
  val Portuguese: ^[typings.yadda.libLocalisationPortugueseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Russian")
  @js.native
  val Russian: ^[typings.yadda.libLocalisationRussianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Spanish")
  @js.native
  val Spanish: ^[typings.yadda.libLocalisationSpanishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Ukrainian")
  @js.native
  val Ukrainian: ^[typings.yadda.libLocalisationUkrainianMod.Library] = js.native
}
