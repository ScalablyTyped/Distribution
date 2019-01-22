package typings
package tstlLib.iteratorIReverseIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReverseIterator[T, Base /* <: IReversableIterator[T, Base, This] */, This /* <: IReverseIterator[T, Base, This] */]
  extends tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, This] {
  /**
    * Get base iterator.
    *
    * @return The base iterator.
    */
  def base(): Base
}

