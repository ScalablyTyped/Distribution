package typings.xmlCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import typings.xmlCore.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AssocArray[T] = StringDictionary[T]
  
  @js.native
  trait ICollection[I] extends StObject {
    
    def Add(item: I): Unit = js.native
    
    def Clear(): Unit = js.native
    
    val Count: Double = js.native
    
    def Every(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
    
    def Filter(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I] = js.native
    
    def ForEach(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit = js.native
    
    def GetIterator(): js.Array[I] = js.native
    
    def IsEmpty(): Boolean = js.native
    
    def Item(index: Double): I | Null = js.native
    
    def Map[U](cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U] = js.native
    
    def Pop(): js.UndefOr[I] = js.native
    
    def RemoveAt(index: Double): Unit = js.native
    
    def Some(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
    
    def Sort(cb: js.Function2[/* a */ I, /* b */ I, Double]): ICollection[I] = js.native
  }
  object ICollection {
    
    @scala.inline
    def apply[I](
      Add: I => Unit,
      Clear: () => Unit,
      Count: Double,
      Every: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
      Filter: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I],
      ForEach: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit,
      GetIterator: () => js.Array[I],
      IsEmpty: () => Boolean,
      Item: Double => I | Null,
      Map: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any],
      Pop: () => js.UndefOr[I],
      RemoveAt: Double => Unit,
      Some: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
      Sort: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]
    ): ICollection[I] = {
      val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort))
      __obj.asInstanceOf[ICollection[I]]
    }
    
    @scala.inline
    implicit class ICollectionMutableBuilder[Self <: ICollection[_], I] (val x: Self with ICollection[I]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: I => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvery(
        value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
      ): Self = StObject.set(x, "Every", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(
        value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I]
      ): Self = StObject.set(x, "Filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit): Self = StObject.set(x, "ForEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIterator(value: () => js.Array[I]): Self = StObject.set(x, "GetIterator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "IsEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setItem(value: Double => I | Null): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMap(
        value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any]
      ): Self = StObject.set(x, "Map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPop(value: () => js.UndefOr[I]): Self = StObject.set(x, "Pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "RemoveAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSome(
        value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
      ): Self = StObject.set(x, "Some", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(value: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]): Self = StObject.set(x, "Sort", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IConverter[T] extends StObject {
    
    /**
      * Converts value from Object to Xml element
      *
      * @memberOf IConverter
      */
    def get(value: T): js.UndefOr[String] = js.native
    
    /**
      * Converts value from Xml element to Object
      *
      * @memberOf IConverter
      */
    def set(value: String): T = js.native
  }
  object IConverter {
    
    @scala.inline
    def apply[T](get: T => js.UndefOr[String], set: String => T): IConverter[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[IConverter[T]]
    }
    
    @scala.inline
    implicit class IConverterMutableBuilder[Self <: IConverter[_], T] (val x: Self with IConverter[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: T => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: String => T): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  type ISelectResult = js.Array[Node] | Node | Boolean | Double | String
  
  @js.native
  trait IXmlSerializable extends StObject {
    
    /**
      * Writes object to XML node
      * - if class was initialized and it has no one change, GetXml returns null
      * @returns Node
      */
    def GetXml(): Node | Null = js.native
    
    def LoadXml(node: String): Unit = js.native
    /**
      * Reads XML from string
      * @param  {Node} node
      * @returns void
      */
    def LoadXml(node: Node): Unit = js.native
  }
  
  type IXmlSerializableConstructor = Instantiable0[IXmlSerializable]
  
  type XmlAttributeType[T] = XmlSchemaItem[T]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.xmlCore.xmlCoreStrings.utf8
    - typings.xmlCore.xmlCoreStrings.binary
    - typings.xmlCore.xmlCoreStrings.hex
    - typings.xmlCore.xmlCoreStrings.base64
    - typings.xmlCore.xmlCoreStrings.base64url
  */
  type XmlBufferEncoding = _XmlBufferEncoding | String
  
  @js.native
  trait XmlChildElementType[T]
    extends XmlSchemaItem[T]
       with XmlSchemaItemParser {
    
    /**
      * max occurs of items in collection
      *
      * @type {number}
      * @memberOf XmlChildElementType
      */
    var maxOccurs: js.UndefOr[Double] = js.native
    
    /**
      * min occurs of items in collection
      *
      * @type {number}
      * @memberOf XmlChildElementType
      */
    var minOccurs: js.UndefOr[Double] = js.native
    
    /**
      * Don't add root element of XmlCollection to compiled element
      *
      * @type {boolean}
      * @memberOf XmlChildElementType
      */
    var noRoot: js.UndefOr[Boolean] = js.native
  }
  object XmlChildElementType {
    
    @scala.inline
    def apply[T](): XmlChildElementType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlChildElementType[T]]
    }
    
    @scala.inline
    implicit class XmlChildElementTypeMutableBuilder[Self <: XmlChildElementType[_], T] (val x: Self with XmlChildElementType[T]) extends AnyVal {
      
      @scala.inline
      def setMaxOccurs(value: Double): Self = StObject.set(x, "maxOccurs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOccursUndefined: Self = StObject.set(x, "maxOccurs", js.undefined)
      
      @scala.inline
      def setMinOccurs(value: Double): Self = StObject.set(x, "minOccurs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOccursUndefined: Self = StObject.set(x, "minOccurs", js.undefined)
      
      @scala.inline
      def setNoRoot(value: Boolean): Self = StObject.set(x, "noRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRootUndefined: Self = StObject.set(x, "noRoot", js.undefined)
    }
  }
  
  @js.native
  trait XmlContentType[T] extends StObject {
    
    /**
      * Custom converter for item value
      *
      * @type {IConverter<T>}
      * @memberOf XmlContentType
      */
    var converter: js.UndefOr[IConverter[T]] = js.native
    
    /**
      * Default value for item
      *
      * @type {(T |)}
      * @memberOf XmlContentType
      */
    var defaultValue: js.UndefOr[T | Null] = js.native
    
    /**
      * Determine where item is required
      *
      * @type {boolean}
      * @memberOf XmlContentType
      */
    var required: js.UndefOr[Boolean] = js.native
  }
  object XmlContentType {
    
    @scala.inline
    def apply[T](): XmlContentType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlContentType[T]]
    }
    
    @scala.inline
    implicit class XmlContentTypeMutableBuilder[Self <: XmlContentType[_], T] (val x: Self with XmlContentType[T]) extends AnyVal {
      
      @scala.inline
      def setConverter(value: IConverter[T]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait XmlElementType
    extends XmlSchemaItemBase
       with XmlSchemaItemParser {
    
    /**
      * Local name for Xml element
      *
      * @type {string}
      * @memberOf XmlElementType
      */
    @JSName("localName")
    var localName_XmlElementType: String = js.native
  }
  object XmlElementType {
    
    @scala.inline
    def apply(localName: String): XmlElementType = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlElementType]
    }
    
    @scala.inline
    implicit class XmlElementTypeMutableBuilder[Self <: XmlElementType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlNamespace extends StObject {
    
    /**
      * Namespace URI
      *
      * @type {(string |)}
      * @memberOf XmlNamespace
      */
    var namespace: String | Null = js.native
    
    /**
      * Prefix
      *
      * @type {(string |)}
      * @memberOf XmlNamespace
      */
    var prefix: String | Null = js.native
  }
  object XmlNamespace {
    
    @scala.inline
    def apply(): XmlNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlNamespace]
    }
    
    @scala.inline
    implicit class XmlNamespaceMutableBuilder[Self <: XmlNamespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixNull: Self = StObject.set(x, "prefix", null)
    }
  }
  
  @js.native
  trait XmlSchema extends StObject {
    
    var items: js.UndefOr[StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]] = js.native
    
    var localName: js.UndefOr[String] = js.native
    
    var namespaceURI: js.UndefOr[String | Null] = js.native
    
    var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
    
    var prefix: js.UndefOr[String | Null] = js.native
    
    var target: js.UndefOr[js.Any] = js.native
  }
  object XmlSchema {
    
    @scala.inline
    def apply(): XmlSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlSchema]
    }
    
    @scala.inline
    implicit class XmlSchemaMutableBuilder[Self <: XmlSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: StringDictionary[(XmlChildElementType[_] | XmlAttributeType[_]) with Type]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
      
      @scala.inline
      def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      @scala.inline
      def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      @scala.inline
      def setParser(value: IXmlSerializableConstructor): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait XmlSchemaItem[T] extends XmlSchemaItemBase {
    
    /**
      * Custom converter for item value
      *
      * @type {IConverter<T>}
      * @memberOf XmlAttributeType
      */
    var converter: js.UndefOr[IConverter[T]] = js.native
    
    /**
      * Default value for item
      *
      * @type {(T |)}
      * @memberOf XmlSchemaItem
      */
    var defaultValue: js.UndefOr[T | Null] = js.native
    
    /**
      * Determine where item is required
      *
      * @type {boolean}
      * @memberOf XmlSchemaItem
      */
    var required: js.UndefOr[Boolean] = js.native
  }
  object XmlSchemaItem {
    
    @scala.inline
    def apply[T](): XmlSchemaItem[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlSchemaItem[T]]
    }
    
    @scala.inline
    implicit class XmlSchemaItemMutableBuilder[Self <: XmlSchemaItem[_], T] (val x: Self with XmlSchemaItem[T]) extends AnyVal {
      
      @scala.inline
      def setConverter(value: IConverter[T]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait XmlSchemaItemBase extends StObject {
    
    /**
      * Local name of item
      *
      * @type {string}
      * @memberOf XmlSchemaItemBase
      */
    var localName: js.UndefOr[String] = js.native
    
    /**
      * Namespace URI of attribute
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var namespaceURI: js.UndefOr[String | Null] = js.native
    
    /**
      * Default prefix for Xml element
      *
      * @type {(string |)}
      * @memberOf XmlSchemaItemBase
      */
    var prefix: js.UndefOr[String | Null] = js.native
  }
  object XmlSchemaItemBase {
    
    @scala.inline
    def apply(): XmlSchemaItemBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlSchemaItemBase]
    }
    
    @scala.inline
    implicit class XmlSchemaItemBaseMutableBuilder[Self <: XmlSchemaItemBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
      
      @scala.inline
      def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      @scala.inline
      def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait XmlSchemaItemParser extends StObject {
    
    /**
      * Xml parser for item
      *
      * @type {*}
      * @memberOf XmlSchemaItemParser
      */
    var parser: js.UndefOr[IXmlSerializableConstructor] = js.native
  }
  object XmlSchemaItemParser {
    
    @scala.inline
    def apply(): XmlSchemaItemParser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlSchemaItemParser]
    }
    
    @scala.inline
    implicit class XmlSchemaItemParserMutableBuilder[Self <: XmlSchemaItemParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParser(value: IXmlSerializableConstructor): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    }
  }
  
  trait _XmlBufferEncoding extends StObject
}
