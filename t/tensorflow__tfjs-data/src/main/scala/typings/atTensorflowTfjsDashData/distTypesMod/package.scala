package typings.atTensorflowTfjsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
  import typings.std.Blob
  import typings.std.File
  import typings.std.Uint8Array

  type ContainerOrT[T] = Container[T] | T
  type DataElement = TensorContainer
  type FileElement = File | Blob | Uint8Array
}
