package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  def dispose(): Any
}
object Dispose {
  
  inline def apply(dispose: () => Any): Dispose = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setDispose(value: () => Any): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
