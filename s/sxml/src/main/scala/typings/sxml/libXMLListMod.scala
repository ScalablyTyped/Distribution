package typings.sxml

import typings.sxml.libXMLListMod.XMLList.Iterator
import typings.sxml.libXMLListMod.XMLList.ReverseIterator
import typings.sxml.libXMLMod.XML
import typings.tstl.tstlMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XMLList", JSImport.Namespace)
@js.native
object libXMLListMod extends js.Object {
  @js.native
  class XMLList () extends Vector[XML] {
    def getTag(): String = js.native
    def toString(level: Double): String = js.native
  }
  
  @js.native
  object XMLList extends js.Object {
    type Iterator = typings.tstl.containerVectorMod.Vector.Iterator[XML]
    type ReverseIterator = typings.tstl.containerVectorMod.Vector.ReverseIterator[XML]
    type iterator = Iterator
    type reverse_iterator = ReverseIterator
  }
  
}

