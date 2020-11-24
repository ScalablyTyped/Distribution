package typings.sylvester

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Sylvester")
@js.native
object Sylvester extends js.Object {
  
  @js.native
  trait LineStatic extends js.Object {
    
    var X: Line = js.native
    
    var Y: Line = js.native
    
    var Z: Line = js.native
    
    /**
      * Constructor function.
      *
      * @param Array<number>|Vector anchor The anchor vector.
      * @param Array<number>|Vector direction The direction vector.
      */
    def create(anchor: js.Array[Double], direction: js.Array[Double]): Line = js.native
    def create(anchor: js.Array[Double], direction: Vector): Line = js.native
    def create(anchor: Vector, direction: js.Array[Double]): Line = js.native
    def create(anchor: Vector, direction: Vector): Line = js.native
  }
  
  @js.native
  trait MatrixStatic extends js.Object {
    
    /**
      * Diagonal matrix - all off-diagonal elements are zero
      *
      * @param {any} elements The elements.
      */
    def Diagonal(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
    def Diagonal(elements: Matrix): Matrix = js.native
    def Diagonal(elements: Vector): Matrix = js.native
    
    /**
      * Identity matrix of size n.
      *
      * @param {number} n The size.
      */
    def I(n: Double): Matrix = js.native
    
    /**
      * Random matrix of n rows, m columns.
      *
      * @param {number} n The number of rows.
      * @param {number} m The number of columns.
      */
    def Random(n: Double, m: Double): Matrix = js.native
    
    /**
      * Rotation matrix about some axis. If no axis is supplied, assume we're after a 2D transform.
      *
      * @param {number} theta The angle in radians.
      * @param {Vector} a [Optional] The axis.
      */
    def Rotation(theta: Double): Matrix = js.native
    def Rotation(theta: Double, a: Vector): Matrix = js.native
    
    def RotationX(t: Double): Matrix = js.native
    
    def RotationY(t: Double): Matrix = js.native
    
    def RotationZ(t: Double): Matrix = js.native
    
    /**
      * Matrix filled with zeros.
      *
      * @param {number} n The number of rows.
      * @param {number} m The number of columns.
      */
    def Zero(n: Double, m: Double): Matrix = js.native
    
    /**
      * Constructor function.
      *
      * @param {Array<number>|Array<Array<number>>|Vector|Matrix} elements The elements.
      */
    def create(elements: js.Array[js.Array[Double] | Double]): Matrix = js.native
    def create(elements: Matrix): Matrix = js.native
    def create(elements: Vector): Matrix = js.native
  }
  
  @js.native
  trait PlaneStatic extends js.Object {
    
    var XY: Plane = js.native
    
    var YX: Plane = js.native
    
    var YZ: Plane = js.native
    
    var ZX: Plane = js.native
    
    /**
      * Constructor function.
      */
    def create(anchor: js.Array[Double], normal: js.Array[Double]): Plane = js.native
    def create(anchor: js.Array[Double], normal: Vector): Plane = js.native
    /**
      * Constructor function.
      */
    def create(anchor: js.Array[Double], v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
    def create(anchor: js.Array[Double], v1: js.Array[Double], v2: Vector): Plane = js.native
    def create(anchor: js.Array[Double], v1: Vector, v2: js.Array[Double]): Plane = js.native
    def create(anchor: js.Array[Double], v1: Vector, v2: Vector): Plane = js.native
    def create(anchor: Vector, normal: js.Array[Double]): Plane = js.native
    def create(anchor: Vector, normal: Vector): Plane = js.native
    def create(anchor: Vector, v1: js.Array[Double], v2: js.Array[Double]): Plane = js.native
    def create(anchor: Vector, v1: js.Array[Double], v2: Vector): Plane = js.native
    def create(anchor: Vector, v1: Vector, v2: js.Array[Double]): Plane = js.native
    def create(anchor: Vector, v1: Vector, v2: Vector): Plane = js.native
  }
  
  @js.native
  trait VectorStatic extends js.Object {
    
    /**
      * Random vector of size n.
      *
      * @param {number} n The vector size.
      */
    def Random(n: Double): Vector = js.native
    
    /**
      * Vector filled with zeros.
      *
      * @param {number} n The vector size.
      */
    def Zero(n: Double): Vector = js.native
    
    def create(elements: js.Array[Double]): Vector = js.native
    /**
      * Constructor function.
      */
    def create(elements: Vector): Vector = js.native
    
    var i: Vector = js.native
    
    var j: Vector = js.native
    
    var k: Vector = js.native
  }
}
