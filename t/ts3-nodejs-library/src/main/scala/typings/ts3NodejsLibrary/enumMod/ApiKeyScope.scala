package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApiKeyScope extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "ApiKeyScope")
@js.native
object ApiKeyScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApiKeyScope with String] = js.native
  
  @js.native
  sealed trait MANAGE extends ApiKeyScope
  /* "manage" */ @js.native
  object MANAGE extends TopLevel[MANAGE with String]
  
  @js.native
  sealed trait READ extends ApiKeyScope
  /* "read" */ @js.native
  object READ extends TopLevel[READ with String]
  
  @js.native
  sealed trait WRITE extends ApiKeyScope
  /* "write" */ @js.native
  object WRITE extends TopLevel[WRITE with String]
}
