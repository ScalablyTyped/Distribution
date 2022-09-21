package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.tagLargeMod.TagLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTagLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/TagLarge", JSImport.Default)
  @js.native
  val default: FC[TagLargeProps] = js.native
  
  type _To = FC[TagLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTagLargeMod.foo` */
  override def _to: FC[TagLargeProps] = default
}
