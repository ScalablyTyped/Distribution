package typings.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientType extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "ClientType")
@js.native
object ClientType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType & Double] = js.native
  
  @js.native
  sealed trait Regular
    extends StObject
       with ClientType
  /* 0 */ val Regular: typings.ts3NodejsLibrary.libTypesEnumMod.ClientType.Regular & Double = js.native
  
  @js.native
  sealed trait ServerQuery
    extends StObject
       with ClientType
  /* 1 */ val ServerQuery: typings.ts3NodejsLibrary.libTypesEnumMod.ClientType.ServerQuery & Double = js.native
}
