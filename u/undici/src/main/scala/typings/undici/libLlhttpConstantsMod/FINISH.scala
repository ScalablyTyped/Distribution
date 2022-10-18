package typings.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FINISH extends StObject
@JSImport("undici/lib/llhttp/constants", "FINISH")
@js.native
object FINISH extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FINISH & Double] = js.native
  
  @js.native
  sealed trait SAFE
    extends StObject
       with FINISH
  /* 0 */ val SAFE: typings.undici.libLlhttpConstantsMod.FINISH.SAFE & Double = js.native
  
  @js.native
  sealed trait SAFE_WITH_CB
    extends StObject
       with FINISH
  /* 1 */ val SAFE_WITH_CB: typings.undici.libLlhttpConstantsMod.FINISH.SAFE_WITH_CB & Double = js.native
  
  @js.native
  sealed trait UNSAFE
    extends StObject
       with FINISH
  /* 2 */ val UNSAFE: typings.undici.libLlhttpConstantsMod.FINISH.UNSAFE & Double = js.native
}
