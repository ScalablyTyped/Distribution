package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/random", JSImport.Namespace)
@js.native
object algorithmRandomMod extends js.Object {
  def randint(x: scala.Double, y: scala.Double): scala.Double = js.native
  def sample[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: scala.Double): OutputIterator = js.native
}

