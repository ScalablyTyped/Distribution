package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress[T] extends StObject {
  
  /**
    * Report a progress update.
    * @param value A progress item, like a message and/or an
    * report on how much work finished
    */
  def report(value: T): Unit = js.native
}
object Progress {
  
  @scala.inline
  def apply[T](report: T => Unit): Progress[T] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[Progress[T]]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress[_], T] (val x: Self with Progress[T]) extends AnyVal {
    
    @scala.inline
    def setReport(value: T => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
  }
}
