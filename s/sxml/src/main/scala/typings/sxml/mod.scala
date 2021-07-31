package typings.sxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("sxml", "default.XML")
    @js.native
    class XML ()
      extends typings.sxml.moduleMod.XML {
      def this(str: String) = this()
      def this(xml: typings.sxml.xmlMod.XML) = this()
    }
    /* static members */
    object XML {
      
      @JSImport("sxml", "default.XML")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @hidden
        */
      @JSImport("sxml", "default.XML._Compute_min_index")
      @js.native
      def _Compute_min_index: js.Any = js.native
      @scala.inline
      def _Compute_min_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
      
      /**
        * @hidden
        */
      @JSImport("sxml", "default.XML._Repeat")
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
    }
    
    @JSImport("sxml", "default.XMLList")
    @js.native
    class XMLList ()
      extends typings.sxml.moduleMod.XMLList
  }
  
  @JSImport("sxml", "XML")
  @js.native
  class XML ()
    extends typings.sxml.moduleMod.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.xmlMod.XML) = this()
  }
  /* static members */
  object XML {
    
    @JSImport("sxml", "XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("sxml", "XML._Compute_min_index")
    @js.native
    def _Compute_min_index: js.Any = js.native
    @scala.inline
    def _Compute_min_index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("sxml", "XML._Repeat")
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
  }
  
  @JSImport("sxml", "XMLList")
  @js.native
  class XMLList ()
    extends typings.sxml.moduleMod.XMLList
}
