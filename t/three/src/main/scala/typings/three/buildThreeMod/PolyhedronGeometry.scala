package typings.three.buildThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "PolyhedronGeometry")
@js.native
/**
  * Create a new instance of {@link PolyhedronGeometry}
  * @param vertices Array of points of the form [1,1,1, -1,-1,-1, ... ]. Default `[]`.
  * @param indices Array of indices that make up the faces of the form [0,1,2, 2,3,0, ... ]. Default `[]`.
  * @param radius [page:The radius of the final shape Expects a `Float`. Default `1`
  * @param detail [page:How many levels to subdivide the geometry. The more detail, the smoother the shape. Expects a `Integer`. Default `0`
  */
open class PolyhedronGeometry ()
  extends typings.three.srcThreeMod.PolyhedronGeometry {
  def this(vertices: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double]) = this()
  def this(vertices: Unit, indices: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double) = this()
  def this(vertices: js.Array[Double], indices: Unit, radius: Double) = this()
  def this(vertices: Unit, indices: js.Array[Double], radius: Double) = this()
  def this(vertices: Unit, indices: Unit, radius: Double) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Double, detail: Double) = this()
  def this(vertices: js.Array[Double], indices: js.Array[Double], radius: Unit, detail: Double) = this()
  def this(vertices: js.Array[Double], indices: Unit, radius: Double, detail: Double) = this()
  def this(vertices: js.Array[Double], indices: Unit, radius: Unit, detail: Double) = this()
  def this(vertices: Unit, indices: js.Array[Double], radius: Double, detail: Double) = this()
  def this(vertices: Unit, indices: js.Array[Double], radius: Unit, detail: Double) = this()
  def this(vertices: Unit, indices: Unit, radius: Double, detail: Double) = this()
  def this(vertices: Unit, indices: Unit, radius: Unit, detail: Double) = this()
}
/* static members */
object PolyhedronGeometry {
  
  @JSImport("three/build/three", "PolyhedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry]
}
