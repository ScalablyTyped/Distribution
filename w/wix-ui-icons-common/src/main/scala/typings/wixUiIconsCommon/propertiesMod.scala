package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPropertiesMod.PropertiesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Properties", JSImport.Default)
  @js.native
  val default: FC[PropertiesProps] = js.native
  
  type _To = FC[PropertiesProps]
  
  /* This means you don't have to write `default`, but can instead just say `propertiesMod.foo` */
  override def _to: FC[PropertiesProps] = default
}
