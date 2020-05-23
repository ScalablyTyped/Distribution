package typings.winrtUwp.global.Windows.Data

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for converting a page in a Portable Document Format (PDF) document to an image file. */
@JSGlobal("Windows.Data.Pdf")
@js.native
object Pdf extends js.Object {
  /** Represents a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfDocument ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfDocument {
    /** Gets whether the Portable Document Format (PDF) document is password-protected. */
    /* CompleteClass */
    override var isPasswordProtected: Boolean = js.native
    /** Gets the number of pages in the Portable Document Format (PDF) document. */
    /* CompleteClass */
    override var pageCount: Double = js.native
    /**
      * Gets a page from a Portable Document Format (PDF) document.
      * @param pageIndex The location of the PDF page relative to its parent document.
      * @return The PDF page.
      */
    /* CompleteClass */
    override def getPage(pageIndex: Double): typings.winrtUwp.Windows.Data.Pdf.PdfPage = js.native
  }
  
  /** Represents a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPage ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPage
  
  /** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPageDimensions ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPageDimensions {
    /** Gets the size of a rectangle that contains the Portable Document Format (PDF) page's contents, including any meaningful surrounding white space, as intended by the PDF page's creator. */
    /* CompleteClass */
    override var artBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the clipped region of a Portable Document Format (PDF) page's contents when it is displayed. */
    /* CompleteClass */
    override var bleedBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the cropped region of a Portable Document Format (PDF) page's contents when it is displayed. */
    /* CompleteClass */
    override var cropBox: Rect = js.native
    /** Gets the size of a rectangle that defines the boundaries of the area that the Portable Document Format (PDF) page will be displayed or printed to. */
    /* CompleteClass */
    override var mediaBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the intended dimensions of the Portable Document Format (PDF) page after it has been trimmed. */
    /* CompleteClass */
    override var trimBox: Rect = js.native
  }
  
  /** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
  @js.native
  /** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
  class PdfPageRenderOptions ()
    extends typings.winrtUwp.Windows.Data.Pdf.PdfPageRenderOptions {
    /** Gets or sets the Portable Document Format (PDF) page's background color. */
    /* CompleteClass */
    override var backgroundColor: Color = js.native
    /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
    /* CompleteClass */
    override var bitmapEncoderId: String = js.native
    /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
    /* CompleteClass */
    override var destinationHeight: Double = js.native
    /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
    /* CompleteClass */
    override var destinationWidth: Double = js.native
    /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
    /* CompleteClass */
    override var isIgnoringHighContrast: Boolean = js.native
    /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
    /* CompleteClass */
    override var sourceRect: Rect = js.native
  }
  
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
  
  /** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
  @js.native
  object PdfPageRotation extends js.Object {
    /* 0 */ val normal: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.normal with Double = js.native
    /* 2 */ val rotate180: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate180 with Double = js.native
    /* 3 */ val rotate270: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate270 with Double = js.native
    /* 1 */ val rotate90: typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation.rotate90 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Pdf.PdfPageRotation with Double] = js.native
  }
  
}

