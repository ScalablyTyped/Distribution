package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskFilter extends StObject {
  
  /**
    * The task type to return;
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The task version as used in the tasks.json file.
    * The string support the package.json semver notation.
    */
  var version: js.UndefOr[String] = js.native
}
object TaskFilter {
  
  @scala.inline
  def apply(): TaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskFilter]
  }
  
  @scala.inline
  implicit class TaskFilterMutableBuilder[Self <: TaskFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
