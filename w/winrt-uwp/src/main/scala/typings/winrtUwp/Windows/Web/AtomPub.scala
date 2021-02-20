package typings.winrtUwp.Windows.Web

import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationNode
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationText
import typings.winrtUwp.Windows.Web.Syndication.RetrievalProgress
import typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute
import typings.winrtUwp.Windows.Web.Syndication.SyndicationCategory
import typings.winrtUwp.Windows.Web.Syndication.SyndicationFeed
import typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat
import typings.winrtUwp.Windows.Web.Syndication.SyndicationItem
import typings.winrtUwp.Windows.Web.Syndication.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables HTTP CRUD access to Web resources using the AtomPub protocol. The AtomPub sample demonstrates this implementation. */
object AtomPub {
  
  /** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
  @js.native
  trait AtomPubClient extends StObject {
    
    /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
    var bypassCacheOnRetrieve: Boolean = js.native
    
    /** Cancels any in-progress asynchronous operations, causing them to fail (asynchronously) with an error code indicating cancellation. */
    def cancelAsyncOperations(): Unit = js.native
    
    /**
      * Creates a new media resource in the specified collection.
      * @param uri The URI of the specified collection in which the new resource should be created.
      * @param mediaType The type for the media resource.
      * @param description The description of the new resource that is turned into the Slug: header of the POST request.
      * @param mediaStream Specifies the IInputStream to use as the media resource.
      * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
      */
    def createMediaResourceAsync(uri: Uri, mediaType: String, description: String, mediaStream: IInputStream): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    
    /**
      * Creates a new Entry resource in the specified collection. The Uri of the collection in which to create the new resource can be discovered from the ResourceCollection object retrieved from the RetrieveResourceAsync method.
      * @param uri The Uri of the specified collection in which the new resource should be created.
      * @param description The description of the new resource that is turned into the Slug: header of the POST request.
      * @param item The new resource to be created.
      * @return The object that is used to create the resource asynchronously and to report the progress and completion status of the operation.
      */
    def createResourceAsync(uri: Uri, description: String, item: SyndicationItem): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress] = js.native
    
    /**
      * Deletes an existing Entry or Media Link resource.
      * @param uri The Uri of the resource to be deleted.
      * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
      */
    def deleteResourceAsync(uri: Uri): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
    
    /**
      * Deletes an existing Entry or Media Link resource. This differs from the DeleteResourceAsync method in that the SyndicationItem object that represents the resource to be deleted is specified instead of the Uri. The DeleteResourceItemAsync method uses the EditUri property of the specified SyndicationItem as the Uri of the resource to be deleted.
      * @param item The resource to be deleted.
      * @return The object that is used to delete the resource asynchronously and to report the progress and completion status of the operation.
      */
    def deleteResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
    
    /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
    var maxResponseBufferSize: Double = js.native
    
    /** Gets or sets the credentials to use when making requests via a proxy. */
    var proxyCredential: PasswordCredential = js.native
    
    /**
      * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
      * @param uri The URI from which the feed is downloaded.
      * @return Contains the results of the operation.
      */
    def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress] = js.native
    
    /**
      * Retrieves a media link resource from the specified Uniform Resource Identifier (URI).
      * @param uri The URI for the media resource.
      * @return The object used to retrieve the media resource and report the progress and completion status of the operation.
      */
    def retrieveMediaResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress] = js.native
    
    /**
      * Retrieves an Entry resource or Media Link resource from the specified Uniform Resource Identifier (URI).
      * @param uri The specified URI.
      * @return The object that is used to retrieve the resource asynchronously and to report the progress and completion status of the operation.
      */
    def retrieveResourceAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress] = js.native
    
    /**
      * Retrieves a service document from the specified Uri.
      * @param uri The specified Uri.
      * @return The object that is used to retrieve the service document asynchronously and to report the progress and completion status of the operation.
      */
    def retrieveServiceDocumentAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress] = js.native
    
    /** Gets or sets the credentials to use when making requests to the server. */
    var serverCredential: PasswordCredential = js.native
    
    /**
      * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
      * @param name The name of the header.
      * @param value The value of the header.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
    
    /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
    var timeout: Double = js.native
    
    /**
      * Updates a media link resource from the specified Uniform Resource Identifier (URI).
      * @param uri The URI of the resource to be updated.
      * @param mediaType The media type of the resource.
      * @param mediaStream The IInputStream of the media that is updating the media resource.
      * @return Completion status or error codes.
      */
    def updateMediaResourceAsync(uri: Uri, mediaType: String, mediaStream: IInputStream): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
    
    /**
      * Updates an existing Entry or Media Link resource. If an ETag: header has previously been seen while retrieving this resource (in a response to RetrieveResourceAsync , CreateResourceAsync or a previous call to UpdateResourceAsync), this method automatically sends an If-Match: header with the remembered value.
      * @param uri The URI of the resource to be updated.
      * @param item The resource to be updated.
      * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
      */
    def updateResourceAsync(uri: Uri, item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
    
    /**
      * Updates an existing Entry or Media Link resource. This differs from the UpdateResourceAsync method in that the EditUri property of the specified SyndicationItem object is used as the Uri of the resource to be updated.
      * @param item The resource to be updated.
      * @return The object that is used to update the resource asynchronously and to report the progress and completion status of the operation.
      */
    def updateResourceItemAsync(item: SyndicationItem): IPromiseWithIAsyncActionWithProgress[TransferProgress] = js.native
  }
  object AtomPubClient {
    
    @scala.inline
    def apply(
      bypassCacheOnRetrieve: Boolean,
      cancelAsyncOperations: () => Unit,
      createMediaResourceAsync: (Uri, String, String, IInputStream) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      createResourceAsync: (Uri, String, SyndicationItem) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress],
      deleteResourceAsync: Uri => IPromiseWithIAsyncActionWithProgress[TransferProgress],
      deleteResourceItemAsync: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress],
      maxResponseBufferSize: Double,
      proxyCredential: PasswordCredential,
      retrieveFeedAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress],
      retrieveMediaResourceAsync: Uri => IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress],
      retrieveResourceAsync: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress],
      retrieveServiceDocumentAsync: Uri => IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress],
      serverCredential: PasswordCredential,
      setRequestHeader: (String, String) => Unit,
      timeout: Double,
      updateMediaResourceAsync: (Uri, String, IInputStream) => IPromiseWithIAsyncActionWithProgress[TransferProgress],
      updateResourceAsync: (Uri, SyndicationItem) => IPromiseWithIAsyncActionWithProgress[TransferProgress],
      updateResourceItemAsync: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]
    ): AtomPubClient = {
      val __obj = js.Dynamic.literal(bypassCacheOnRetrieve = bypassCacheOnRetrieve.asInstanceOf[js.Any], cancelAsyncOperations = js.Any.fromFunction0(cancelAsyncOperations), createMediaResourceAsync = js.Any.fromFunction4(createMediaResourceAsync), createResourceAsync = js.Any.fromFunction3(createResourceAsync), deleteResourceAsync = js.Any.fromFunction1(deleteResourceAsync), deleteResourceItemAsync = js.Any.fromFunction1(deleteResourceItemAsync), maxResponseBufferSize = maxResponseBufferSize.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], retrieveFeedAsync = js.Any.fromFunction1(retrieveFeedAsync), retrieveMediaResourceAsync = js.Any.fromFunction1(retrieveMediaResourceAsync), retrieveResourceAsync = js.Any.fromFunction1(retrieveResourceAsync), retrieveServiceDocumentAsync = js.Any.fromFunction1(retrieveServiceDocumentAsync), serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader), timeout = timeout.asInstanceOf[js.Any], updateMediaResourceAsync = js.Any.fromFunction3(updateMediaResourceAsync), updateResourceAsync = js.Any.fromFunction2(updateResourceAsync), updateResourceItemAsync = js.Any.fromFunction1(updateResourceItemAsync))
      __obj.asInstanceOf[AtomPubClient]
    }
    
    @scala.inline
    implicit class AtomPubClientMutableBuilder[Self <: AtomPubClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBypassCacheOnRetrieve(value: Boolean): Self = StObject.set(x, "bypassCacheOnRetrieve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelAsyncOperations(value: () => Unit): Self = StObject.set(x, "cancelAsyncOperations", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateMediaResourceAsync(
        value: (Uri, String, String, IInputStream) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createMediaResourceAsync", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCreateResourceAsync(
        value: (Uri, String, SyndicationItem) => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, TransferProgress]
      ): Self = StObject.set(x, "createResourceAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeleteResourceAsync(value: Uri => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteResourceItemAsync(value: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "deleteResourceItemAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxResponseBufferSize(value: Double): Self = StObject.set(x, "maxResponseBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyCredential(value: PasswordCredential): Self = StObject.set(x, "proxyCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetrieveFeedAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationFeed, RetrievalProgress]): Self = StObject.set(x, "retrieveFeedAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveMediaResourceAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[IInputStream, RetrievalProgress]): Self = StObject.set(x, "retrieveMediaResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveResourceAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[SyndicationItem, RetrievalProgress]): Self = StObject.set(x, "retrieveResourceAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveServiceDocumentAsync(value: Uri => IPromiseWithIAsyncOperationWithProgress[ServiceDocument, RetrievalProgress]): Self = StObject.set(x, "retrieveServiceDocumentAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServerCredential(value: PasswordCredential): Self = StObject.set(x, "serverCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRequestHeader(value: (String, String) => Unit): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMediaResourceAsync(value: (Uri, String, IInputStream) => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateMediaResourceAsync", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpdateResourceAsync(value: (Uri, SyndicationItem) => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceAsync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateResourceItemAsync(value: SyndicationItem => IPromiseWithIAsyncActionWithProgress[TransferProgress]): Self = StObject.set(x, "updateResourceItemAsync", js.Any.fromFunction1(value))
    }
  }
  
  /** Encapsulates one or more collections within a workspace. */
  @js.native
  trait ResourceCollection extends StObject {
    
    /** Gets or sets the collection of app:accept elements. */
    var accepts: IVectorView[String] = js.native
    
    /** Gets the list of attributes of the element. */
    var attributeExtensions: IVector[SyndicationAttribute] = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    var baseUri: Uri = js.native
    
    /** Gets the collection of atom:category elements within the app:categories element. */
    var categories: IVectorView[SyndicationCategory] = js.native
    
    /** Gets the list of child elements within the element. */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
    var nodeValue: String = js.native
    
    /** Gets the atom:title element under the app:collection element. */
    var title: ISyndicationText = js.native
    
    /** Gets the Uniform Resource Identifier (URI) representing the href attribute of the app:collection element. This is the absolute URI resolved against the xml:base attribute when it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property will be Null. */
    var uri: Uri = js.native
  }
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
    
    @scala.inline
    implicit class ResourceCollectionMutableBuilder[Self <: ResourceCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: IVectorView[String]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategories(value: IVectorView[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /** Encapsulates a service document. */
  @js.native
  trait ServiceDocument extends StObject {
    
    /** Gets the list of attributes of the element. */
    var attributeExtensions: IVector[SyndicationAttribute] = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
    var nodeValue: String = js.native
    
    /** Gets the collection of app:workspace elements in the service document. */
    var workspaces: IVectorView[Workspace] = js.native
  }
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
    
    @scala.inline
    implicit class ServiceDocumentMutableBuilder[Self <: ServiceDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkspaces(value: IVectorView[Workspace]): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    }
  }
  
  /** Encapsulates a workspace in a service document. */
  @js.native
  trait Workspace extends StObject {
    
    /** Gets the list of attributes of the element. */
    var attributeExtensions: IVector[SyndicationAttribute] = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    var baseUri: Uri = js.native
    
    /** Gets the read-only collection of app:collection elements within the app:workspace element. */
    var collections: IVectorView[ResourceCollection] = js.native
    
    /** Gets the list of child elements within the element. */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format for the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. It must be valid according to XML 1.0. */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this attribute is NULL. */
    var nodeValue: String = js.native
    
    /** Gets the atom:title element under the app:workspace element. */
    var title: ISyndicationText = js.native
  }
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
    
    @scala.inline
    implicit class WorkspaceMutableBuilder[Self <: Workspace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeExtensions(value: IVector[SyndicationAttribute]): Self = StObject.set(x, "attributeExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUri(value: Uri): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollections(value: IVectorView[ResourceCollection]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementExtensions(value: IVector[ISyndicationNode]): Self = StObject.set(x, "elementExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetXmlDocument(value: SyndicationFormat => XmlDocument): Self = StObject.set(x, "getXmlDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNamespace(value: String): Self = StObject.set(x, "nodeNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
