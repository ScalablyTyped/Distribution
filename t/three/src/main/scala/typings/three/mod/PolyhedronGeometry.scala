package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "PolyhedronGeometry")
@js.native
/**
  * @param vertices
  * @param indices
  * @param [radius=1]
  * @param [detail=0]
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
  
  @JSImport("three", "PolyhedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesPolyhedronGeometryMod.PolyhedronGeometry]
}
