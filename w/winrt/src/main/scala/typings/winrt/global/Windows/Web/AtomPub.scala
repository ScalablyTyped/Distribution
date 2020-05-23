package typings.winrt.global.Windows.Web

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
import typings.winrt.Windows.Web.Syndication.SyndicationFeed
import typings.winrt.Windows.Web.Syndication.SyndicationFormat
import typings.winrt.Windows.Web.Syndication.SyndicationItem
import typings.winrt.Windows.Web.Syndication.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  @js.native
  class AtomPubClient ()
    extends typings.winrt.Windows.Web.AtomPub.AtomPubClient {
    def this(serverCredential: PasswordCredential) = this()
    /* CompleteClass */
    override var bypassCacheOnRetrieve: Boolean = js.native
    /* CompleteClass */
    override var maxResponseBufferSize: Double = js.native
    /* CompleteClass */
    override var proxyCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var serverCredential: PasswordCredential = js.native
    /* CompleteClass */
    override var timeout: Double = js.native
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
    override def retrieveFeedAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
    /* CompleteClass */
    override def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[typings.winrt.Windows.Web.AtomPub.ServiceDocument, RetrievalProgress] = js.native
    /* CompleteClass */
    override def setRequestHeader(name: String, value: String): Unit = js.native
    /* CompleteClass */
    override def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    /* CompleteClass */
    override def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  }
  
  @js.native
  class ResourceCollection ()
    extends typings.winrt.Windows.Web.AtomPub.ResourceCollection {
    /* CompleteClass */
    override var accepts: IVectorView[String] = js.native
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var categories: IVectorView[SyndicationCategory] = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override var uri: Uri = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class ServiceDocument ()
    extends typings.winrt.Windows.Web.AtomPub.ServiceDocument {
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var workspaces: IVectorView[typings.winrt.Windows.Web.AtomPub.Workspace] = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  @js.native
  class Workspace ()
    extends typings.winrt.Windows.Web.AtomPub.Workspace {
    /* CompleteClass */
    override var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /* CompleteClass */
    override var baseUri: Uri = js.native
    /* CompleteClass */
    override var collections: IVectorView[typings.winrt.Windows.Web.AtomPub.ResourceCollection] = js.native
    /* CompleteClass */
    override var elementExtensions: IVector[ISyndicationNode] = js.native
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var nodeName: String = js.native
    /* CompleteClass */
    override var nodeNamespace: String = js.native
    /* CompleteClass */
    override var nodeValue: String = js.native
    /* CompleteClass */
    override var title: ISyndicationText = js.native
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
}

