package typings.winrt.global.Windows

import typings.std.Date
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Web.Syndication.ISyndicationNode
import typings.winrt.Windows.Web.Syndication.ISyndicationText
import typings.winrt.Windows.Web.Syndication.RetrievalProgress
import typings.winrt.Windows.Web.Syndication.SyndicationAttribute
import typings.winrt.Windows.Web.Syndication.SyndicationCategory
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus
import typings.winrt.Windows.Web.Syndication.SyndicationFeed
import typings.winrt.Windows.Web.Syndication.SyndicationFormat
import typings.winrt.Windows.Web.Syndication.SyndicationItem
import typings.winrt.Windows.Web.Syndication.SyndicationTextType
import typings.winrt.Windows.Web.Syndication.TransferProgress
import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  object AtomPub {
    
    @JSGlobal("Windows.Web.AtomPub.AtomPubClient")
    @js.native
    class AtomPubClient ()
      extends StObject
         with typings.winrt.Windows.Web.AtomPub.AtomPubClient {
      def this(serverCredential: PasswordCredential) = this()
      
      /* CompleteClass */
      var bypassCacheOnRetrieve: Boolean = js.native
      
      /* CompleteClass */
      override def cancelAsyncOperations(): Unit = js.native
      
      /* CompleteClass */
      override def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
      
      /* CompleteClass */
      override def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
      
      /* CompleteClass */
      override def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
      
      /* CompleteClass */
      override def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
      
      /* CompleteClass */
      var maxResponseBufferSize: Double = js.native
      
      /* CompleteClass */
      var proxyCredential: PasswordCredential = js.native
      
      /* CompleteClass */
      override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
      
      /* CompleteClass */
      override def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
      
      /* CompleteClass */
      override def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
      
      /* CompleteClass */
      override def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[typings.winrt.Windows.Web.AtomPub.ServiceDocument, RetrievalProgress] = js.native
      
      /* CompleteClass */
      var serverCredential: PasswordCredential = js.native
      
      /* CompleteClass */
      override def setRequestHeader(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      var timeout: Double = js.native
      
      /* CompleteClass */
      override def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
      
      /* CompleteClass */
      override def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
      
      /* CompleteClass */
      override def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    }
    
    @JSGlobal("Windows.Web.AtomPub.ResourceCollection")
    @js.native
    class ResourceCollection ()
      extends StObject
         with typings.winrt.Windows.Web.AtomPub.ResourceCollection {
      
      /* CompleteClass */
      var accepts: IVectorView[String] = js.native
      
      /* CompleteClass */
      var attributeExtensions: IVector[SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var categories: IVectorView[SyndicationCategory] = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var title: ISyndicationText = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
    }
    
    @JSGlobal("Windows.Web.AtomPub.ServiceDocument")
    @js.native
    class ServiceDocument ()
      extends StObject
         with typings.winrt.Windows.Web.AtomPub.ServiceDocument {
      
      /* CompleteClass */
      var attributeExtensions: IVector[SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var workspaces: IVectorView[typings.winrt.Windows.Web.AtomPub.Workspace] = js.native
    }
    
    @JSGlobal("Windows.Web.AtomPub.Workspace")
    @js.native
    class Workspace ()
      extends StObject
         with typings.winrt.Windows.Web.AtomPub.Workspace {
      
      /* CompleteClass */
      var attributeExtensions: IVector[SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var collections: IVectorView[typings.winrt.Windows.Web.AtomPub.ResourceCollection] = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var title: ISyndicationText = js.native
    }
  }
  
  object Syndication {
    
    @JSGlobal("Windows.Web.Syndication.SyndicationAttribute")
    @js.native
    class SyndicationAttribute ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationAttribute {
      def this(attributeName: String, attributeNamespace: String, attributeValue: String) = this()
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var namespace: String = js.native
      
      /* CompleteClass */
      var value: String = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationCategory")
    @js.native
    class SyndicationCategory ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationCategory {
      def this(term: String) = this()
      def this(term: String, scheme: String, label: String) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var label: String = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var scheme: String = js.native
      
      /* CompleteClass */
      var term: String = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationClient")
    @js.native
    class SyndicationClient ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationClient {
      def this(serverCredential: PasswordCredential) = this()
      
      /* CompleteClass */
      var bypassCacheOnRetrieve: Boolean = js.native
      
      /* CompleteClass */
      var maxResponseBufferSize: Double = js.native
      
      /* CompleteClass */
      var proxyCredential: PasswordCredential = js.native
      
      /* CompleteClass */
      override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[typings.winrt.Windows.Web.Syndication.SyndicationFeed, RetrievalProgress] = js.native
      
      /* CompleteClass */
      var serverCredential: PasswordCredential = js.native
      
      /* CompleteClass */
      override def setRequestHeader(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      var timeout: Double = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationContent")
    @js.native
    class SyndicationContent ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationContent {
      def this(sourceUri: Uri) = this()
      def this(text: String, `type`: SyndicationTextType) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var sourceUri: Uri = js.native
      
      /* CompleteClass */
      var text: String = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
      
      /* CompleteClass */
      var xml: XmlDocument = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationError")
    @js.native
    class SyndicationError ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationError
    /* static members */
    object SyndicationError {
      
      @JSGlobal("Windows.Web.Syndication.SyndicationError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getStatus(hresult: Double): SyndicationErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[SyndicationErrorStatus]
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
    @js.native
    object SyndicationErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus & Double] = js.native
      
      /* 3 */ val invalidXml: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml & Double = js.native
      
      /* 2 */ val missingRequiredAttribute: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute & Double = js.native
      
      /* 1 */ val missingRequiredElement: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement & Double = js.native
      
      /* 4 */ val unexpectedContent: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent & Double = js.native
      
      /* 0 */ val unknown: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unknown & Double = js.native
      
      /* 5 */ val unsupportedFormat: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat & Double = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationFeed")
    @js.native
    class SyndicationFeed ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationFeed {
      def this(title: String, subtitle: String, uri: Uri) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var authors: IVector[typings.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var categories: IVector[typings.winrt.Windows.Web.Syndication.SyndicationCategory] = js.native
      
      /* CompleteClass */
      var contributors: IVector[typings.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      var firstUri: Uri = js.native
      
      /* CompleteClass */
      var generator: typings.winrt.Windows.Web.Syndication.SyndicationGenerator = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var iconUri: Uri = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var imageUri: Uri = js.native
      
      /* CompleteClass */
      var items: IVector[typings.winrt.Windows.Web.Syndication.SyndicationItem] = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var lastUpdatedTime: Date = js.native
      
      /* CompleteClass */
      var lastUri: Uri = js.native
      
      /* CompleteClass */
      var links: IVector[typings.winrt.Windows.Web.Syndication.SyndicationLink] = js.native
      
      /* CompleteClass */
      override def load(feed: String): Unit = js.native
      
      /* CompleteClass */
      override def loadFromXml(feedDocument: XmlDocument): Unit = js.native
      
      /* CompleteClass */
      var nextUri: Uri = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var previousUri: Uri = js.native
      
      /* CompleteClass */
      var rights: ISyndicationText = js.native
      
      /* CompleteClass */
      var sourceFormat: SyndicationFormat = js.native
      
      /* CompleteClass */
      var subtitle: ISyndicationText = js.native
      
      /* CompleteClass */
      var title: ISyndicationText = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationFormat")
    @js.native
    object SyndicationFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationFormat & Double] = js.native
      
      /* 5 */ val atom03: typings.winrt.Windows.Web.Syndication.SyndicationFormat.atom03 & Double = js.native
      
      /* 0 */ val atom10: typings.winrt.Windows.Web.Syndication.SyndicationFormat.atom10 & Double = js.native
      
      /* 4 */ val rss091: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss091 & Double = js.native
      
      /* 3 */ val rss092: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss092 & Double = js.native
      
      /* 2 */ val rss10: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss10 & Double = js.native
      
      /* 1 */ val rss20: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss20 & Double = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationGenerator")
    @js.native
    class SyndicationGenerator ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationGenerator {
      def this(text: String) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var text: String = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
      
      /* CompleteClass */
      var version: String = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationItem")
    @js.native
    class SyndicationItem ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationItem {
      def this(title: String, content: typings.winrt.Windows.Web.Syndication.SyndicationContent, uri: Uri) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var authors: IVector[typings.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var categories: IVector[typings.winrt.Windows.Web.Syndication.SyndicationCategory] = js.native
      
      /* CompleteClass */
      var commentsUri: Uri = js.native
      
      /* CompleteClass */
      var content: typings.winrt.Windows.Web.Syndication.SyndicationContent = js.native
      
      /* CompleteClass */
      var contributors: IVector[typings.winrt.Windows.Web.Syndication.SyndicationPerson] = js.native
      
      /* CompleteClass */
      var eTag: String = js.native
      
      /* CompleteClass */
      var editMediaUri: Uri = js.native
      
      /* CompleteClass */
      var editUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var itemUri: Uri = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var lastUpdatedTime: Date = js.native
      
      /* CompleteClass */
      var links: IVector[typings.winrt.Windows.Web.Syndication.SyndicationLink] = js.native
      
      /* CompleteClass */
      override def load(item: String): Unit = js.native
      
      /* CompleteClass */
      override def loadFromXml(itemDocument: XmlDocument): Unit = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var publishedDate: Date = js.native
      
      /* CompleteClass */
      var rights: ISyndicationText = js.native
      
      /* CompleteClass */
      var source: typings.winrt.Windows.Web.Syndication.SyndicationFeed = js.native
      
      /* CompleteClass */
      var summary: ISyndicationText = js.native
      
      /* CompleteClass */
      var title: ISyndicationText = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationLink")
    @js.native
    class SyndicationLink ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationLink {
      def this(uri: Uri) = this()
      def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var length: Double = js.native
      
      /* CompleteClass */
      var mediaType: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var relationship: String = js.native
      
      /* CompleteClass */
      var resourceLanguage: String = js.native
      
      /* CompleteClass */
      var title: String = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationNode")
    @js.native
    class SyndicationNode ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationNode {
      def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationPerson")
    @js.native
    class SyndicationPerson ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationPerson {
      def this(name: String) = this()
      def this(name: String, email: String, uri: Uri) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      var email: String = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationText")
    @js.native
    class SyndicationText ()
      extends StObject
         with typings.winrt.Windows.Web.Syndication.SyndicationText {
      def this(text: String) = this()
      def this(text: String, `type`: SyndicationTextType) = this()
      
      /* CompleteClass */
      var attributeExtensions: IVector[typings.winrt.Windows.Web.Syndication.SyndicationAttribute] = js.native
      
      /* CompleteClass */
      var baseUri: Uri = js.native
      
      /* CompleteClass */
      var elementExtensions: IVector[ISyndicationNode] = js.native
      
      /* CompleteClass */
      override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
      
      /* CompleteClass */
      var language: String = js.native
      
      /* CompleteClass */
      var nodeName: String = js.native
      
      /* CompleteClass */
      var nodeNamespace: String = js.native
      
      /* CompleteClass */
      var nodeValue: String = js.native
      
      /* CompleteClass */
      var text: String = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
      
      /* CompleteClass */
      var xml: XmlDocument = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationTextType")
    @js.native
    object SyndicationTextType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationTextType & Double] = js.native
      
      /* 1 */ val html: typings.winrt.Windows.Web.Syndication.SyndicationTextType.html & Double = js.native
      
      /* 0 */ val text: typings.winrt.Windows.Web.Syndication.SyndicationTextType.text & Double = js.native
      
      /* 2 */ val xhtml: typings.winrt.Windows.Web.Syndication.SyndicationTextType.xhtml & Double = js.native
    }
  }
  
  @JSGlobal("Windows.Web.WebError")
  @js.native
  class WebError ()
    extends StObject
       with typings.winrt.Windows.Web.WebError
  /* static members */
  object WebError {
    
    @JSGlobal("Windows.Web.WebError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStatus(hresult: Double): WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[WebErrorStatus]
  }
  
  @JSGlobal("Windows.Web.WebErrorStatus")
  @js.native
  object WebErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.WebErrorStatus & Double] = js.native
    
    /* 49 */ val badGateway: typings.winrt.Windows.Web.WebErrorStatus.badGateway & Double = js.native
    
    /* 29 */ val badRequest: typings.winrt.Windows.Web.WebErrorStatus.badRequest & Double = js.native
    
    /* 14 */ val cannotConnect: typings.winrt.Windows.Web.WebErrorStatus.cannotConnect & Double = js.native
    
    /* 1 */ val certificateCommonNameIsIncorrect: typings.winrt.Windows.Web.WebErrorStatus.certificateCommonNameIsIncorrect & Double = js.native
    
    /* 3 */ val certificateContainsErrors: typings.winrt.Windows.Web.WebErrorStatus.certificateContainsErrors & Double = js.native
    
    /* 2 */ val certificateExpired: typings.winrt.Windows.Web.WebErrorStatus.certificateExpired & Double = js.native
    
    /* 5 */ val certificateIsInvalid: typings.winrt.Windows.Web.WebErrorStatus.certificateIsInvalid & Double = js.native
    
    /* 4 */ val certificateRevoked: typings.winrt.Windows.Web.WebErrorStatus.certificateRevoked & Double = js.native
    
    /* 38 */ val conflict: typings.winrt.Windows.Web.WebErrorStatus.conflict & Double = js.native
    
    /* 9 */ val connectionAborted: typings.winrt.Windows.Web.WebErrorStatus.connectionAborted & Double = js.native
    
    /* 10 */ val connectionReset: typings.winrt.Windows.Web.WebErrorStatus.connectionReset & Double = js.native
    
    /* 11 */ val disconnected: typings.winrt.Windows.Web.WebErrorStatus.disconnected & Double = js.native
    
    /* 8 */ val errorHttpInvalidServerResponse: typings.winrt.Windows.Web.WebErrorStatus.errorHttpInvalidServerResponse & Double = js.native
    
    /* 46 */ val expectationFailed: typings.winrt.Windows.Web.WebErrorStatus.expectationFailed & Double = js.native
    
    /* 32 */ val forbidden: typings.winrt.Windows.Web.WebErrorStatus.forbidden & Double = js.native
    
    /* 24 */ val found: typings.winrt.Windows.Web.WebErrorStatus.found & Double = js.native
    
    /* 51 */ val gatewayTimeout: typings.winrt.Windows.Web.WebErrorStatus.gatewayTimeout & Double = js.native
    
    /* 39 */ val gone: typings.winrt.Windows.Web.WebErrorStatus.gone & Double = js.native
    
    /* 15 */ val hostNameNotResolved: typings.winrt.Windows.Web.WebErrorStatus.hostNameNotResolved & Double = js.native
    
    /* 12 */ val httpToHttpsOnRedirection: typings.winrt.Windows.Web.WebErrorStatus.httpToHttpsOnRedirection & Double = js.native
    
    /* 52 */ val httpVersionNotSupported: typings.winrt.Windows.Web.WebErrorStatus.httpVersionNotSupported & Double = js.native
    
    /* 13 */ val httpsToHttpOnRedirection: typings.winrt.Windows.Web.WebErrorStatus.httpsToHttpOnRedirection & Double = js.native
    
    /* 47 */ val internalServerError: typings.winrt.Windows.Web.WebErrorStatus.internalServerError & Double = js.native
    
    /* 40 */ val lengthRequired: typings.winrt.Windows.Web.WebErrorStatus.lengthRequired & Double = js.native
    
    /* 34 */ val methodNotAllowed: typings.winrt.Windows.Web.WebErrorStatus.methodNotAllowed & Double = js.native
    
    /* 23 */ val movedPermanently: typings.winrt.Windows.Web.WebErrorStatus.movedPermanently & Double = js.native
    
    /* 22 */ val multipleChoices: typings.winrt.Windows.Web.WebErrorStatus.multipleChoices & Double = js.native
    
    /* 35 */ val notAcceptable: typings.winrt.Windows.Web.WebErrorStatus.notAcceptable & Double = js.native
    
    /* 33 */ val notFound: typings.winrt.Windows.Web.WebErrorStatus.notFound & Double = js.native
    
    /* 48 */ val notImplemented: typings.winrt.Windows.Web.WebErrorStatus.notImplemented & Double = js.native
    
    /* 26 */ val notModified: typings.winrt.Windows.Web.WebErrorStatus.notModified & Double = js.native
    
    /* 16 */ val operationCanceled: typings.winrt.Windows.Web.WebErrorStatus.operationCanceled & Double = js.native
    
    /* 31 */ val paymentRequired: typings.winrt.Windows.Web.WebErrorStatus.paymentRequired & Double = js.native
    
    /* 41 */ val preconditionFailed: typings.winrt.Windows.Web.WebErrorStatus.preconditionFailed & Double = js.native
    
    /* 36 */ val proxyAuthenticationRequired: typings.winrt.Windows.Web.WebErrorStatus.proxyAuthenticationRequired & Double = js.native
    
    /* 17 */ val redirectFailed: typings.winrt.Windows.Web.WebErrorStatus.redirectFailed & Double = js.native
    
    /* 42 */ val requestEntityTooLarge: typings.winrt.Windows.Web.WebErrorStatus.requestEntityTooLarge & Double = js.native
    
    /* 37 */ val requestTimeout: typings.winrt.Windows.Web.WebErrorStatus.requestTimeout & Double = js.native
    
    /* 43 */ val requestUriTooLong: typings.winrt.Windows.Web.WebErrorStatus.requestUriTooLong & Double = js.native
    
    /* 45 */ val requestedRangeNotSatisfiable: typings.winrt.Windows.Web.WebErrorStatus.requestedRangeNotSatisfiable & Double = js.native
    
    /* 25 */ val seeOther: typings.winrt.Windows.Web.WebErrorStatus.seeOther & Double = js.native
    
    /* 6 */ val serverUnreachable: typings.winrt.Windows.Web.WebErrorStatus.serverUnreachable & Double = js.native
    
    /* 50 */ val serviceUnavailable: typings.winrt.Windows.Web.WebErrorStatus.serviceUnavailable & Double = js.native
    
    /* 28 */ val temporaryRedirect: typings.winrt.Windows.Web.WebErrorStatus.temporaryRedirect & Double = js.native
    
    /* 7 */ val timeout: typings.winrt.Windows.Web.WebErrorStatus.timeout & Double = js.native
    
    /* 30 */ val unauthorized: typings.winrt.Windows.Web.WebErrorStatus.unauthorized & Double = js.native
    
    /* 20 */ val unexpectedClientError: typings.winrt.Windows.Web.WebErrorStatus.unexpectedClientError & Double = js.native
    
    /* 19 */ val unexpectedRedirection: typings.winrt.Windows.Web.WebErrorStatus.unexpectedRedirection & Double = js.native
    
    /* 21 */ val unexpectedServerError: typings.winrt.Windows.Web.WebErrorStatus.unexpectedServerError & Double = js.native
    
    /* 18 */ val unexpectedStatusCode: typings.winrt.Windows.Web.WebErrorStatus.unexpectedStatusCode & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Web.WebErrorStatus.unknown & Double = js.native
    
    /* 44 */ val unsupportedMediaType: typings.winrt.Windows.Web.WebErrorStatus.unsupportedMediaType & Double = js.native
    
    /* 27 */ val useProxy: typings.winrt.Windows.Web.WebErrorStatus.useProxy & Double = js.native
  }
}
