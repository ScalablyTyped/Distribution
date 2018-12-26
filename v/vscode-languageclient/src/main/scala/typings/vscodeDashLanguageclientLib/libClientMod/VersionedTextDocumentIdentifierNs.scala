package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "VersionedTextDocumentIdentifier")
@js.native
object VersionedTextDocumentIdentifierNs extends js.Object {
  /**
       * Creates a new VersionedTextDocumentIdentifier literal.
       * @param uri The document's uri.
       * @param uri The document's text.
       */
  def create(uri: java.lang.String): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  /**
       * Creates a new VersionedTextDocumentIdentifier literal.
       * @param uri The document's uri.
       * @param uri The document's text.
       */
  def create(uri: java.lang.String, version: scala.Double): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier = js.native
  /**
       * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
       */
  def is(value: js.Any): /* is VersionedTextDocumentIdentifier */scala.Boolean = js.native
}

