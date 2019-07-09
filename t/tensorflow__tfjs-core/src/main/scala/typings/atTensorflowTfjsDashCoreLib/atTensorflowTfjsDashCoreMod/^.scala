package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ENV: atTensorflowTfjsDashCoreLib.distEnvironmentMod.Environment = js.native
  val basicLSTMCell: js.Function6[
    /* forgetBias */ atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* lstmKernel */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* lstmBias */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* data */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* c */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* h */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Tuple2[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D, 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
    ]
  ] = js.native
  val batchNorm2d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val batchNorm3d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val batchNorm4d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val batchNormalization2d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val batchNormalization3d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val batchNormalization4d: js.Function6[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* mean */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* variance */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* varianceEpsilon */ js.UndefOr[scala.Double], 
    /* scale */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* offset */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val concat1d: js.Function1[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val concat2d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val concat3d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val concat4d: js.Function2[
    /* tensors */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* axis */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val depthToSpace: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D, 
    /* blockSize */ scala.Double, 
    /* dataFormat */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NHWC | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.NCHW
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val dot: js.Function2[
    /* t1 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* t2 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val dropout: js.Function4[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* rate */ atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | scala.Double, 
    /* noiseShape */ js.UndefOr[js.Array[scala.Double]], 
    /* seed */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val eye: js.Function4[
    /* numRows */ scala.Double, 
    /* numColumns */ js.UndefOr[scala.Double], 
    /* batchShape */ js.UndefOr[
      js.Array[scala.Double] | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
    ], 
    /* dtype */ js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val fft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val frame: js.Function5[
    /* signal */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D, 
    /* frameLength */ scala.Double, 
    /* frameStep */ scala.Double, 
    /* padEnd */ js.UndefOr[scala.Boolean], 
    /* padValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val gatherND: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* indices */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val hammingWindow: js.Function1[
    /* windowLength */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val hannWindow: js.Function1[
    /* windowLength */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val ifft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val moments: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    /* keepDims */ js.UndefOr[scala.Boolean], 
    atTensorflowTfjsDashCoreLib.Anon_Mean
  ] = js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[atTensorflowTfjsDashCoreLib.distOpsLstmMod.LSTMCellFunc], 
    /* data */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* c */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* h */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    js.Tuple2[
      js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D], 
      js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D]
    ]
  ] = js.native
  val multinomial: js.Function4[
    /* logits */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* numSamples */ scala.Double, 
    /* seed */ js.UndefOr[scala.Double], 
    /* normalized */ js.UndefOr[scala.Boolean], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val norm: js.Function4[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* ord */ js.UndefOr[
      scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro
    ], 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    /* keepDims */ js.UndefOr[scala.Boolean], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val oneHot: js.Function4[
    /* indices */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* depth */ scala.Double, 
    /* onValue */ js.UndefOr[scala.Double], 
    /* offValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val outerProduct: js.Function2[
    /* v1 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* v2 */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val pad1d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple2[scala.Double, scala.Double], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val pad2d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val pad3d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple3[
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double]
    ], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val pad4d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* paddings */ js.Tuple4[
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double], 
      js.Tuple2[scala.Double, scala.Double]
    ], 
    /* constantValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val reverse1d: js.Function1[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val reverse2d: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val reverse3d: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val reverse4d: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val rfft: js.Function2[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val setdiff1dAsync: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* y */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Promise[
      js.Tuple2[
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]
    ]
  ] = js.native
  val slice1d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ scala.Double, 
    /* size */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val slice2d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple2[scala.Double, scala.Double], 
    /* size */ js.Tuple2[scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val slice3d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple3[scala.Double, scala.Double, scala.Double], 
    /* size */ js.Tuple3[scala.Double, scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
  ] = js.native
  val slice4d: js.Function3[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], 
    /* size */ js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
  ] = js.native
  val stridedSlice: js.Function9[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* begin */ js.Array[scala.Double], 
    /* end */ js.Array[scala.Double], 
    /* strides */ js.Array[scala.Double], 
    /* beginMask */ js.UndefOr[scala.Double], 
    /* endMask */ js.UndefOr[scala.Double], 
    /* ellipsisMask */ js.UndefOr[scala.Double], 
    /* newAxisMask */ js.UndefOr[scala.Double], 
    /* shrinkAxisMask */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val unstack: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* axis */ js.UndefOr[scala.Double], 
    js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  val variable: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Variable.variable */ js.Any = js.native
  val version_core: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.`1DOT2DOT2` = js.native
  val whereAsync: js.Function1[
    /* condition */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    js.Promise[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D]
  ] = js.native
  def backend(): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  /**
    * Creates an empty `tf.TensorBuffer` with the specified `shape` and `dtype`.
    *
    * The values are stored in CPU as `TypedArray`. Fill the buffer using
    * `buffer.set()`, or by modifying directly `buffer.values`.
    *
    * When done, call `buffer.toTensor()` to get an immutable `tf.Tensor` with
    * those values.
    *
    * ```js
    * // Create a buffer and set values at particular indices.
    * const buffer = tf.buffer([2, 2]);
    * buffer.set(3, 0, 0);
    * buffer.set(5, 1, 0);
    *
    * // Convert the buffer back to a tensor.
    * buffer.toTensor().print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The dtype of the buffer. Defaults to 'float32'.
    * @param values The values of the buffer as `TypedArray`. Defaults to
    * zeros.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def buffer[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool,
    values: stdLib.Uint8Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    values: stdLib.Float32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32,
    values: stdLib.Float32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32,
    values: stdLib.Int32Array
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string,
    values: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.TensorBuffer[R, atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string] = js.native
  /**
    * Overrides the gradient computation of a function `f`.
    *
    * Takes a function
    * `f(...inputs, save) => {value: Tensor, gradFunc: (dy, saved) => Tensor[]}`
    * and returns another function `g(...inputs)` which takes the same inputs as
    * `f`. When called, `g` returns `f().value`. In backward mode, custom gradients
    * with respect to each input of `f` are computed using `f().gradFunc`.
    *
    * The `save` function passsed to `f` should be used for saving tensors needed
    * in the gradient. And the `saved` passed to the `gradFunc` is a
    * `NamedTensorMap`, which contains those saved tensor.
    *
    * ```js
    * const customOp = tf.customGrad((x, save) => {
    *   // Save x to make sure it's available later for the gradient.
    *   save([x]);
    *   // Override gradient of our custom x ^ 2 op to be dy * abs(x);
    *   return {
    *     value: x.square(),
    *     // Note `saved.x` which points to the `x` we saved earlier.
    *     gradFunc: (dy, saved) => [dy.mul(saved[0].abs())]
    *   };
    * });
    *
    * const x = tf.tensor1d([-1, -2, 3]);
    * const dx = tf.grad(x => customOp(x));
    *
    * console.log(`f(x):`);
    * customOp(x).print();
    * console.log(`f'(x):`);
    * dx(x).print();
    * ```
    *
    * @param f The function to evaluate in forward mode, which should return
    *     `{value: Tensor, gradFunc: (dy, saved) => Tensor[]}`, where `gradFunc`
    *     returns the custom gradients of `f` with respect to its inputs.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def customGrad[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](f: atTensorflowTfjsDashCoreLib.distEngineMod.CustomGradientFunc[T]): js.Function1[
    /* repeated */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    T
  ] = js.native
  def deprecationWarn(msg: java.lang.String): scala.Unit = js.native
  def disableDeprecationWarnings(): scala.Unit = js.native
  def dispose(container: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer): scala.Unit = js.native
  def disposeVariables(): scala.Unit = js.native
  def enableDebugMode(): scala.Unit = js.native
  def enableProdMode(): scala.Unit = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /**
    * Creates a `tf.Tensor` filled with a scalar value.
    *
    * ```js
    * tf.fill([2, 2], 4).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param value The scalar value to fill the tensor with.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    * 'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def findBackend(name: java.lang.String): atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend = js.native
  def findBackendFactory(name: java.lang.String): js.Function0[
    atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
  ] = js.native
  def getBackend(): java.lang.String = js.native
  /**
    * Provided `f(x)`, returns another function `g(x, dy?)`, which gives the
    * gradient of `f(x)` with respect to `x`.
    *
    * If `dy` is provided, the gradient of `f(x).mul(dy).sum()` with respect to
    * `x` is computed instead. `f(x)` must take a single tensor `x` and return a
    * single tensor `y`. If `f()` takes multiple inputs, use `tf.grads` instead.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.grad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * g(x).print();
    * ```
    *
    * ```js
    * // f(x) = x ^ 3
    * const f = x => x.pow(tf.scalar(3, 'int32'));
    * // f'(x) = 3x ^ 2
    * const g = tf.grad(f);
    * // f''(x) = 6x
    * const gg = tf.grad(g);
    *
    * const x = tf.tensor1d([2, 3]);
    * gg(x).print();
    * ```
    *
    * @param f The function f(x), to compute gradient for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grad(
    f: js.Function1[
      /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* dy */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  /**
    * Provided `f(x1, x2,...)`, returns another function `g([x1, x2,...], dy?)`,
    * which gives an array of gradients of `f()` with respect to each input
    * [`x1`,`x2`,...].
    *
    * If `dy` is passed when calling `g()`, the gradient of
    * `f(x1,...).mul(dy).sum()` with respect to each input is computed instead.
    * The provided `f` must take one or more tensors and return a single tensor
    * `y`. If `f()` takes a single input, we recommend using `tf.grad` instead.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df / da = b, df / db = a
    * const g = tf.grads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const [da, db] = g([a, b]);
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    *
    * @param f The function `f(x1, x2,...)` to compute gradients for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grads(
    f: js.Function1[
      /* repeated */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Function2[
    /* args */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    /* dy */ js.UndefOr[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  def keep[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](result: T): T = js.native
  /**
    * Return an evenly spaced sequence of numbers over the given interval.
    *
    * ```js
    * tf.linspace(0, 9, 10).print();
    * ```
    * @param start The start value of the sequence.
    * @param stop The end value of the sequence.
    * @param num The number of values to generate.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def linspace(start: scala.Double, stop: scala.Double, num: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def memory(): atTensorflowTfjsDashCoreLib.distEngineMod.MemoryInfo = js.native
  def nextFrame(): js.Promise[scala.Unit] = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 1.
    *
    * ```js
    * tf.ones([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    *     'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def ones[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def ones[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def op[T /* <: js.Function */](f: org.scalablytyped.runtime.StringDictionary[T]): T = js.native
  /**
    * Prints information about the `tf.Tensor` including its data.
    *
    * ```js
    * const verbose = true;
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print(verbose);
    * ```
    * @param x The tensor to be printed.
    * @param verbose Whether to print verbose information about the ` Tensor`,
    * including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def print[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): scala.Unit = js.native
  def print[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T, verbose: scala.Boolean): scala.Unit = js.native
  def profile(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer]): js.Promise[atTensorflowTfjsDashCoreLib.distEngineMod.ProfileInfo] = js.native
  /**
    * Creates a new `tf.Tensor1D` filled with the numbers in the range provided.
    *
    * The tensor is a is half-open interval meaning it includes start, but
    * excludes stop. Decrementing ranges and negative step values are also
    * supported.
    *
    * ```js
    * tf.range(0, 9, 2).print();
    * ```
    *
    * @param start An integer start value
    * @param stop An integer stop value
    * @param step An integer increment (will default to 1 or -1)
    * @param dtype The data type of the output tensor. Defaults to 'float32'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def range(start: scala.Double, stop: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  @JSName("range")
  def range_float32(
    start: scala.Double,
    stop: scala.Double,
    step: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  @JSName("range")
  def range_int32(
    start: scala.Double,
    stop: scala.Double,
    step: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def ready(): js.Promise[scala.Unit] = js.native
  def registerBackend(
    name: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ]
  ): scala.Boolean = js.native
  def registerBackend(
    name: java.lang.String,
    factory: js.Function0[
      atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend | js.Promise[atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend]
    ],
    priority: scala.Double
  ): scala.Boolean = js.native
  def removeBackend(name: java.lang.String): scala.Unit = js.native
  def scalar(value: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: java.lang.String, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Boolean): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Boolean, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  /**
    * Creates rank-0 `tf.Tensor` (scalar) with the provided value and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.scalar` as it makes the code more readable.
    *
    * ```js
    * tf.scalar(3.14).print();
    * ```
    *
    * @param value The value of the scalar.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def scalar(value: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Double, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def setBackend(backendName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setPlatform(
    platformName: java.lang.String,
    platform: atTensorflowTfjsDashCoreLib.distPlatformsPlatformMod.Platform
  ): scala.Unit = js.native
  /**
    * Creates a `tf.Tensor` with the provided values, shape and dtype.
    *
    * ```js
    * // Pass an array of values to create a vector.
    * tf.tensor([1, 2, 3, 4]).print();
    * ```
    *
    * ```js
    * // Pass a nested array of values to make a matrix or a higher
    * // dimensional tensor.
    * tf.tensor([[1, 2], [3, 4]]).print();
    * ```
    *
    * ```js
    * // Pass a flat array and specify a shape yourself.
    * tf.tensor([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /**
    * Creates rank-1 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor1d` as it makes the code more readable.
    *
    * ```js
    * tf.tensor1d([1, 2, 3]).print();
    * ```
    *
    * @param values The values of the tensor. Can be array of numbers,
    *     or a `TypedArray`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor1d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def tensor1d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  /**
    * Creates rank-2 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor2d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor2d([[1, 2], [3, 4]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided, it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor2d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def tensor2d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D,
    shape: js.Tuple2[scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def tensor2d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D,
    shape: js.Tuple2[scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  /**
    * Creates rank-3 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor3d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor3d([[[1], [2]], [[3], [4]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor3d([1, 2, 3, 4], [2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided,  it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor3d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def tensor3d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    shape: js.Tuple3[scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def tensor3d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    shape: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  /**
    * Creates rank-4 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor4d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor4d([[[[1], [2]], [[3], [4]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor4d([1, 2, 3, 4], [1, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor4d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def tensor4d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    shape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def tensor4d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    shape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  /**
    * Creates rank-5 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor5d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor5d([[[[[1], [2]], [[3], [4]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor5d([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor5d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def tensor5d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D,
    shape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def tensor5d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D,
    shape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  /**
    * Creates rank-6 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor6d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor6d([[[[[[1],[2]],[[3],[4]]],[[[5],[6]],[[7],[8]]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor6d([1, 2, 3, 4, 5, 6, 7, 8], [1, 1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor6d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  def tensor6d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D,
    shape: js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  def tensor6d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D,
    shape: js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](
    nameOrFn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T],
    fn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]
  ): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String): T = js.native
  def tidy[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](nameOrFn: java.lang.String, fn: atTensorflowTfjsDashCoreLib.distEngineMod.ScopeFn[T]): T = js.native
  def time(f: js.Function0[scala.Unit]): js.Promise[atTensorflowTfjsDashCoreLib.distEngineMod.TimingInfo] = js.native
  /**
    * Like `tf.grad`, but also returns the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grad: The gradient of `f(x)` w.r.t `x` (result of `tf.grad`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.valueAndGrad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * const {value, grad} = g(x);
    *
    * console.log('value');
    * value.print();
    * console.log('grad');
    * grad.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrad[I /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](f: js.Function1[/* x */ I, O]): js.Function2[/* x */ I, /* dy */ js.UndefOr[O], atTensorflowTfjsDashCoreLib.Anon_Grad[O, I]] = js.native
  /**
    * Like `tf.grads`, but returns also the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grads: The gradients of `f()` w.r.t each input (result of `tf.grads`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df/da = b, df/db = a
    * const g = tf.valueAndGrads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const {value, grads} = g([a, b]);
    *
    * const [da, db] = grads;
    *
    * console.log('value');
    * value.print();
    *
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrads[O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    f: js.Function1[
      /* repeated */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
      O
    ]
  ): js.Function2[
    /* args */ js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    /* dy */ js.UndefOr[O], 
    atTensorflowTfjsDashCoreLib.Anon_GradsValueArray[O]
  ] = js.native
  /**
    * Computes and returns the gradient of f(x) with respect to the list of
    * trainable variables provided by `varList`. If no list is provided, it
    * defaults to all trainable variables.
    *
    * ```js
    * const a = tf.variable(tf.tensor1d([3, 4]));
    * const b = tf.variable(tf.tensor1d([5, 6]));
    * const x = tf.tensor1d([1, 2]);
    *
    * // f(a, b) = a * x ^ 2 + b * x
    * const f = () => a.mul(x.square()).add(b.mul(x)).sum();
    * // df/da = x ^ 2, df/db = x
    * const {value, grads} = tf.variableGrads(f);
    *
    * Object.keys(grads).forEach(varName => grads[varName].print());
    * ```
    *
    * @param f The function to execute. f() should return a scalar.
    * @param varList The list of variables to compute the gradients with respect
    *     to. Defaults to all trainable variables.
    * @returns An object with the following keys and values:
    *   - `value`: The value of the function `f`.
    *   - `grads`: A map from the names of the variables to the gradients.
    *     If the `varList` argument is provided explicitly and contains a subset of
    *     non-trainable variables, this map in the return value will contain keys
    *     that map the names of the non-trainable variables to `null`.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def variableGrads(f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]): atTensorflowTfjsDashCoreLib.Anon_GradsValue = js.native
  def variableGrads(
    f: js.Function0[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar],
    varList: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Variable[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.Anon_GradsValue = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 0.
    *
    * ```js
    * tf.zeros([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Can
    *     be 'float32', 'int32' or 'bool'. Defaults to 'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def zeros[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def zeros[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
}

