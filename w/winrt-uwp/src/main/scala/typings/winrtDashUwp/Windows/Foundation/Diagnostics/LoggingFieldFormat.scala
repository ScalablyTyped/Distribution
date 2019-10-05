package typings.winrtDashUwp.Windows.Foundation.Diagnostics

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
  
  /* 3 */ val boolean: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.boolean with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.default with Double = js.native
  /* 16 */ val fileTime: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.fileTime with Double = js.native
  /* 4 */ val hexadecimal: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hexadecimal with Double = js.native
  /* 1 */ val hidden: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hidden with Double = js.native
  /* 15 */ val hresult: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.hresult with Double = js.native
  /* 8 */ val ipv4Address: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv4Address with Double = js.native
  /* 9 */ val ipv6Address: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ipv6Address with Double = js.native
  /* 12 */ val json: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.json with Double = js.native
  /* 14 */ val ntStatus: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.ntStatus with Double = js.native
  /* 7 */ val port: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.port with Double = js.native
  /* 5 */ val processId: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.processId with Double = js.native
  /* 17 */ val signed: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.signed with Double = js.native
  /* 10 */ val socketAddress: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.socketAddress with Double = js.native
  /* 2 */ val string: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.string with Double = js.native
  /* 6 */ val threadId: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.threadId with Double = js.native
  /* 18 */ val unsigned: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.unsigned with Double = js.native
  /* 13 */ val win32Error: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.win32Error with Double = js.native
  /* 11 */ val xml: typings.winrtDashUwp.Windows.Foundation.Diagnostics.LoggingFieldFormat.xml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingFieldFormat with Double] = js.native
}

