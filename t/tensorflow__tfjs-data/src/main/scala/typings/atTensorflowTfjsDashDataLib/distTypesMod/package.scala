package typings
package atTensorflowTfjsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type ContainerOrT[T] = Container[T] | T
  type DataElement = atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer
  type DatasetContainer = Container[atTensorflowTfjsDashDataLib.distDatasetMod.Dataset[DataElement]]
  type FileElement = stdLib.File | stdLib.Blob | stdLib.Uint8Array
  type IteratorContainer = Container[
    atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod.LazyIterator[DataElement]
  ]
}
