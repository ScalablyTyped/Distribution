package typings
package vscodeDashLanguageserverDashProtocolLib.vscodeDashLanguageserverDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "Diagnostic")
@js.native
object DiagnosticNs extends js.Object {
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: java.lang.String,
    source: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: java.lang.String,
    source: java.lang.String,
    relatedInformation: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: scala.Double
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: scala.Double,
    source: java.lang.String
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Creates a new Diagnostic literal.
       */
  def create(
    range: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Range,
    message: java.lang.String,
    severity: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticSeverity,
    code: scala.Double,
    source: java.lang.String,
    relatedInformation: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.DiagnosticRelatedInformation
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
  /**
       * Checks whether the given literal conforms to the [Diagnostic](#Diagnostic) interface.
       */
  def is(value: js.Any): /* is Diagnostic */scala.Boolean = js.native
}

