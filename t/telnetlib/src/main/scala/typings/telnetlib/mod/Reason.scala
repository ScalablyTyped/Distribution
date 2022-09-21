package typings.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Reason extends StObject
@JSImport("telnetlib", "Reason")
@js.native
object Reason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Reason & String] = js.native
  
  @js.native
  sealed trait CHUNK
    extends StObject
       with Reason
  /* "CHUNK" */ val CHUNK: typings.telnetlib.mod.Reason.CHUNK & String = js.native
  
  @js.native
  sealed trait DATA
    extends StObject
       with Reason
  /* "DATA" */ val DATA: typings.telnetlib.mod.Reason.DATA & String = js.native
  
  @js.native
  sealed trait EOR
    extends StObject
       with Reason
  /* "EOR" */ val EOR: typings.telnetlib.mod.Reason.EOR & String = js.native
  
  @js.native
  sealed trait GA
    extends StObject
       with Reason
  /* "GA" */ val GA: typings.telnetlib.mod.Reason.GA & String = js.native
}
