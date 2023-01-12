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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AtomPub {
  
  trait AtomPubClient
    extends StObject
       with IAtomPubClient
  object AtomPubClient {
    
    inline def apply(
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
  
  trait IAtomPubClient
    extends StObject
       with ISyndicationClient {
    
    def cancelAsyncOperations(): Unit
    
    def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    
    def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
    
    def deleteResourceAsync(uri: Uri): IAsyncActionWithProgress[TransferProgress]
    
    def deleteResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
    
    def retrieveMediaResourceAsync(uri: Uri): IAsyncOperationWithProgress[IInputStream, RetrievalProgress]
    
    def retrieveResourceAsync(uri: Uri): IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]
    
    def retrieveServiceDocumentAsync(uri: Uri): IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]
    
    def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IAsyncActionWithProgress[TransferProgress]
    
    def updateResourceAsync(uri: Uri, item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
    
    def updateResourceItemAsync(item: SyndicationItem): IAsyncActionWithProgress[TransferProgress]
  }
  object IAtomPubClient {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IAtomPubClient] (val x: Self) extends AnyVal {
      
      inline def setCancelAsyncOperations(value: () => Unit): Self = StObject.set(x, "cancelAsyncOperations", js.Any.fromFunction0(value))
      
      inline def setCreateMediaResourceAsync(
        value: (Uri, String, String, IInputStream) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createMediaResourceAsync", js.Any.fromFunction4(value))
      
      inline def setCreateResourceAsync(
        value: (Uri, String, SyndicationItem) => IAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createResourceAsync", js.Any.fromFunction3(value))
      
      inline def setDeleteResourceAsync(value: Uri => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceAsync", js.Any.fromFunction1(value))
      
      inline def setDeleteResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceItemAsync", js.Any.fromFunction1(value))
      
      inline def setRetrieveMediaResourceAsync(value: Uri => IAsyncOperationWithProgress[IInputStream, RetrievalProgress]): Self = StObject.set(x, "retrieveMediaResourceAsync", js.Any.fromFunction1(value))
      
      inline def setRetrieveResourceAsync(value: Uri => IAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]): Self = StObject.set(x, "retrieveResourceAsync", js.Any.fromFunction1(value))
      
      inline def setRetrieveServiceDocumentAsync(value: Uri => IAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]): Self = StObject.set(x, "retrieveServiceDocumentAsync", js.Any.fromFunction1(value))
      
      inline def setUpdateMediaResourceAsync(value: (Uri, String, IInputStream) => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateMediaResourceAsync", js.Any.fromFunction3(value))
      
      inline def setUpdateResourceAsync(value: (Uri, SyndicationItem) => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceAsync", js.Any.fromFunction2(value))
      
      inline def setUpdateResourceItemAsync(value: SyndicationItem => IAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceItemAsync", js.Any.fromFunction1(value))
    }
  }
  
  trait IAtomPubClientFactory extends StObject {
    
    def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient
  }
  object IAtomPubClientFactory {
    
    inline def apply(createAtomPubClientWithCredentials: PasswordCredential => AtomPubClient): IAtomPubClientFactory = {
      val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
      __obj.asInstanceOf[IAtomPubClientFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAtomPubClientFactory] (val x: Self) extends AnyVal {
      
      inline def setCreateAtomPubClientWithCredentials(value: PasswordCredential => AtomPubClient): Self = StObject.set(x, "createAtomPubClientWithCredentials", js.Any.fromFunction1(value))
    }
  }
  
  trait IResourceCollection
    extends StObject
       with ISyndicationNode {
    
    var accepts: IVectorView[String]
    
    var categories: IVectorView[SyndicationCategory]
    
    var title: ISyndicationText
    
    var uri: Uri
  }
  object IResourceCollection {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IResourceCollection] (val x: Self) extends AnyVal {
      
      inline def setAccepts(value: IVectorView[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: IVectorView[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IServiceDocument
    extends StObject
       with ISyndicationNode {
    
    var workspaces: IVectorView[Workspace]
  }
  object IServiceDocument {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IServiceDocument] (val x: Self) extends AnyVal {
      
      inline def setWorkspaces(value: IVectorView[Workspace]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorkspace
    extends StObject
       with ISyndicationNode {
    
    var collections: IVectorView[ResourceCollection]
    
    var title: ISyndicationText
  }
  object IWorkspace {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IWorkspace] (val x: Self) extends AnyVal {
      
      inline def setCollections(value: IVectorView[ResourceCollection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceCollection
    extends StObject
       with IResourceCollection
  object ResourceCollection {
    
    inline def apply(
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
  
  trait ServiceDocument
    extends StObject
       with IServiceDocument
  object ServiceDocument {
    
    inline def apply(
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
  
  trait Workspace
    extends StObject
       with IWorkspace
  object Workspace {
    
    inline def apply(
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
