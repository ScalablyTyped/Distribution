package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCustomizeDesignMod.CustomizeDesignProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizeDesignMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/CustomizeDesign", JSImport.Default)
  @js.native
  val default: FC[CustomizeDesignProps] = js.native
  
  type _To = FC[CustomizeDesignProps]
  
  /* This means you don't have to write `default`, but can instead just say `customizeDesignMod.foo` */
  override def _to: FC[CustomizeDesignProps] = default
}
