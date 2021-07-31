package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("@uifabric/utilities/lib/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addDirectionalKeyCode(which: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDirectionalKeyCode")(which.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isDirectionalKeyCode(which: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionalKeyCode")(which.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
