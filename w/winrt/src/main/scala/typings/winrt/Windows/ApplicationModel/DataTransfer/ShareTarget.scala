package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShareTarget {
  
  @js.native
  trait IQuickLink extends StObject {
    
    var id: String = js.native
    
    var supportedDataFormats: IVector[String] = js.native
    
    var supportedFileTypes: IVector[String] = js.native
    
    var thumbnail: RandomAccessStreamReference = js.native
    
    var title: String = js.native
  }
  object IQuickLink {
    
    @scala.inline
    def apply(
      id: String,
      supportedDataFormats: IVector[String],
      supportedFileTypes: IVector[String],
      thumbnail: RandomAccessStreamReference,
      title: String
    ): IQuickLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IQuickLink]
    }
    
    @scala.inline
    implicit class IQuickLinkMutableBuilder[Self <: IQuickLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedDataFormats(value: IVector[String]): Self = StObject.set(x, "supportedDataFormats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedFileTypes(value: IVector[String]): Self = StObject.set(x, "supportedFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: RandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShareOperation extends StObject {
    
    var data: DataPackageView = js.native
    
    var quickLinkId: String = js.native
    
    def removeThisQuickLink(): Unit = js.native
    
    def reportCompleted(): Unit = js.native
    def reportCompleted(quicklink: QuickLink): Unit = js.native
    
    def reportDataRetrieved(): Unit = js.native
    
    def reportError(value: String): Unit = js.native
    
    def reportStarted(): Unit = js.native
    
    def reportSubmittedBackgroundTask(): Unit = js.native
  }
  
  @js.native
  trait QuickLink extends IQuickLink
  object QuickLink {
    
    @scala.inline
    def apply(
      id: String,
      supportedDataFormats: IVector[String],
      supportedFileTypes: IVector[String],
      thumbnail: RandomAccessStreamReference,
      title: String
    ): QuickLink = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickLink]
    }
  }
  
  @js.native
  trait ShareOperation extends IShareOperation
}
