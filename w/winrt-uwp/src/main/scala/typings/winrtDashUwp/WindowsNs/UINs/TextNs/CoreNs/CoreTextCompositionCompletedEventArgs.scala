package typings.winrtDashUwp.WindowsNs.UINs.TextNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CompositionCompleted event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs")
@js.native
abstract class CoreTextCompositionCompletedEventArgs () extends js.Object {
  /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
  var compositionSegments: IVectorView[CoreTextCompositionSegment] = js.native
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean = js.native
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

