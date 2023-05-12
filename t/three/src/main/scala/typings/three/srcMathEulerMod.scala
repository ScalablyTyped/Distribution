package typings.three

import typings.std.Generator
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import typings.three.threeStrings.XYZ
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
    def this(x: Double, y: Double, z: Double, order: EulerOrder) = this()
    def this(x: Double, y: Double, z: Unit, order: EulerOrder) = this()
    def this(x: Double, y: Unit, z: Double, order: EulerOrder) = this()
    def this(x: Double, y: Unit, z: Unit, order: EulerOrder) = this()
    def this(x: Unit, y: Double, z: Double, order: EulerOrder) = this()
    def this(x: Unit, y: Double, z: Unit, order: EulerOrder) = this()
    def this(x: Unit, y: Unit, z: Double, order: EulerOrder) = this()
    def this(x: Unit, y: Unit, z: Unit, order: EulerOrder) = this()
    
    def _onChange(callback: js.Function0[Unit]): this.type = js.native
    
    def _onChangeCallback(): Unit = js.native
    
    def copy(euler: Euler): this.type = js.native
    
    def equals(euler: Euler): Boolean = js.native
    
    def fromArray(xyzo: Array[js.UndefOr[Double | EulerOrder | Any]]): Euler = js.native
    
    val isEuler: `true` = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[String | Double, Unit, Any]] = js.native
    
    /**
      * @default THREE.Euler.DEFAULT_ORDER
      */
    var order: EulerOrder = js.native
    
    def reorder(newOrder: EulerOrder): Euler = js.native
    
    def set(x: Double, y: Double, z: Double): Euler = js.native
    def set(x: Double, y: Double, z: Double, order: EulerOrder): Euler = js.native
    
    def setFromQuaternion(q: Quaternion): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: Unit, update: Boolean): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: EulerOrder): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: EulerOrder, update: Boolean): Euler = js.native
    
    def setFromRotationMatrix(m: Matrix4): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: Unit, update: Boolean): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: EulerOrder): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: EulerOrder, update: Boolean): Euler = js.native
    
    def setFromVector3(v: Vector3): Euler = js.native
    def setFromVector3(v: Vector3, order: EulerOrder): Euler = js.native
    
    def toArray(): js.Array[js.UndefOr[Double | String]] = js.native
    def toArray(array: js.Array[js.UndefOr[Double | String]]): js.Array[js.UndefOr[Double | String]] = js.native
    def toArray(array: js.Array[js.UndefOr[Double | String]], offset: Double): js.Array[js.UndefOr[Double | String]] = js.native
    def toArray(array: Unit, offset: Double): js.Array[js.UndefOr[Double | String]] = js.native
    
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
    
    @JSImport("three/src/math/Euler", "Euler.DEFAULT_ORDER")
    @js.native
    def DEFAULT_ORDER: XYZ = js.native
    inline def DEFAULT_ORDER_=(x: XYZ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ORDER")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.XYZ
    - typings.three.threeStrings.YXZ
    - typings.three.threeStrings.ZXY
    - typings.three.threeStrings.ZYX
    - typings.three.threeStrings.YZX
    - typings.three.threeStrings.XZY
  */
  trait EulerOrder extends StObject
  object EulerOrder {
    
    inline def XYZ: typings.three.threeStrings.XYZ = "XYZ".asInstanceOf[typings.three.threeStrings.XYZ]
    
    inline def XZY: typings.three.threeStrings.XZY = "XZY".asInstanceOf[typings.three.threeStrings.XZY]
    
    inline def YXZ: typings.three.threeStrings.YXZ = "YXZ".asInstanceOf[typings.three.threeStrings.YXZ]
    
    inline def YZX: typings.three.threeStrings.YZX = "YZX".asInstanceOf[typings.three.threeStrings.YZX]
    
    inline def ZXY: typings.three.threeStrings.ZXY = "ZXY".asInstanceOf[typings.three.threeStrings.ZXY]
    
    inline def ZYX: typings.three.threeStrings.ZYX = "ZYX".asInstanceOf[typings.three.threeStrings.ZYX]
  }
}
