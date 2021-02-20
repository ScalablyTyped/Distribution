package typings.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecation {
  
  @JSImport("websocket", "deprecation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("websocket", "deprecation.disableWarnings")
  @js.native
  def disableWarnings: Boolean = js.native
  @scala.inline
  def disableWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableWarnings")(x.asInstanceOf[js.Any])
  
  @JSImport("websocket", "deprecation.warn")
  @js.native
  def warn(deprecationName: String): Unit = js.native
}
