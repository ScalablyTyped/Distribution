package typings
package tstlLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "SetContainer")
@js.native
abstract class SetContainer[Key, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorISetIteratorMod.ISetIterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorISetIteratorMod.ISetReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends tstlLib.baseContainerSetContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
      /* thisArg */ Source, 
      tstlLib.baseContainerILinearContainerMod.ILinearContainer[Key, Source, IteratorT, ReverseT, Key]
    ]) = this()
}

