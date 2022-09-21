package typings.terraActionHeader

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.terraActionHeader.actionHeaderMod.ActionHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("terra-action-header", JSImport.Default)
  @js.native
  val default: FC[ActionHeaderProps] = js.native
  
  type _To = FC[ActionHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[ActionHeaderProps] = default
}
