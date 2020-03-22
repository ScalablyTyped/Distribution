package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApiKeyScope extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "ApiKeyScope")
@js.native
object ApiKeyScope extends js.Object {
  @js.native
  sealed trait manage extends ApiKeyScope
  
  @js.native
  sealed trait read extends ApiKeyScope
  
  @js.native
  sealed trait write extends ApiKeyScope
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApiKeyScope with String] = js.native
  /* "manage" */ @js.native
  object manage extends TopLevel[manage with String]
  
  /* "read" */ @js.native
  object read extends TopLevel[read with String]
  
  /* "write" */ @js.native
  object write extends TopLevel[write with String]
  
}

