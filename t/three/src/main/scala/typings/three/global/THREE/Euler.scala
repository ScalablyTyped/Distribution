package typings.three.global.THREE

import typings.three.srcMathEulerMod.EulerOrder
import typings.three.threeStrings.XYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Euler")
@js.native
open class Euler ()
  extends typings.three.mod.Euler {
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
  
  @JSGlobal("THREE.Euler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.Euler.DEFAULT_ORDER")
  @js.native
  def DEFAULT_ORDER: XYZ = js.native
  inline def DEFAULT_ORDER_=(x: XYZ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ORDER")(x.asInstanceOf[js.Any])
}
