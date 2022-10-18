package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "WorkspaceFeature")
@js.native
open class WorkspaceFeature[RO, PR, M] protected ()
  extends typings.vscodeLanguageclient.libCommonFeaturesMod.WorkspaceFeature[RO, PR, M] {
  def this(
    client: FeatureClient[M, js.Object],
    registrationType: typings.vscodeLanguageserverProtocol.mod.RegistrationType[RO]
  ) = this()
}
