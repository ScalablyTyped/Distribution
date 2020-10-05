package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "CubeCamera")
@js.native
class CubeCamera protected ()
  extends typings.three.cubeCameraMod.CubeCamera {
  def this(
    near: Double,
    far: Double,
    renderTarget: typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
  ) = this()
}

