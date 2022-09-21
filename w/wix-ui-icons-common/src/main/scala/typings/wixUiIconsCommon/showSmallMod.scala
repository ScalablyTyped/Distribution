package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShowSmallMod.ShowSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object showSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ShowSmall", JSImport.Default)
  @js.native
  val default: FC[ShowSmallProps] = js.native
  
  type _To = FC[ShowSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `showSmallMod.foo` */
  override def _to: FC[ShowSmallProps] = default
}
