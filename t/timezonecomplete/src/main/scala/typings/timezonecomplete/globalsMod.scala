package typings.timezonecomplete

import typings.timezonecomplete.datetimeMod.DateTime
import typings.timezonecomplete.durationMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete/dist/lib/globals", JSImport.Namespace)
@js.native
object globalsMod extends js.Object {
  
  def abs(d: Duration): Duration = js.native
  
  def max(d1: DateTime, d2: DateTime): DateTime = js.native
  def max(d1: Duration, d2: Duration): Duration = js.native
  
  def min(d1: DateTime, d2: DateTime): DateTime = js.native
  def min(d1: Duration, d2: Duration): Duration = js.native
}
