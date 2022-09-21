package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Quaternion")
@js.native
/**
  * @param x x coordinate
  * @param y y coordinate
  * @param z z coordinate
  * @param w w coordinate
  */
open class Quaternion ()
  extends typings.three.threeMod.Quaternion {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
/* static members */
object Quaternion {
  
  @JSImport("three", "Quaternion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiplyQuaternionsFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyQuaternionsFlat")(dst.asInstanceOf[js.Any], dstOffset.asInstanceOf[js.Any], src0.asInstanceOf[js.Any], srcOffset.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], stcOffset1.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * @deprecated Use qm.slerpQuaternions( qa, qb, t ) instead..
    */
  inline def slerp(
    qa: typings.three.quaternionMod.Quaternion,
    qb: typings.three.quaternionMod.Quaternion,
    qm: typings.three.quaternionMod.Quaternion,
    t: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(qa.asInstanceOf[js.Any], qb.asInstanceOf[js.Any], qm.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typings.three.quaternionMod.Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("slerpFlat")(dst.asInstanceOf[js.Any], dstOffset.asInstanceOf[js.Any], src0.asInstanceOf[js.Any], srcOffset.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], stcOffset1.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.three.quaternionMod.Quaternion]
}
