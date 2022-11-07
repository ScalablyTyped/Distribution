package typings.three.srcThreeMod

import typings.three.srcMathEulerMod.EulerOrder
import typings.three.threeStrings.XYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "Euler")
@js.native
open class Euler ()
  extends typings.three.srcMathEulerMod.Euler {
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
}
/* static members */
object Euler {
  
  @JSImport("three/src/Three", "Euler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/src/Three", "Euler.DefaultOrder")
  @js.native
  def DefaultOrder: XYZ = js.native
  inline def DefaultOrder_=(x: XYZ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("three/src/Three", "Euler.RotationOrders")
  @js.native
  def RotationOrders: js.Array[EulerOrder] = js.native
  inline def RotationOrders_=(x: js.Array[EulerOrder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationOrders")(x.asInstanceOf[js.Any])
}
