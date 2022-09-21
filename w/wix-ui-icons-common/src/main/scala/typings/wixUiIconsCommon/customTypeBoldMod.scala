package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCustomTypeBoldMod.CustomTypeBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customTypeBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/CustomTypeBold", JSImport.Default)
  @js.native
  val default: FC[CustomTypeBoldProps] = js.native
  
  type _To = FC[CustomTypeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `customTypeBoldMod.foo` */
  override def _to: FC[CustomTypeBoldProps] = default
}
