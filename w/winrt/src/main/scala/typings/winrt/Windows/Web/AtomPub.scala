package typings.winrt.Windows.Web

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Web.Syndication.ISyndicationClient
import typings.winrt.Windows.Web.Syndication.ISyndicationNode
import typings.winrt.Windows.Web.Syndication.ISyndicationText
import typings.winrt.Windows.Web.Syndication.RetrievalProgress
import typings.winrt.Windows.Web.Syndication.SyndicationAttribute
import typings.winrt.Windows.Web.Syndication.SyndicationCategory
import typings.winrt.Windows.Web.Syndication.SyndicationFeed
import typings.winrt.Windows.Web.Syndication.SyndicationFormat
import typings.winrt.Windows.Web.Syndication.SyndicationItem
import typings.winrt.Windows.Web.Syndication.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AtomPub {
  
  @js.native
  trait AtomPubClient extends IAtomPubClient
  object AtomPubClient {
    
    @scala.inline
    def apply(
      bypassCacheOnRetrieve: Boolean,
      cancelAsyncOperations: () => Unit,
      createMediaResourceAsync: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      createResourceAsync: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      deleteResourceAsync: Uri => IAsyncActionWithProgress[TransferProgress],
      deleteResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress],
      maxResponseBufferSize: Double,
      proxyCredential: PasswordCredential,
      retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
      retrieveMediaResourceAsync: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress],
      retrieveResourceAsync: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
      retrieveServiceDocumentAsync: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
      serverCredential: PasswordCredential,
      setRequestHeader: (String, String) => Unit,
      timeout: Double,
      updateMediaResourceAsync: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress],
      updateResourceAsync: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress],
      updateResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress]
    ): AtomPubClient = {
      val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
      __obj.asInstanceOf[AtomPubClient]
    }
  }
  
  @js.native
  trait IAtomPubClient extends ISyndicationClient {
    
    def cancelAsyncOperations(): Unit = js.native
    
    def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    
    def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    
    def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress] = js.native
    
    def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    
    def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
    
    def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
    
    def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
    
    def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress] = js.native
    
    def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
    
    def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress] = js.native
  }
  object IAtomPubClient {
    
    @scala.inline
    def apply(
      bypassCacheOnRetrieve: Boolean,
      cancelAsyncOperations: () => Unit,
      createMediaResourceAsync: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      createResourceAsync: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      deleteResourceAsync: Uri => IAsyncActionWithProgress[TransferProgress],
      deleteResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress],
      maxResponseBufferSize: Double,
      proxyCredential: PasswordCredential,
      retrieveFeedAsync: Uri => IAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
      retrieveMediaResourceAsync: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress],
      retrieveResourceAsync: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
      retrieveServiceDocumentAsync: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
      serverCredential: PasswordCredential,
      setRequestHeader: (String, String) => Unit,
      timeout: Double,
      updateMediaResourceAsync: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress],
      updateResourceAsync: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress],
      updateResourceItemAsync: SyndicationItem => IAsyncActionWithProgress[TransferProgress]
    ): IAtomPubClient = {
      val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
      __obj.asInstanceOf[IAtomPubClient]
    }
    
    @scala.inline
    implicit class IAtomPubClientMutableBuilder[Self <: IAtomPubClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelAsyncOperations(value: () => Unit): Self = StObject.set(x, "cancelAsyncOperations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateMediaResourceAsync(
        value: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createMediaResourceAsync", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCreateResourceAsync(
        value: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createResourceAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteResourceAsync(value: Uri => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceItemAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveMediaResourceAsync(value: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress]): Self = StObject.set(x, "retrieveMediaResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveResourceAsync(value: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]): Self = StObject.set(x, "retrieveResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveServiceDocumentAsync(value: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]): Self = StObject.set(x, "retrieveServiceDocumentAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateMediaResourceAsync(value: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateMediaResourceAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateResourceAsync(value: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceItemAsync", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IAtomPubClientFactory extends StObject {
    
    def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient = js.native
  }
  object IAtomPubClientFactory {
    
    @scala.inline
    def apply(createAtomPubClientWithCredentials: PasswordCredential => AtomPubClient): IAtomPubClientFactory = {
      val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
      __obj.asInstanceOf[IAtomPubClientFactory]
    }
    
    @scala.inline
    implicit class IAtomPubClientFactoryMutableBuilder[Self <: IAtomPubClientFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateAtomPubClientWithCredentials(value: PasswordCredential => AtomPubClient): Self = StObject.set(x, "createAtomPubClientWithCredentials", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IResourceCollection extends ISyndicationNode {
    
    var accepts: IVectorView[String] = js.native
    
    var categories: IVectorView[SyndicationCategory] = js.native
    
    var title: ISyndicationText = js.native
    
    var uri: Uri = js.native
  }
  object IResourceCollection {
    
    @scala.inline
    def apply(
      accepts: IVectorView[String],
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      categories: IVectorView[SyndicationCategory],
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      title: ISyndicationText,
      uri: Uri
    ): IResourceCollection = {
      val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResourceCollection]
    }
    
    @scala.inline
    implicit class IResourceCollectionMutableBuilder[Self <: IResourceCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: IVectorView[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: IVectorView[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IServiceDocument extends ISyndicationNode {
    
    var workspaces: IVectorView[Workspace] = js.native
  }
  object IServiceDocument {
    
    @scala.inline
    def apply(
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      workspaces: IVectorView[Workspace]
    ): IServiceDocument = {
      val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[IServiceDocument]
    }
    
    @scala.inline
    implicit class IServiceDocumentMutableBuilder[Self <: IServiceDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWorkspaces(value: IVectorView[Workspace]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWorkspace extends ISyndicationNode {
    
    var collections: IVectorView[ResourceCollection] = js.native
    
    var title: ISyndicationText = js.native
  }
  object IWorkspace {
    
    @scala.inline
    def apply(
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      collections: IVectorView[ResourceCollection],
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      title: ISyndicationText
    ): IWorkspace = {
      val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorkspace]
    }
    
    @scala.inline
    implicit class IWorkspaceMutableBuilder[Self <: IWorkspace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollections(value: IVectorView[ResourceCollection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceCollection extends IResourceCollection
  object ResourceCollection {
    
    @scala.inline
    def apply(
      accepts: IVectorView[String],
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      categories: IVectorView[SyndicationCategory],
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      title: ISyndicationText,
      uri: Uri
    ): ResourceCollection = {
      val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceCollection]
    }
  }
  
  @js.native
  trait ServiceDocument extends IServiceDocument
  object ServiceDocument {
    
    @scala.inline
    def apply(
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      workspaces: IVectorView[Workspace]
    ): ServiceDocument = {
      val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceDocument]
    }
  }
  
  @js.native
  trait Workspace extends IWorkspace
  object Workspace {
    
    @scala.inline
    def apply(
      attributeExtensions: IVector[SyndicationAttribute],
      baseUri: Uri,
      collections: IVectorView[ResourceCollection],
      elementExtensions: IVector[ISyndicationNode],
      getXmlDocument: SyndicationFormat => XmlDocument,
      language: String,
      nodeName: String,
      nodeNamespace: String,
      nodeValue: String,
      title: ISyndicationText
    ): Workspace = {
      val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Workspace]
    }
  }
}
