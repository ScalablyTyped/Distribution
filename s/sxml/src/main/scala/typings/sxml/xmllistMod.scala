package typings.sxml

import typings.sxml.xmlMod.XML
import typings.tstl.vectorMod.Vector
import typings.tstl.vectorMod.Vector.Iterator
import typings.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sxml/lib/module/XMLList", JSImport.Namespace)
@js.native
object xmllistMod extends js.Object {
  
  @js.native
  class XMLList () extends Vector[XML] {
    
    def getTag(): String = js.native
    
    def toString(level: Double): String = js.native
  }
  @js.native
  object XMLList extends js.Object {
    
    type Iterator_ = Iterator[XML]
    
    type ReverseIterator_ = ReverseIterator[XML]
    
    type iterator = Iterator_
    
    type reverseIterator = ReverseIterator_
  }
}
