package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageBackgroundMod.PageBackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageBackgroundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PageBackground", JSImport.Default)
  @js.native
  val default: FC[PageBackgroundProps] = js.native
  
  type _To = FC[PageBackgroundProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageBackgroundMod.foo` */
  override def _to: FC[PageBackgroundProps] = default
}
