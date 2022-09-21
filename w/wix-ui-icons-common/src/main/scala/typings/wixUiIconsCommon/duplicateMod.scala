package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsDuplicateMod.DuplicateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplicateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Duplicate", JSImport.Default)
  @js.native
  val default: FC[DuplicateProps] = js.native
  
  type _To = FC[DuplicateProps]
  
  /* This means you don't have to write `default`, but can instead just say `duplicateMod.foo` */
  override def _to: FC[DuplicateProps] = default
}
