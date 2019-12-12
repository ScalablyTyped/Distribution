package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.TopLevel
import typings.umbraco.umbraco.services.NotificationType.error
import typings.umbraco.umbraco.services.NotificationType.info
import typings.umbraco.umbraco.services.NotificationType.success
import typings.umbraco.umbraco.services.NotificationType.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationType with Double] = js.native
  /* 1 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 3 */ @js.native
  object info extends TopLevel[info with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 2 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

