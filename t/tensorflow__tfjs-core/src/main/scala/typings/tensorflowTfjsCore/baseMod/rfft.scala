package typings.tensorflowTfjsCore.baseMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "rfft")
@js.native
object rfft
  extends TopLevel[
      js.Function2[
        /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
        /* fftLength */ js.UndefOr[Double], 
        Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
