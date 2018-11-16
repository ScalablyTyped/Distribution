package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputFileType extends js.Object

@JSGlobal("TypeScript.OutputFileType")
@js.native
object OutputFileType extends js.Object {
  @js.native
  sealed trait Declaration
    extends typescriptDashServicesLib.TypeScriptNs.OutputFileType
  
  @js.native
  sealed trait JavaScript
    extends typescriptDashServicesLib.TypeScriptNs.OutputFileType
  
  @js.native
  sealed trait SourceMap
    extends typescriptDashServicesLib.TypeScriptNs.OutputFileType
  
  /* 2 */ val Declaration: Declaration with scala.Double = js.native
  /* 0 */ val JavaScript: JavaScript with scala.Double = js.native
  /* 1 */ val SourceMap: SourceMap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.OutputFileType with scala.Double] = js.native
}

