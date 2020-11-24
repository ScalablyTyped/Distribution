package typings.xelib.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConflictAll extends js.Object
@JSImport("xelib", "ConflictAll")
@js.native
object ConflictAll extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConflictAll with Double] = js.native
  
  @js.native
  sealed trait caConflict extends ConflictAll
  /* 5 */ @js.native
  object caConflict extends TopLevel[caConflict with Double]
  
  @js.native
  sealed trait caConflictBenign extends ConflictAll
  /* 3 */ @js.native
  object caConflictBenign extends TopLevel[caConflictBenign with Double]
  
  @js.native
  sealed trait caConflictCritical extends ConflictAll
  /* 6 */ @js.native
  object caConflictCritical extends TopLevel[caConflictCritical with Double]
  
  @js.native
  sealed trait caNoConflict extends ConflictAll
  /* 2 */ @js.native
  object caNoConflict extends TopLevel[caNoConflict with Double]
  
  @js.native
  sealed trait caOnlyOne extends ConflictAll
  /* 1 */ @js.native
  object caOnlyOne extends TopLevel[caOnlyOne with Double]
  
  @js.native
  sealed trait caOverride extends ConflictAll
  /* 4 */ @js.native
  object caOverride extends TopLevel[caOverride with Double]
  
  @js.native
  sealed trait caUnknown extends ConflictAll
  /* 0 */ @js.native
  object caUnknown extends TopLevel[caUnknown with Double]
}
