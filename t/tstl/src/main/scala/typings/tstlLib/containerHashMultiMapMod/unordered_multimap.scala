package typings
package tstlLib.containerHashMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/HashMultiMap", "unordered_multimap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class unordered_multimap[Key, T] () extends HashMultiMap[Key, T] {
  def this(hash: js.Function1[/* key */ Key, scala.Double]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: HashMultiMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ]) = this()
  def this(hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
}

