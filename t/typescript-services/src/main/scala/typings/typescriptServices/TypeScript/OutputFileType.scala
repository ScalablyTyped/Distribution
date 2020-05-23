package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputFileType extends js.Object

@JSGlobal("TypeScript.OutputFileType")
@js.native
object OutputFileType extends js.Object {
  @js.native
  sealed trait Declaration extends OutputFileType
  
  @js.native
  sealed trait JavaScript extends OutputFileType
  
  @js.native
  sealed trait SourceMap extends OutputFileType
  
}

