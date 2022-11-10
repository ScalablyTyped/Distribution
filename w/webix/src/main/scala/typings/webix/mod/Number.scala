package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  def format(value: Double): String = js.native
  def format(value: Double, config: obj): String = js.native
  
  def getConfig(format: String): obj = js.native
  
  def numToStr(config: obj): WebixCallback = js.native
  
  def parse(value: String, config: obj): Double = js.native
}
object Number {
  
  inline def apply: Number = ^.asInstanceOf[js.Dynamic].selectDynamic("Number").asInstanceOf[Number]
}
