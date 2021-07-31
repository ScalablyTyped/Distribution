package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationType extends StObject
/**
  * Notification Type
  */
@JSGlobal("umbraco.services.NotificationType")
@js.native
object NotificationType extends StObject {
  
  @js.native
  sealed trait error
    extends StObject
       with NotificationType
  
  @js.native
  sealed trait info
    extends StObject
       with NotificationType
  
  @js.native
  sealed trait success
    extends StObject
       with NotificationType
  
  @js.native
  sealed trait warning
    extends StObject
       with NotificationType
}
