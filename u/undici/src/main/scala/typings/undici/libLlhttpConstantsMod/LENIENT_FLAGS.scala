package typings.undici.libLlhttpConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LENIENT_FLAGS extends StObject
@JSImport("undici/lib/llhttp/constants", "LENIENT_FLAGS")
@js.native
object LENIENT_FLAGS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LENIENT_FLAGS & Double] = js.native
  
  @js.native
  sealed trait CHUNKED_LENGTH
    extends StObject
       with LENIENT_FLAGS
  /* 2 */ val CHUNKED_LENGTH: typings.undici.libLlhttpConstantsMod.LENIENT_FLAGS.CHUNKED_LENGTH & Double = js.native
  
  @js.native
  sealed trait HEADERS
    extends StObject
       with LENIENT_FLAGS
  /* 1 */ val HEADERS: typings.undici.libLlhttpConstantsMod.LENIENT_FLAGS.HEADERS & Double = js.native
  
  @js.native
  sealed trait KEEP_ALIVE
    extends StObject
       with LENIENT_FLAGS
  /* 4 */ val KEEP_ALIVE: typings.undici.libLlhttpConstantsMod.LENIENT_FLAGS.KEEP_ALIVE & Double = js.native
}
