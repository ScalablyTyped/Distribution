package typings
package tstlLib.experimentalAlgorithmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/algorithm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def erase[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    `val`: tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container]
  ): scala.Unit = js.native
  @JSName("erase")
  def erase_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]): scala.Unit = js.native
  def erase_if[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    predicator: js.Function1[
      /* val */ tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](
    container: Container,
    predicator: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
}

