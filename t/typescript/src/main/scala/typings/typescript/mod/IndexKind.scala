package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexKind extends js.Object
@JSImport("typescript", "IndexKind")
@js.native
object IndexKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
  
  @js.native
  sealed trait Number extends IndexKind
  /* 1 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  @js.native
  sealed trait String extends IndexKind
  /* 0 */ @js.native
  object String
    extends TopLevel[typings.typescript.mod.IndexKind.String with Double]
}
