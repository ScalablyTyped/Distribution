package typings.typedoc.distLibConverterNodesBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceFileMode extends js.Object

@JSImport("typedoc/dist/lib/converter/nodes/block", "SourceFileMode")
@js.native
object SourceFileMode extends js.Object {
  @js.native
  sealed trait File extends SourceFileMode
  
  @js.native
  sealed trait Modules extends SourceFileMode
  
  /* 0 */ val File: typings.typedoc.distLibConverterNodesBlockMod.SourceFileMode.File with Double = js.native
  /* 1 */ val Modules: typings.typedoc.distLibConverterNodesBlockMod.SourceFileMode.Modules with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
}

