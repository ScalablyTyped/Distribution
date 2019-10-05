package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "eye")
@js.native
object eye
  extends TopLevel[
      js.Function4[
        /* numRows */ Double, 
        /* numColumns */ js.UndefOr[Double], 
        /* batchShape */ js.UndefOr[
          js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ], 
        /* dtype */ js.UndefOr[DataType], 
        Tensor2D
      ]
    ]

