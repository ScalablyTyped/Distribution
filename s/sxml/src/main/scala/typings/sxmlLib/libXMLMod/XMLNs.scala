package typings
package sxmlLib.libXMLMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XML", "XML")
@js.native
object XMLNs extends js.Object {
  def decode_property(str: java.lang.String): java.lang.String = js.native
  def decode_value(str: java.lang.String): java.lang.String = js.native
  def encode_property(str: java.lang.String): java.lang.String = js.native
  def encode_value(str: java.lang.String): java.lang.String = js.native
  def head(): java.lang.String = js.native
  def head(encoding: java.lang.String): java.lang.String = js.native
  type Iterator = tstlLib.containerHashMapMod.HashMapNs.Iterator[java.lang.String, sxmlLib.libXMLListMod.XMLList]
  type ReverseIterator = tstlLib.containerHashMapMod.HashMapNs.ReverseIterator[java.lang.String, sxmlLib.libXMLListMod.XMLList]
  type iterator = Iterator
  type reverse_iterator = ReverseIterator
}

