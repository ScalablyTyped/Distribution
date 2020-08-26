package typings.tensorflowTfjsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ContainerOrT[T] = typings.tensorflowTfjsData.typesMod.Container[T] | T
  type FileElement = typings.std.File | typings.std.Blob | typings.std.Uint8Array
}
