package typings.winrtUwp.Windows.Data

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for converting a page in a Portable Document Format (PDF) document to an image file. */
object Pdf {
  
  @js.native
  sealed trait PdfPageRotation extends StObject
  /** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
  @JSGlobal("Windows.Data.Pdf.PdfPageRotation")
  @js.native
  object PdfPageRotation extends StObject {
    
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
  }
  
  /** Represents a Portable Document Format (PDF) document. */
  @js.native
  trait PdfDocument extends StObject {
    
    /**
      * Gets a page from a Portable Document Format (PDF) document.
      * @param pageIndex The location of the PDF page relative to its parent document.
      * @return The PDF page.
      */
    def getPage(pageIndex: Double): PdfPage = js.native
    
    /** Gets whether the Portable Document Format (PDF) document is password-protected. */
    var isPasswordProtected: Boolean = js.native
    
    /** Gets the number of pages in the Portable Document Format (PDF) document. */
    var pageCount: Double = js.native
  }
  object PdfDocument {
    
    @scala.inline
    def apply(getPage: Double => PdfPage, isPasswordProtected: Boolean, pageCount: Double): PdfDocument = {
      val __obj = js.Dynamic.literal(getPage = js.Any.fromFunction1(getPage), isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfDocument]
    }
    
    @scala.inline
    implicit class PdfDocumentMutableBuilder[Self <: PdfDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPage(value: Double => PdfPage): Self = StObject.set(x, "getPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a single page in a Portable Document Format (PDF) document. */
  @js.native
  trait PdfPage extends StObject {
    
    /** Releases all resources associated with the Portable Document Format (PDF) page. */
    def close(): Unit = js.native
    
    /** Gets the group of dimension properties for a single page in a Portable Document Format (PDF) document. */
    var dimensions: PdfPageDimensions = js.native
    
    /** Gets the relative position of the Portable Document Format (PDF) page within its parent PDF document. */
    var index: Double = js.native
    
    /** Gets the Portable Document Format (PDF) page's preferred magnification factor. */
    var preferredZoom: Double = js.native
    
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
    
    /** Gets the number of degrees that the Portable Document Format (PDF) page will be rotated when it's displayed or printed. */
    var rotation: PdfPageRotation = js.native
    
    /** Gets the Portable Document Format (PDF) page's size based on its related CropBox , MediaBox , and Rotation property values. */
    var size: Size = js.native
  }
  
  /** Represents the dimensions of a single page in a Portable Document Format (PDF) document. */
  @js.native
  trait PdfPageDimensions extends StObject {
    
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
  object PdfPageDimensions {
    
    @scala.inline
    def apply(artBox: Rect, bleedBox: Rect, cropBox: Rect, mediaBox: Rect, trimBox: Rect): PdfPageDimensions = {
      val __obj = js.Dynamic.literal(artBox = artBox.asInstanceOf[js.Any], bleedBox = bleedBox.asInstanceOf[js.Any], cropBox = cropBox.asInstanceOf[js.Any], mediaBox = mediaBox.asInstanceOf[js.Any], trimBox = trimBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfPageDimensions]
    }
    
    @scala.inline
    implicit class PdfPageDimensionsMutableBuilder[Self <: PdfPageDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtBox(value: Rect): Self = StObject.set(x, "artBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBleedBox(value: Rect): Self = StObject.set(x, "bleedBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropBox(value: Rect): Self = StObject.set(x, "cropBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaBox(value: Rect): Self = StObject.set(x, "mediaBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimBox(value: Rect): Self = StObject.set(x, "trimBox", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents display settings for a single page of a Portable Document Format (PDF) document, such as the page's background color and its encoding type. */
  @js.native
  trait PdfPageRenderOptions extends StObject {
    
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
  object PdfPageRenderOptions {
    
    @scala.inline
    def apply(
      backgroundColor: Color,
      bitmapEncoderId: String,
      destinationHeight: Double,
      destinationWidth: Double,
      isIgnoringHighContrast: Boolean,
      sourceRect: Rect
    ): PdfPageRenderOptions = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bitmapEncoderId = bitmapEncoderId.asInstanceOf[js.Any], destinationHeight = destinationHeight.asInstanceOf[js.Any], destinationWidth = destinationWidth.asInstanceOf[js.Any], isIgnoringHighContrast = isIgnoringHighContrast.asInstanceOf[js.Any], sourceRect = sourceRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfPageRenderOptions]
    }
    
    @scala.inline
    implicit class PdfPageRenderOptionsMutableBuilder[Self <: PdfPageRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitmapEncoderId(value: String): Self = StObject.set(x, "bitmapEncoderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationHeight(value: Double): Self = StObject.set(x, "destinationHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationWidth(value: Double): Self = StObject.set(x, "destinationWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIgnoringHighContrast(value: Boolean): Self = StObject.set(x, "isIgnoringHighContrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRect(value: Rect): Self = StObject.set(x, "sourceRect", value.asInstanceOf[js.Any])
    }
  }
}
