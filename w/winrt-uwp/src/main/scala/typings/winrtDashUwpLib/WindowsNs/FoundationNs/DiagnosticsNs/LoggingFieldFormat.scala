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
  
  val boolean: boolean with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val fileTime: fileTime with java.lang.String = js.native
  val hexadecimal: hexadecimal with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val hresult: hresult with java.lang.String = js.native
  val ipv4Address: ipv4Address with java.lang.String = js.native
  val ipv6Address: ipv6Address with java.lang.String = js.native
  val json: json with java.lang.String = js.native
  val ntStatus: ntStatus with java.lang.String = js.native
  val port: port with java.lang.String = js.native
  val processId: processId with java.lang.String = js.native
  val signed: signed with java.lang.String = js.native
  val socketAddress: socketAddress with java.lang.String = js.native
  val string: string with java.lang.String = js.native
  val threadId: threadId with java.lang.String = js.native
  val unsigned: unsigned with java.lang.String = js.native
  val win32Error: win32Error with java.lang.String = js.native
  val xml: xml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingFieldFormat with java.lang.String
  ] = js.native
}

