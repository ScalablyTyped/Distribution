package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.anon.DateOrDeltaHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
/* note: abstract class */ @JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
@js.native
open class HttpDateOrDeltaHeaderValue ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue {
  
  /** Gets the value of the HTTP-date information used in the Retry-After HTTP header. */
  /* CompleteClass */
  var date: js.Date = js.native
  
  /** Gets the value of the delta-seconds information used in the Retry-After HTTP header. */
  /* CompleteClass */
  var delta: Double = js.native
}
object HttpDateOrDeltaHeaderValue {
  
  @JSGlobal("Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a string to an HttpDateOrDeltaHeaderValue instance.
    * @param input A string that represents the HTTP-date or delta-seconds information in the Retry-After HTTP header.
    * @return An HttpDateOrDeltaHeaderValue instance.
    */
  /* static member */
  inline def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue]
  
  /**
    * Determines whether a string is valid HttpDateOrDeltaHeaderValue information.
    * @param input The string to validate.
    */
  /* static member */
  inline def tryParse(input: String): DateOrDeltaHeaderValue = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[DateOrDeltaHeaderValue]
}
