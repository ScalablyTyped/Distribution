package typings
package topojsonDashSimplifyLib.topojsonDashSimplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-simplify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filter[K /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[K], filter: Filter): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[topojsonDashSpecificationLib.topojsonDashSpecificationMod.OrNull[K]] = js.native
  def filterAttached(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): Filter = js.native
  def filterAttachedWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): Filter = js.native
  def filterAttachedWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    minWeight: scala.Double
  ): Filter = js.native
  def filterAttachedWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    minWeight: scala.Double,
    weight: RingWeighter
  ): Filter = js.native
  def filterWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ]
  ): Filter = js.native
  def filterWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    minWeight: scala.Double
  ): Filter = js.native
  def filterWeight(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    minWeight: scala.Double,
    weight: RingWeighter
  ): Filter = js.native
  def planarRingArea(ring: Ring): scala.Double = js.native
  def planarTriangleArea(triangle: Triangle): scala.Double = js.native
  def presimplify[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T]): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def presimplify[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T],
    weight: TriangleWeighter
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def quantile(
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ],
    p: scala.Double
  ): scala.Double = js.native
  def simplify[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T]): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def simplify[T /* <: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[js.Object] */](
    topology: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T],
    minWeight: scala.Double
  ): topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[T] = js.native
  def sphericalRingArea(ring: Ring, interior: scala.Boolean): scala.Double = js.native
  def sphericalTriangleArea(triangle: Triangle): scala.Double = js.native
}

