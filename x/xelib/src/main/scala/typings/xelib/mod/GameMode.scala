package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GameMode extends StObject
@JSImport("xelib", "GameMode")
@js.native
object GameMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GameMode with Double] = js.native
  
  /**
    * Fallout: New Vegas
    */
  @js.native
  sealed trait gmFNV extends GameMode
  /* 0 */ val gmFNV: typings.xelib.mod.GameMode.gmFNV with Double = js.native
  
  /**
    * Fallout 3
    */
  @js.native
  sealed trait gmFO3 extends GameMode
  /* 1 */ val gmFO3: typings.xelib.mod.GameMode.gmFO3 with Double = js.native
  
  /**
    * Fallout 4
    */
  @js.native
  sealed trait gmFO4 extends GameMode
  /* 5 */ val gmFO4: typings.xelib.mod.GameMode.gmFO4 with Double = js.native
  
  /**
    * Skyrim: Special Edition
    */
  @js.native
  sealed trait gmSSE extends GameMode
  /* 4 */ val gmSSE: typings.xelib.mod.GameMode.gmSSE with Double = js.native
  
  /**
    * The Elder Scrolls IV: Oblivion
    */
  @js.native
  sealed trait gmTES4 extends GameMode
  /* 2 */ val gmTES4: typings.xelib.mod.GameMode.gmTES4 with Double = js.native
  
  /**
    * The Elder Scrolls V: Skyrim
    */
  @js.native
  sealed trait gmTES5 extends GameMode
  /* 3 */ val gmTES5: typings.xelib.mod.GameMode.gmTES5 with Double = js.native
}
