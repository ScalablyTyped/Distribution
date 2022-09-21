package typings.vscodeLanguageclient.featuresMod

import typings.std.Map
import typings.vscode.mod.Disposable
import typings.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/common/features", "WorkspaceFeature")
@js.native
abstract class WorkspaceFeature[RO, PR, M] protected ()
  extends StObject
     with DynamicFeature[RO] {
  def this(client: FeatureClient[M, js.Object], registrationType: RegistrationType[RO]) = this()
  
  /* protected */ val _client: FeatureClient[M, js.Object] = js.native
  
  /* private */ val _registrationType: Any = js.native
  
  /* protected */ val _registrations: Map[String, WorkspaceFeatureRegistration[PR]] = js.native
  
  def getProviders(): js.Array[PR] = js.native
  
  /* protected */ def registerLanguageProvider(options: RO): js.Tuple2[Disposable, PR] = js.native
  
  @JSName("registrationType")
  def registrationType_MWorkspaceFeature: RegistrationType[RO] = js.native
}
