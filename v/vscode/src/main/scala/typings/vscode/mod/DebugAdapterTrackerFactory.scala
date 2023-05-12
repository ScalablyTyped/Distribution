package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugAdapterTrackerFactory extends StObject {
  
  /**
  		 * The method 'createDebugAdapterTracker' is called at the start of a debug session in order
  		 * to return a "tracker" object that provides read-access to the communication between the editor and a debug adapter.
  		 *
  		 * @param session The {@link DebugSession debug session} for which the debug adapter tracker will be used.
  		 * @return A {@link DebugAdapterTracker debug adapter tracker} or undefined.
  		 */
  def createDebugAdapterTracker(session: DebugSession): ProviderResult[DebugAdapterTracker]
}
object DebugAdapterTrackerFactory {
  
  inline def apply(createDebugAdapterTracker: DebugSession => ProviderResult[DebugAdapterTracker]): DebugAdapterTrackerFactory = {
    val __obj = js.Dynamic.literal(createDebugAdapterTracker = js.Any.fromFunction1(createDebugAdapterTracker))
    __obj.asInstanceOf[DebugAdapterTrackerFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugAdapterTrackerFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateDebugAdapterTracker(value: DebugSession => ProviderResult[DebugAdapterTracker]): Self = StObject.set(x, "createDebugAdapterTracker", js.Any.fromFunction1(value))
  }
}
