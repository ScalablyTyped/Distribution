package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "PerspectiveCamera")
@js.native
/**
  * Creates a new {@link PerspectiveCamera}.
  * @remarks Together these define the camera's {@link https://en.wikipedia.org/wiki/Viewing_frustum | viewing frustum}.
  * @param fov Camera frustum vertical field of view. Default `50`.
  * @param aspect Camera frustum aspect ratio. Default `1`.
  * @param near Camera frustum near plane. Default `0.1`.
  * @param far Camera frustum far plane. Default `2000`.
  */
open class PerspectiveCamera ()
  extends typings.three.srcThreeMod.PerspectiveCamera {
  def this(fov: Double) = this()
  def this(fov: Double, aspect: Double) = this()
  def this(fov: Unit, aspect: Double) = this()
  def this(fov: Double, aspect: Double, near: Double) = this()
  def this(fov: Double, aspect: Unit, near: Double) = this()
  def this(fov: Unit, aspect: Double, near: Double) = this()
  def this(fov: Unit, aspect: Unit, near: Double) = this()
  def this(fov: Double, aspect: Double, near: Double, far: Double) = this()
  def this(fov: Double, aspect: Double, near: Unit, far: Double) = this()
  def this(fov: Double, aspect: Unit, near: Double, far: Double) = this()
  def this(fov: Double, aspect: Unit, near: Unit, far: Double) = this()
  def this(fov: Unit, aspect: Double, near: Double, far: Double) = this()
  def this(fov: Unit, aspect: Double, near: Unit, far: Double) = this()
  def this(fov: Unit, aspect: Unit, near: Double, far: Double) = this()
  def this(fov: Unit, aspect: Unit, near: Unit, far: Double) = this()
}
