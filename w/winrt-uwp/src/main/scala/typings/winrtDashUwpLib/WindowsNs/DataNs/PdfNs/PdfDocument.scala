package typings
package winrtDashUwpLib.WindowsNs.DataNs.PdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Portable Document Format (PDF) document. */
@JSGlobal("Windows.Data.Pdf.PdfDocument")
@js.native
abstract class PdfDocument () extends js.Object {
  /** Gets whether the Portable Document Format (PDF) document is password-protected. */
  var isPasswordProtected: scala.Boolean = js.native
  /** Gets the number of pages in the Portable Document Format (PDF) document. */
  var pageCount: scala.Double = js.native
  /**
                   * Gets a page from a Portable Document Format (PDF) document.
                   * @param pageIndex The location of the PDF page relative to its parent document.
                   * @return The PDF page.
                   */
  def getPage(pageIndex: scala.Double): PdfPage = js.native
}

/** Represents a Portable Document Format (PDF) document. */
@JSGlobal("Windows.Data.Pdf.PdfDocument")
@js.native
object PdfDocument extends js.Object {
  /**
                   * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document.
                   * @param file The file, which represents a PDF document.
                   * @return The asynchronous operation.
                   */
  def loadFromFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfDocument] = js.native
  /**
                   * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document. Use this method if the PDF document is password-protected.
                   * @param file The file, which represents a PDF document.
                   * @param password The password to open the PDF document, if it requires one.
                   * @return The asynchronous operation.
                   */
  def loadFromFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile, password: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfDocument] = js.native
  /**
                   * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system.
                   * @param inputStream The stream of data, which represents a PDF document.
                   * @return The asynchronous operation.
                   */
  def loadFromStreamAsync(inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfDocument] = js.native
  /**
                   * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system. Use this method if the PDF document is password-protected.
                   * @param inputStream The stream of data, which represents a PDF document.
                   * @param password The password to open the PDF document, if it requires one.
                   * @return The asynchronous operation.
                   */
  def loadFromStreamAsync(
    inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream,
    password: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfDocument] = js.native
}

