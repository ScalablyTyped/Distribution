package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsignal extends StObject {
  
  def frame(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    padEnd: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    padEnd: Boolean,
    padValue: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    padEnd: Unit,
    padValue: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def hammingWindow(windowLength: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  
  def hannWindow(windowLength: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[R1] = js.native
  
  def stft(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: typings.tensorflowTfjsCore.distTensorMod.Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: Unit,
    windowFn: js.Function1[/* length */ Double, typings.tensorflowTfjsCore.distTensorMod.Tensor[R1]]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
