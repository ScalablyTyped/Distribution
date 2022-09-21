package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataMod.DataProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Data", JSImport.Default)
  @js.native
  val default: FC[DataProps] = js.native
  
  type _To = FC[DataProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataMod.foo` */
  override def _to: FC[DataProps] = default
}
