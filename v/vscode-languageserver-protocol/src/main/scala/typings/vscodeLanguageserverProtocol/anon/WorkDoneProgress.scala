package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDoneProgress extends StObject {
  
  var workDoneProgress: Boolean
}
object WorkDoneProgress {
  
  @scala.inline
  def apply(workDoneProgress: Boolean): WorkDoneProgress = {
    val __obj = js.Dynamic.literal(workDoneProgress = workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgress]
  }
  
  @scala.inline
  implicit class WorkDoneProgressMutableBuilder[Self <: WorkDoneProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkDoneProgress(value: Boolean): Self = StObject.set(x, "workDoneProgress", value.asInstanceOf[js.Any])
  }
}
