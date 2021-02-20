package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle with Double] = js.native
  
  @js.native
  sealed trait Block extends IndentStyle
  /* 1 */ val Block: typings.typescript.mod.IndentStyle.Block with Double = js.native
  
  @js.native
  sealed trait None extends IndentStyle
  /* 0 */ val None: typings.typescript.mod.IndentStyle.None with Double = js.native
  
  @js.native
  sealed trait Smart extends IndentStyle
  /* 2 */ val Smart: typings.typescript.mod.IndentStyle.Smart with Double = js.native
}
