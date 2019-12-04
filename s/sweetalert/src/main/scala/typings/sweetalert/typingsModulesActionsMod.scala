package typings.sweetalert

import typings.sweetalert.typingsModulesStateMod.SwalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sweetalert/typings/modules/actions", JSImport.Namespace)
@js.native
object typingsModulesActionsMod extends js.Object {
  def getState(): SwalState = js.native
  def onAction(): Unit = js.native
  def onAction(namespace: String): Unit = js.native
  def openModal(): Unit = js.native
  def stopLoading(): Unit = js.native
}

