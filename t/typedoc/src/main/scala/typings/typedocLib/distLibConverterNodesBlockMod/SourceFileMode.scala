package typings
package typedocLib.distLibConverterNodesBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceFileMode extends js.Object

@JSImport("typedoc/dist/lib/converter/nodes/block", "SourceFileMode")
@js.native
object SourceFileMode extends js.Object {
  @js.native
  sealed trait File
    extends typedocLib.distLibConverterNodesBlockMod.SourceFileMode
  
  @js.native
  sealed trait Modules
    extends typedocLib.distLibConverterNodesBlockMod.SourceFileMode
  
  /* 0 */ val File: File with scala.Double = js.native
  /* 1 */ val Modules: Modules with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibConverterNodesBlockMod.SourceFileMode with scala.Double] = js.native
}

