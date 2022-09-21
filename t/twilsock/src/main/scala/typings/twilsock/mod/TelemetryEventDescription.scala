package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock", "TelemetryEventDescription")
@js.native
open class TelemetryEventDescription protected () extends StObject {
  def this(title: String, details: String, start: js.Date) = this()
  def this(title: String, details: String, start: js.Date, end: js.Date) = this()
  def this(title: String, details: String, start: js.Date, end: js.Date, `type`: String) = this()
  def this(title: String, details: String, start: js.Date, end: Null, `type`: String) = this()
  def this(title: String, details: String, start: js.Date, end: Unit, `type`: String) = this()
  def this(title: String, details: String, start: js.Date, end: js.Date, `type`: String, id: String) = this()
  def this(title: String, details: String, start: js.Date, end: js.Date, `type`: Unit, id: String) = this()
  def this(title: String, details: String, start: js.Date, end: Null, `type`: String, id: String) = this()
  def this(title: String, details: String, start: js.Date, end: Null, `type`: Unit, id: String) = this()
  def this(title: String, details: String, start: js.Date, end: Unit, `type`: String, id: String) = this()
  def this(title: String, details: String, start: js.Date, end: Unit, `type`: Unit, id: String) = this()
  
  val details: String = js.native
  
  var end: js.UndefOr[js.Date | Null] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val start: js.Date = js.native
  
  val title: String = js.native
  
  // Prepare telemetry event right before sending it.
  // Convert times to relative.
  def toTelemetryEvent(): TelemetryEvent = js.native
  
  val `type`: js.UndefOr[String] = js.native
}
