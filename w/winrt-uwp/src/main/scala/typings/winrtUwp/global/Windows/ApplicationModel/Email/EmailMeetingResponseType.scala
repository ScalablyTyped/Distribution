package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the type of response to a meeting request. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMeetingResponseType")
@js.native
object EmailMeetingResponseType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingResponseType & Double
  ] = js.native
  
  /* 0 */ val accept: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingResponseType.accept & Double = js.native
  
  /* 1 */ val decline: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingResponseType.decline & Double = js.native
  
  /* 2 */ val tentative: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMeetingResponseType.tentative & Double = js.native
}
