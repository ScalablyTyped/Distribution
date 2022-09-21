package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.clientMod.LanguageClientOptions
import typings.vscodeLanguageclient.clientMod.Middleware
import typings.vscodeLanguageclient.featuresMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  @JSImport("vscode-languageclient", "ProposedFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAll(_client: FeatureClient[Middleware, LanguageClientOptions]): js.Array[
    typings.vscodeLanguageclient.featuresMod.StaticFeature | typings.vscodeLanguageclient.featuresMod.DynamicFeature[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAll")(_client.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typings.vscodeLanguageclient.featuresMod.StaticFeature | typings.vscodeLanguageclient.featuresMod.DynamicFeature[Any]
  ]]
}
