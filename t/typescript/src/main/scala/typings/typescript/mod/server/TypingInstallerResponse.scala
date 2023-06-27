package typings.typescript.mod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingInstallerResponse extends StObject {
  
  val kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed | ActionWatchTypingLocations
}
object TypingInstallerResponse {
  
  inline def apply(
    kind: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed | ActionWatchTypingLocations
  ): TypingInstallerResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingInstallerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypingInstallerResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(
      value: ActionSet | ActionInvalidate | EventTypesRegistry | ActionPackageInstalled | EventBeginInstallTypes | EventEndInstallTypes | EventInitializationFailed | ActionWatchTypingLocations
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
