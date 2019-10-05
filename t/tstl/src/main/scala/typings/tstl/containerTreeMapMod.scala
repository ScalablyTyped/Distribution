package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerUniqueTreeMapMod.UniqueTreeMap
import typings.tstl.containerTreeMapMod.TreeMap
import typings.tstl.containerTreeMapMod.TreeMap.Iterator
import typings.tstl.containerTreeMapMod.TreeMap.ReverseIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.tstlNumbers.`true`
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeMap", JSImport.Namespace)
@js.native
object containerTreeMapMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class TreeMap[Key, T] () extends UniqueTreeMap[Key, T, TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: TreeMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    /**
      * @hidden
      */
    var tree_ : js.Any = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class map[Key, T] () extends TreeMap[Key, T] {
    def this(comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[IPair[Key, T]]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: TreeMap[Key, T]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]]
    ) = this()
    def this(items: js.Array[IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]) = this()
    def this(
      first: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      last: IForwardIterator[IPair[Key, T], IForwardIterator[IPair[Key, T], _]],
      comp: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
  }
  
  @js.native
  object TreeMap extends js.Object {
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
    type Iterator[Key, T] = typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator[Key, T, `true`, TreeMap[Key, T]]
    type ReverseIterator[Key, T] = typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator[Key, T, `true`, TreeMap[Key, T]]
    type iterator[Key, T] = typings.tstl.containerTreeMapMod.TreeMap.Iterator[Key, T]
    type reverse_iterator[Key, T] = typings.tstl.containerTreeMapMod.TreeMap.ReverseIterator[Key, T]
  }
  
  @js.native
  object map extends js.Object {
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
  
}

