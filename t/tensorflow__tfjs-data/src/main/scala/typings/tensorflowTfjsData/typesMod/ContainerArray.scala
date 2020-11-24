package typings.tensorflowTfjsData.typesMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerArray[T]
  extends Array[ContainerOrT[T]]
     with Container[T]
