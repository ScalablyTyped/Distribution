package typings.xmljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("xmljs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with XmlParser {
    def this(oPar: ParserParameters) = this()
    
    /* CompleteClass */
    var errors: js.Array[js.Error] = js.native
    
    /**
      * Parses a xml string
      * @param xml  XML string to parse
      * @param cb Callback function with error and the result (an Node)
      * @returns whenever or not there where any errors
      */
    /* CompleteClass */
    override def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]): Boolean = js.native
  }
  @JSImport("xmljs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whenever a node is a XmlNode or not
    * @param n
    */
  /* static member */
  inline def isXmlNode(n: Node): /* is xmljs.xmljs.XmlNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXmlNode")(n.asInstanceOf[js.Any]).asInstanceOf[/* is xmljs.xmljs.XmlNode */ Boolean]
  
  /**
    * Attribute
    */
  trait Attribute extends StObject {
    
    var name: String
    
    var text: String
  }
  object Attribute {
    
    inline def apply(name: String, text: String): Attribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    /**
      * Gets an node attribute by name
      * @param attrName  Name of the attribute
      * @param ignoreCase  whenever or not to ignore the name casing
      */
    def getAttribute(attrName: String, ignoreCase: Boolean): XmlAttribute
    
    /**
      * Traverses the XML Nodes and iterates through specified path
      * @param path  Node names to traverse down
      * @param ignoreCase  Ignore the casing of the path / node names
      */
    def path(path: js.Array[String], ignoreCase: Boolean): js.Array[XmlNode]
    
    /**
      * Recursively traverses the nodes and calls the given function in-order
      * @param fn Function to call for each node
      */
    def visit(fn: js.Function1[/* n */ this.type, Unit]): Unit
  }
  object Node {
    
    inline def apply(
      getAttribute: (String, Boolean) => XmlAttribute,
      path: (js.Array[String], Boolean) => js.Array[XmlNode],
      visit: js.Function1[Node, Unit] => Unit
    ): Node = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), path = js.Any.fromFunction2(path), visit = js.Any.fromFunction1(visit))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setGetAttribute(value: (String, Boolean) => XmlAttribute): Self = StObject.set(x, "getAttribute", js.Any.fromFunction2(value))
      
      inline def setPath(value: (js.Array[String], Boolean) => js.Array[XmlNode]): Self = StObject.set(x, "path", js.Any.fromFunction2(value))
      
      inline def setVisit(value: js.Function1[Node, Unit] => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
    }
  }
  
  trait ParserParameters extends StObject {
    
    /**
      * Turn the tagsNames to lowercase
      */
    var lowercaseTagnames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables xml namespaces
      */
    var noNamespaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not normalize whitespaces in text
      */
    var noNormalizeWhitespaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable position tracing of sax
      */
    var noTracing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not trimtext and comment nodes
      */
    var noTrim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whenever or not to use a strict parser
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow only predefined entities
      */
    var strictEntities: js.UndefOr[Boolean] = js.undefined
  }
  object ParserParameters {
    
    inline def apply(): ParserParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserParameters]
    }
    
    extension [Self <: ParserParameters](x: Self) {
      
      inline def setLowercaseTagnames(value: Boolean): Self = StObject.set(x, "lowercaseTagnames", value.asInstanceOf[js.Any])
      
      inline def setLowercaseTagnamesUndefined: Self = StObject.set(x, "lowercaseTagnames", js.undefined)
      
      inline def setNoNamespaces(value: Boolean): Self = StObject.set(x, "noNamespaces", value.asInstanceOf[js.Any])
      
      inline def setNoNamespacesUndefined: Self = StObject.set(x, "noNamespaces", js.undefined)
      
      inline def setNoNormalizeWhitespaces(value: Boolean): Self = StObject.set(x, "noNormalizeWhitespaces", value.asInstanceOf[js.Any])
      
      inline def setNoNormalizeWhitespacesUndefined: Self = StObject.set(x, "noNormalizeWhitespaces", js.undefined)
      
      inline def setNoTracing(value: Boolean): Self = StObject.set(x, "noTracing", value.asInstanceOf[js.Any])
      
      inline def setNoTracingUndefined: Self = StObject.set(x, "noTracing", js.undefined)
      
      inline def setNoTrim(value: Boolean): Self = StObject.set(x, "noTrim", value.asInstanceOf[js.Any])
      
      inline def setNoTrimUndefined: Self = StObject.set(x, "noTrim", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictEntities(value: Boolean): Self = StObject.set(x, "strictEntities", value.asInstanceOf[js.Any])
      
      inline def setStrictEntitiesUndefined: Self = StObject.set(x, "strictEntities", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /**
    * XML Attribute, an attribute with a namespace
    */
  trait XmlAttribute
    extends StObject
       with Attribute {
    
    var ns: String
  }
  object XmlAttribute {
    
    inline def apply(name: String, ns: String, text: String): XmlAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlAttribute]
    }
    
    extension [Self <: XmlAttribute](x: Self) {
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlNode
    extends StObject
       with typings.std.Node {
    
    var localName: String = js.native
    
    var name: String = js.native
    
    var ns: String = js.native
    
    var prefix: String = js.native
    
    var text: String = js.native
  }
  
  /*~ Write your module's methods and properties in this class */
  trait XmlParser extends StObject {
    
    var errors: js.Array[js.Error]
    
    /**
      * Parses a xml string
      * @param xml  XML string to parse
      * @param cb Callback function with error and the result (an Node)
      * @returns whenever or not there where any errors
      */
    def parseString(xml: String, cb: js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]): Boolean
  }
  object XmlParser {
    
    inline def apply(
      errors: js.Array[js.Error],
      parseString: (String, js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]) => Boolean
    ): XmlParser = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], parseString = js.Any.fromFunction2(parseString))
      __obj.asInstanceOf[XmlParser]
    }
    
    extension [Self <: XmlParser](x: Self) {
      
      inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setParseString(
        value: (String, js.Function2[/* err */ Null | js.Array[js.Error], /* xmlNode */ Node, Unit]) => Boolean
      ): Self = StObject.set(x, "parseString", js.Any.fromFunction2(value))
    }
  }
}
