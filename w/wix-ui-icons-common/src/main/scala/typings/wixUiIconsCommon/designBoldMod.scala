package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDesignBoldMod.DesignBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object designBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DesignBold", JSImport.Default)
  @js.native
  val default: FC[DesignBoldProps] = js.native
  
  type _To = FC[DesignBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `designBoldMod.foo` */
  override def _to: FC[DesignBoldProps] = default
}
