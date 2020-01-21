package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("viewport-mercator-project", "Viewport")
@js.native
class Viewport () extends js.Object {
  def this(opts: ViewportOptions) = this()
  var height: Double = js.native
  var projectionMatrix: ViewMatrix = js.native
  var scale: Double = js.native
  var viewMatrix: ViewMatrix = js.native
  var width: Double = js.native
  def equals(viewport: Viewport): Boolean = js.native
  def project(lngLatZ: CoordinatesZ): CoordinatesZ = js.native
  def project(lngLatZ: CoordinatesZ, opts: ProjectOptions): CoordinatesZ = js.native
  def project(lngLat: Coordinates): Coordinates = js.native
  def project(lngLat: Coordinates, opts: ProjectOptions): Coordinates = js.native
  def unproject(xy: Coordinates): Coordinates = js.native
  def unproject(xy: Coordinates, opts: UnprojectOptions): Coordinates = js.native
  def unproject(xyz: CoordinatesZ): CoordinatesZ = js.native
  def unproject(xyz: CoordinatesZ, opts: UnprojectOptions): CoordinatesZ = js.native
}

