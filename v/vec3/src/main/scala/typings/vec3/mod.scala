package typings.vec3

import typings.vec3.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vec3", "Vec3")
  @js.native
  class Vec3 protected () extends StObject {
    def this(locationStr: String) = this()
    def this(location: js.Array[Double]) = this()
    def this(location: X) = this()
    def this(x: Double, y: Double, z: Double) = this()
    
    def abs(): Vec3 = js.native
    
    def add(other: Vec3): Vec3 = js.native
    
    def distanceTo(other: Vec3): Double = js.native
    
    def equals(other: Vec3): Boolean = js.native
    
    def floor(): Vec3 = js.native
    
    def floored(): Vec3 = js.native
    
    def max(other: Vec3): Vec3 = js.native
    
    def min(other: Vec3): Vec3 = js.native
    
    def minus(other: Vec3): Vec3 = js.native
    
    def modulus(): Vec3 = js.native
    
    def offset(dx: Double, dy: Double, dz: Double): Vec3 = js.native
    
    def plus(other: Vec3): Vec3 = js.native
    
    def scaled(scalar: Double): Vec3 = js.native
    
    def set(x: Double, y: Double, z: Double): Vec3 = js.native
    
    def substract(other: Vec3): Vec3 = js.native
    
    def translate(dx: Double, dy: Double, dz: Double): Vec3 = js.native
    
    def update(other: Vec3): Vec3 = js.native
    
    def volume(): Double = js.native
  }
}
