package typings.winrtUwp.global.Windows.Web

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationNode
import typings.winrtUwp.Windows.Web.Syndication.ISyndicationText
import typings.winrtUwp.Windows.Web.Syndication.RetrievalProgress
import typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus
import typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat
import typings.winrtUwp.Windows.Web.Syndication.SyndicationTextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages syndication feeds. */
object Syndication {
  
  /** Represents a custom attribute not defined in the specification. */
  @JSGlobal("Windows.Web.Syndication.SyndicationAttribute")
  @js.native
  /** Creates a new SyndicationAttribute object. */
  class SyndicationAttribute ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute {
    /**
      * Creates a new SyndicationAttribute object with the specified Name, Namespace, and Value property values.
      * @param attributeName The name of the attribute.
      * @param attributeNamespace The namespace of the attribute.
      * @param attributeValue The value of the attribute.
      */
    def this(attributeName: String, attributeNamespace: String, attributeValue: String) = this()
    
    /** Gets the name of the syndication attribute. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets the namespace of the attribute. */
    /* CompleteClass */
    var namespace: String = js.native
    
    /** Gets or sets the value of the attribute. */
    /* CompleteClass */
    var value: String = js.native
  }
  
  /** Represents the category of a feed or an item. This class encapsulates information in the /rss/channel/item/category element in RSS 2.0 or the atom:category element in Atom 1.0. */
  @JSGlobal("Windows.Web.Syndication.SyndicationCategory")
  @js.native
  /** Creates a SyndicationCategory object. */
  class SyndicationCategory ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationCategory {
    /**
      * Creates a SyndicationCategory object with the specified term property.
      * @param term A string that identifies the category. This parameter represents the required term attribute on atom:category or the text content of the category element in RSS 2.0.
      */
    def this(term: String) = this()
    /**
      * Creates SyndicationCategory object with the specified property values.
      * @param term A string that identifies the category.
      * @param scheme The scheme of the category.
      * @param label A label for display in end-user applications.
      */
    def this(term: String, scheme: String, label: String) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the label for the category. This property represents the label attribute on atom:category. It provides a label for display in end-user applications. */
    /* CompleteClass */
    var label: String = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the scheme of the category. This property represents the scheme attribute on atom:category or the domain attribute on the category element in RSS 2.0. */
    /* CompleteClass */
    var scheme: String = js.native
    
    /** Gets or sets a string that identifies the category. This property represents the required term attribute on atom:category or the text content of the category element in RSS 2.0. */
    /* CompleteClass */
    var term: String = js.native
  }
  
  /** Implements the ISyndicationClient interface which retrieves feeds from a URI asynchronously. */
  @JSGlobal("Windows.Web.Syndication.SyndicationClient")
  @js.native
  /** Creates a new SyndicationClient object. */
  class SyndicationClient ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationClient {
    /**
      * Creates a new SyndicationClient object with authentication credentials.
      * @param serverCredential Credentials for user authentication.
      */
    def this(serverCredential: PasswordCredential) = this()
    
    /** Gets or sets a Boolean value that specifies whether to bypass the cache when retrieving the feed. */
    /* CompleteClass */
    var bypassCacheOnRetrieve: Boolean = js.native
    
    /** Gets or sets the maximum number of bytes to buffer when receiving a response from a server. */
    /* CompleteClass */
    var maxResponseBufferSize: Double = js.native
    
    /** Gets or sets the credentials to use when making requests via a proxy. */
    /* CompleteClass */
    var proxyCredential: PasswordCredential = js.native
    
    /**
      * Starts an asynchronous operation to download the syndication feed from the given URI. This method instantiates a SyndicationFeed object from the feed string, which can be in one of the formats specified in SyndicationFormat .
      * @param uri The URI from which the feed is downloaded.
      * @return Contains the results of the operation.
      */
    /* CompleteClass */
    override def retrieveFeedAsync(uri: Uri): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Web.Syndication.SyndicationFeed, RetrievalProgress] = js.native
    
    /** Gets or sets the credentials to use when making requests to the server. */
    /* CompleteClass */
    var serverCredential: PasswordCredential = js.native
    
    /**
      * Sets an HTTP header for the request. This method can be called multiple times to set multiple headers. When the same header is set multiple times, the values will be concatenated and separated by ",".
      * @param name The name of the header.
      * @param value The value of the header.
      */
    /* CompleteClass */
    override def setRequestHeader(name: String, value: String): Unit = js.native
    
    /** Gets or sets the maximum amount of time, in milliseconds, to wait for any of the asynchronous operations to complete. If the operation is not complete within this amount of time, it will fail with a status code indicating that it timed out. */
    /* CompleteClass */
    var timeout: Double = js.native
  }
  
  /** Represents feed content including Text, HTML, XHTML, URL, and XML. This object encapsulates the atom:content element in Atom 1.0 and can contain a link to external content. */
  @JSGlobal("Windows.Web.Syndication.SyndicationContent")
  @js.native
  /** Creates a new SyndicationContent object. */
  class SyndicationContent ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationContent {
    /**
      * Creates a new SyndicationContent object with the specified Uri property value.
      * @param sourceUri The Uri value.
      */
    def this(sourceUri: Uri) = this()
    /**
      * Creates a new SyndicationContent object with the specified Text and Type property values.
      * @param text The text of the content.
      * @param type The type of the content.
      */
    def this(text: String, `type`: SyndicationTextType) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the URI to the content. This property represents the src attribute on atom:content. */
    /* CompleteClass */
    var sourceUri: Uri = js.native
    
    /** Gets the syndication content. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets or sets the type of the content. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Gets or sets the XML content. */
    /* CompleteClass */
    var xml: XmlDocument = js.native
  }
  
  /** Represents an error encountered during a Syndication operation. */
  @JSGlobal("Windows.Web.Syndication.SyndicationError")
  @js.native
  abstract class SyndicationError ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationError
  object SyndicationError {
    
    @JSGlobal("Windows.Web.Syndication.SyndicationError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the specific error using the returned HRESULT value. Possible values are defined by SyndicationErrorStatus .
      * @param hresult An HRESULT returned during the operation.
      * @return The error encountered.
      */
    /* static member */
    inline def getStatus(hresult: Double): SyndicationErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[SyndicationErrorStatus]
  }
  
  /** Defines errors encountered during a Syndication operation. */
  @JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
  @js.native
  object SyndicationErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus & Double] = js.native
    
    /* 3 */ val invalidXml: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml & Double = js.native
    
    /* 2 */ val missingRequiredAttribute: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute & Double = js.native
    
    /* 1 */ val missingRequiredElement: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement & Double = js.native
    
    /* 4 */ val unexpectedContent: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unknown & Double = js.native
    
    /* 5 */ val unsupportedFormat: typings.winrtUwp.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat & Double = js.native
  }
  
  /** Contains information about a feed. This class encapsulates the information in the /rss/channel element in RSS 2.0 or the atom:feed element in Atom 1.0. */
  @JSGlobal("Windows.Web.Syndication.SyndicationFeed")
  @js.native
  /** Creates a new SyndicationFeed object. */
  class SyndicationFeed ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationFeed {
    /**
      * Creates a new SyndicationFeed object with a Title, Subtitle, and Uri.
      * @param title The Title of the syndication feed.
      * @param subtitle The Subtitle of the syndication feed.
      * @param uri The Uri value.
      */
    def this(title: String, subtitle: String, uri: Uri) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
    /* CompleteClass */
    var authors: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationPerson] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
    /* CompleteClass */
    var categories: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationCategory] = js.native
    
    /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
    /* CompleteClass */
    var contributors: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationPerson] = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /** Gets the first Uniform Resource Identifier (URI) in a sequence. This property represents the atom:link element with attribute rel=”first”. */
    /* CompleteClass */
    var firstUri: Uri = js.native
    
    /** Gets or sets the generator of the feed. This property represents the atom:generator element or the generator element in RSS 2.0. */
    /* CompleteClass */
    var generator: typings.winrtUwp.Windows.Web.Syndication.SyndicationGenerator = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) for the image for the feed. This property represents the atom:icon element. */
    /* CompleteClass */
    var iconUri: Uri = js.native
    
    /** Gets or sets the identifier for the syndication feed. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) of the logo for the feed. This property represents the atom:logo element or image/uri element in RSS 2.0. */
    /* CompleteClass */
    var imageUri: Uri = js.native
    
    /** Gets the collection of items in the feed. This property represents the collection of atom:entry elements or a collection of item elements in RSS 2.0. */
    /* CompleteClass */
    var items: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationItem] = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the time the feed was last modified. This property represents the /rss/channel/lastBuildDate or atom:updated element. */
    /* CompleteClass */
    var lastUpdatedTime: Date = js.native
    
    /** Gets the last Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel=”last”. */
    /* CompleteClass */
    var lastUri: Uri = js.native
    
    /** Gets the links associated with the feed. This property represents a collection of the atom:link elements under atom:feed. In RSS 2.0, this maps to the link element. */
    /* CompleteClass */
    var links: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationLink] = js.native
    
    /**
      * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
      * @param feed The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
      */
    /* CompleteClass */
    override def load(feed: String): Unit = js.native
    
    /**
      * Initializes the SyndicationFeed object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
      * @param feedDocument The DOM object which contains XML content in either RSS 2.0 or Atom 1.0 format.
      */
    /* CompleteClass */
    override def loadFromXml(feedDocument: XmlDocument): Unit = js.native
    
    /** Gets the next Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="next". */
    /* CompleteClass */
    var nextUri: Uri = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets the previous Uniform Resource Identifier (URI) in the sequence. This property represents the atom:link element with attribute rel="previous". */
    /* CompleteClass */
    var previousUri: Uri = js.native
    
    /** Gets or sets information about the rights for the feed. This property represents the atom:rights element or the copyright element in RSS 2.0. */
    /* CompleteClass */
    var rights: ISyndicationText = js.native
    
    /** Gets the format of the source document. If the object is not loaded from a document, this property will return SyndicationFormat_Atom10. */
    /* CompleteClass */
    var sourceFormat: SyndicationFormat = js.native
    
    /** Gets or sets the subtitle of the feed. This property represents the atom:subtitle element or the description element in RSS 2.0. */
    /* CompleteClass */
    var subtitle: ISyndicationText = js.native
    
    /** Gets or sets the title of the syndication feed. */
    /* CompleteClass */
    var title: ISyndicationText = js.native
  }
  
  /** Specifies the syndication formats supported by the API. */
  @JSGlobal("Windows.Web.Syndication.SyndicationFormat")
  @js.native
  object SyndicationFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat & Double] = js.native
    
    /* 5 */ val atom03: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.atom03 & Double = js.native
    
    /* 0 */ val atom10: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.atom10 & Double = js.native
    
    /* 4 */ val rss091: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss091 & Double = js.native
    
    /* 3 */ val rss092: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss092 & Double = js.native
    
    /* 2 */ val rss10: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss10 & Double = js.native
    
    /* 1 */ val rss20: typings.winrtUwp.Windows.Web.Syndication.SyndicationFormat.rss20 & Double = js.native
  }
  
  /** Describes the agent or the tool used to generate the feed. This class encapsulates information in the /rss/channel/generator element in RSS 2.0 or the /atom:feed/atom:generator element in Atom 1.0. */
  @JSGlobal("Windows.Web.Syndication.SyndicationGenerator")
  @js.native
  /** Creates a new SyndicationGenerator object. */
  class SyndicationGenerator ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationGenerator {
    /**
      * Creates a new SyndicationGenerator object with the specified Text property value.
      * @param text Identifies the generator. This parameter represents the text content in the atom:generator element or the generator element in RSS 2.0.
      */
    def this(text: String) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the text that identifies the generator. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) of the syndication generator. */
    /* CompleteClass */
    var uri: Uri = js.native
    
    /** Gets or sets the version of the generator. */
    /* CompleteClass */
    var version: String = js.native
  }
  
  /** Represents an item in the feed. This class encapsulates information in the /rss/channel/item element in RSS 2.0 or the atom:entry element in Atom 1.0. */
  @JSGlobal("Windows.Web.Syndication.SyndicationItem")
  @js.native
  /** Creates a new SyndicationItem object. */
  class SyndicationItem ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationItem {
    /**
      * Creates a new SyndicationItem object with a title, content, and URI.
      * @param title Title of the new item.
      * @param content The content for this feed item.
      * @param uri The URI associated with this item.
      */
    def this(title: String, content: typings.winrtUwp.Windows.Web.Syndication.SyndicationContent, uri: Uri) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets the authors of an item. This property represents the collection of all the atom:author elements under atom:entry. */
    /* CompleteClass */
    var authors: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationPerson] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets a collection of categories of the feed. This property represents the collection of all the atom:category elements under atom:feed. */
    /* CompleteClass */
    var categories: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationCategory] = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) of the comments for the item. This property represents the /rss/channel/item/comments element. */
    /* CompleteClass */
    var commentsUri: Uri = js.native
    
    /** Gets or sets the content of the item. */
    /* CompleteClass */
    var content: typings.winrtUwp.Windows.Web.Syndication.SyndicationContent = js.native
    
    /** Gets a collection of the contributors of the feed. This property represents the collection of all the atom:contributor elements under atom:feed. */
    /* CompleteClass */
    var contributors: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationPerson] = js.native
    
    /** Gets the Uniform Resource Identifier (URI) of an editable media resource. */
    /* CompleteClass */
    var editMediaUri: Uri = js.native
    
    /** Gets the Uniform Resource Identifier (URI) of an editable resource. */
    /* CompleteClass */
    var editUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /** Gets an ETag HTTP header. */
    /* CompleteClass */
    var etag: String = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the identifier for the syndication feed. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets the Uniform Resource Identifier (URI) of this item. AtomPubClient creates this property after new resource is created. */
    /* CompleteClass */
    var itemUri: Uri = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the most recent time the item was modified. This property represents the atom:updated element. */
    /* CompleteClass */
    var lastUpdatedTime: Date = js.native
    
    /** Gets the links contained in the item. */
    /* CompleteClass */
    var links: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationLink] = js.native
    
    /**
      * Initializes the object from the given feed string, which can be in either RSS 2.0 or Atom 1.0 format.
      * @param item The feed string, which can be in either RSS 2.0 or Atom 1.0 format.
      */
    /* CompleteClass */
    override def load(item: String): Unit = js.native
    
    /**
      * Initializes the object from the given DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
      * @param itemDocument The DOM object, which can contain XML content in either RSS 2.0 or Atom 1.0 format.
      */
    /* CompleteClass */
    override def loadFromXml(itemDocument: XmlDocument): Unit = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the date the item was published. */
    /* CompleteClass */
    var publishedDate: Date = js.native
    
    /** Gets or sets information about the rights of an item. This property represents the atom:rights element. */
    /* CompleteClass */
    var rights: ISyndicationText = js.native
    
    /** Gets or sets the source feed of the item. This property represents the atom:source element or the source element in RSS 2.0. */
    /* CompleteClass */
    var source: typings.winrtUwp.Windows.Web.Syndication.SyndicationFeed = js.native
    
    /** Gets or sets a summary of the item. */
    /* CompleteClass */
    var summary: ISyndicationText = js.native
    
    /** Gets or sets the title of the item. */
    /* CompleteClass */
    var title: ISyndicationText = js.native
  }
  
  /** Represents a link within a syndication feed or item. This class encapsulates information in the /rss/channel/link or / rss/channel/item/link element in RSS 2.0 or the atom:link element in Atom 1.0. */
  @JSGlobal("Windows.Web.Syndication.SyndicationLink")
  @js.native
  /** Creates a new SyndicationLink object. */
  class SyndicationLink ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationLink {
    /**
      * Creates a new SyndicationLink with a Uri.
      * @param uri The Uri value.
      */
    def this(uri: Uri) = this()
    /**
      * Creates a new SyndicationLink object with a Uri, Relationship, Title, MediaType, and Length.
      * @param uri The Uri value.
      * @param relationship The relationship type.
      * @param title The title of the syndication link.
      * @param mediaType The MediaType of the syndication link.
      * @param length The length, in bytes, of the syndication link.
      */
    def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the length of the linked resource, in bytes. */
    /* CompleteClass */
    var length: Double = js.native
    
    /** Gets or sets the media type of the linked resource. The string must have the pattern ".+/.+". */
    /* CompleteClass */
    var mediaType: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the relationship type of the link. */
    /* CompleteClass */
    var relationship: String = js.native
    
    /** Gets or sets the language of the resource pointed to by the Uri property. This property represents the hreflang attribute on atom:link. It must adhere to the pattern defined by RFC 3066. */
    /* CompleteClass */
    var resourceLanguage: String = js.native
    
    /** Gets or sets the title of the syndication link. */
    /* CompleteClass */
    var title: String = js.native
    
    /** Gets or sets the URI of the linked resource. */
    /* CompleteClass */
    var uri: Uri = js.native
  }
  
  /** Implements the ISyndicationNode interface which represents a generic XML syndication element. */
  @JSGlobal("Windows.Web.Syndication.SyndicationNode")
  @js.native
  /** Creates a new SyndicationNode object. */
  class SyndicationNode ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationNode {
    /**
      * Creates a new SyndicationNode object with the specified NodeName, NodeNamespace, and NodeValue property values.
      * @param nodeName The local name of the element. It must be valid according to XML 1.0.
      * @param nodeNamespace The namespace of the element.
      * @param nodeValue The text content of the element. If the element contains only child elements, this parameter is NULL.
      */
    def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
  }
  
  /** Represents an author or contributor of syndication content. */
  @JSGlobal("Windows.Web.Syndication.SyndicationPerson")
  @js.native
  /** Creates a SyndicationPerson object. */
  class SyndicationPerson ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationPerson {
    /**
      * Creates a SyndicationPerson object with the specified Name property value.
      * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
      */
    def this(name: String) = this()
    /**
      * Creates a SyndicationPerson object with the specified Name, Email, and Uri property values.
      * @param name The name of the SyndicationPerson . This parameter represents the atom:name element.
      * @param email Gets or sets the email address of the person. This property represents the atom:email element.
      * @param uri Gets or sets the URI of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because relative URI is not supported by the runtime URI class.
      */
    def this(name: String, email: String, uri: Uri) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /** Gets or sets the email address of the person. */
    /* CompleteClass */
    var email: String = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets the name of the syndication person. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets or sets the Uniform Resource Identifier (URI) of the person. This property represents the atom:uri element. It is the absolute URI resolved against the xml:base attribute, if it is present. If the href attribute is a relative URI string and there is no xml:base attribute, this property is NULL because the relative URI is not supported by the runtime URI class. */
    /* CompleteClass */
    var uri: Uri = js.native
  }
  
  /** Implements the ISyndicationText interface that encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML. In Atom 1.0, this object maps to an atomTextConstruct in the schema, which can be atom:title, atom:subtitle, atom:rights, or atom:summary elements. */
  @JSGlobal("Windows.Web.Syndication.SyndicationText")
  @js.native
  /** Creates a new SyndicationText object. */
  class SyndicationText ()
    extends StObject
       with typings.winrtUwp.Windows.Web.Syndication.SyndicationText {
    /**
      * Creates a new SyndicationText object with the specified Text property value.
      * @param text The content of a text content construct like atom:title.
      */
    def this(text: String) = this()
    /**
      * Creates a new SyndicationText object with the specified Text and Type property values.
      * @param text The content of a text content construct like atom:title.
      * @param type The type of the content. This value can be "text", "html", and "xhtml".
      */
    def this(text: String, `type`: SyndicationTextType) = this()
    
    /** Gets the list of custom attributes of the element. */
    /* CompleteClass */
    var attributeExtensions: IVector[typings.winrtUwp.Windows.Web.Syndication.SyndicationAttribute] = js.native
    
    /** Gets or sets the base URI for the element. This property represents the xml:base attribute on the element. It may be inherited from an ancestor element. */
    /* CompleteClass */
    var baseUri: Uri = js.native
    
    /** Gets the list of child elements within the element. */
    /* CompleteClass */
    var elementExtensions: IVector[ISyndicationNode] = js.native
    
    /**
      * Generates the DOM object that represents this element, all the attributes and child elements including foreign markups. The only formats accepted by this method are Atom 1.0 and RSS 2.0.
      * @param format The format of the data.
      * @return The DOM object that represents this element, and all the attributes and child elements, including foreign markups.
      */
    /* CompleteClass */
    override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
    
    /** Gets or sets the language of the element. This property represents the xml:lang attribute on the element. It may be inherited from an ancestor element. It must be valid according to XML 1.0. */
    /* CompleteClass */
    var language: String = js.native
    
    /** Gets or sets the local name of the element. */
    /* CompleteClass */
    var nodeName: String = js.native
    
    /** Gets or sets the namespace of the element. */
    /* CompleteClass */
    var nodeNamespace: String = js.native
    
    /** Gets or sets the text content of the element. If the element contains only child elements, this property is NULL. */
    /* CompleteClass */
    var nodeValue: String = js.native
    
    /** Gets the content of a text content construct like atom:title. */
    /* CompleteClass */
    var text: String = js.native
    
    /** Gets or sets the type of the content. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Gets or sets the XML content. */
    /* CompleteClass */
    var xml: XmlDocument = js.native
  }
  
  /** Specifies the text types supported for syndication content. */
  @JSGlobal("Windows.Web.Syndication.SyndicationTextType")
  @js.native
  object SyndicationTextType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Syndication.SyndicationTextType & Double] = js.native
    
    /* 1 */ val html: typings.winrtUwp.Windows.Web.Syndication.SyndicationTextType.html & Double = js.native
    
    /* 0 */ val text: typings.winrtUwp.Windows.Web.Syndication.SyndicationTextType.text & Double = js.native
    
    /* 2 */ val xhtml: typings.winrtUwp.Windows.Web.Syndication.SyndicationTextType.xhtml & Double = js.native
  }
}
