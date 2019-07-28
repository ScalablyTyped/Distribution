package typings.atTensorflowTfjsDashData.distTypesMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerArray[T]
  extends Array[ContainerOrT[T]]
     with Container[T]

