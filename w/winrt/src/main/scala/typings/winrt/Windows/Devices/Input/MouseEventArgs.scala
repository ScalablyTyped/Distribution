package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEventArgs
  extends StObject
     with IMouseEventArgs
object MouseEventArgs {
  
  @scala.inline
  def apply(mouseDelta: MouseDelta): MouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEventArgs]
  }
}
