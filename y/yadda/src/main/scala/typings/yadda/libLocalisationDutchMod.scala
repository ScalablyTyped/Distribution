package typings.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocalisationDutchMod extends Shortcut {
  
  @JSImport("yadda/lib/localisation/Dutch", JSImport.Namespace)
  @js.native
  val ^ : typings.yadda.libLocalisationLanguageMod.^[Library] = js.native
  
  type Library = typings.yadda.libLocalisationEnglishMod.Library
  
  type Vocabulary = typings.yadda.libLocalisationEnglishMod.Vocabulary
  
  type _To = typings.yadda.libLocalisationLanguageMod.^[Library]
  
  /* This means you don't have to write `^`, but can instead just say `libLocalisationDutchMod.foo` */
  override def _to: typings.yadda.libLocalisationLanguageMod.^[Library] = ^
}
