package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataSmallMod.DataSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DataSmall", JSImport.Default)
  @js.native
  val default: FC[DataSmallProps] = js.native
  
  type _To = FC[DataSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataSmallMod.foo` */
  override def _to: FC[DataSmallProps] = default
}
