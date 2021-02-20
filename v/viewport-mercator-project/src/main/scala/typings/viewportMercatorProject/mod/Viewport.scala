package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("viewport-mercator-project", "Viewport")
@js.native
class Viewport () extends StObject {
  def this(opts: ViewportOptions) = this()
  
  def equals(viewport: Viewport): Boolean = js.native
  
  var height: Double = js.native
  
  def project(lngLatZ: CoordinatesZ): CoordinatesZ = js.native
  def project(lngLatZ: CoordinatesZ, opts: ProjectOptions): CoordinatesZ = js.native
  def project(lngLat: Coordinates): Coordinates = js.native
  def project(lngLat: Coordinates, opts: ProjectOptions): Coordinates = js.native
  
  var projectionMatrix: ViewMatrix = js.native
  
  var scale: Double = js.native
  
  def unproject(xy: Coordinates): Coordinates = js.native
  def unproject(xy: Coordinates, opts: UnprojectOptions): Coordinates = js.native
  def unproject(xyz: CoordinatesZ): CoordinatesZ = js.native
  def unproject(xyz: CoordinatesZ, opts: UnprojectOptions): CoordinatesZ = js.native
  
  var viewMatrix: ViewMatrix = js.native
  
  var width: Double = js.native
}
