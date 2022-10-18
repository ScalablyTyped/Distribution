package typings.three

import typings.std.ArrayLike
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathSphericalHarmonics3Mod {
  
  @JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
  @js.native
  open class SphericalHarmonics3 () extends StObject {
    
    def add(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
    
    def addScaledSH(sh: SphericalHarmonics3, s: Double): SphericalHarmonics3 = js.native
    
    /**
      * @default [new THREE.Vector3(), new THREE.Vector3(), new THREE.Vector3(), new THREE.Vector3(),
      * new THREE.Vector3(), new THREE.Vector3(), new THREE.Vector3(), new THREE.Vector3(), new THREE.Vector3()]
      */
    var coefficients: js.Array[Vector3] = js.native
    
    def copy(sh: SphericalHarmonics3): SphericalHarmonics3 = js.native
    
    def equals(sh: SphericalHarmonics3): Boolean = js.native
    
    /**
      * Sets the values of this spherical harmonics from the provided array or array-like.
      * @param array the source array or array-like.
      * @param offset (optional) offset into the array. Default is 0.
      */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    def getAt(normal: Vector3, target: Vector3): Vector3 = js.native
    
    def getIrradianceAt(normal: Vector3, target: Vector3): Vector3 = js.native
    
    val isSphericalHarmonics3: `true` = js.native
    
    def lerp(sh: SphericalHarmonics3, alpha: Double): SphericalHarmonics3 = js.native
    
    def scale(s: Double): SphericalHarmonics3 = js.native
    
    def set(coefficients: js.Array[Vector3]): SphericalHarmonics3 = js.native
    
    /**
      * Returns an array with the values of this spherical harmonics, or copies them into the provided array.
      * @param array (optional) array to store the spherical harmonics to. If this is not provided, a new array will be created.
      * @param offset (optional) optional offset into the array.
      * @return The created or provided array.
      */
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): js.Array[Double] = js.native
    /**
      * Returns an array with the values of this spherical harmonics, or copies them into the provided array-like.
      * @param array array-like to store the spherical harmonics to.
      * @param offset (optional) optional offset into the array-like.
      * @return The provided array-like.
      */
    def toArray(array: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(array: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
    
    def zero(): SphericalHarmonics3 = js.native
  }
  /* static members */
  object SphericalHarmonics3 {
    
    @JSImport("three/src/math/SphericalHarmonics3", "SphericalHarmonics3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBasisAt(normal: Vector3, shBasis: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasisAt")(normal.asInstanceOf[js.Any], shBasis.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
