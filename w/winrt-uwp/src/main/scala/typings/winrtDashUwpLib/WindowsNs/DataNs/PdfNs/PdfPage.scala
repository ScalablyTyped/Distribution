package typings
package winrtDashUwpLib.WindowsNs.DataNs.PdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single page in a Portable Document Format (PDF) document. */
@JSGlobal("Windows.Data.Pdf.PdfPage")
@js.native
abstract class PdfPage () extends js.Object {
  /** Gets the group of dimension properties for a single page in a Portable Document Format (PDF) document. */
  var dimensions: PdfPageDimensions = js.native
  /** Gets the relative position of the Portable Document Format (PDF) page within its parent PDF document. */
  var index: scala.Double = js.native
  /** Gets the Portable Document Format (PDF) page's preferred magnification factor. */
  var preferredZoom: scala.Double = js.native
  /** Gets the number of degrees that the Portable Document Format (PDF) page will be rotated when it's displayed or printed. */
  var rotation: PdfPageRotation = js.native
  /** Gets the Portable Document Format (PDF) page's size based on its related CropBox , MediaBox , and Rotation property values. */
  var size: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Releases all resources associated with the Portable Document Format (PDF) page. */
  def close(): scala.Unit = js.native
  /**
                   * Begins building the Portable Document Format (PDF) page. After this method finishes, the PDF page is completely built.
                   * @return Represents the fully-built PDF page.
                   */
  def preparePageAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Outputs a stream of data, which represents a Portable Document Format (PDF) page's contents, as an asynchronous action. This asynchronous action can be used to create an image of the PDF page.
                   * @param outputStream The stream of data, which represents a PDF page's content.
                   * @return The asynchronous action.
                   */
  def renderToStreamAsync(outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Takes a set of display settings, applies them to the output of a Portable Document Format (PDF) page's contents, and creates a stream with the customized, rendered output as an asynchronous action. This asynchronous action can be used to create a customized display image of the PDF page.
                   * @param outputStream The stream of data, which represents a PDF page's contents.
                   * @param options The requested set of display settings to apply to the display image that is output based on the PDF page.
                   * @return The asynchronous action.
                   */
  def renderToStreamAsync(
    outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    options: PdfPageRenderOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

