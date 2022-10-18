package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createEvent` operation. */
object CreateEventConstants {
  
  @js.native
  sealed trait Type extends StObject
  /** The event type to be created. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEventConstants.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type & String] = js.native
    
    @js.native
    sealed trait CLICK
      extends StObject
         with Type
    /* "click" */ val CLICK: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.CreateEventConstants.Type.CLICK & String = js.native
  }
}
