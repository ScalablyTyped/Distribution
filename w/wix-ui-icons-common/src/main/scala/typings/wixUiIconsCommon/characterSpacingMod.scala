package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCharacterSpacingMod.CharacterSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterSpacingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/CharacterSpacing", JSImport.Default)
  @js.native
  val default: FC[CharacterSpacingProps] = js.native
  
  type _To = FC[CharacterSpacingProps]
  
  /* This means you don't have to write `default`, but can instead just say `characterSpacingMod.foo` */
  override def _to: FC[CharacterSpacingProps] = default
}
