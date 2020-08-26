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
  sealed trait MANAGE extends ApiKeyScope
  
  @js.native
  sealed trait READ extends ApiKeyScope
  
  @js.native
  sealed trait WRITE extends ApiKeyScope
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApiKeyScope with String] = js.native
  /* "manage" */ @js.native
  object MANAGE extends TopLevel[MANAGE with String]
  
  /* "read" */ @js.native
  object READ extends TopLevel[READ with String]
  
  /* "write" */ @js.native
  object WRITE extends TopLevel[WRITE with String]
  
}

