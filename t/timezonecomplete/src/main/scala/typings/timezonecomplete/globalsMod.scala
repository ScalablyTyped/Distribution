package typings.timezonecomplete

import typings.timezonecomplete.datetimeMod.DateTime
import typings.timezonecomplete.durationMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("timezonecomplete/dist/lib/globals", "abs")
  @js.native
  def abs(d: Duration): Duration = js.native
  
  @JSImport("timezonecomplete/dist/lib/globals", "max")
  @js.native
  def max(d1: DateTime, d2: DateTime): DateTime = js.native
  @JSImport("timezonecomplete/dist/lib/globals", "max")
  @js.native
  def max(d1: Duration, d2: Duration): Duration = js.native
  
  @JSImport("timezonecomplete/dist/lib/globals", "min")
  @js.native
  def min(d1: DateTime, d2: DateTime): DateTime = js.native
  @JSImport("timezonecomplete/dist/lib/globals", "min")
  @js.native
  def min(d1: Duration, d2: Duration): Duration = js.native
}
