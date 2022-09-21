package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAlignTopMod.AlignTopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignTopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AlignTop", JSImport.Default)
  @js.native
  val default: FC[AlignTopProps] = js.native
  
  type _To = FC[AlignTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignTopMod.foo` */
  override def _to: FC[AlignTopProps] = default
}
