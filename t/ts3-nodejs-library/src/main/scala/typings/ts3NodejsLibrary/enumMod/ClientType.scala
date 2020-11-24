package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientType extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "ClientType")
@js.native
object ClientType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientType with Double] = js.native
  
  @js.native
  sealed trait Regular extends ClientType
  /* 0 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
  @js.native
  sealed trait ServerQuery extends ClientType
  /* 1 */ @js.native
  object ServerQuery extends TopLevel[ServerQuery with Double]
}
