package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "HashMultiMap")
@js.native
/**
  * Default Constructor.
  *
  * @param hash An unary function returns hash code. Default is {hash}.
  * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
  */
class HashMultiMap[Key, T] ()
  extends tstlLib.containerHashMultiMapMod.HashMultiMap[Key, T] {
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
  def this(obj: tstlLib.containerHashMultiMapMod.HashMultiMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
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
  def this(hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double]) = this()
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
    ], hash: js.Function1[/* key */ Key, scala.Double]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
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
    ], hash: js.Function1[/* key */ Key, scala.Double], equal: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
}

