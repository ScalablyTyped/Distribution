package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.boolean
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.default
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.fileTime
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hexadecimal
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hidden
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hresult
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv4Address
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv6Address
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.json
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ntStatus
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.port
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.processId
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.signed
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.socketAddress
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.string
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.threadId
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.unsigned
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.win32Error
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggingFieldFormat extends js.Object

/** Specifies the format of an event field. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingFieldFormat")
@js.native
object LoggingFieldFormat extends js.Object {
  /** A boolean field. */
  @js.native
  sealed trait boolean extends LoggingFieldFormat
  
  /** No format is specified. */
  @js.native
  sealed trait default extends LoggingFieldFormat
  
  /** A 64-bit FILETIME value. */
  @js.native
  sealed trait fileTime extends LoggingFieldFormat
  
  /** A hexadecimal field. */
  @js.native
  sealed trait hexadecimal extends LoggingFieldFormat
  
  /** The field is hidden. */
  @js.native
  sealed trait hidden extends LoggingFieldFormat
  
  /** A 32-bit Windows HRESULT value. */
  @js.native
  sealed trait hresult extends LoggingFieldFormat
  
  /** An Internet Protocol version 4 (IPv4) field. */
  @js.native
  sealed trait ipv4Address extends LoggingFieldFormat
  
  /** An Internet Protocol version 6 (IPv6) field. */
  @js.native
  sealed trait ipv6Address extends LoggingFieldFormat
  
  /** A JavaScript Object Notation (JSON) field. */
  @js.native
  sealed trait json extends LoggingFieldFormat
  
  /** A 32-bit Windows NTSTATUS value. */
  @js.native
  sealed trait ntStatus extends LoggingFieldFormat
  
  /** A port number field. */
  @js.native
  sealed trait port extends LoggingFieldFormat
  
  /** A process identifier field. */
  @js.native
  sealed trait processId extends LoggingFieldFormat
  
  /** A signed value. */
  @js.native
  sealed trait signed extends LoggingFieldFormat
  
  /** A socket address field. */
  @js.native
  sealed trait socketAddress extends LoggingFieldFormat
  
  /** The field contains a MBCS (8-bit character) string. */
  @js.native
  sealed trait string extends LoggingFieldFormat
  
  /** A thread identifier field. */
  @js.native
  sealed trait threadId extends LoggingFieldFormat
  
  /** An unsigned value. */
  @js.native
  sealed trait unsigned extends LoggingFieldFormat
  
  /** A 32-bit Win32 error code. */
  @js.native
  sealed trait win32Error extends LoggingFieldFormat
  
  /** An Extensible Markup Language (XML) field. */
  @js.native
  sealed trait xml extends LoggingFieldFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingFieldFormat with Double] = js.native
  /* 3 */ @js.native
  object boolean extends TopLevel[boolean with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 16 */ @js.native
  object fileTime extends TopLevel[fileTime with Double]
  
  /* 4 */ @js.native
  object hexadecimal extends TopLevel[hexadecimal with Double]
  
  /* 1 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 15 */ @js.native
  object hresult extends TopLevel[hresult with Double]
  
  /* 8 */ @js.native
  object ipv4Address extends TopLevel[ipv4Address with Double]
  
  /* 9 */ @js.native
  object ipv6Address extends TopLevel[ipv6Address with Double]
  
  /* 12 */ @js.native
  object json extends TopLevel[json with Double]
  
  /* 14 */ @js.native
  object ntStatus extends TopLevel[ntStatus with Double]
  
  /* 7 */ @js.native
  object port extends TopLevel[port with Double]
  
  /* 5 */ @js.native
  object processId extends TopLevel[processId with Double]
  
  /* 17 */ @js.native
  object signed extends TopLevel[signed with Double]
  
  /* 10 */ @js.native
  object socketAddress extends TopLevel[socketAddress with Double]
  
  /* 2 */ @js.native
  object string extends TopLevel[string with Double]
  
  /* 6 */ @js.native
  object threadId extends TopLevel[threadId with Double]
  
  /* 18 */ @js.native
  object unsigned extends TopLevel[unsigned with Double]
  
  /* 13 */ @js.native
  object win32Error extends TopLevel[win32Error with Double]
  
  /* 11 */ @js.native
  object xml extends TopLevel[xml with Double]
  
}

