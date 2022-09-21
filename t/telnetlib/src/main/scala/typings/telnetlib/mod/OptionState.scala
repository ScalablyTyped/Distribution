package typings.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptionState extends StObject
@JSImport("telnetlib", "OptionState")
@js.native
object OptionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OptionState & String] = js.native
  
  @js.native
  sealed trait NO
    extends StObject
       with OptionState
  /* "NO" */ val NO: typings.telnetlib.mod.OptionState.NO & String = js.native
  
  @js.native
  sealed trait WANTNO
    extends StObject
       with OptionState
  /* "WANTNO" */ val WANTNO: typings.telnetlib.mod.OptionState.WANTNO & String = js.native
  
  @js.native
  sealed trait WANTYES
    extends StObject
       with OptionState
  /* "WANTYES" */ val WANTYES: typings.telnetlib.mod.OptionState.WANTYES & String = js.native
  
  @js.native
  sealed trait YES
    extends StObject
       with OptionState
  /* "YES" */ val YES: typings.telnetlib.mod.OptionState.YES & String = js.native
}
