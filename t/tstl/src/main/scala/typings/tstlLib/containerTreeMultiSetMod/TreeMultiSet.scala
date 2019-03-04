package typings
package tstlLib.containerTreeMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerITreeSetMod.ITreeSet because var conflicts: data_, iterator. Inlined  */ @JSImport("tstl/container/TreeMultiSet", "TreeMultiSet")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class TreeMultiSet[Key] ()
  extends tstlLib.baseContainerMultiSetMod.MultiSet[Key, TreeMultiSet[Key]] {
  def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(items: js.Array[Key]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: TreeMultiSet[Key]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ]) = this()
  def this(items: js.Array[Key], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * @hidden
    */
  var tree_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def equal_range(key: Key): tstlLib.utilityPairMod.Pair[
    tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[Key], 
    tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[Key]
  ] = js.native
  /**
    * @inheritDoc
    */
  def key_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
  /**
    * @inheritDoc
    */
  def lower_bound(key: Key): tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[Key] = js.native
  /**
    * @inheritDoc
    */
  def upper_bound(key: Key): tstlLib.containerTreeMultiSetMod.TreeMultiSetNs.Iterator[Key] = js.native
  /**
    * @inheritDoc
    */
  def value_comp(): js.Function2[/* x */ Key, /* y */ Key, scala.Boolean] = js.native
}

