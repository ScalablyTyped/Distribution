package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLOptions extends StObject {
  
  def addOption(id: String, value: Any): Unit = js.native
  def addOption(id: String, value: Any, show: Boolean): Unit = js.native
  def addOption(id: String, value: Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: String, value: Any, show: Unit, index: Double): Unit = js.native
  def addOption(id: Double, value: Any): Unit = js.native
  def addOption(id: Double, value: Any, show: Boolean): Unit = js.native
  def addOption(id: Double, value: Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: Double, value: Any, show: Unit, index: Double): Unit = js.native
  
  def disableOption(id: String): Unit = js.native
  def disableOption(id: Double): Unit = js.native
  
  def enableOption(id: String): Unit = js.native
  def enableOption(id: Double): Unit = js.native
  
  def getOption(id: String): Any = js.native
  def getOption(id: Double): Any = js.native
  
  def hideOption(id: String): Unit = js.native
  def hideOption(id: Double): Unit = js.native
  
  def optionIndex(ID: String): Double = js.native
  def optionIndex(ID: Double): Double = js.native
  
  def removeOption(id: String): Unit = js.native
  def removeOption(id: Double): Unit = js.native
  
  def showOption(id: String): Unit = js.native
  def showOption(id: Double): Unit = js.native
}
object HTMLOptions {
  
  inline def apply: HTMLOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("HTMLOptions").asInstanceOf[HTMLOptions]
}
