package typings.three.srcThreeMod

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
  def this(x: Double, y: Double, z: Double, order: String) = this()
  def this(x: Double, y: Double, z: Unit, order: String) = this()
  def this(x: Double, y: Unit, z: Double, order: String) = this()
  def this(x: Double, y: Unit, z: Unit, order: String) = this()
  def this(x: Unit, y: Double, z: Double, order: String) = this()
  def this(x: Unit, y: Double, z: Unit, order: String) = this()
  def this(x: Unit, y: Unit, z: Double, order: String) = this()
  def this(x: Unit, y: Unit, z: Unit, order: String) = this()
}
/* static members */
object Euler {
  
  @JSImport("three/src/Three", "Euler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/src/Three", "Euler.DefaultOrder")
  @js.native
  def DefaultOrder: String = js.native
  inline def DefaultOrder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("three/src/Three", "Euler.RotationOrders")
  @js.native
  def RotationOrders: js.Array[String] = js.native
  inline def RotationOrders_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RotationOrders")(x.asInstanceOf[js.Any])
}
