package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApiKeyScope extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "ApiKeyScope")
@js.native
object ApiKeyScope extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApiKeyScope with String] = js.native
  
  @js.native
  sealed trait MANAGE extends ApiKeyScope
  /* "manage" */ val MANAGE: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.MANAGE with String = js.native
  
  @js.native
  sealed trait READ extends ApiKeyScope
  /* "read" */ val READ: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.READ with String = js.native
  
  @js.native
  sealed trait WRITE extends ApiKeyScope
  /* "write" */ val WRITE: typings.ts3NodejsLibrary.enumMod.ApiKeyScope.WRITE with String = js.native
}
