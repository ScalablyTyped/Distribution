package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCustomBoldMod.CustomBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/CustomBold", JSImport.Default)
  @js.native
  val default: FC[CustomBoldProps] = js.native
  
  type _To = FC[CustomBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `customBoldMod.foo` */
  override def _to: FC[CustomBoldProps] = default
}
