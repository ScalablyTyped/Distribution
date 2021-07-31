package typings.sxml

import typings.sxml.xmllistMod.XMLList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap<string, XMLList> * / any */ @JSImport("sxml/lib/module/XML", "XML")
  @js.native
  class XML () extends StObject {
    def this(str: String) = this()
    def this(xml: XML) = this()
    
    /**
      * @hidden
      */
    var _Copy_constructor: js.Any = js.native
    
    /* protected */ def _Handle_insert(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<string, XMLList> */ js.Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<string, XMLList> */ js.Any
    ): Unit = js.native
    
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
    
    def eraseProperty(key: String): Unit = js.native
    
    def findProperty(key: String): js.Any = js.native
    
    def getProperty(key: String): String = js.native
    
    def getPropertyMap(): js.Any = js.native
    
    def getTag(): String = js.native
    
    def getValue(): String = js.native
    
    def hasProperty(key: String): Boolean = js.native
    
    def insertValue(tag: String, value: String): XML = js.native
    
    /**
      * @hidden
      */
    var property_map_ : js.Any = js.native
    
    def push(
      args: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPair<string, XMLList> */ js.Any) | XML | XMLList)*
    ): Double = js.native
    
    def setProperty(key: String, value: String): Unit = js.native
    
    def setTag(`val`: String): Unit = js.native
    
    def setValue(`val`: String): Unit = js.native
    
    /**
      * @hidden
      */
    var tag_ : js.Any = js.native
    
    def toString(tab: Double): String = js.native
    
    /**
      * @hidden
      */
    var value_ : js.Any = js.native
  }
  /* static members */
  object XML {
    
    @JSImport("sxml/lib/module/XML", "XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module/XML", "XML._Compute_min_index")
    @js.native
    def _Compute_min_index: js.Any = js.native
    @scala.inline
    def _Compute_min_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module/XML", "XML._Repeat")
    @js.native
    def _Repeat: js.Any = js.native
    @scala.inline
    def _Repeat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def decodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def decodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def encodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def encodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def head(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[String]
    @scala.inline
    def head(encoding: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(encoding.asInstanceOf[js.Any]).asInstanceOf[String]
    
    type Iterator_ = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.Iterator<string, XMLList> */ js.Any
    
    type ReverseIterator_ = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMap.ReverseIterator<string, XMLList> */ js.Any
    
    type iterator = Iterator_
    
    type reverseIterator = ReverseIterator_
  }
}
