package typings.three.mod

import typings.three.webXRMod.WebGLRenderingContext
import typings.three.webXRMod.XRSession
import typings.three.webXRMod.XRWebGLLayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "XRWebGLLayer")
@js.native
class XRWebGLLayer protected ()
  extends typings.three.webXRMod.XRWebGLLayer {
  def this(session: XRSession) = this()
  def this(session: XRSession, gl: WebGLRenderingContext) = this()
  def this(session: XRSession, gl: Unit, options: XRWebGLLayerInit) = this()
  def this(session: XRSession, gl: WebGLRenderingContext, options: XRWebGLLayerInit) = this()
}
