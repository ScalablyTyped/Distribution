package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

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
  sealed trait boolean
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** No format is specified. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A 64-bit FILETIME value. */
  @js.native
  sealed trait fileTime
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A hexadecimal field. */
  @js.native
  sealed trait hexadecimal
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** The field is hidden. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A 32-bit Windows HRESULT value. */
  @js.native
  sealed trait hresult
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** An Internet Protocol version 4 (IPv4) field. */
  @js.native
  sealed trait ipv4Address
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** An Internet Protocol version 6 (IPv6) field. */
  @js.native
  sealed trait ipv6Address
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A JavaScript Object Notation (JSON) field. */
  @js.native
  sealed trait json
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A 32-bit Windows NTSTATUS value. */
  @js.native
  sealed trait ntStatus
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A port number field. */
  @js.native
  sealed trait port
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A process identifier field. */
  @js.native
  sealed trait processId
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A signed value. */
  @js.native
  sealed trait signed
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A socket address field. */
  @js.native
  sealed trait socketAddress
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** The field contains a MBCS (8-bit character) string. */
  @js.native
  sealed trait string
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A thread identifier field. */
  @js.native
  sealed trait threadId
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** An unsigned value. */
  @js.native
  sealed trait unsigned
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** A 32-bit Win32 error code. */
  @js.native
  sealed trait win32Error
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /** An Extensible Markup Language (XML) field. */
  @js.native
  sealed trait xml
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat
  
  /* 3 */ val boolean: boolean with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 16 */ val fileTime: fileTime with scala.Double = js.native
  /* 4 */ val hexadecimal: hexadecimal with scala.Double = js.native
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 15 */ val hresult: hresult with scala.Double = js.native
  /* 8 */ val ipv4Address: ipv4Address with scala.Double = js.native
  /* 9 */ val ipv6Address: ipv6Address with scala.Double = js.native
  /* 12 */ val json: json with scala.Double = js.native
  /* 14 */ val ntStatus: ntStatus with scala.Double = js.native
  /* 7 */ val port: port with scala.Double = js.native
  /* 5 */ val processId: processId with scala.Double = js.native
  /* 17 */ val signed: signed with scala.Double = js.native
  /* 10 */ val socketAddress: socketAddress with scala.Double = js.native
  /* 2 */ val string: string with scala.Double = js.native
  /* 6 */ val threadId: threadId with scala.Double = js.native
  /* 18 */ val unsigned: unsigned with scala.Double = js.native
  /* 13 */ val win32Error: win32Error with scala.Double = js.native
  /* 11 */ val xml: xml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat with scala.Double
  ] = js.native
}

