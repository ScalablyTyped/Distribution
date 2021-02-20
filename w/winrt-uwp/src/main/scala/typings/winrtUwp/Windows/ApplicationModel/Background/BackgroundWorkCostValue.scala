package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundWorkCostValue extends StObject
/** Indicates the current cost of doing background work. Used as a hint to background tasks about how much work they can do. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCostValue")
@js.native
object BackgroundWorkCostValue extends StObject {
  
  /** Background resources are under heavy use and the background task should not do any work. */
  @js.native
  sealed trait high extends BackgroundWorkCostValue
  
  /** Background resource usage is low. The background task can do work. */
  @js.native
  sealed trait low extends BackgroundWorkCostValue
  
  /** Background resources are in use, but the background task can do some work. */
  @js.native
  sealed trait medium extends BackgroundWorkCostValue
}
