package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPackageMod.PackageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Package", JSImport.Default)
  @js.native
  val default: FC[PackageProps] = js.native
  
  type _To = FC[PackageProps]
  
  /* This means you don't have to write `default`, but can instead just say `packageMod.foo` */
  override def _to: FC[PackageProps] = default
}
