package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector.Iterator
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector.ReverseIterator
import typings.tstl.baseContainerVectorContainerMod.VectorContainer
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementVector", JSImport.Namespace)
@js.native
object baseContainerMapElementVectorMod extends js.Object {
  @js.native
  class MapElementVector[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends VectorContainer[
          Entry[Key, T], 
          Source, 
          MapElementVector[Key, T, Unique, Source], 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          IPair[Key, T]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object MapElementVector extends js.Object {
    @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends ArrayIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ]
         with IMapIterator[
              Key, 
              T, 
              Unique, 
              Source, 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source]
            ] {
      /**
        * The first, key element.
        */
      /* CompleteClass */
      override val first: Key = js.native
      /**
        * The second, stored element.
        */
      /* CompleteClass */
      override var second: T = js.native
    }
    
    @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends ArrayReverseIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ]
         with IMapReverseIterator[
              Key, 
              T, 
              Unique, 
              Source, 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source]
            ] {
      /**
        * The first, key element.
        */
      /* CompleteClass */
      override val first: Key = js.native
      /**
        * The second, stored element.
        */
      /* CompleteClass */
      override var second: T = js.native
    }
    
  }
  
}

