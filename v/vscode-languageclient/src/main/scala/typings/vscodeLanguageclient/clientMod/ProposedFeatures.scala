package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.featuresMod.DynamicFeature
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import typings.vscodeLanguageclient.featuresMod.StaticFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  @JSImport("vscode-languageclient/lib/common/client", "ProposedFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAll(_client: FeatureClient[Middleware, LanguageClientOptions]): js.Array[StaticFeature | DynamicFeature[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAll")(_client.asInstanceOf[js.Any]).asInstanceOf[js.Array[StaticFeature | DynamicFeature[Any]]]
}
