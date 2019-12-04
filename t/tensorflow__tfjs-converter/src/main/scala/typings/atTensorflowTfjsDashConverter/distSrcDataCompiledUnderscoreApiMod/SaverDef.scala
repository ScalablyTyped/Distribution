package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.SaverDef.CheckpointFormatVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/data/compiled_api", "SaverDef")
@js.native
object SaverDef extends js.Object {
  @js.native
  sealed trait CheckpointFormatVersion extends js.Object
  
  /** CheckpointFormatVersion enum. */
  @js.native
  object CheckpointFormatVersion extends js.Object {
    @js.native
    sealed trait LEGACY extends CheckpointFormatVersion
    
    @js.native
    sealed trait V1 extends CheckpointFormatVersion
    
    @js.native
    sealed trait V2 extends CheckpointFormatVersion
    
    /* 0 */ val LEGACY: typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.SaverDef.CheckpointFormatVersion.LEGACY with Double = js.native
    /* 1 */ val V1: typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.SaverDef.CheckpointFormatVersion.V1 with Double = js.native
    /* 2 */ val V2: typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.SaverDef.CheckpointFormatVersion.V2 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CheckpointFormatVersion with Double] = js.native
  }
  
}

