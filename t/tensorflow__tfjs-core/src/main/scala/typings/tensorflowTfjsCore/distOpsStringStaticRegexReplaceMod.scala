package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsStringStaticRegexReplaceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/string/static_regex_replace", "staticRegexReplace")
  @js.native
  val staticRegexReplace: js.Function4[
    /* input */ Tensor[Rank] | TensorLike, 
    /* pattern */ String, 
    /* rewrite */ String, 
    /* replaceGlobal */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
}
