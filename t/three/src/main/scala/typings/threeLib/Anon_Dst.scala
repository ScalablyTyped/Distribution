package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Dst
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Quaternion]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, threeLib.threeMod.Quaternion]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, threeLib.threeMod.Quaternion]
     with org.scalablytyped.runtime.Instantiable3[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      threeLib.threeMod.Quaternion
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      threeLib.threeMod.Quaternion
    ] {
  /**
    * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    */
  def slerp(
    qa: threeLib.threeDashCoreMod.Quaternion,
    qb: threeLib.threeDashCoreMod.Quaternion,
    qm: threeLib.threeDashCoreMod.Quaternion,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[scala.Double],
    dstOffset: scala.Double,
    src0: js.Array[scala.Double],
    srcOffset: scala.Double,
    src1: js.Array[scala.Double],
    stcOffset1: scala.Double,
    t: scala.Double
  ): threeLib.threeDashCoreMod.Quaternion = js.native
}

