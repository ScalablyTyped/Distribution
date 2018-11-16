package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputFileType extends js.Object

@JSImport("typescript/ts", "OutputFileType")
@js.native
object OutputFileType extends js.Object {
  @js.native
  sealed trait Declaration
    extends typescriptLib.typescriptMod.tsNs.OutputFileType
  
  @js.native
  sealed trait JavaScript
    extends typescriptLib.typescriptMod.tsNs.OutputFileType
  
  @js.native
  sealed trait SourceMap
    extends typescriptLib.typescriptMod.tsNs.OutputFileType
  
}

