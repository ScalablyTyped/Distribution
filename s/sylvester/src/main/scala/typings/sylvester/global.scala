package typings.sylvester

import typings.sylvester.Sylvester.LineStatic
import typings.sylvester.Sylvester.MatrixStatic
import typings.sylvester.Sylvester.PlaneStatic
import typings.sylvester.Sylvester.VectorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
  * Constructor function.
  *
  * @param Array<number>|Vector anchor The anchor vector.
  * @param Array<number>|Vector direction The direction vector.
  */
  @JSGlobal("$L")
  @js.native
  def L(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
  @JSGlobal("$L")
  @js.native
  def L(anchor: js.Array[Double], direction: Vector): Line = js.native
  @JSGlobal("$L")
  @js.native
  def L(anchor: Vector, direction: js.Array[Double]): Line = js.native
  @JSGlobal("$L")
  @js.native
  def L(anchor: Vector, direction: Vector): Line = js.native
  
  @JSGlobal("Line")
  @js.native
  def Line: LineStatic = js.native
  @scala.inline
  def Line_=(x: LineStatic): Unit = js.Dynamic.global.updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /**
  * Constructor function.
  *
  * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
  */
  @JSGlobal("$M")
  @js.native
  def M(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
  @JSGlobal("$M")
  @js.native
  def M(elements: Matrix): Matrix = js.native
  @JSGlobal("$M")
  @js.native
  def M(elements: Vector): Matrix = js.native
  
  @JSGlobal("Matrix")
  @js.native
  def Matrix: MatrixStatic = js.native
  @scala.inline
  def Matrix_=(x: MatrixStatic): Unit = js.Dynamic.global.updateDynamic("Matrix")(x.asInstanceOf[js.Any])
  
  /**
  * Constructor function.
  *
  * @param {Array<number>|Vector} anchor The anchor vector.
  * @param {Array<number>|Vector} normal The normal vector.
  */
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], normal: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], normal: Vector): Plane = js.native
  /**
    * Constructor function.
    *
    * @param {Array<number>|Vector} anchor The anchor vector.
    * @param {Array<number>|Vector} v1 The first direction vector.
    * @param {Array<number>|Vecotr} v2 The second direction vector.
    */
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, normal: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, normal: Vector): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
  @JSGlobal("$P")
  @js.native
  def P(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  
  @JSGlobal("Plane")
  @js.native
  def Plane: PlaneStatic = js.native
  @scala.inline
  def Plane_=(x: PlaneStatic): Unit = js.Dynamic.global.updateDynamic("Plane")(x.asInstanceOf[js.Any])
  
  object Sylvester {
    
    @JSGlobal("Sylvester")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Sylvester.precision")
    @js.native
    def precision: Double = js.native
    @scala.inline
    def precision_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("precision")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Sylvester.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("$V")
  @js.native
  def V(elements: js.Array[Double]): Vector = js.native
  /**
  * Constructor function.
  *
  * @param {Vector|Array<number} elements The elements.
  */
  @JSGlobal("$V")
  @js.native
  def V(elements: Vector): Vector = js.native
  
  @JSGlobal("Vector")
  @js.native
  def Vector: VectorStatic = js.native
  @scala.inline
  def Vector_=(x: VectorStatic): Unit = js.Dynamic.global.updateDynamic("Vector")(x.asInstanceOf[js.Any])
}
