package typings.three.srcGeometriesTorusGeometryMod

import typings.three.Anon_Arc
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TorusGeometry", "TorusBufferGeometry")
@js.native
class TorusBufferGeometry () extends BufferGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, tube: Double) = this()
  def this(radius: Double, tube: Double, radialSegments: Double) = this()
  def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double) = this()
  def this(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, arc: Double) = this()
  var parameters: Anon_Arc = js.native
}

