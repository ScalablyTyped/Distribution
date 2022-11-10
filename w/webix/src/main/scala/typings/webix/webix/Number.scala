package typings.webix.webix

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
