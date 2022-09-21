package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.FileProperties.ThumbnailType
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileProperties {
  
  @JSGlobal("Windows.Storage.FileProperties.BasicProperties")
  @js.native
  open class BasicProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.BasicProperties {
    
    /* CompleteClass */
    var dateModified: js.Date = js.native
    
    /* CompleteClass */
    var itemDate: js.Date = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.DocumentProperties")
  @js.native
  open class DocumentProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.DocumentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.ImageProperties")
  @js.native
  open class ImageProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.ImageProperties
  
  @JSGlobal("Windows.Storage.FileProperties.MusicProperties")
  @js.native
  open class MusicProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.MusicProperties
  
  @JSGlobal("Windows.Storage.FileProperties.PhotoOrientation")
  @js.native
  object PhotoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.PhotoOrientation & Double] = js.native
    
    /* 2 */ val flipHorizontal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipHorizontal & Double = js.native
    
    /* 4 */ val flipVertical: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.flipVertical & Double = js.native
    
    /* 1 */ val normal: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.normal & Double = js.native
    
    /* 3 */ val rotate180: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate180 & Double = js.native
    
    /* 6 */ val rotate270: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate270 & Double = js.native
    
    /* 8 */ val rotate90: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.rotate90 & Double = js.native
    
    /* 5 */ val transpose: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transpose & Double = js.native
    
    /* 7 */ val transverse: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.transverse & Double = js.native
    
    /* 0 */ val unspecified: typings.winrt.Windows.Storage.FileProperties.PhotoOrientation.unspecified & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
  @js.native
  object PropertyPrefetchOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions & Double] = js.native
    
    /* 5 */ val basicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.basicProperties & Double = js.native
    
    /* 4 */ val documentProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.documentProperties & Double = js.native
    
    /* 3 */ val imageProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.imageProperties & Double = js.native
    
    /* 1 */ val musicProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.musicProperties & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.none & Double = js.native
    
    /* 2 */ val videoProperties: typings.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions.videoProperties & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemContentProperties")
  @js.native
  open class StorageItemContentProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.StorageItemContentProperties
  
  @JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
  @js.native
  open class StorageItemThumbnail ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.StorageItemThumbnail {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var originalHeight: Double = js.native
    
    /* CompleteClass */
    var originalWidth: Double = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    var returnedSmallerCachedSize: Boolean = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var `type`: ThumbnailType = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailMode")
  @js.native
  object ThumbnailMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailMode & Double] = js.native
    
    /* 3 */ val documentsView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.documentsView & Double = js.native
    
    /* 4 */ val listView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.listView & Double = js.native
    
    /* 2 */ val musicView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.musicView & Double = js.native
    
    /* 0 */ val picturesView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.picturesView & Double = js.native
    
    /* 5 */ val singleItem: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.singleItem & Double = js.native
    
    /* 1 */ val videosView: typings.winrt.Windows.Storage.FileProperties.ThumbnailMode.videosView & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailOptions")
  @js.native
  object ThumbnailOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions & Double] = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.none & Double = js.native
    
    /* 2 */ val resizeThumbnail: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.resizeThumbnail & Double = js.native
    
    /* 1 */ val returnOnlyIfCached: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.returnOnlyIfCached & Double = js.native
    
    /* 3 */ val useCurrentScale: typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions.useCurrentScale & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.ThumbnailType")
  @js.native
  object ThumbnailType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.ThumbnailType & Double] = js.native
    
    /* 1 */ val icon: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.icon & Double = js.native
    
    /* 0 */ val image: typings.winrt.Windows.Storage.FileProperties.ThumbnailType.image & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoOrientation")
  @js.native
  object VideoOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.FileProperties.VideoOrientation & Double] = js.native
    
    /* 0 */ val normal: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.normal & Double = js.native
    
    /* 2 */ val rotate180: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate180 & Double = js.native
    
    /* 3 */ val rotate270: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate270 & Double = js.native
    
    /* 1 */ val rotate90: typings.winrt.Windows.Storage.FileProperties.VideoOrientation.rotate90 & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.FileProperties.VideoProperties")
  @js.native
  open class VideoProperties ()
    extends StObject
       with typings.winrt.Windows.Storage.FileProperties.VideoProperties
}
