package typings.tstl

import typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typings.tstl.insertIteratorBaseMod.InsertIteratorBase
import typings.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/FrontInsertIterator", JSImport.Namespace)
@js.native
object frontInsertIteratorMod extends js.Object {
  
  @js.native
  class FrontInsertIterator[Source /* <: IPushFront[ValueType[Source]] */] protected () extends InsertIteratorBase[ValueType[Source], FrontInsertIterator[Source]] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
    
    var source_ : js.Any = js.native
  }
  @js.native
  object FrontInsertIterator extends js.Object {
    
    /**
      * Deduct value type.
      */
    type ValueType[Source /* <: IPushFront[_] */] = js.Any
  }
}
