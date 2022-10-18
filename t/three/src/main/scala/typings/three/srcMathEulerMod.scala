package typings.three

import typings.std.Generator
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathEulerMod {
  
  @JSImport("three/src/math/Euler", "Euler")
  @js.native
  open class Euler () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, order: String) = this()
    def this(x: Double, y: Double, z: Unit, order: String) = this()
    def this(x: Double, y: Unit, z: Double, order: String) = this()
    def this(x: Double, y: Unit, z: Unit, order: String) = this()
    def this(x: Unit, y: Double, z: Double, order: String) = this()
    def this(x: Unit, y: Double, z: Unit, order: String) = this()
    def this(x: Unit, y: Unit, z: Double, order: String) = this()
    def this(x: Unit, y: Unit, z: Unit, order: String) = this()
    
    def _onChange(callback: js.Function0[Unit]): this.type = js.native
    
    def _onChangeCallback(): Unit = js.native
    
    def copy(euler: Euler): this.type = js.native
    
    def equals(euler: Euler): Boolean = js.native
    
    def fromArray(xyzo: js.Array[Any]): Euler = js.native
    
    val isEuler: `true` = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[String | Double, Unit, Any]] = js.native
    
    /**
      * @default THREE.Euler.DefaultOrder
      */
    var order: String = js.native
    
    def reorder(newOrder: String): Euler = js.native
    
    def set(x: Double, y: Double, z: Double): Euler = js.native
    def set(x: Double, y: Double, z: Double, order: String): Euler = js.native
    
    def setFromQuaternion(q: Quaternion): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: String): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: String, update: Boolean): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: Unit, update: Boolean): Euler = js.native
    
    def setFromRotationMatrix(m: Matrix4): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: String): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: String, update: Boolean): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: Unit, update: Boolean): Euler = js.native
    
    def setFromVector3(v: Vector3): Euler = js.native
    def setFromVector3(v: Vector3, order: String): Euler = js.native
    
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toArray(array: Unit, offset: Double): js.Array[Double] = js.native
    
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
    inline def DefaultOrder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOrder")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/math/Euler", "Euler.RotationOrders")
    @js.native
    def RotationOrders: js.Array[String] = js.native
    inline def RotationOrders_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationOrders")(x.asInstanceOf[js.Any])
  }
}
