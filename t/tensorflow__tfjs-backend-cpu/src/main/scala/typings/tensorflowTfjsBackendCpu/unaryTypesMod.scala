package typings.tensorflowTfjsBackendCpu

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.kernelRegistryMod.NamedAttrMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/unary_types", JSImport.Namespace)
@js.native
object unaryTypesMod extends js.Object {
  
  type SimpleUnaryImpl = js.Function3[
    /* values */ TypedArray, 
    /* dtype */ DataType, 
    /* attrs */ js.UndefOr[NamedAttrMap], 
    TypedArray
  ]
  
  type SimpleUnaryOperation = js.Function2[/* x */ Double, /* attrs */ js.UndefOr[NamedAttrMap], Double]
}
