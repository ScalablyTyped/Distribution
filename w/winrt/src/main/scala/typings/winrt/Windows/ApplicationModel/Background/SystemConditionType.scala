package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SystemConditionType extends StObject
@JSGlobal("Windows.ApplicationModel.Background.SystemConditionType")
@js.native
object SystemConditionType extends StObject {
  
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
