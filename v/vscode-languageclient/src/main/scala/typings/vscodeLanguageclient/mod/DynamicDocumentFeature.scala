package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.featuresMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "DynamicDocumentFeature")
@js.native
abstract class DynamicDocumentFeature[RO, MW, CO] protected ()
  extends typings.vscodeLanguageclient.featuresMod.DynamicDocumentFeature[RO, MW, CO] {
  def this(client: FeatureClient[MW, CO]) = this()
}
