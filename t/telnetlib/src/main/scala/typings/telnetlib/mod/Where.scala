package typings.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Where extends StObject
@JSImport("telnetlib", "Where")
@js.native
object Where extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Where & String] = js.native
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with Where
  /* "LOCAL" */ val LOCAL: typings.telnetlib.mod.Where.LOCAL & String = js.native
  
  @js.native
  sealed trait REMOTE
    extends StObject
       with Where
  /* "REMOTE" */ val REMOTE: typings.telnetlib.mod.Where.REMOTE & String = js.native
}
