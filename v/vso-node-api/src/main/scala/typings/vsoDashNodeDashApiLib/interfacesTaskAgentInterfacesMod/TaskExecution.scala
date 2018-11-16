package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskExecution extends js.Object {
  /**
       * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
       */
  var execTask: TaskReference
  /**
       * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } net20: { typeName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask", assemblyName: "Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll" } java: { jar: "powershelltask.tasks.automation.teamfoundation.microsoft.com", } node: { script: "powershellhost.js", }
       */
  var platformInstructions: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[java.lang.String]]
}

