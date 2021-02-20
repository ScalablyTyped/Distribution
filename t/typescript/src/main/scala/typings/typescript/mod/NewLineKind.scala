package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport("typescript", "NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  /* 0 */ val CarriageReturnLineFeed: typings.typescript.mod.NewLineKind.CarriageReturnLineFeed with Double = js.native
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  /* 1 */ val LineFeed: typings.typescript.mod.NewLineKind.LineFeed with Double = js.native
}
