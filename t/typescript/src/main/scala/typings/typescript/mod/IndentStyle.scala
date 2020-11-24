package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends js.Object
@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle with Double] = js.native
  
  @js.native
  sealed trait Block extends IndentStyle
  /* 1 */ @js.native
  object Block
    extends TopLevel[typings.typescript.mod.IndentStyle.Block with Double]
  
  @js.native
  sealed trait None extends IndentStyle
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Smart extends IndentStyle
  /* 2 */ @js.native
  object Smart extends TopLevel[Smart with Double]
}
