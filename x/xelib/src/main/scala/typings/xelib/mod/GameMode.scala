package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GameMode extends StObject
@JSImport("xelib", "GameMode")
@js.native
object GameMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GameMode & Double] = js.native
  
  /**
    * Fallout: New Vegas
    */
  @js.native
  sealed trait gmFNV
    extends StObject
       with GameMode
  /* 0 */ val gmFNV: typings.xelib.mod.GameMode.gmFNV & Double = js.native
  
  /**
    * Fallout 3
    */
  @js.native
  sealed trait gmFO3
    extends StObject
       with GameMode
  /* 1 */ val gmFO3: typings.xelib.mod.GameMode.gmFO3 & Double = js.native
  
  /**
    * Fallout 4
    */
  @js.native
  sealed trait gmFO4
    extends StObject
       with GameMode
  /* 5 */ val gmFO4: typings.xelib.mod.GameMode.gmFO4 & Double = js.native
  
  /**
    * Skyrim: Special Edition
    */
  @js.native
  sealed trait gmSSE
    extends StObject
       with GameMode
  /* 4 */ val gmSSE: typings.xelib.mod.GameMode.gmSSE & Double = js.native
  
  /**
    * The Elder Scrolls IV: Oblivion
    */
  @js.native
  sealed trait gmTES4
    extends StObject
       with GameMode
  /* 2 */ val gmTES4: typings.xelib.mod.GameMode.gmTES4 & Double = js.native
  
  /**
    * The Elder Scrolls V: Skyrim
    */
  @js.native
  sealed trait gmTES5
    extends StObject
       with GameMode
  /* 3 */ val gmTES5: typings.xelib.mod.GameMode.gmTES5 & Double = js.native
}
