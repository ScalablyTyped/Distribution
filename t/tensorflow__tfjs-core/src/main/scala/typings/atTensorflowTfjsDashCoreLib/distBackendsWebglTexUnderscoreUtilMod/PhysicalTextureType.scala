package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicalTextureType extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", "PhysicalTextureType")
@js.native
object PhysicalTextureType extends js.Object {
  @js.native
  sealed trait PACKED_2X2_FLOAT16
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType
  
  @js.native
  sealed trait PACKED_2X2_FLOAT32
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType
  
  @js.native
  sealed trait PACKED_4X1_UNSIGNED_BYTE
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType
  
  @js.native
  sealed trait UNPACKED_FLOAT16
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType
  
  @js.native
  sealed trait UNPACKED_FLOAT32
    extends atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType
  
  /* 4 */ val PACKED_2X2_FLOAT16: PACKED_2X2_FLOAT16 with scala.Double = js.native
  /* 3 */ val PACKED_2X2_FLOAT32: PACKED_2X2_FLOAT32 with scala.Double = js.native
  /* 2 */ val PACKED_4X1_UNSIGNED_BYTE: PACKED_4X1_UNSIGNED_BYTE with scala.Double = js.native
  /* 0 */ val UNPACKED_FLOAT16: UNPACKED_FLOAT16 with scala.Double = js.native
  /* 1 */ val UNPACKED_FLOAT32: UNPACKED_FLOAT32 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atTensorflowTfjsDashCoreLib.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType with scala.Double
  ] = js.native
}

