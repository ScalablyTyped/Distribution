package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexKind extends StObject
@JSImport("typescript", "IndexKind")
@js.native
object IndexKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
  
  @js.native
  sealed trait Number extends IndexKind
  /* 1 */ val Number: typings.typescript.mod.IndexKind.Number with Double = js.native
  
  @js.native
  sealed trait String extends IndexKind
  /* 0 */ val String: typings.typescript.mod.IndexKind.String with Double = js.native
}
