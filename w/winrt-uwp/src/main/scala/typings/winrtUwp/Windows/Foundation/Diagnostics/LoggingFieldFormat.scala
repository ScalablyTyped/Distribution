package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoggingFieldFormat extends StObject
/** Specifies the format of an event field. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingFieldFormat")
@js.native
object LoggingFieldFormat extends StObject {
  
  /** No format is specified. */
  @js.native
  sealed trait default
    extends StObject
       with LoggingFieldFormat
  
  /** A boolean field. */
  @js.native
  sealed trait boolean
    extends StObject
       with LoggingFieldFormat
  
  /** A 64-bit FILETIME value. */
  @js.native
  sealed trait fileTime
    extends StObject
       with LoggingFieldFormat
  
  /** A hexadecimal field. */
  @js.native
  sealed trait hexadecimal
    extends StObject
       with LoggingFieldFormat
  
  /** The field is hidden. */
  @js.native
  sealed trait hidden
    extends StObject
       with LoggingFieldFormat
  
  /** A 32-bit Windows HRESULT value. */
  @js.native
  sealed trait hresult
    extends StObject
       with LoggingFieldFormat
  
  /** An Internet Protocol version 4 (IPv4) field. */
  @js.native
  sealed trait ipv4Address
    extends StObject
       with LoggingFieldFormat
  
  /** An Internet Protocol version 6 (IPv6) field. */
  @js.native
  sealed trait ipv6Address
    extends StObject
       with LoggingFieldFormat
  
  /** A JavaScript Object Notation (JSON) field. */
  @js.native
  sealed trait json
    extends StObject
       with LoggingFieldFormat
  
  /** A 32-bit Windows NTSTATUS value. */
  @js.native
  sealed trait ntStatus
    extends StObject
       with LoggingFieldFormat
  
  /** A port number field. */
  @js.native
  sealed trait port
    extends StObject
       with LoggingFieldFormat
  
  /** A process identifier field. */
  @js.native
  sealed trait processId
    extends StObject
       with LoggingFieldFormat
  
  /** A signed value. */
  @js.native
  sealed trait signed
    extends StObject
       with LoggingFieldFormat
  
  /** A socket address field. */
  @js.native
  sealed trait socketAddress
    extends StObject
       with LoggingFieldFormat
  
  /** The field contains a MBCS (8-bit character) string. */
  @js.native
  sealed trait string
    extends StObject
       with LoggingFieldFormat
  
  /** A thread identifier field. */
  @js.native
  sealed trait threadId
    extends StObject
       with LoggingFieldFormat
  
  /** An unsigned value. */
  @js.native
  sealed trait unsigned
    extends StObject
       with LoggingFieldFormat
  
  /** A 32-bit Win32 error code. */
  @js.native
  sealed trait win32Error
    extends StObject
       with LoggingFieldFormat
  
  /** An Extensible Markup Language (XML) field. */
  @js.native
  sealed trait xml
    extends StObject
       with LoggingFieldFormat
}
