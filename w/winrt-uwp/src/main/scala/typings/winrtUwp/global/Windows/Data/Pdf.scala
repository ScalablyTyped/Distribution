package typings.winrtUwp.global.Windows.Data

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for converting a page in a Portable Document Format (PDF) document to an image file. */
@JSGlobal("Windows.Data.Pdf")
@js.native
object Pdf extends js.Object {
  
  /** Represents a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfDocument ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfDocument
  /* static members */
  @js.native
  object PdfDocument extends js.Object {
    
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document.
      * @param file The file, which represents a PDF document.
      * @return The asynchronous operation.
      */
    def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document. Use this method if the PDF document is password-protected.
      * @param file The file, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    def loadFromFileAsync(file: IStorageFile, password: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system.
      * @param inputStream The stream of data, which represents a PDF document.
      * @return The asynchronous operation.
      */
    def loadFromStreamAsync(inputStream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system. Use this method if the PDF document is password-protected.
      * @param inputStream The stream of data, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    def loadFromStreamAsync(inputStream: IRandomAccessStream, password: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Pdf.PdfDocument] = js.native
  }
  
  /** Represents a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPage ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPage
  
  /** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPageDimensions ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPageDimensions
  
  /** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
  @js.native
  /** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
  class PdfPageRenderOptions ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPageRenderOptions
  
  /** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
  @js.native
  object PdfPageRotation extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation with Double] = js.native
    
    /* 0 */ val normal: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.normal with Double = js.native
    
    /* 2 */ val rotate180: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate180 with Double = js.native
    
    /* 3 */ val rotate270: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate270 with Double = js.native
    
    /* 1 */ val rotate90: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate90 with Double = js.native
  }
}
