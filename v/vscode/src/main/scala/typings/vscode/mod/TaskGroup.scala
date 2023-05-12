package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TaskGroup")
@js.native
open class TaskGroup protected () extends StObject {
  /* private */ def this(id: String, label: String) = this()
  
  /**
  		 * The ID of the task group. Is one of TaskGroup.Clean.id, TaskGroup.Build.id, TaskGroup.Rebuild.id, or TaskGroup.Test.id.
  		 */
  val id: String = js.native
  
  /**
  		 * Whether the task that is part of this group is the default for the group.
  		 * This property cannot be set through API, and is controlled by a user's task configurations.
  		 */
  val isDefault: js.UndefOr[Boolean] = js.native
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
  inline def Build_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Build")(x.asInstanceOf[js.Any])
  
  /**
  		 * The clean task group;
  		 */
  @JSImport("vscode", "TaskGroup.Clean")
  @js.native
  def Clean: TaskGroup = js.native
  inline def Clean_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clean")(x.asInstanceOf[js.Any])
  
  /**
  		 * The rebuild all task group;
  		 */
  @JSImport("vscode", "TaskGroup.Rebuild")
  @js.native
  def Rebuild: TaskGroup = js.native
  inline def Rebuild_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rebuild")(x.asInstanceOf[js.Any])
  
  /**
  		 * The test all task group;
  		 */
  @JSImport("vscode", "TaskGroup.Test")
  @js.native
  def Test: TaskGroup = js.native
  inline def Test_=(x: TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Test")(x.asInstanceOf[js.Any])
}
