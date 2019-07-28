package typings.atTensorflowTfjsDashData.distDatasetMod

import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.LazyIterator
import typings.atTensorflowTfjsDashData.distTypesMod.DatasetContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def array[T /* <: TensorContainer */](items: js.Array[T]): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]]): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: TensorContainer */](iteratorFn: js.Function0[js.Promise[LazyIterator[T]]], size: Double): Dataset[T] = js.native
  def zip[O /* <: TensorContainer */](datasets: DatasetContainer): Dataset[O] = js.native
}

