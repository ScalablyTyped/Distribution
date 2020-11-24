package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationType extends js.Object
/**
  * Notification Type
  */
@JSGlobal("umbraco.services.NotificationType")
@js.native
object NotificationType extends js.Object {
  
  @js.native
  sealed trait error extends NotificationType
  
  @js.native
  sealed trait info extends NotificationType
  
  @js.native
  sealed trait success extends NotificationType
  
  @js.native
  sealed trait warning extends NotificationType
}
