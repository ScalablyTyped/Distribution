package typings.three

import typings.three.matrix4Mod.Matrix4
import typings.three.quaternionMod.Quaternion
import typings.three.threeBooleans.`true`
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eulerMod {
  
  @JSImport("three/src/math/Euler", "Euler")
  @js.native
  class Euler () extends StObject {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      order: String
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, order: String) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], order: String) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, order: String) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], order: String) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, order: String) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], order: String) = this()
    def this(x: Double, y: Double, z: Double, order: String) = this()
    
    def _onChange(callback: js.Function): this.type = js.native
    
    var _onChangeCallback: js.Function = js.native
    
    def copy(euler: Euler): this.type = js.native
    
    def equals(euler: Euler): Boolean = js.native
    
    def fromArray(xyzo: js.Array[_]): Euler = js.native
    
    val isEuler: `true` = js.native
    
    /**
    	 * @default THREE.Euler.DefaultOrder
    	 */
    var order: String = js.native
    
    def reorder(newOrder: String): Euler = js.native
    
    def set(x: Double, y: Double, z: Double): Euler = js.native
    def set(x: Double, y: Double, z: Double, order: String): Euler = js.native
    
    def setFromQuaternion(q: Quaternion): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: String): Euler = js.native
    
    def setFromRotationMatrix(m: Matrix4): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: String): Euler = js.native
    
    def setFromVector3(v: Vector3): Euler = js.native
    def setFromVector3(v: Vector3, order: String): Euler = js.native
    
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    
    def toVector3(): Vector3 = js.native
    def toVector3(optionalResult: Vector3): Vector3 = js.native
    
    /**
    	 * @default 0
    	 */
    var x: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var y: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var z: Double = js.native
  }
  /* static members */
  object Euler {
    
    @JSImport("three/src/math/Euler", "Euler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/math/Euler", "Euler.DefaultOrder")
    @js.native
    def DefaultOrder: String = js.native
    @scala.inline
    def DefaultOrder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOrder")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/math/Euler", "Euler.RotationOrders")
    @js.native
    def RotationOrders: js.Array[String] = js.native
    @scala.inline
    def RotationOrders_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationOrders")(x.asInstanceOf[js.Any])
  }
}
