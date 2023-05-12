package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "OrthographicCamera")
@js.native
open class OrthographicCamera protected ()
  extends typings.three.srcThreeMod.OrthographicCamera {
  /**
    * Creates a new {@link OrthographicCamera}.
    * @remarks Together these define the camera's {@link https://en.wikipedia.org/wiki/Viewing_frustum | viewing frustum}.
    * @param left Camera frustum left plane. Default `-1`.
    * @param right Camera frustum right plane. Default `1`.
    * @param top Camera frustum top plane. Default `1`.
    * @param bottom Camera frustum bottom plane. Default `-1`.
    * @param near Camera frustum near plane. Default `0.1`.
    * @param far Camera frustum far plane. Default `2000`.
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
