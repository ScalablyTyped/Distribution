package typings.yadda

import org.scalablytyped.runtime.Shortcut
import typings.yadda.englishMod.Library
import typings.yadda.languageMod.Vocabulary
import typings.yadda.languageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localisationMod {
  
  object default extends Shortcut {
    
    @JSImport("yadda/lib/localisation", JSImport.Default)
    @js.native
    val ^ : typings.yadda.languageMod.^[Library] = js.native
    
    type _To = typings.yadda.languageMod.^[Library]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: typings.yadda.languageMod.^[Library] = ^
  }
  
  @JSImport("yadda/lib/localisation", "Chinese")
  @js.native
  val Chinese: ^[typings.yadda.chineseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Dutch")
  @js.native
  val Dutch: ^[typings.yadda.dutchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "English")
  @js.native
  val English: ^[Library] = js.native
  
  @JSImport("yadda/lib/localisation", "French")
  @js.native
  val French: ^[typings.yadda.frenchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "German")
  @js.native
  val German: ^[typings.yadda.germanMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Language")
  @js.native
  class Language[TLibrary /* <: typings.yadda.languageMod.Library */] protected () extends ^[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @JSImport("yadda/lib/localisation", "Norwegian")
  @js.native
  val Norwegian: ^[typings.yadda.norwegianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Pirate")
  @js.native
  val Pirate: ^[typings.yadda.pirateMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Polish")
  @js.native
  val Polish: ^[typings.yadda.polishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Portuguese")
  @js.native
  val Portuguese: ^[typings.yadda.portugueseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Russian")
  @js.native
  val Russian: ^[typings.yadda.russianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Spanish")
  @js.native
  val Spanish: ^[typings.yadda.spanishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Ukrainian")
  @js.native
  val Ukrainian: ^[typings.yadda.ukrainianMod.Library] = js.native
}
