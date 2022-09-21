package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDesignMod.DesignProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object designMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Design", JSImport.Default)
  @js.native
  val default: FC[DesignProps] = js.native
  
  type _To = FC[DesignProps]
  
  /* This means you don't have to write `default`, but can instead just say `designMod.foo` */
  override def _to: FC[DesignProps] = default
}
