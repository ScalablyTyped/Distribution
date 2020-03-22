package typings.three.mod

import typings.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CubeCamera")
@js.native
class CubeCamera ()
  extends typings.three.cubeCameraMod.CubeCamera {
  def this(near: Double) = this()
  def this(near: Double, far: Double) = this()
  def this(near: Double, far: Double, cubeResolution: Double) = this()
  def this(near: Double, far: Double, cubeResolution: Double, options: WebGLRenderTargetOptions) = this()
}

