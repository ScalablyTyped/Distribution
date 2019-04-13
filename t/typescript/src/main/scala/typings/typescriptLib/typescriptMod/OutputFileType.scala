package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputFileType extends js.Object

@JSImport("typescript", "OutputFileType")
@js.native
object OutputFileType extends js.Object {
  @js.native
  sealed trait Declaration
    extends typescriptLib.typescriptMod.OutputFileType
  
  @js.native
  sealed trait JavaScript
    extends typescriptLib.typescriptMod.OutputFileType
  
  @js.native
  sealed trait SourceMap
    extends typescriptLib.typescriptMod.OutputFileType
  
  /* 2 */ val Declaration: Declaration with scala.Double = js.native
  /* 0 */ val JavaScript: JavaScript with scala.Double = js.native
  /* 1 */ val SourceMap: SourceMap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.OutputFileType with scala.Double] = js.native
}

