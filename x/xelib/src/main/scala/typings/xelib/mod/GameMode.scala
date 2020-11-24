package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GameMode extends js.Object
@JSImport("xelib", "GameMode")
@js.native
object GameMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GameMode with Double] = js.native
  
  /**
    * Fallout: New Vegas
    */
  @js.native
  sealed trait gmFNV extends GameMode
  /* 0 */ @js.native
  object gmFNV extends TopLevel[gmFNV with Double]
  
  /**
    * Fallout 3
    */
  @js.native
  sealed trait gmFO3 extends GameMode
  /* 1 */ @js.native
  object gmFO3 extends TopLevel[gmFO3 with Double]
  
  /**
    * Fallout 4
    */
  @js.native
  sealed trait gmFO4 extends GameMode
  /* 5 */ @js.native
  object gmFO4 extends TopLevel[gmFO4 with Double]
  
  /**
    * Skyrim: Special Edition
    */
  @js.native
  sealed trait gmSSE extends GameMode
  /* 4 */ @js.native
  object gmSSE extends TopLevel[gmSSE with Double]
  
  /**
    * The Elder Scrolls IV: Oblivion
    */
  @js.native
  sealed trait gmTES4 extends GameMode
  /* 2 */ @js.native
  object gmTES4 extends TopLevel[gmTES4 with Double]
  
  /**
    * The Elder Scrolls V: Skyrim
    */
  @js.native
  sealed trait gmTES5 extends GameMode
  /* 3 */ @js.native
  object gmTES5 extends TopLevel[gmTES5 with Double]
}
