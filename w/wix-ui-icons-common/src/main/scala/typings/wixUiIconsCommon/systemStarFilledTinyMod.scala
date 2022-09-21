package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.starFilledTinyMod.StarFilledTinyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemStarFilledTinyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/StarFilledTiny", JSImport.Default)
  @js.native
  val default: FC[StarFilledTinyProps] = js.native
  
  type _To = FC[StarFilledTinyProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemStarFilledTinyMod.foo` */
  override def _to: FC[StarFilledTinyProps] = default
}
