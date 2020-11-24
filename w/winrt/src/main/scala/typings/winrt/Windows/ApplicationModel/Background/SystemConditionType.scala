package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemConditionType extends js.Object
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends js.Object {
  
  @js.native
  sealed trait internetAvailable extends SystemConditionType
  
  @js.native
  sealed trait internetNotAvailable extends SystemConditionType
  
  @js.native
  sealed trait invalid extends SystemConditionType
  
  @js.native
  sealed trait sessionConnected extends SystemConditionType
  
  @js.native
  sealed trait sessionDisconnected extends SystemConditionType
  
  @js.native
  sealed trait userNotPresent extends SystemConditionType
  
  @js.native
  sealed trait userPresent extends SystemConditionType
}
