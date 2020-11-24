package typings.tzFormat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tz-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): String = js.native
  def apply(date: js.UndefOr[scala.Nothing], offset: Double): String = js.native
  def apply(date: Double): String = js.native
  def apply(date: Double, offset: Double): String = js.native
  def apply(date: Date): String = js.native
  def apply(date: Date, offset: Double): String = js.native
}
