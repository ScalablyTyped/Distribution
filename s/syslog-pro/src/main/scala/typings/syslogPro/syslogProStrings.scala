package typings.syslogPro

import typings.syslogPro.mod.CEF.Severity
import typings.syslogPro.mod.CEF.SeverityString
import typings.syslogPro.mod.Syslog.Format
import typings.syslogPro.mod.Syslog.Protocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syslogProStrings {
  
  @js.native
  sealed trait `-_` extends StObject
  inline def `-_`: `-_` = "-".asInstanceOf[`-_`]
  
  @js.native
  sealed trait High
    extends StObject
       with Severity
       with SeverityString
  inline def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait Low
    extends StObject
       with Severity
       with SeverityString
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Medium
    extends StObject
       with Severity
       with SeverityString
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with Severity
       with SeverityString
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait `Very-High`
    extends StObject
       with Severity
       with SeverityString
  inline def `Very-High`: `Very-High` = "Very-High".asInstanceOf[`Very-High`]
  
  @js.native
  sealed trait cef
    extends StObject
       with Format
  inline def cef: cef = "cef".asInstanceOf[cef]
  
  @js.native
  sealed trait leef
    extends StObject
       with Format
  inline def leef: leef = "leef".asInstanceOf[leef]
  
  @js.native
  sealed trait none
    extends StObject
       with Format
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait rfc3164
    extends StObject
       with Format
  inline def rfc3164: rfc3164 = "rfc3164".asInstanceOf[rfc3164]
  
  @js.native
  sealed trait rfc5424
    extends StObject
       with Format
  inline def rfc5424: rfc5424 = "rfc5424".asInstanceOf[rfc5424]
  
  @js.native
  sealed trait tcp
    extends StObject
       with Protocol
  inline def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait tls
    extends StObject
       with Protocol
  inline def tls: tls = "tls".asInstanceOf[tls]
  
  @js.native
  sealed trait udp
    extends StObject
       with Protocol
  inline def udp: udp = "udp".asInstanceOf[udp]
}
