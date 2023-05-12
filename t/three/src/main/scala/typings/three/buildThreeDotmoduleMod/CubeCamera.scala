package typings.three.buildThreeDotmoduleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.module", "CubeCamera")
@js.native
open class CubeCamera protected ()
  extends typings.three.srcThreeMod.CubeCamera {
  /**
    * Constructs a {@link CubeCamera} that contains 6 {@link PerspectiveCamera | PerspectiveCameras} that render to a {@link THREE.WebGLCubeRenderTarget | WebGLCubeRenderTarget}.
    * @param near The near clipping distance.
    * @param far The far clipping distance.
    * @param renderTarget The destination cube render target.
    */
  def this(
    near: Double,
    far: Double,
    renderTarget: typings.three.srcRenderersWebGLCubeRenderTargetMod.WebGLCubeRenderTarget
  ) = this()
}
