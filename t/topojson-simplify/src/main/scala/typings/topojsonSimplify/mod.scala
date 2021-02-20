package typings.topojsonSimplify

import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.OrNull
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-simplify", "filter")
  @js.native
  def filter[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = js.native
  
  @JSImport("topojson-simplify", "filterAttached")
  @js.native
  def filterAttached(topology: Topology[Objects[Properties]]): Filter_ = js.native
  
  @JSImport("topojson-simplify", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]]): Filter_ = js.native
  @JSImport("topojson-simplify", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(
    topology: Topology[Objects[Properties]],
    minWeight: js.UndefOr[scala.Nothing],
    weight: RingWeighter
  ): Filter_ = js.native
  @JSImport("topojson-simplify", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  @JSImport("topojson-simplify", "filterAttachedWeight")
  @js.native
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
  
  @JSImport("topojson-simplify", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]]): Filter_ = js.native
  @JSImport("topojson-simplify", "filterWeight")
  @js.native
  def filterWeight(
    topology: Topology[Objects[Properties]],
    minWeight: js.UndefOr[scala.Nothing],
    weight: RingWeighter
  ): Filter_ = js.native
  @JSImport("topojson-simplify", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = js.native
  @JSImport("topojson-simplify", "filterWeight")
  @js.native
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = js.native
  
  @JSImport("topojson-simplify", "planarRingArea")
  @js.native
  def planarRingArea(ring: Ring): Double = js.native
  
  @JSImport("topojson-simplify", "planarTriangleArea")
  @js.native
  def planarTriangleArea(triangle: Triangle): Double = js.native
  
  @JSImport("topojson-simplify", "presimplify")
  @js.native
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  @JSImport("topojson-simplify", "presimplify")
  @js.native
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = js.native
  
  @JSImport("topojson-simplify", "quantile")
  @js.native
  def quantile(topology: Topology[Objects[Properties]], p: Double): Double = js.native
  
  @JSImport("topojson-simplify", "simplify")
  @js.native
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = js.native
  @JSImport("topojson-simplify", "simplify")
  @js.native
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = js.native
  
  @JSImport("topojson-simplify", "sphericalRingArea")
  @js.native
  def sphericalRingArea(ring: Ring, interior: Boolean): Double = js.native
  
  @JSImport("topojson-simplify", "sphericalTriangleArea")
  @js.native
  def sphericalTriangleArea(triangle: Triangle): Double = js.native
  
  type Filter_ = js.Function2[/* ring */ Ring, /* interior */ Boolean, Boolean]
  
  type Ring = js.Array[js.Tuple2[Double, Double]]
  
  type RingWeighter = js.Function1[/* triangle */ Ring, Double]
  
  type Triangle = js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  
  type TriangleWeighter = js.Function1[/* triangle */ Triangle, Double]
}
