package typings
package tstlLib.baseContainerITreeSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeSet[T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[T, Unique, Source] */]
  extends tstlLib.baseContainerSetContainerMod.SetContainer[T, Unique, Source]
     with tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer[T, tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source]] {
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[/* x */ T, /* y */ T, scala.Boolean] = js.native
}

