package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.objectsMod.ObjectsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonObjectsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Objects", JSImport.Default)
  @js.native
  val default: SFC[ObjectsProps] = js.native
  
  type _To = SFC[ObjectsProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonObjectsMod.foo` */
  override def _to: SFC[ObjectsProps] = default
}
