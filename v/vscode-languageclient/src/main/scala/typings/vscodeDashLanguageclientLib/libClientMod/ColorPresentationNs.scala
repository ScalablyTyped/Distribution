package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorPresentation")
@js.native
object ColorPresentationNs extends js.Object {
  /**
       * Creates a new ColorInformation literal.
       */
  def create(label: java.lang.String): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation = js.native
  /**
       * Creates a new ColorInformation literal.
       */
  def create(
    label: java.lang.String,
    textEdit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation = js.native
  /**
       * Creates a new ColorInformation literal.
       */
  def create(
    label: java.lang.String,
    textEdit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit,
    additionalTextEdits: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextEdit
    ]
  ): vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ColorPresentation = js.native
  /**
       * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
       */
  def is(value: js.Any): /* is ColorPresentation */scala.Boolean = js.native
}

