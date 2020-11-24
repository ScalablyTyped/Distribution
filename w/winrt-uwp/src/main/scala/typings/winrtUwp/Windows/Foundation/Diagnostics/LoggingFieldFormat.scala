package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
