package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.featuresMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "WorkspaceFeature")
@js.native
abstract class WorkspaceFeature[RO, PR, M] protected ()
  extends typings.vscodeLanguageclient.featuresMod.WorkspaceFeature[RO, PR, M] {
  def this(
    client: FeatureClient[M, js.Object],
    registrationType: typings.vscodeLanguageserverProtocol.mod.RegistrationType[RO]
  ) = this()
}
