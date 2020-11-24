package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationControlLaunchMode extends js.Object
@JSImport("tizen-common-web/application", "ApplicationControlLaunchMode")
@js.native
object ApplicationControlLaunchMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplicationControlLaunchMode with String] = js.native
  
  @js.native
  sealed trait GROUP extends ApplicationControlLaunchMode
  /* "GROUP" */ @js.native
  object GROUP extends TopLevel[GROUP with String]
  
  @js.native
  sealed trait SINGLE extends ApplicationControlLaunchMode
  /* "SINGLE" */ @js.native
  object SINGLE extends TopLevel[SINGLE with String]
}
