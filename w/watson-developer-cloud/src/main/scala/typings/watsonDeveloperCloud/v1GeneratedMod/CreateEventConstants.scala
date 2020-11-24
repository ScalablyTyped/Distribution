package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createEvent` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEventConstants")
@js.native
object CreateEventConstants extends js.Object {
  
  @js.native
  sealed trait Type extends js.Object
  /** The event type to be created. */
  @js.native
  object Type extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type with String] = js.native
    
    @js.native
    sealed trait CLICK extends Type
    /* "click" */ @js.native
    object CLICK extends TopLevel[CLICK with String]
  }
}
