package typings.tensorflowTfjsBackendCpu

import typings.std.ArrayLike
import typings.tensorflowTfjsCore.distKernelRegistryMod.NamedAttrMap
import typings.tensorflowTfjsCore.distTypesMod.DataTypeFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUnaryTypesMod {
  
  type SimpleUnaryImpl[I /* <: Double | String */, O /* <: Double | String */] = js.Function3[
    /* values */ ArrayLike[I], 
    /* dtype */ DataTypeFor[O], 
    /* attrs */ js.UndefOr[NamedAttrMap], 
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeFor<O>] */ js.Any
  ]
  
  type SimpleUnaryOperation[I /* <: Double | String */, O /* <: Double | String */] = js.Function2[/* x */ I, /* attrs */ js.UndefOr[NamedAttrMap], O]
}
