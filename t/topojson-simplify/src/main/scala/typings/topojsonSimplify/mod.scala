package typings.topojsonSimplify

import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.OrNull
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-simplify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filter[K /* <: Objects[js.Object] */](topology: Topology[K], filter: Filter_): Topology[OrNull[K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(topology.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Topology[OrNull[K]]]
  
  @scala.inline
  def filterAttached(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttached")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterAttachedWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterAttachedWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]]): Filter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any]).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Double, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  @scala.inline
  def filterWeight(topology: Topology[Objects[Properties]], minWeight: Unit, weight: RingWeighter): Filter_ = (^.asInstanceOf[js.Dynamic].applyDynamic("filterWeight")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Filter_]
  
  @scala.inline
  def planarRingArea(ring: Ring): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarRingArea")(ring.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def planarTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("planarTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  @scala.inline
  def presimplify[T /* <: Objects[js.Object] */](topology: Topology[T], weight: TriangleWeighter): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("presimplify")(topology.asInstanceOf[js.Any], weight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def quantile(topology: Topology[Objects[Properties]], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quantile")(topology.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T]): Topology[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any]).asInstanceOf[Topology[T]]
  @scala.inline
  def simplify[T /* <: Objects[js.Object] */](topology: Topology[T], minWeight: Double): Topology[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(topology.asInstanceOf[js.Any], minWeight.asInstanceOf[js.Any])).asInstanceOf[Topology[T]]
  
  @scala.inline
  def sphericalRingArea(ring: Ring, interior: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sphericalRingArea")(ring.asInstanceOf[js.Any], interior.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def sphericalTriangleArea(triangle: Triangle): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sphericalTriangleArea")(triangle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Filter_ = js.Function2[/* ring */ Ring, /* interior */ Boolean, Boolean]
  
  type Ring = js.Array[js.Tuple2[Double, Double]]
  
  type RingWeighter = js.Function1[/* triangle */ Ring, Double]
  
  type Triangle = js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  
  type TriangleWeighter = js.Function1[/* triangle */ Triangle, Double]
}
