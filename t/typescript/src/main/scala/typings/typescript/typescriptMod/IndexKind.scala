package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexKind extends js.Object

@JSImport("typescript", "IndexKind")
@js.native
object IndexKind extends js.Object {
  @js.native
  sealed trait Number extends IndexKind
  
  @js.native
  sealed trait String extends IndexKind
  
  /* 1 */ val Number: typings.typescript.typescriptMod.IndexKind.Number with Double = js.native
  /* 0 */ val String: typings.typescript.typescriptMod.IndexKind.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
}

