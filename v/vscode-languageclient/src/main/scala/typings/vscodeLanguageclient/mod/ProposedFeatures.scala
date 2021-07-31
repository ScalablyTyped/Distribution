package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.clientMod.DynamicFeature
import typings.vscodeLanguageclient.clientMod.StaticFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  @JSImport("vscode-languageclient", "ProposedFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createAll(client: typings.vscodeLanguageclient.clientMod.BaseLanguageClient): js.Array[StaticFeature | DynamicFeature[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAll")(client.asInstanceOf[js.Any]).asInstanceOf[js.Array[StaticFeature | DynamicFeature[js.Any]]]
}
