package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndentStyle extends js.Object

@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends js.Object {
  @js.native
  sealed trait Block extends IndentStyle
  
  @js.native
  sealed trait None extends IndentStyle
  
  @js.native
  sealed trait Smart extends IndentStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle with Double] = js.native
  /* 1 */ @js.native
  object Block
    extends TopLevel[typings.typescript.mod.IndentStyle.Block with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Smart extends TopLevel[Smart with Double]
  
}

