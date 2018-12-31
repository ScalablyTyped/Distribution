package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognizerContainer extends js.Object {
  def getRecognizers(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognizer]
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[InkRecognitionResult]]
  def setDefaultRecognizer(recognizer: InkRecognizer): scala.Unit
}

