package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TaskGroup")
@js.native
class TaskGroup protected () extends StObject {
  protected def this(id: String, label: String) = this()
}
/* static members */
object TaskGroup {
  
  @JSImport("vscode", "TaskGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The build task group;
    */
  @JSImport("vscode", "TaskGroup.Build")
  @js.native
  def Build: TaskGroup = js.native
  @scala.inline
  def Build_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Build")(x.asInstanceOf[js.Any])
  
  /**
    * The clean task group;
    */
  @JSImport("vscode", "TaskGroup.Clean")
  @js.native
  def Clean: TaskGroup = js.native
  @scala.inline
  def Clean_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clean")(x.asInstanceOf[js.Any])
  
  /**
    * The rebuild all task group;
    */
  @JSImport("vscode", "TaskGroup.Rebuild")
  @js.native
  def Rebuild: TaskGroup = js.native
  @scala.inline
  def Rebuild_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rebuild")(x.asInstanceOf[js.Any])
  
  /**
    * The test all task group;
    */
  @JSImport("vscode", "TaskGroup.Test")
  @js.native
  def Test: TaskGroup = js.native
  @scala.inline
  def Test_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Test")(x.asInstanceOf[js.Any])
}
