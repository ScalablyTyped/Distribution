package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "set")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class set[Key] ()
  extends tstlLib.containerTreeSetMod.set[Key] {
  def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(container: tstlLib.containerTreeSetMod.TreeSet[Key]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(items: js.Array[Key]) = this()
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
}

