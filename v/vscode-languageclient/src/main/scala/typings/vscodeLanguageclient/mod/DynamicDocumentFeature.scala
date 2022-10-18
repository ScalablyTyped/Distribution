package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "DynamicDocumentFeature")
@js.native
open class DynamicDocumentFeature[RO, MW, CO] protected ()
  extends typings.vscodeLanguageclient.libCommonFeaturesMod.DynamicDocumentFeature[RO, MW, CO] {
  def this(client: FeatureClient[MW, CO]) = this()
}
