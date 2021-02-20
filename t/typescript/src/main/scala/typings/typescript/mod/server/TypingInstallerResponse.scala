package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypingInstallerResponse extends StObject {
  
  val kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed = js.native
}
object TypingInstallerResponse {
  
  @scala.inline
  def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
  ): TypingInstallerResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerResponse]
  }
  
  @scala.inline
  implicit class TypingInstallerResponseMutableBuilder[Self <: TypingInstallerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(
      value: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
