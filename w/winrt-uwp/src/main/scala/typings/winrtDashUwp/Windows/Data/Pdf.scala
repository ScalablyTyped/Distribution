package typings.winrtDashUwp.Windows.Data

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Foundation.Size
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for converting a page in a Portable Document Format (PDF) document to an image file. */
@JSGlobal("Windows.Data.Pdf")
@js.native
object Pdf extends js.Object {
  /** Represents a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfDocument () extends js.Object {
    /** Gets whether the Portable Document Format (PDF) document is password-protected. */
    var isPasswordProtected: Boolean = js.native
    /** Gets the number of pages in the Portable Document Format (PDF) document. */
    var pageCount: Double = js.native
    /**
      * Gets a page from a Portable Document Format (PDF) document.
      * @param pageIndex The location of the PDF page relative to its parent document.
      * @return The PDF page.
      */
    def getPage(pageIndex: Double): PdfPage = js.native
  }
  
  /** Represents a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPage () extends js.Object {
    /** Gets the group of dimension properties for a single page in a Portable Document Format (PDF) document. */
    var dimensions: PdfPageDimensions = js.native
    /** Gets the relative position of the Portable Document Format (PDF) page within its parent PDF document. */
    var index: Double = js.native
    /** Gets the Portable Document Format (PDF) page's preferred magnification factor. */
    var preferredZoom: Double = js.native
    /** Gets the number of degrees that the Portable Document Format (PDF) page will be rotated when it's displayed or printed. */
    var rotation: PdfPageRotation = js.native
    /** Gets the Portable Document Format (PDF) page's size based on its related CropBox , MediaBox , and Rotation property values. */
    var size: Size = js.native
    /** Releases all resources associated with the Portable Document Format (PDF) page. */
    def close(): Unit = js.native
    /**
      * Begins building the Portable Document Format (PDF) page. After this method finishes, the PDF page is completely built.
      * @return Represents the fully-built PDF page.
      */
    def preparePageAsync(): IPromiseWithIAsyncAction = js.native
    /**
      * Outputs a stream of data, which represents a Portable Document Format (PDF) page's contents, as an asynchronous action. This asynchronous action can be used to create an image of the PDF page.
      * @param outputStream The stream of data, which represents a PDF page's content.
      * @return The asynchronous action.
      */
    def renderToStreamAsync(outputStream: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
    /**
      * Takes a set of display settings, applies them to the output of a Portable Document Format (PDF) page's contents, and creates a stream with the customized, rendered output as an asynchronous action. This asynchronous action can be used to create a customized display image of the PDF page.
      * @param outputStream The stream of data, which represents a PDF page's contents.
      * @param options The requested set of display settings to apply to the display image that is output based on the PDF page.
      * @return The asynchronous action.
      */
    def renderToStreamAsync(outputStream: IRandomAccessStream, options: PdfPageRenderOptions): IPromiseWithIAsyncAction = js.native
  }
  
  /** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
  @js.native
  abstract class PdfPageDimensions () extends js.Object {
    /** Gets the size of a rectangle that contains the Portable Document Format (PDF) page's contents, including any meaningful surrounding white space, as intended by the PDF page's creator. */
    var artBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the clipped region of a Portable Document Format (PDF) page's contents when it is displayed. */
    var bleedBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the cropped region of a Portable Document Format (PDF) page's contents when it is displayed. */
    var cropBox: Rect = js.native
    /** Gets the size of a rectangle that defines the boundaries of the area that the Portable Document Format (PDF) page will be displayed or printed to. */
    var mediaBox: Rect = js.native
    /** Gets the size of a rectangle that specifies the intended dimensions of the Portable Document Format (PDF) page after it has been trimmed. */
    var trimBox: Rect = js.native
  }
  
  /** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
  @js.native
  /** Creates and initializes a new instance of display settings for a single page of a Portable Document Format (PDF) document. */
  class PdfPageRenderOptions () extends js.Object {
    /** Gets or sets the Portable Document Format (PDF) page's background color. */
    var backgroundColor: Color = js.native
    /** Gets or sets the Portable Document Format (PDF) page's encoding type to be used while the page is being converted to a bitmap. */
    var bitmapEncoderId: String = js.native
    /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
    var destinationHeight: Double = js.native
    /** Gets or sets the final size of the rendering of the Portable Document Format (PDF) page in device-independent pixels (DIPs). */
    var destinationWidth: Double = js.native
    /** Gets or sets whether the Portable Document Format (PDF) page uses the system's high contrast display setting. */
    var isIgnoringHighContrast: Boolean = js.native
    /** Gets or sets a portion of the Portable Document Format (PDF) page to be displayed. */
    var sourceRect: Rect = js.native
  }
  
  @js.native
  sealed trait PdfPageRotation extends js.Object
  
  /* static members */
  @js.native
  object PdfDocument extends js.Object {
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document.
      * @param file The file, which represents a PDF document.
      * @return The asynchronous operation.
      */
    def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[PdfDocument] = js.native
    /**
      * Outputs an asynchronous operation. When the operation completes, a PdfDocument object is returned, which represents a Portable Document Format (PDF) document. Use this method if the PDF document is password-protected.
      * @param file The file, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    def loadFromFileAsync(file: IStorageFile, password: String): IPromiseWithIAsyncOperation[PdfDocument] = js.native
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system.
      * @param inputStream The stream of data, which represents a PDF document.
      * @return The asynchronous operation.
      */
    def loadFromStreamAsync(inputStream: IRandomAccessStream): IPromiseWithIAsyncOperation[PdfDocument] = js.native
    /**
      * Creates a PdfDocument object, representing a Portable Document Format (PDF) document, from a stream of data that represents a PDF document in the file system. Use this method if the PDF document is password-protected.
      * @param inputStream The stream of data, which represents a PDF document.
      * @param password The password to open the PDF document, if it requires one.
      * @return The asynchronous operation.
      */
    def loadFromStreamAsync(inputStream: IRandomAccessStream, password: String): IPromiseWithIAsyncOperation[PdfDocument] = js.native
  }
  
  /** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
  @js.native
  object PdfPageRotation extends js.Object {
    /** No rotation. */
    @js.native
    sealed trait normal extends PdfPageRotation
    
    /** A 180-degree rotation. */
    @js.native
    sealed trait rotate180 extends PdfPageRotation
    
    /** A 270-degree rotation. */
    @js.native
    sealed trait rotate270 extends PdfPageRotation
    
    /** A 90-degree rotation. */
    @js.native
    sealed trait rotate90 extends PdfPageRotation
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PdfPageRotation with Double] = js.native
    /* 0 */ @js.native
    object normal extends TopLevel[normal with Double]
    
    /* 2 */ @js.native
    object rotate180 extends TopLevel[rotate180 with Double]
    
    /* 3 */ @js.native
    object rotate270 extends TopLevel[rotate270 with Double]
    
    /* 1 */ @js.native
    object rotate90 extends TopLevel[rotate90 with Double]
    
  }
  
}

