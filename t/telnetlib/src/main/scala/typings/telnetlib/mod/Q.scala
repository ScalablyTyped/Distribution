package typings.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Q extends StObject
@JSImport("telnetlib", "Q")
@js.native
object Q extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Q & String] = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with Q
  /* "EMPTY" */ val EMPTY: typings.telnetlib.mod.Q.EMPTY & String = js.native
  
  @js.native
  sealed trait OPPOSITE
    extends StObject
       with Q
  /* "OPPOSITE" */ val OPPOSITE: typings.telnetlib.mod.Q.OPPOSITE & String = js.native
}
