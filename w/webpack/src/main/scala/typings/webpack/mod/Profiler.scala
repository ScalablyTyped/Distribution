package typings.webpack.mod

import typings.webpack.anon.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profiler extends StObject {
  
  def destroy(): js.Promise[Unit] = js.native
  
  def hasSession(): Boolean = js.native
  
  var inspector: Any = js.native
  
  def sendCommand(): js.Promise[Any] = js.native
  def sendCommand(method: Any): js.Promise[Any] = js.native
  def sendCommand(method: Any, params: Any): js.Promise[Any] = js.native
  def sendCommand(method: Unit, params: Any): js.Promise[Any] = js.native
  
  var session: Any = js.native
  
  def startProfiling(): js.Promise[(js.Tuple3[Any, Any, Any]) | Unit] = js.native
  
  def stopProfiling(): js.Promise[Profile] = js.native
}
