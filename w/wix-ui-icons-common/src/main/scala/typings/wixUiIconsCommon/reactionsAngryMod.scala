package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.angryMod.AngryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionsAngryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/reactions/Angry", JSImport.Default)
  @js.native
  val default: FC[AngryProps] = js.native
  
  type _To = FC[AngryProps]
  
  /* This means you don't have to write `default`, but can instead just say `reactionsAngryMod.foo` */
  override def _to: FC[AngryProps] = default
}
