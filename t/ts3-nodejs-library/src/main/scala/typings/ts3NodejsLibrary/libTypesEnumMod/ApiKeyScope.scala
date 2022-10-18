package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApiKeyScope extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "ApiKeyScope")
@js.native
object ApiKeyScope extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApiKeyScope & String] = js.native
  
  @js.native
  sealed trait MANAGE
    extends StObject
       with ApiKeyScope
  /* "manage" */ val MANAGE: typings.ts3NodejsLibrary.libTypesEnumMod.ApiKeyScope.MANAGE & String = js.native
  
  @js.native
  sealed trait READ
    extends StObject
       with ApiKeyScope
  /* "read" */ val READ: typings.ts3NodejsLibrary.libTypesEnumMod.ApiKeyScope.READ & String = js.native
  
  @js.native
  sealed trait WRITE
    extends StObject
       with ApiKeyScope
  /* "write" */ val WRITE: typings.ts3NodejsLibrary.libTypesEnumMod.ApiKeyScope.WRITE & String = js.native
}
