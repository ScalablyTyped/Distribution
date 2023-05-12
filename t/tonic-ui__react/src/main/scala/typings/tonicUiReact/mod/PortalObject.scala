package typings.tonicUiReact.mod

import typings.react.mod.ReactNode
import typings.tonicUiReact.anon.AppendToParentPortal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalObject extends StObject {
  
  def apply(render: js.Function1[/* close */ js.Function0[Unit], ReactNode]): String = js.native
  def apply(render: js.Function1[/* close */ js.Function0[Unit], ReactNode], options: AppendToParentPortal): String = js.native
  
  def remove(id: String): Unit = js.native
}
