package typings
package tstlLib.experimentalAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @hidden
  */
trait IContainer[Iterator /* <: stdLib.Readonly[
tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator]] */] extends js.Object {
  def begin(): Iterator
  def end(): Iterator
  def erase(first: Iterator, last: Iterator): Iterator
}

object IContainer {
  @scala.inline
  def apply[Iterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator]
  ] */](
    begin: js.Function0[Iterator],
    end: js.Function0[Iterator],
    erase: js.Function2[Iterator, Iterator, Iterator]
  ): IContainer[Iterator] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("erase")(erase)
    __obj.asInstanceOf[IContainer[Iterator]]
  }
}

