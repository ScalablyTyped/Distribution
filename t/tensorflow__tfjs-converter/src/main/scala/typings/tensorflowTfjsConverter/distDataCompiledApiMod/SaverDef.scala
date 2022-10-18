package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SaverDef {
  
  @js.native
  sealed trait CheckpointFormatVersion extends StObject
  /** CheckpointFormatVersion enum. */
  @JSImport("@tensorflow/tfjs-converter/dist/data/compiled_api", "SaverDef.CheckpointFormatVersion")
  @js.native
  object CheckpointFormatVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CheckpointFormatVersion & Double] = js.native
    
    @js.native
    sealed trait LEGACY
      extends StObject
         with CheckpointFormatVersion
    /* 0 */ val LEGACY: typings.tensorflowTfjsConverter.distDataCompiledApiMod.SaverDef.CheckpointFormatVersion.LEGACY & Double = js.native
    
    @js.native
    sealed trait V1
      extends StObject
         with CheckpointFormatVersion
    /* 1 */ val V1: typings.tensorflowTfjsConverter.distDataCompiledApiMod.SaverDef.CheckpointFormatVersion.V1 & Double = js.native
    
    @js.native
    sealed trait V2
      extends StObject
         with CheckpointFormatVersion
    /* 2 */ val V2: typings.tensorflowTfjsConverter.distDataCompiledApiMod.SaverDef.CheckpointFormatVersion.V2 & Double = js.native
  }
}
