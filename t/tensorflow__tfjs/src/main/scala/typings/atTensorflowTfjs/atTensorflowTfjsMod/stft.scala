package typings.atTensorflowTfjs.atTensorflowTfjsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "stft")
@js.native
object stft
  extends TopLevel[
      js.Function5[
        /* signal */ Tensor1D, 
        /* frameLength */ Double, 
        /* frameStep */ Double, 
        /* fftLength */ js.UndefOr[Double], 
        /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
      ]
    ]

