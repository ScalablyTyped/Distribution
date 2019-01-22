package typings
package tstlLib.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "HashMultiSet")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMultiSet[Key] ()
  extends tstlLib.containerMod.HashMultiSet[Key] {
  def this(hash: js.Function1[/* key */ Key, scala.Double]) = this()
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
  def this(obj: tstlLib.containerHashMultiSetMod.HashMultiSet[Key]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ]) = this()
  def this(hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(items: js.Array[Key], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Key, _]]
    ], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
}

