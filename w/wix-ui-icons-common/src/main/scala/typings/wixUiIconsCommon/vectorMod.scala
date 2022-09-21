package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVectorMod.VectorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Vector", JSImport.Default)
  @js.native
  val default: FC[VectorProps] = js.native
  
  type _To = FC[VectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `vectorMod.foo` */
  override def _to: FC[VectorProps] = default
}
