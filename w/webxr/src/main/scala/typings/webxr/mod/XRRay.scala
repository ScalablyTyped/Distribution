package typings.webxr.mod

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webxr", "XRRay")
@js.native
class XRRay protected () extends StObject {
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  def this(transformOrOrigin: XRRigidTransform, direction: DOMPointInit) = this()
  
  var direction: DOMPointReadOnly = js.native
  
  var matrix: Float32Array = js.native
  
  var origin: DOMPointReadOnly = js.native
}
