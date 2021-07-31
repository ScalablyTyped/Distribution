package typings.uifabricUtilities

import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.uifabricUtilities.anon.RootRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusRectsMod {
  
  @JSImport("@uifabric/utilities/lib/useFocusRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/useFocusRects", "FocusRects")
  @js.native
  val FocusRects: FunctionComponent[RootRef] = js.native
  
  @scala.inline
  def useFocusRects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")().asInstanceOf[Unit]
  @scala.inline
  def useFocusRects(rootRef: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
