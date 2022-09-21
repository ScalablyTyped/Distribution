package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDismissBoldMod.DismissBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dismissBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DismissBold", JSImport.Default)
  @js.native
  val default: FC[DismissBoldProps] = js.native
  
  type _To = FC[DismissBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `dismissBoldMod.foo` */
  override def _to: FC[DismissBoldProps] = default
}
