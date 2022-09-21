package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.attach
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.attachForSuspendedLaunch
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.launch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLocalProcess extends StObject {
  
  /** If true, the process is running on the same computer as the debug adapter. */
  var isLocalProcess: js.UndefOr[Boolean] = js.undefined
  
  /** The logical name of the process. This is usually the full path to process's executable file. Example: /home/example/myproj/program.js. */
  var name: String
  
  /** The size of a pointer or address for this process, in bits. This value may be used by clients when formatting addresses for display. */
  var pointerSize: js.UndefOr[Double] = js.undefined
  
  /** Describes how the debug engine started debugging this process.
  				'launch': Process was launched under the debugger.
  				'attach': Debugger attached to an existing process.
  				'attachForSuspendedLaunch': A project launcher component has launched a new process in a suspended state and then asked the debugger to attach.
  			*/
  var startMethod: js.UndefOr[launch | attach | attachForSuspendedLaunch] = js.undefined
  
  /** The system process id of the debugged process. This property is missing for non-system processes. */
  var systemProcessId: js.UndefOr[Double] = js.undefined
}
object IsLocalProcess {
  
  inline def apply(name: String): IsLocalProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLocalProcess]
  }
  
  extension [Self <: IsLocalProcess](x: Self) {
    
    inline def setIsLocalProcess(value: Boolean): Self = StObject.set(x, "isLocalProcess", value.asInstanceOf[js.Any])
    
    inline def setIsLocalProcessUndefined: Self = StObject.set(x, "isLocalProcess", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPointerSize(value: Double): Self = StObject.set(x, "pointerSize", value.asInstanceOf[js.Any])
    
    inline def setPointerSizeUndefined: Self = StObject.set(x, "pointerSize", js.undefined)
    
    inline def setStartMethod(value: launch | attach | attachForSuspendedLaunch): Self = StObject.set(x, "startMethod", value.asInstanceOf[js.Any])
    
    inline def setStartMethodUndefined: Self = StObject.set(x, "startMethod", js.undefined)
    
    inline def setSystemProcessId(value: Double): Self = StObject.set(x, "systemProcessId", value.asInstanceOf[js.Any])
    
    inline def setSystemProcessIdUndefined: Self = StObject.set(x, "systemProcessId", js.undefined)
  }
}
