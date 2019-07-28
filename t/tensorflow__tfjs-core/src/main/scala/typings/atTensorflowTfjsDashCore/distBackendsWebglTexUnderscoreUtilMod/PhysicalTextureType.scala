package typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicalTextureType extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/tex_util", "PhysicalTextureType")
@js.native
object PhysicalTextureType extends js.Object {
  @js.native
  sealed trait PACKED_2X2_FLOAT16 extends PhysicalTextureType
  
  @js.native
  sealed trait PACKED_2X2_FLOAT32 extends PhysicalTextureType
  
  @js.native
  sealed trait PACKED_4X1_UNSIGNED_BYTE extends PhysicalTextureType
  
  @js.native
  sealed trait UNPACKED_FLOAT16 extends PhysicalTextureType
  
  @js.native
  sealed trait UNPACKED_FLOAT32 extends PhysicalTextureType
  
  /* 4 */ val PACKED_2X2_FLOAT16: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT16 with Double = js.native
  /* 3 */ val PACKED_2X2_FLOAT32: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT32 with Double = js.native
  /* 2 */ val PACKED_4X1_UNSIGNED_BYTE: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType.PACKED_4X1_UNSIGNED_BYTE with Double = js.native
  /* 0 */ val UNPACKED_FLOAT16: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType.UNPACKED_FLOAT16 with Double = js.native
  /* 1 */ val UNPACKED_FLOAT32: typings.atTensorflowTfjsDashCore.distBackendsWebglTexUnderscoreUtilMod.PhysicalTextureType.UNPACKED_FLOAT32 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicalTextureType with Double] = js.native
}

