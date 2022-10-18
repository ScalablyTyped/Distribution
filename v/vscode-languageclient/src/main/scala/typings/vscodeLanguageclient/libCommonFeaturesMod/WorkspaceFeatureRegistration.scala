package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFeatureRegistration[PR] extends StObject {
  
  var disposable: Disposable
  
  var provider: PR
}
object WorkspaceFeatureRegistration {
  
  inline def apply[PR](disposable: Disposable, provider: PR): WorkspaceFeatureRegistration[PR] = {
    val __obj = js.Dynamic.literal(disposable = disposable.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFeatureRegistration[PR]]
  }
  
  extension [Self <: WorkspaceFeatureRegistration[?], PR](x: Self & WorkspaceFeatureRegistration[PR]) {
    
    inline def setDisposable(value: Disposable): Self = StObject.set(x, "disposable", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: PR): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
