package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientType extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "ClientType")
@js.native
object ClientType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType with Double] = js.native
  
  @js.native
  sealed trait Regular extends ClientType
  /* 0 */ val Regular: typings.ts3NodejsLibrary.enumMod.ClientType.Regular with Double = js.native
  
  @js.native
  sealed trait ServerQuery extends ClientType
  /* 1 */ val ServerQuery: typings.ts3NodejsLibrary.enumMod.ClientType.ServerQuery with Double = js.native
}
