package typings.tizenAccessory

import typings.tizenAccessory.tizenAccessoryStrings.ATTACHED
import typings.tizenAccessory.tizenAccessoryStrings.DETACHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAManager extends StObject {
  
  def requestSAAgent(success: js.Function1[/* agents */ js.Array[SAAgent], Unit]): Unit = js.native
  def requestSAAgent(
    success: js.Function1[/* agents */ js.Array[SAAgent], Unit],
    error: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  
  def setDeviceStatusListener(callback: js.Function2[/* type */ SATransport, /* status */ DETACHED | ATTACHED, Unit]): Unit = js.native
}
