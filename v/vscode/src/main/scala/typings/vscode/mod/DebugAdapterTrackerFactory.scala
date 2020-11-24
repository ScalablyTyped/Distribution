package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugAdapterTrackerFactory extends js.Object {
  
  /**
    * The method 'createDebugAdapterTracker' is called at the start of a debug session in order
    * to return a "tracker" object that provides read-access to the communication between VS Code and a debug adapter.
    *
    * @param session The [debug session](#DebugSession) for which the debug adapter tracker will be used.
    * @return A [debug adapter tracker](#DebugAdapterTracker) or undefined.
    */
  def createDebugAdapterTracker(session: DebugSession): ProviderResult[DebugAdapterTracker] = js.native
}
object DebugAdapterTrackerFactory {
  
  @scala.inline
  def apply(createDebugAdapterTracker: DebugSession => ProviderResult[DebugAdapterTracker]): DebugAdapterTrackerFactory = {
    val __obj = js.Dynamic.literal(createDebugAdapterTracker = js.Any.fromFunction1(createDebugAdapterTracker))
    __obj.asInstanceOf[DebugAdapterTrackerFactory]
  }
  
  @scala.inline
  implicit class DebugAdapterTrackerFactoryOps[Self <: DebugAdapterTrackerFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateDebugAdapterTracker(value: DebugSession => ProviderResult[DebugAdapterTracker]): Self = this.set("createDebugAdapterTracker", js.Any.fromFunction1(value))
  }
}
