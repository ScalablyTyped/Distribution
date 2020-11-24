package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictThis extends js.Object
@JSImport("xelib", "ConflictThis")
@js.native
object ConflictThis extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictThis with Double] = js.native
  
  @js.native
  sealed trait ctConflictBenign extends ConflictThis
  /* 7 */ @js.native
  object ctConflictBenign extends TopLevel[ctConflictBenign with Double]
  
  @js.native
  sealed trait ctConflictLoses extends ConflictThis
  /* 11 */ @js.native
  object ctConflictLoses extends TopLevel[ctConflictLoses with Double]
  
  @js.native
  sealed trait ctConflictWins extends ConflictThis
  /* 10 */ @js.native
  object ctConflictWins extends TopLevel[ctConflictWins with Double]
  
  @js.native
  sealed trait ctHiddenByModGroup extends ConflictThis
  /* 5 */ @js.native
  object ctHiddenByModGroup extends TopLevel[ctHiddenByModGroup with Double]
  
  @js.native
  sealed trait ctIdenticalToMaster extends ConflictThis
  /* 3 */ @js.native
  object ctIdenticalToMaster extends TopLevel[ctIdenticalToMaster with Double]
  
  @js.native
  sealed trait ctIdenticalToMasterWinsConflict extends ConflictThis
  /* 9 */ @js.native
  object ctIdenticalToMasterWinsConflict extends TopLevel[ctIdenticalToMasterWinsConflict with Double]
  
  @js.native
  sealed trait ctIgnored extends ConflictThis
  /* 1 */ @js.native
  object ctIgnored extends TopLevel[ctIgnored with Double]
  
  @js.native
  sealed trait ctMaster extends ConflictThis
  /* 6 */ @js.native
  object ctMaster extends TopLevel[ctMaster with Double]
  
  @js.native
  sealed trait ctNotDefined extends ConflictThis
  /* 2 */ @js.native
  object ctNotDefined extends TopLevel[ctNotDefined with Double]
  
  @js.native
  sealed trait ctOnlyOne extends ConflictThis
  /* 4 */ @js.native
  object ctOnlyOne extends TopLevel[ctOnlyOne with Double]
  
  @js.native
  sealed trait ctOverride extends ConflictThis
  /* 8 */ @js.native
  object ctOverride extends TopLevel[ctOverride with Double]
  
  @js.native
  sealed trait ctUnknown extends ConflictThis
  /* 0 */ @js.native
  object ctUnknown extends TopLevel[ctUnknown with Double]
}
