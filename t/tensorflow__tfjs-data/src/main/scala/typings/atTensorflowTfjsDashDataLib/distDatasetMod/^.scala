package typings
package atTensorflowTfjsDashDataLib.distDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/dataset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def array[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](items: js.Array[T]): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](
    iteratorFn: js.Function0[
      js.Promise[
        atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.LazyIterator[T]
      ]
    ]
  ): Dataset[T] = js.native
  def datasetFromIteratorFn[T /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](
    iteratorFn: js.Function0[
      js.Promise[
        atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.LazyIterator[T]
      ]
    ],
    size: scala.Double
  ): Dataset[T] = js.native
  def zip[O /* <: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer */](datasets: atTensorflowTfjsDashDataLib.distTypesMod.DatasetContainer): Dataset[O] = js.native
}

