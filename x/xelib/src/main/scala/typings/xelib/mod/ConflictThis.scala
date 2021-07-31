package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictThis extends StObject
@JSImport("xelib", "ConflictThis")
@js.native
object ConflictThis extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictThis & Double] = js.native
  
  @js.native
  sealed trait ctConflictBenign
    extends StObject
       with ConflictThis
  /* 7 */ val ctConflictBenign: typings.xelib.mod.ConflictThis.ctConflictBenign & Double = js.native
  
  @js.native
  sealed trait ctConflictLoses
    extends StObject
       with ConflictThis
  /* 11 */ val ctConflictLoses: typings.xelib.mod.ConflictThis.ctConflictLoses & Double = js.native
  
  @js.native
  sealed trait ctConflictWins
    extends StObject
       with ConflictThis
  /* 10 */ val ctConflictWins: typings.xelib.mod.ConflictThis.ctConflictWins & Double = js.native
  
  @js.native
  sealed trait ctHiddenByModGroup
    extends StObject
       with ConflictThis
  /* 5 */ val ctHiddenByModGroup: typings.xelib.mod.ConflictThis.ctHiddenByModGroup & Double = js.native
  
  @js.native
  sealed trait ctIdenticalToMaster
    extends StObject
       with ConflictThis
  /* 3 */ val ctIdenticalToMaster: typings.xelib.mod.ConflictThis.ctIdenticalToMaster & Double = js.native
  
  @js.native
  sealed trait ctIdenticalToMasterWinsConflict
    extends StObject
       with ConflictThis
  /* 9 */ val ctIdenticalToMasterWinsConflict: typings.xelib.mod.ConflictThis.ctIdenticalToMasterWinsConflict & Double = js.native
  
  @js.native
  sealed trait ctIgnored
    extends StObject
       with ConflictThis
  /* 1 */ val ctIgnored: typings.xelib.mod.ConflictThis.ctIgnored & Double = js.native
  
  @js.native
  sealed trait ctMaster
    extends StObject
       with ConflictThis
  /* 6 */ val ctMaster: typings.xelib.mod.ConflictThis.ctMaster & Double = js.native
  
  @js.native
  sealed trait ctNotDefined
    extends StObject
       with ConflictThis
  /* 2 */ val ctNotDefined: typings.xelib.mod.ConflictThis.ctNotDefined & Double = js.native
  
  @js.native
  sealed trait ctOnlyOne
    extends StObject
       with ConflictThis
  /* 4 */ val ctOnlyOne: typings.xelib.mod.ConflictThis.ctOnlyOne & Double = js.native
  
  @js.native
  sealed trait ctOverride
    extends StObject
       with ConflictThis
  /* 8 */ val ctOverride: typings.xelib.mod.ConflictThis.ctOverride & Double = js.native
  
  @js.native
  sealed trait ctUnknown
    extends StObject
       with ConflictThis
  /* 0 */ val ctUnknown: typings.xelib.mod.ConflictThis.ctUnknown & Double = js.native
}
