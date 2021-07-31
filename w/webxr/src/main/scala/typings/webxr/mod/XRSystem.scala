package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRSystem extends StObject {
  
  def isSessionSupported(sessionMode: XRSessionMode): js.Promise[Boolean] = js.native
  
  def requestSession(sessionMode: XRSessionMode): js.Promise[XRSession] = js.native
  def requestSession(sessionMode: XRSessionMode, sessionInit: js.Any): js.Promise[XRSession] = js.native
}
