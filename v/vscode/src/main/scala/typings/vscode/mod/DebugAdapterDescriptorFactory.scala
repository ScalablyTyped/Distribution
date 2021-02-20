package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugAdapterDescriptorFactory extends StObject {
  
  /**
    * 'createDebugAdapterDescriptor' is called at the start of a debug session to provide details about the debug adapter to use.
    * These details must be returned as objects of type [DebugAdapterDescriptor](#DebugAdapterDescriptor).
    * Currently two types of debug adapters are supported:
    * - a debug adapter executable is specified as a command path and arguments (see [DebugAdapterExecutable](#DebugAdapterExecutable)),
    * - a debug adapter server reachable via a communication port (see [DebugAdapterServer](#DebugAdapterServer)).
    * If the method is not implemented the default behavior is this:
    *   createDebugAdapter(session: DebugSession, executable: DebugAdapterExecutable) {
    *      if (typeof session.configuration.debugServer === 'number') {
    *         return new DebugAdapterServer(session.configuration.debugServer);
    *      }
    *      return executable;
    *   }
    * @param session The [debug session](#DebugSession) for which the debug adapter will be used.
    * @param executable The debug adapter's executable information as specified in the package.json (or undefined if no such information exists).
    * @return a [debug adapter descriptor](#DebugAdapterDescriptor) or undefined.
    */
  def createDebugAdapterDescriptor(session: DebugSession): ProviderResult[DebugAdapterDescriptor] = js.native
  def createDebugAdapterDescriptor(session: DebugSession, executable: DebugAdapterExecutable): ProviderResult[DebugAdapterDescriptor] = js.native
}
