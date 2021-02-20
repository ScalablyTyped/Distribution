package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictThis extends StObject
@JSImport("xelib", "ConflictThis")
@js.native
object ConflictThis extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictThis with Double] = js.native
  
  @js.native
  sealed trait ctConflictBenign extends ConflictThis
  /* 7 */ val ctConflictBenign: typings.xelib.mod.ConflictThis.ctConflictBenign with Double = js.native
  
  @js.native
  sealed trait ctConflictLoses extends ConflictThis
  /* 11 */ val ctConflictLoses: typings.xelib.mod.ConflictThis.ctConflictLoses with Double = js.native
  
  @js.native
  sealed trait ctConflictWins extends ConflictThis
  /* 10 */ val ctConflictWins: typings.xelib.mod.ConflictThis.ctConflictWins with Double = js.native
  
  @js.native
  sealed trait ctHiddenByModGroup extends ConflictThis
  /* 5 */ val ctHiddenByModGroup: typings.xelib.mod.ConflictThis.ctHiddenByModGroup with Double = js.native
  
  @js.native
  sealed trait ctIdenticalToMaster extends ConflictThis
  /* 3 */ val ctIdenticalToMaster: typings.xelib.mod.ConflictThis.ctIdenticalToMaster with Double = js.native
  
  @js.native
  sealed trait ctIdenticalToMasterWinsConflict extends ConflictThis
  /* 9 */ val ctIdenticalToMasterWinsConflict: typings.xelib.mod.ConflictThis.ctIdenticalToMasterWinsConflict with Double = js.native
  
  @js.native
  sealed trait ctIgnored extends ConflictThis
  /* 1 */ val ctIgnored: typings.xelib.mod.ConflictThis.ctIgnored with Double = js.native
  
  @js.native
  sealed trait ctMaster extends ConflictThis
  /* 6 */ val ctMaster: typings.xelib.mod.ConflictThis.ctMaster with Double = js.native
  
  @js.native
  sealed trait ctNotDefined extends ConflictThis
  /* 2 */ val ctNotDefined: typings.xelib.mod.ConflictThis.ctNotDefined with Double = js.native
  
  @js.native
  sealed trait ctOnlyOne extends ConflictThis
  /* 4 */ val ctOnlyOne: typings.xelib.mod.ConflictThis.ctOnlyOne with Double = js.native
  
  @js.native
  sealed trait ctOverride extends ConflictThis
  /* 8 */ val ctOverride: typings.xelib.mod.ConflictThis.ctOverride with Double = js.native
  
  @js.native
  sealed trait ctUnknown extends ConflictThis
  /* 0 */ val ctUnknown: typings.xelib.mod.ConflictThis.ctUnknown with Double = js.native
}
