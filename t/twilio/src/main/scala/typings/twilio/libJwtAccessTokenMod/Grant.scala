package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("twilio/lib/jwt/AccessToken", "Grant")
@js.native
open class Grant[TOptions, TPayload, TKey] protected () extends StObject {
  /* protected */ def this(key: TKey) = this()
  
  var key: TKey = js.native
  
  def toPayload(): TPayload = js.native
}
