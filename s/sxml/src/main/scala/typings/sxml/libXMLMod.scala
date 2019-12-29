package typings.sxml

import typings.sxml.libXMLListMod.XMLList
import typings.tstl.containerHashMapMod.HashMap.Iterator
import typings.tstl.tstlMod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XML", JSImport.Namespace)
@js.native
object libXMLMod extends js.Object {
  @js.native
  class XML () extends HashMap[String, XMLList] {
    def this(str: String) = this()
    def this(xml: XML) = this()
    /**
      * @hidden
      */
    var _Copy_constructor: js.Any = js.native
    /**
      * @hidden
      */
    var _Parse: js.Any = js.native
    /**
      * @hidden
      */
    var _Parse_children: js.Any = js.native
    /**
      * @hidden
      */
    var _Parse_properties: js.Any = js.native
    /**
      * @hidden
      */
    var _Parse_tag: js.Any = js.native
    /**
      * @hidden
      */
    var _Parse_value: js.Any = js.native
    /**
      * @hidden
      */
    var _Parser_constructor: js.Any = js.native
    /**
      * @hidden
      */
    var property_map_ : js.Any = js.native
    /**
      * @hidden
      */
    var tag_ : js.Any = js.native
    /**
      * @hidden
      */
    var value_ : js.Any = js.native
    def eraseProperty(key: String): Unit = js.native
    def findProperty(key: String): Iterator[String, String] = js.native
    def getProperty(key: String): String = js.native
    def getPropertyMap(): HashMap[String, String] = js.native
    def getTag(): String = js.native
    def getValue(): String = js.native
    def hasProperty(key: String): Boolean = js.native
    def insertValue(tag: String, value: String): XML = js.native
    def setProperty(key: String, value: String): Unit = js.native
    def setTag(`val`: String): Unit = js.native
    def setValue(`val`: String): Unit = js.native
    def toString(tab: Double): String = js.native
  }
  
  /* static members */
  @js.native
  object XML extends js.Object {
    /**
      * @hidden
      */
    var _Compute_min_index: js.Any = js.native
    /**
      * @hidden
      */
    var _Repeat: js.Any = js.native
    def decode_property(str: String): String = js.native
    def decode_value(str: String): String = js.native
    def encode_property(str: String): String = js.native
    def encode_value(str: String): String = js.native
    def head(): String = js.native
    def head(encoding: String): String = js.native
    type Iterator = typings.tstl.containerHashMapMod.HashMap.Iterator[String, XMLList]
    type ReverseIterator = typings.tstl.containerHashMapMod.HashMap.ReverseIterator[String, XMLList]
    type iterator = typings.sxml.libXMLMod.XML.Iterator
    type reverse_iterator = ReverseIterator
  }
  
}

