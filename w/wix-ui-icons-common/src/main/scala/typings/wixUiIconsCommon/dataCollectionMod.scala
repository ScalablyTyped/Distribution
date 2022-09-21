package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataCollectionMod.DataCollectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCollectionMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/DataCollection", JSImport.Default)
  @js.native
  val default: FC[DataCollectionProps] = js.native
  
  type _To = FC[DataCollectionProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataCollectionMod.foo` */
  override def _to: FC[DataCollectionProps] = default
}
