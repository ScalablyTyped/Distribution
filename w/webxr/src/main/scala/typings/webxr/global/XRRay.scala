package typings.webxr.global

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// AR Hit testing
@JSGlobal("XRRay")
@js.native
open class XRRay ()
  extends StObject
     with typings.webxr.XRRay {
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: typings.webxr.XRRigidTransform) = this()
  def this(transformOrOrigin: Unit, direction: DOMPointInit) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  def this(transformOrOrigin: typings.webxr.XRRigidTransform, direction: DOMPointInit) = this()
  
  /* CompleteClass */
  override val direction: DOMPointReadOnly = js.native
  
  /* CompleteClass */
  override val matrix: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  override val origin: DOMPointReadOnly = js.native
}
