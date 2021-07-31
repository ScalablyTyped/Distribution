package typings.xelib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictAll extends StObject
@JSImport("xelib", "ConflictAll")
@js.native
object ConflictAll extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictAll & Double] = js.native
  
  @js.native
  sealed trait caConflict
    extends StObject
       with ConflictAll
  /* 5 */ val caConflict: typings.xelib.mod.ConflictAll.caConflict & Double = js.native
  
  @js.native
  sealed trait caConflictBenign
    extends StObject
       with ConflictAll
  /* 3 */ val caConflictBenign: typings.xelib.mod.ConflictAll.caConflictBenign & Double = js.native
  
  @js.native
  sealed trait caConflictCritical
    extends StObject
       with ConflictAll
  /* 6 */ val caConflictCritical: typings.xelib.mod.ConflictAll.caConflictCritical & Double = js.native
  
  @js.native
  sealed trait caNoConflict
    extends StObject
       with ConflictAll
  /* 2 */ val caNoConflict: typings.xelib.mod.ConflictAll.caNoConflict & Double = js.native
  
  @js.native
  sealed trait caOnlyOne
    extends StObject
       with ConflictAll
  /* 1 */ val caOnlyOne: typings.xelib.mod.ConflictAll.caOnlyOne & Double = js.native
  
  @js.native
  sealed trait caOverride
    extends StObject
       with ConflictAll
  /* 4 */ val caOverride: typings.xelib.mod.ConflictAll.caOverride & Double = js.native
  
  @js.native
  sealed trait caUnknown
    extends StObject
       with ConflictAll
  /* 0 */ val caUnknown: typings.xelib.mod.ConflictAll.caUnknown & Double = js.native
}
