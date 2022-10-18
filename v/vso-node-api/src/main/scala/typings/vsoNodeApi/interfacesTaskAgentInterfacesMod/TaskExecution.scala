package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskExecution extends StObject {
  
  /**
    * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
    */
  var execTask: TaskReference
  
  /**
    * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } net20: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } java: { jar: "powershelltask.tasks.automation.teamfoundation.microsoft.com", } node: { script: "powershellhost.js", }
    */
  var platformInstructions: StringDictionary[StringDictionary[String]]
}
object TaskExecution {
  
  inline def apply(execTask: TaskReference, platformInstructions: StringDictionary[StringDictionary[String]]): TaskExecution = {
    val __obj = js.Dynamic.literal(execTask = execTask.asInstanceOf[js.Any], platformInstructions = platformInstructions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskExecution]
  }
  
  extension [Self <: TaskExecution](x: Self) {
    
    inline def setExecTask(value: TaskReference): Self = StObject.set(x, "execTask", value.asInstanceOf[js.Any])
    
    inline def setPlatformInstructions(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "platformInstructions", value.asInstanceOf[js.Any])
  }
}
