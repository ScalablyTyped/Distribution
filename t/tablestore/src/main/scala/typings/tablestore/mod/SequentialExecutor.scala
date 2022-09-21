package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablestore", "SequentialExecutor")
@js.native
open class SequentialExecutor () extends StObject {
  
  def on(eventName: String, listener: js.Function0[Unit]): SequentialExecutor = js.native
  
  def onAsync(eventName: String, listener: js.Function0[Unit]): SequentialExecutor = js.native
  
  def removeAllListeners(eventName: String): SequentialExecutor = js.native
  
  def removeListener(eventName: String, listener: js.Function0[Unit]): SequentialExecutor = js.native
}
