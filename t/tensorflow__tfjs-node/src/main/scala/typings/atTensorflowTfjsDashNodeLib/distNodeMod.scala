package typings
package atTensorflowTfjsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/node", JSImport.Namespace)
@js.native
object distNodeMod extends js.Object {
  @js.native
  object node extends js.Object {
    @JSName("decodeBmp")
    var decodeBmp_Original: js.Function2[
        /* contents */ stdLib.Uint8Array, 
        /* channels */ js.UndefOr[scala.Double], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
      ] = js.native
    @JSName("decodeGif")
    var decodeGif_Original: js.Function1[
        /* contents */ stdLib.Uint8Array, 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
      ] = js.native
    @JSName("decodeImage")
    var decodeImage_Original: js.Function4[
        /* content */ stdLib.Uint8Array, 
        /* channels */ js.UndefOr[scala.Double], 
        /* dtype */ js.UndefOr[java.lang.String], 
        /* expandAnimations */ js.UndefOr[scala.Boolean], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D
      ] = js.native
    @JSName("decodeJpeg")
    var decodeJpeg_Original: js.Function7[
        /* contents */ stdLib.Uint8Array, 
        /* channels */ js.UndefOr[scala.Double], 
        /* ratio */ js.UndefOr[scala.Double], 
        /* fancyUpscaling */ js.UndefOr[scala.Boolean], 
        /* tryRecoverTruncated */ js.UndefOr[scala.Boolean], 
        /* acceptableFraction */ js.UndefOr[scala.Double], 
        /* dctMethod */ js.UndefOr[java.lang.String], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
      ] = js.native
    @JSName("decodePng")
    var decodePng_Original: js.Function3[
        /* contents */ stdLib.Uint8Array, 
        /* channels */ js.UndefOr[scala.Double], 
        /* dtype */ js.UndefOr[java.lang.String], 
        atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D
      ] = js.native
    @JSName("summaryFileWriter")
    var summaryFileWriter_Original: js.Function4[
        /* logdir */ java.lang.String, 
        /* maxQueue */ js.UndefOr[scala.Double], 
        /* flushMillis */ js.UndefOr[scala.Double], 
        /* filenameSuffix */ js.UndefOr[java.lang.String], 
        atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter
      ] = js.native
    @JSName("tensorBoard")
    var tensorBoard_Original: js.Function2[
        /* logdir */ js.UndefOr[java.lang.String], 
        /* args */ js.UndefOr[atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallbackArgs], 
        atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback
      ] = js.native
    def decodeBmp(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def decodeBmp(contents: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def decodeGif(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
    def decodeImage(content: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
    def decodeImage(content: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
    def decodeImage(content: stdLib.Uint8Array, channels: scala.Double, dtype: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
    def decodeImage(
      content: stdLib.Uint8Array,
      channels: scala.Double,
      dtype: java.lang.String,
      expandAnimations: scala.Boolean
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
    def decodeJpeg(
      contents: stdLib.Uint8Array,
      channels: js.UndefOr[scala.Double],
      ratio: js.UndefOr[scala.Double],
      fancyUpscaling: js.UndefOr[scala.Boolean],
      tryRecoverTruncated: js.UndefOr[scala.Boolean],
      acceptableFraction: js.UndefOr[scala.Double],
      dctMethod: js.UndefOr[java.lang.String]
    ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def decodePng(contents: stdLib.Uint8Array): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def decodePng(contents: stdLib.Uint8Array, channels: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def decodePng(contents: stdLib.Uint8Array, channels: scala.Double, dtype: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
    def summaryFileWriter(logdir: java.lang.String): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
    def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
    def summaryFileWriter(logdir: java.lang.String, maxQueue: scala.Double, flushMillis: scala.Double): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
    def summaryFileWriter(
      logdir: java.lang.String,
      maxQueue: scala.Double,
      flushMillis: scala.Double,
      filenameSuffix: java.lang.String
    ): atTensorflowTfjsDashNodeLib.distTensorboardMod.SummaryFileWriter = js.native
    def tensorBoard(): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
    def tensorBoard(logdir: java.lang.String): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
    def tensorBoard(
      logdir: java.lang.String,
      args: atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallbackArgs
    ): atTensorflowTfjsDashNodeLib.distCallbacksMod.TensorBoardCallback = js.native
  }
  
}

