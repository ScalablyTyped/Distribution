package typings.vscodeLanguageclient.libCommonFeaturesMod

import typings.vscode.mod.TextDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedTextSynchronizationFeature extends StObject {
  
  def handles(textDocument: TextDocument): Boolean
}
object DedicatedTextSynchronizationFeature {
  
  inline def apply(handles: TextDocument => Boolean): DedicatedTextSynchronizationFeature = {
    val __obj = js.Dynamic.literal(handles = js.Any.fromFunction1(handles))
    __obj.asInstanceOf[DedicatedTextSynchronizationFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DedicatedTextSynchronizationFeature] (val x: Self) extends AnyVal {
    
    inline def setHandles(value: TextDocument => Boolean): Self = StObject.set(x, "handles", js.Any.fromFunction1(value))
  }
}
