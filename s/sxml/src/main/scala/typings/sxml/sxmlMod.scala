package typings.sxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml", JSImport.Namespace)
@js.native
object sxmlMod extends js.Object {
  @js.native
  class XML ()
    extends typings.sxml.libXMLMod.XML {
    def this(str: String) = this()
    def this(xml: typings.sxml.libXMLMod.XML) = this()
  }
  
  @js.native
  class XMLList ()
    extends typings.sxml.libXMLListMod.XMLList
  
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
  }
  
}

