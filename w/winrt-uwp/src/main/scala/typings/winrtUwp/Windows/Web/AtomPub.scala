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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables HTTP CRUD access to Web resources using the AtomPub protocol. The AtomPub sample demonstrates this implementation. */
@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  /** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
  @js.native
  /** Creates a new AtomPubClient object. */
  class AtomPubClient () extends js.Object {
    /**
      * Creates a new AtomPubClient object with the credential to use when making requests to the server. Initially, a 'username/password' tuple. However, for domain credentials, the username must be in 'domain\\user form'.
      * @param serverCredential The specified security credentials.
      */
    def this(serverCredential: PasswordCredential) = this()
    /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
    var bypassCacheOnRetrieve: Boolean = js.native
    /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
    var maxResponseBufferSize: Double = js.native
    /** Gets or sets the credentials to use when making requests via a proxy. */
    var proxyCredential: PasswordCredential = js.native
    /** Gets or sets the credentials to use when making requests to the server. */
    var serverCredential: PasswordCredential = js.native
    /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
    var timeout: Double = js.native
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
    /**
      * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
      * @param name The name of the header.
      * @param value The value of the header.
      */
    def setRequestHeader(name: String, value: String): Unit = js.native
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
  
  /** Encapsulates one or more collections within a workspace. */
  @js.native
  abstract class ResourceCollection () extends js.Object {
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
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  /** Encapsulates a service document. */
  @js.native
  abstract class ServiceDocument () extends js.Object {
    /** Gets the list of attributes of the element. */
    var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    var baseUri: Uri = js.native
    /** Gets the list of child elements within the element. */
    var elementExtensions: IVector[ISyndicationNode] = js.native
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
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format of the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
  /** Encapsulates a workspace in a service document. */
  @js.native
  abstract class Workspace () extends js.Object {
    /** Gets the list of attributes of the element. */
    var attributeExtensions: IVector[SyndicationAttribute] = js.native
    /** Gets or sets the Uniform Resource Identifier (URI) for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    var baseUri: Uri = js.native
    /** Gets the read-only collection of app:collection elements within the app:workspace element. */
    var collections: IVectorView[ResourceCollection] = js.native
    /** Gets the list of child elements within the element. */
    var elementExtensions: IVector[ISyndicationNode] = js.native
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
    /**
      * Generates the DOM object that represents this element, and all the attributes and child elements including foreign markups.
      * @param format The format for the element. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @return The XML document.
      */
    def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
  }
  
}

