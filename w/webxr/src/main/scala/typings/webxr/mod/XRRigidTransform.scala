package typings.webxr.mod

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webxr", "XRRigidTransform")
@js.native
class XRRigidTransform () extends js.Object {
  def this(position: DOMPointInit) = this()
  def this(position: js.UndefOr[scala.Nothing], direction: DOMPointInit) = this()
  def this(position: DOMPointInit, direction: DOMPointInit) = this()
  
  var inverse: XRRigidTransform = js.native
  
  var matrix: Float32Array = js.native
  
  var orientation: DOMPointReadOnly = js.native
  
  var position: DOMPointReadOnly = js.native
}
