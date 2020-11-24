package typings.tensorflowTfjsBackendWebgl.texUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicalTextureType extends js.Object
@JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PhysicalTextureType")
@js.native
object PhysicalTextureType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicalTextureType with Double] = js.native
  
  @js.native
  sealed trait PACKED_2X2_FLOAT16 extends PhysicalTextureType
  /* 4 */ @js.native
  object PACKED_2X2_FLOAT16 extends TopLevel[PACKED_2X2_FLOAT16 with Double]
  
  @js.native
  sealed trait PACKED_2X2_FLOAT32 extends PhysicalTextureType
  /* 3 */ @js.native
  object PACKED_2X2_FLOAT32 extends TopLevel[PACKED_2X2_FLOAT32 with Double]
  
  @js.native
  sealed trait PACKED_4X1_UNSIGNED_BYTE extends PhysicalTextureType
  /* 2 */ @js.native
  object PACKED_4X1_UNSIGNED_BYTE extends TopLevel[PACKED_4X1_UNSIGNED_BYTE with Double]
  
  @js.native
  sealed trait UNPACKED_FLOAT16 extends PhysicalTextureType
  /* 0 */ @js.native
  object UNPACKED_FLOAT16 extends TopLevel[UNPACKED_FLOAT16 with Double]
  
  @js.native
  sealed trait UNPACKED_FLOAT32 extends PhysicalTextureType
  /* 1 */ @js.native
  object UNPACKED_FLOAT32 extends TopLevel[UNPACKED_FLOAT32 with Double]
}
