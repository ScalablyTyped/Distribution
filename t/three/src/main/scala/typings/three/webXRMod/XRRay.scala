package typings.three.webXRMod

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXR", "XRRay")
@js.native
class XRRay protected () extends js.Object {
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit, direction: XRRayDirectionInit) = this()
  def this(transformOrOrigin: XRRigidTransform, direction: XRRayDirectionInit) = this()
  
  val direction: XRRayDirectionInit = js.native
  
  var matrix: Float32Array = js.native
  
  val origin: DOMPointReadOnly = js.native
}
