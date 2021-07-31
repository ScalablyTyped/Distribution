package typings.timezonecomplete

import typings.timezonecomplete.datetimeMod.DateTime
import typings.timezonecomplete.durationMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalsMod {
  
  @JSImport("timezonecomplete/dist/lib/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def abs(d: Duration): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(d.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  @scala.inline
  def max(d1: DateTime, d2: DateTime): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  @scala.inline
  def max(d1: Duration, d2: Duration): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  @scala.inline
  def min(d1: DateTime, d2: DateTime): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[DateTime]
  @scala.inline
  def min(d1: Duration, d2: Duration): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[Duration]
}
