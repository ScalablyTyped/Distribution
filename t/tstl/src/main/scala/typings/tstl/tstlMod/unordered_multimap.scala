package typings.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unordered_multimap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class unordered_multimap[Key, T] ()
  extends typings.tstl.containerMod.unordered_multimap[Key, T] {
  def this(hash: js.Function1[/* key */ Key, Double]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[IPair[Key, T]]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: typings.tstl.containerHashMultiMapMod.HashMultiMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
  ) = this()
  def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  def this(items: js.Array[IPair[Key, T]], hash: js.Function1[/* key */ Key, Double]) = this()
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    hash: js.Function1[/* key */ Key, Double]
  ) = this()
  def this(
    items: js.Array[IPair[Key, T]],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
  def this(
    first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
}

@JSImport("tstl", "unordered_multimap")
@js.native
object unordered_multimap extends js.Object {
  val Iterator: Instantiable0[
    typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: Instantiable0[
    typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val iterator: Instantiable0[
    typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val reverse_iterator: Instantiable0[
    typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
}

