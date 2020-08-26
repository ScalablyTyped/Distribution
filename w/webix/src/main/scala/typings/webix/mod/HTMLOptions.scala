package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOptions extends js.Object {
  def addOption(id: String, value: js.Any): Unit = js.native
  def addOption(id: String, value: js.Any, show: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def addOption(id: String, value: js.Any, show: Boolean): Unit = js.native
  def addOption(id: String, value: js.Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: Double, value: js.Any): Unit = js.native
  def addOption(id: Double, value: js.Any, show: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
  def addOption(id: Double, value: js.Any, show: Boolean): Unit = js.native
  def addOption(id: Double, value: js.Any, show: Boolean, index: Double): Unit = js.native
  def disableOption(id: String): Unit = js.native
  def disableOption(id: Double): Unit = js.native
  def enableOption(id: String): Unit = js.native
  def enableOption(id: Double): Unit = js.native
  def getOption(id: String): js.Any = js.native
  def getOption(id: Double): js.Any = js.native
  def hideOption(id: String): Unit = js.native
  def hideOption(id: Double): Unit = js.native
  def optionIndex(ID: String): Double = js.native
  def optionIndex(ID: Double): Double = js.native
  def removeOption(id: String): Unit = js.native
  def removeOption(id: Double): Unit = js.native
  def showOption(id: String): Unit = js.native
  def showOption(id: Double): Unit = js.native
}

@JSImport("webix", "HTMLOptions")
@js.native
object HTMLOptions extends TopLevel[HTMLOptions]

