package typings.atTensorflowTfjsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
  import typings.atTensorflowTfjsDashData.distDatasetMod.Dataset
  import typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod.LazyIterator
  import typings.std.Blob
  import typings.std.File
  import typings.std.Uint8Array

  type ContainerOrT[T] = Container[T] | T
  type DataElement = TensorContainer
  type DatasetContainer = Container[Dataset[DataElement]]
  type FileElement = File | Blob | Uint8Array
  type IteratorContainer = Container[LazyIterator[DataElement]]
}
