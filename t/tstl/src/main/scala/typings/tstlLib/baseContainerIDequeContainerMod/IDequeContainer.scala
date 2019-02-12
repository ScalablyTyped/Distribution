package typings
package tstlLib.baseContainerIDequeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDequeContainer[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseIteratorT, T] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, T] */]
  extends tstlLib.baseContainerILinearContainerMod.ILinearContainer[T, SourceT, IteratorT, ReverseIteratorT]
     with _IDeque[T]

