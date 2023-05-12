package typings.vec3

import typings.vec3.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vec3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vec3]
  inline def default(coordinates: String): Vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Vec3]
  inline def default(coordinates: js.Tuple3[Double | String, Double | String, Double | String]): Vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Vec3]
  inline def default(coordinates: X): Vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Vec3]
  inline def default(x: String, y: String, z: String): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: String, y: String, z: Double): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: String, y: Double, z: String): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: String, y: Double, z: Double): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: Double, y: String, z: String): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: Double, y: String, z: Double): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: Double, y: Double, z: String): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  inline def default(x: Double, y: Double, z: Double): Vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Vec3]
  
  @JSImport("vec3", "Vec3")
  @js.native
  open class Vec3 protected () extends StObject {
    def this(x: Double, y: Double, z: Double) = this()
    
    /**
      * Return a new instance with copied values that are absolute
      */
    def abs(): Vec3 = js.native
    
    /**
      * Add to own values by vector
      */
    def add(other: Vec3): this.type = js.native
    
    /**
      * Returns a new instance off the cross product to another vector
      */
    def cross(other: Vec3): Vec3 = js.native
    
    /**
      * Return the squared euclidean distance to another vector
      */
    def distanceSquared(other: Vec3): Double = js.native
    
    /**
      * Return the euclidean distance to another vector 
      */
    def distanceTo(other: Vec3): Double = js.native
    
    /**
      * Divide own values by value from vector
      */
    def divide(other: Vec3): this.type = js.native
    
    /**
      * Returns the dot product with another vector
      */
    def dot(other: Vec3): Double = js.native
    
    /**
      * Returns true when all values match with the values off the other vector
      */
    def equals(other: Vec3): Boolean = js.native
    
    /**
      * Floor own values
      */
    def floor(): this.type = js.native
    
    /**
      * Return a new instance with copied values that are floored
      */
    def floored(): Vec3 = js.native
    
    /**
      * Returns the inner product to another vector
      */
    def innerProduct(other: Vec3): Double = js.native
    
    /**
      * Returns the manhattan distance to another vector
      */
    def manhattanDistanceTo(other: Vec3): Double = js.native
    
    /**
      * Return a new instance with the max values by value compared to another vector
      */
    def max(other: Vec3): Vec3 = js.native
    
    /**
      * Return a new instance with the min values by value compared to another vector
      */
    def min(other: Vec3): Vec3 = js.native
    
    /**
      * Return a new instance with copied values that are subtracted by vector
      */
    def minus(other: Vec3): Vec3 = js.native
    
    /**
      * Return a new instance with copied values that are modulated by value from a vector
      */
    def modulus(other: Vec3): Vec3 = js.native
    
    /**
      * Multiply own values by value from vector
      */
    def multiply(other: Vec3): this.type = js.native
    
    /**
      * Returns its own euclidean norm
      */
    def norm(): Double = js.native
    
    /**
      * Normalize own values
      */
    def normalize(): Vec3 = js.native
    
    /**
      * Return a new instance with copied values that are offset by dx dy and dz
      */
    def offset(dx: Double, dy: Double, dz: Double): Vec3 = js.native
    
    /**
      * Return a new instance with copied values that are added to by vector
      */
    def plus(other: Vec3): Vec3 = js.native
    
    /**
      * Round own values to nearest integer
      */
    def round(): this.type = js.native
    
    /**
      * Return a new instance with copied values that are rounded
      */
    def rounded(): Vec3 = js.native
    
    /**
      * Scale own values by a number
      */
    def scale(scalar: Double): this.type = js.native
    
    /**
      * Return a new instance with copied values that are scaled by number
      */
    def scaled(scalar: Double): Vec3 = js.native
    
    /**
      * Set own values to given x y z
      */
    def set(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Subtract own values by vector
      */
    def subtract(other: Vec3): this.type = js.native
    
    /**
      * Returns an array with x y z in array form ie [x, y, z]
      */
    def toArray(): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Translate own values by dx dy and dz
      */
    def translate(dx: Double, dy: Double, dz: Double): this.type = js.native
    
    /**
      * Returns a new instance with copied values normed to the unit vector
      */
    def unit(): Vec3 = js.native
    
    /**
      * Set own values to values given by other
      */
    def update(other: Vec3): this.type = js.native
    
    /**
      * Return the volume off the vector
      */
    def volume(): Double = js.native
    
    var x: Double = js.native
    
    /**
      * Returns the xy distance to another vector
      */
    def xyDistanceTo(other: Vec3): Double = js.native
    
    /**
      * Returns the xz distance to another vector
      */
    def xzDistanceTo(other: Vec3): Double = js.native
    
    var y: Double = js.native
    
    /**
      * Returns the yz distance to another vector
      */
    def yzDistanceTo(other: Vec3): Double = js.native
    
    var z: Double = js.native
  }
}
