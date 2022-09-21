package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "AdaptiveActionContainer")
@js.native
open class AdaptiveActionContainer[T /* <: Action */] () extends ActionContainer[T] {
  
  /* protected */ var dotsItem: Action = js.native
  
  def fit(dimension: Double, dotsItemSize: Double): Unit = js.native
  
  /* protected */ def hiddenItemSelected(item: T): Unit = js.native
  
  def hiddenItemsListModel: ListModel = js.native
  
  var isResponsivenessDisabled: Boolean = js.native
  
  var minVisibleItemsCount: Double = js.native
  
  var responsivityManager: ResponsivityManager = js.native
  
  def setActionsMode(mode: Any): Unit = js.native
}
/* static members */
object AdaptiveActionContainer {
  
  @JSImport("survey-knockout", "AdaptiveActionContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "AdaptiveActionContainer.ContainerID")
  @js.native
  def ContainerID: Double = js.native
  inline def ContainerID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContainerID")(x.asInstanceOf[js.Any])
}
