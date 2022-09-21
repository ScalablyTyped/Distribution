package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsChevronUpSmallMod.ChevronUpSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ChevronUpSmall", JSImport.Default)
  @js.native
  val default: FC[ChevronUpSmallProps] = js.native
  
  type _To = FC[ChevronUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpSmallMod.foo` */
  override def _to: FC[ChevronUpSmallProps] = default
}
