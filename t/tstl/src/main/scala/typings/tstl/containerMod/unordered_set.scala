package typings.tstl.containerMod

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "unordered_set")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class unordered_set[Key] ()
  extends typings.tstl.containerHashSetMod.unordered_set[Key] {
  def this(hash: js.Function1[/* key */ Key, Double]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[Key]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: typings.tstl.containerHashSetMod.HashSet[Key]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]]
  ) = this()
  def this(hash: js.Function1[/* key */ Key, Double], equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, Double]) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: js.Function1[/* key */ Key, Double]
  ) = this()
  def this(
    items: js.Array[Key],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
  def this(
    first: IForwardIterator[Key, IForwardIterator[Key, _]],
    last: IForwardIterator[Key, IForwardIterator[Key, _]],
    hash: js.Function1[/* key */ Key, Double],
    equal: js.Function2[/* x */ Key, /* y */ Key, Boolean]
  ) = this()
}

@JSImport("tstl/container", "unordered_set")
@js.native
object unordered_set extends js.Object {
  val Iterator: Instantiable0[
    typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val ReverseIterator: Instantiable0[
    typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val iterator: Instantiable0[
    typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  val reverse_iterator: Instantiable0[
    typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any, 
        typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ], 
        typings.tstl.baseContainerSetElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
}

