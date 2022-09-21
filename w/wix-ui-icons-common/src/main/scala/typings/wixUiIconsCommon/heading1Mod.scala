package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHeading1Mod.Heading1Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heading1Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Heading1", JSImport.Default)
  @js.native
  val default: FC[Heading1Props] = js.native
  
  type _To = FC[Heading1Props]
  
  /* This means you don't have to write `default`, but can instead just say `heading1Mod.foo` */
  override def _to: FC[Heading1Props] = default
}
