package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsColorBucketMod.ColorBucketProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorBucketMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ColorBucket", JSImport.Default)
  @js.native
  val default: FC[ColorBucketProps] = js.native
  
  type _To = FC[ColorBucketProps]
  
  /* This means you don't have to write `default`, but can instead just say `colorBucketMod.foo` */
  override def _to: FC[ColorBucketProps] = default
}
