package typings.three.webXRMod

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XR extends EventTarget {
  
  def isSessionSupported(mode: XRSessionMode): js.Promise[Boolean] = js.native
  
  def requestSession(mode: XRSessionMode): js.Promise[XRSession] = js.native
  def requestSession(mode: XRSessionMode, options: XRSessionInit): js.Promise[XRSession] = js.native
}
