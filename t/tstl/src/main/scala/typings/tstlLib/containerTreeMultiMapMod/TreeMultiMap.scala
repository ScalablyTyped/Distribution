package typings
package tstlLib.containerTreeMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerITreeMapMod.ITreeMap because var conflicts: `data_`, iterator. Inlined  */ @JSImport("tstl/container/TreeMultiMap", "TreeMultiMap")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class TreeMultiMap[Key, T] ()
  extends tstlLib.baseContainerMultiMapMod.MultiMap[Key, T, TreeMultiMap[Key, T]] {
  def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: TreeMultiMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        tstlLib.utilityIPairMod.IPair[Key, T], 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
      ]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        tstlLib.utilityIPairMod.IPair[Key, T], 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
      ]
    ]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        tstlLib.utilityIPairMod.IPair[Key, T], 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
      ]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        tstlLib.utilityIPairMod.IPair[Key, T], 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
      ]
    ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * @hidden
    */
  var `tree_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T], 
    tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T]
  ] = js.native
  /**
    * @inheritDoc
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * @inheritDoc
    */
  def lower_bound(key: Key): tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def upper_bound(key: Key): tstlLib.containerTreeMultiMapMod.TreeMultiMapNs.Iterator[Key, T] = js.native
  /**
    * @inheritDoc
    */
  def value_comp(): js.Function2[
    /* x */ tstlLib.utilityIPairMod.IPair[Key, T], 
    /* y */ tstlLib.utilityIPairMod.IPair[Key, T], 
    scala.Boolean
  ] = js.native
}

