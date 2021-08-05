package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.FileProperties.BasicProperties
import typings.winrt.Windows.Storage.FileProperties.DocumentProperties
import typings.winrt.Windows.Storage.FileProperties.ImageProperties
import typings.winrt.Windows.Storage.FileProperties.MusicProperties
import typings.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typings.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typings.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typings.winrt.Windows.Storage.FileProperties.VideoProperties
import typings.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import typings.winrt.Windows.Storage.Search.IStorageQueryResultBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulkAccess {
  
  @js.native
  trait FileInformation
    extends StObject
       with IStorageItemInformation
       with IStorageFile
       with IStorageItemProperties
  
  @js.native
  trait FileInformationFactory
    extends StObject
       with IFileInformationFactory
  
  @js.native
  trait FolderInformation
    extends StObject
       with IStorageItemInformation
       with IStorageFolder
       with IStorageItemProperties
       with IStorageFolderQueryOperations {
    
    /* InferMemberOverrides */
    override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  }
  
  @js.native
  trait IFileInformationFactory extends StObject {
    
    def getFilesAsync(): IAsyncOperation[IVectorView[FileInformation]] = js.native
    def getFilesAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[FileInformation]] = js.native
    
    def getFoldersAsync(): IAsyncOperation[IVectorView[FolderInformation]] = js.native
    def getFoldersAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[FolderInformation]] = js.native
    
    def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItemInformation]] = js.native
    def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItemInformation]] = js.native
    
    def getVirtualizedFilesVector(): js.Any = js.native
    
    def getVirtualizedFoldersVector(): js.Any = js.native
    
    def getVirtualizedItemsVector(): js.Any = js.native
  }
  
  trait IFileInformationFactoryFactory extends StObject {
    
    def createWithMode(queryResult: IStorageQueryResultBase, mode: ThumbnailMode): FileInformationFactory
    
    def createWithModeAndSize(queryResult: IStorageQueryResultBase, mode: ThumbnailMode, requestedThumbnailSize: Double): FileInformationFactory
    
    def createWithModeAndSizeAndOptions(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions
    ): FileInformationFactory
    
    def createWithModeAndSizeAndOptionsAndFlags(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: Double,
      thumbnailOptions: ThumbnailOptions,
      delayLoad: Boolean
    ): FileInformationFactory
  }
  object IFileInformationFactoryFactory {
    
    inline def apply(
      createWithMode: (IStorageQueryResultBase, ThumbnailMode) => FileInformationFactory,
      createWithModeAndSize: (IStorageQueryResultBase, ThumbnailMode, Double) => FileInformationFactory,
      createWithModeAndSizeAndOptions: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => FileInformationFactory,
      createWithModeAndSizeAndOptionsAndFlags: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => FileInformationFactory
    ): IFileInformationFactoryFactory = {
      val __obj = js.Dynamic.literal(createWithMode = js.Any.fromFunction2(createWithMode), createWithModeAndSize = js.Any.fromFunction3(createWithModeAndSize), createWithModeAndSizeAndOptions = js.Any.fromFunction4(createWithModeAndSizeAndOptions), createWithModeAndSizeAndOptionsAndFlags = js.Any.fromFunction5(createWithModeAndSizeAndOptionsAndFlags))
      __obj.asInstanceOf[IFileInformationFactoryFactory]
    }
    
    extension [Self <: IFileInformationFactoryFactory](x: Self) {
      
      inline def setCreateWithMode(value: (IStorageQueryResultBase, ThumbnailMode) => FileInformationFactory): Self = StObject.set(x, "createWithMode", js.Any.fromFunction2(value))
      
      inline def setCreateWithModeAndSize(value: (IStorageQueryResultBase, ThumbnailMode, Double) => FileInformationFactory): Self = StObject.set(x, "createWithModeAndSize", js.Any.fromFunction3(value))
      
      inline def setCreateWithModeAndSizeAndOptions(
        value: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions) => FileInformationFactory
      ): Self = StObject.set(x, "createWithModeAndSizeAndOptions", js.Any.fromFunction4(value))
      
      inline def setCreateWithModeAndSizeAndOptionsAndFlags(
        value: (IStorageQueryResultBase, ThumbnailMode, Double, ThumbnailOptions, Boolean) => FileInformationFactory
      ): Self = StObject.set(x, "createWithModeAndSizeAndOptionsAndFlags", js.Any.fromFunction5(value))
    }
  }
  
  trait IStorageItemInformation extends StObject {
    
    var basicProperties: BasicProperties
    
    var documentProperties: DocumentProperties
    
    var imageProperties: ImageProperties
    
    var musicProperties: MusicProperties
    
    var onpropertiesupdated: js.Any
    
    var onthumbnailupdated: js.Any
    
    var thumbnail: StorageItemThumbnail
    
    var videoProperties: VideoProperties
  }
  object IStorageItemInformation {
    
    inline def apply(
      basicProperties: BasicProperties,
      documentProperties: DocumentProperties,
      imageProperties: ImageProperties,
      musicProperties: MusicProperties,
      onpropertiesupdated: js.Any,
      onthumbnailupdated: js.Any,
      thumbnail: StorageItemThumbnail,
      videoProperties: VideoProperties
    ): IStorageItemInformation = {
      val __obj = js.Dynamic.literal(basicProperties = basicProperties.asInstanceOf[js.Any], documentProperties = documentProperties.asInstanceOf[js.Any], imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], onpropertiesupdated = onpropertiesupdated.asInstanceOf[js.Any], onthumbnailupdated = onthumbnailupdated.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], videoProperties = videoProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStorageItemInformation]
    }
    
    extension [Self <: IStorageItemInformation](x: Self) {
      
      inline def setBasicProperties(value: BasicProperties): Self = StObject.set(x, "basicProperties", value.asInstanceOf[js.Any])
      
      inline def setDocumentProperties(value: DocumentProperties): Self = StObject.set(x, "documentProperties", value.asInstanceOf[js.Any])
      
      inline def setImageProperties(value: ImageProperties): Self = StObject.set(x, "imageProperties", value.asInstanceOf[js.Any])
      
      inline def setMusicProperties(value: MusicProperties): Self = StObject.set(x, "musicProperties", value.asInstanceOf[js.Any])
      
      inline def setOnpropertiesupdated(value: js.Any): Self = StObject.set(x, "onpropertiesupdated", value.asInstanceOf[js.Any])
      
      inline def setOnthumbnailupdated(value: js.Any): Self = StObject.set(x, "onthumbnailupdated", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: StorageItemThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setVideoProperties(value: VideoProperties): Self = StObject.set(x, "videoProperties", value.asInstanceOf[js.Any])
    }
  }
}
