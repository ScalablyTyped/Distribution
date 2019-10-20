package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEventConstants.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createEvent` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEventConstants")
@js.native
object CreateEventConstants extends js.Object {
  @js.native
  sealed trait Type extends js.Object
  
  /** The event type to be created. */
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait CLICK extends Type
    
    /* "click" */ val CLICK: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.CreateEventConstants.Type.CLICK with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type with String] = js.native
  }
  
}

