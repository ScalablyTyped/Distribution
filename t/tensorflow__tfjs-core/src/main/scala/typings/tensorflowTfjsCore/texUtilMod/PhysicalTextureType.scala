package typings.tensorflowTfjsCore.texUtilMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicalTextureType with Double] = js.native
  /* 4 */ @js.native
  object PACKED_2X2_FLOAT16 extends TopLevel[PACKED_2X2_FLOAT16 with Double]
  
  /* 3 */ @js.native
  object PACKED_2X2_FLOAT32 extends TopLevel[PACKED_2X2_FLOAT32 with Double]
  
  /* 2 */ @js.native
  object PACKED_4X1_UNSIGNED_BYTE extends TopLevel[PACKED_4X1_UNSIGNED_BYTE with Double]
  
  /* 0 */ @js.native
  object UNPACKED_FLOAT16 extends TopLevel[UNPACKED_FLOAT16 with Double]
  
  /* 1 */ @js.native
  object UNPACKED_FLOAT32 extends TopLevel[UNPACKED_FLOAT32 with Double]
  
}

