package typings.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object germanMod extends Shortcut {
  
  @JSImport("yadda/lib/localisation/German", JSImport.Namespace)
  @js.native
  val ^ : typings.yadda.languageMod.^[Library] = js.native
  
  type Library = typings.yadda.englishMod.Library
  
  type Vocabulary = typings.yadda.englishMod.Vocabulary
  
  type _To = typings.yadda.languageMod.^[Library]
  
  /* This means you don't have to write `^`, but can instead just say `germanMod.foo` */
  override def _to: typings.yadda.languageMod.^[Library] = ^
}
