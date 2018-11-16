package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnityMessagingIndicator extends js.Object {
  // This is suppose to be readonly, but i'm not sure how to do this
  // in a definition file.
  var presence: java.lang.String
  def addAction(name: java.lang.String, onActionInvoked: js.Function): js.Any
  def clearIndicator(name: java.lang.String): js.Any
  def clearIndicators(): js.Any
  def onPresenceChanged(onPresenceChanged: js.Function): js.Any
  def removeAction(name: java.lang.String): js.Any
  def removeActions(): js.Any
  def showIndicator(name: java.lang.String, indicatorProperties: UnityIndicatorProperties): js.Any
}

