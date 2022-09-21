package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.OrthographicCamera")
@js.native
open class OrthographicCamera protected ()
  extends typings.three.mod.OrthographicCamera {
  /**
    * @param left Camera frustum left plane.
    * @param right Camera frustum right plane.
    * @param top Camera frustum top plane.
    * @param bottom Camera frustum bottom plane.
    * @param [near=0.1] Camera frustum near plane.
    * @param [far=2000] Camera frustum far plane.
    */
  def this(
    left: js.UndefOr[Double],
    right: js.UndefOr[Double],
    top: js.UndefOr[Double],
    bottom: js.UndefOr[Double],
    near: js.UndefOr[Double],
    far: js.UndefOr[Double]
  ) = this()
}
