package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.libCommonClientMod.LanguageClientOptions
import typings.vscodeLanguageclient.libCommonClientMod.Middleware
import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  @JSImport("vscode-languageclient", "ProposedFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAll(_client: FeatureClient[Middleware, LanguageClientOptions]): js.Array[
    typings.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature | typings.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAll")(_client.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typings.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature | typings.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature[Any]
  ]]
}
