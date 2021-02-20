package typings.yadda

import org.scalablytyped.runtime.Shortcut
import typings.yadda.englishMod.Library
import typings.yadda.languageMod.Vocabulary
import typings.yadda.languageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  object Chinese extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Chinese")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.chineseMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Chinese.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = ^
  }
  
  object Dutch extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Dutch")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.dutchMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Dutch.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = ^
  }
  
  object English extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "English")
    @js.native
    val ^ : typings.yadda.languageMod.^[Library] = js.native
    
    type _To = typings.yadda.languageMod.^[Library]
    
    /* This means you don't have to write `^`, but can instead just say `English.foo` */
    override def _to: typings.yadda.languageMod.^[Library] = ^
  }
  
  object French extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "French")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.frenchMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `French.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = ^
  }
  
  object German extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "German")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.germanMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `German.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = ^
  }
  
  @JSImport("yadda/lib/localisation", "Language")
  @js.native
  class Language[TLibrary /* <: typings.yadda.languageMod.Library */] protected () extends ^[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  object Norwegian extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Norwegian")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Norwegian.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = ^
  }
  
  object Pirate extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Pirate")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.pirateMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Pirate.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = ^
  }
  
  object Polish extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Polish")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.polishMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Polish.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = ^
  }
  
  object Portuguese extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Portuguese")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Portuguese.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = ^
  }
  
  object Russian extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Russian")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.russianMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Russian.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = ^
  }
  
  object Spanish extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Spanish")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.spanishMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Spanish.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = ^
  }
  
  object Ukrainian extends Shortcut {
    
    @JSImport("yadda/lib/localisation", "Ukrainian")
    @js.native
    val ^ : typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = js.native
    
    type _To = typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library]
    
    /* This means you don't have to write `^`, but can instead just say `Ukrainian.foo` */
    override def _to: typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = ^
  }
}
