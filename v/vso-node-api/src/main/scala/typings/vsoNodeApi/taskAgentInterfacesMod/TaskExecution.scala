package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskExecution extends js.Object {
  /**
    * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
    */
  var execTask: TaskReference = js.native
  /**
    * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } net20: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } java: { jar: "powershelltask.tasks.automation.teamfoundation.microsoft.com", } node: { script: "powershellhost.js", }
    */
  var platformInstructions: StringDictionary[StringDictionary[String]] = js.native
}

object TaskExecution {
  @scala.inline
  def apply(execTask: TaskReference, platformInstructions: StringDictionary[StringDictionary[String]]): TaskExecution = {
    val __obj = js.Dynamic.literal(execTask = execTask.asInstanceOf[js.Any], platformInstructions = platformInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskExecution]
  }
  @scala.inline
  implicit class TaskExecutionOps[Self <: TaskExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecTask(value: TaskReference): Self = this.set("execTask", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformInstructions(value: StringDictionary[StringDictionary[String]]): Self = this.set("platformInstructions", value.asInstanceOf[js.Any])
  }
  
}

