package typings.sxml.libXMLMod

import typings.sxml.libXMLListMod.XMLList
import typings.sxml.libXMLMod.XMLNs.Iterator
import typings.sxml.libXMLMod.XMLNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XML", "XML")
@js.native
object XMLNs extends js.Object {
  def decode_property(str: String): String = js.native
  def decode_value(str: String): String = js.native
  def encode_property(str: String): String = js.native
  def encode_value(str: String): String = js.native
  def head(): String = js.native
  def head(encoding: String): String = js.native
  type Iterator = typings.tstl.containerHashMapMod.HashMapNs.Iterator[String, XMLList]
  type ReverseIterator = typings.tstl.containerHashMapMod.HashMapNs.ReverseIterator[String, XMLList]
  type iterator = Iterator
  type reverse_iterator = ReverseIterator
}

