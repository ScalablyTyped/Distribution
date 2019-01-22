package typings
package tstlLib.experimentalAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/algorithm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def erase[T, Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, Container], 
    tstlLib.tstlLibStrings.remove_if
  ] */](contaier: Container, `val`: T): scala.Unit = js.native
  @JSName("erase")
  def erase_TContainerIContainerIteratorReadonly[T, Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[T, Iterator] */, Iterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator]] */](container: Container, `val`: T): scala.Unit = js.native
  def erase_if[T, Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[T, Container], 
    tstlLib.tstlLibStrings.remove_if
  ] */](contaier: Container, predicator: js.Function1[/* val */ T, scala.Boolean]): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_TContainerIContainerIteratorReadonly[T, Container /* <: tstlLib.experimentalAlgorithmMod.IContainer[T, Iterator] */, Iterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator]] */](container: Container, predicator: js.Function1[/* val */ T, scala.Boolean]): scala.Unit = js.native
}

