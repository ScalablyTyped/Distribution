package typings.tstl

import typings.tstl.backInsertIteratorMod.BackInsertIterator.ValueType
import typings.tstl.insertIteratorBaseMod.InsertIteratorBase
import typings.tstl.ipushbackMod.IPushBack
import typings.tstl.vectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/BackInsertIterator", JSImport.Namespace)
@js.native
object backInsertIteratorMod extends js.Object {
  
  @js.native
  class BackInsertIterator[Source /* <: IPushBack[ValueType[Source]] */] protected () extends InsertIteratorBase[ValueType[Source], BackInsertIterator[Source]] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
    
    var source_ : js.Any = js.native
  }
  @js.native
  object BackInsertIterator extends js.Object {
    
    /**
      * Deduct source type.
      */
    type SourceType[Source /* <: js.Array[_] | IPushBack[_] */] = Source | Vector[js.Any]
    
    /**
      * Deduct value type.
      */
    type ValueType[Source /* <: IPushBack[_] */] = js.Any
  }
}
