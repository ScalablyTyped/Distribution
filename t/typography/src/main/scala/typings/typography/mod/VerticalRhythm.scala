package typings.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalRhythm extends js.Object {
  
  def adjustFontSizeTo(): js.Object = js.native
  def adjustFontSizeTo(value: String): js.Object = js.native
  def adjustFontSizeTo(value: Double): js.Object = js.native
  
  def establishBaseline(): BaseLine = js.native
  
  def linesForFontSize(fontSize: Double): Double = js.native
  
  def rhythm(value: Double): String = js.native
  
  def scale(value: Double): BaseLine = js.native
}
