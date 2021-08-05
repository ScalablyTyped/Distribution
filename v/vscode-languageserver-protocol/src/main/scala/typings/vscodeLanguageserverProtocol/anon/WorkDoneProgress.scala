package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDoneProgress extends StObject {
  
  var workDoneProgress: Boolean
}
object WorkDoneProgress {
  
  inline def apply(workDoneProgress: Boolean): WorkDoneProgress = {
    val __obj = js.Dynamic.literal(workDoneProgress = workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgress]
  }
  
  extension [Self <: WorkDoneProgress](x: Self) {
    
    inline def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
  }
}
