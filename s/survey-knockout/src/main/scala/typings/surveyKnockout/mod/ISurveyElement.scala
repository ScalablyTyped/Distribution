package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyElement
  extends StObject
     with IShortcutText {
  
  var containsErrors: Boolean = js.native
  
  def delete(): Any = js.native
  
  def getTitleToolbar(): AdaptiveActionContainer[Action] = js.native
  
  def getType(): String = js.native
  
  var isPage: Boolean = js.native
  
  var isPanel: Boolean = js.native
  
  var isReadOnly: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  def locStrsChanged(): Any = js.native
  
  var name: String = js.native
  
  def onFirstRendering(): Any = js.native
  
  def onSurveyLoad(): Any = js.native
  
  var parent: IPanel = js.native
  
  def setSurveyImpl(value: ISurveyImpl): Any = js.native
  def setSurveyImpl(value: ISurveyImpl, isLight: Boolean): Any = js.native
  
  def setVisibleIndex(value: Double): Double = js.native
  
  var skeletonComponentName: String = js.native
  
  def stateChangedCallback(): Unit = js.native
  
  def toggleState(): Unit = js.native
}
