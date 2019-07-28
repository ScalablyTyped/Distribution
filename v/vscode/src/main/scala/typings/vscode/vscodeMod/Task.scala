package typings.vscode.vscodeMod

import typings.vscode.vscodeMod.TaskScope.Global
import typings.vscode.vscodeMod.TaskScope.Workspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Task")
@js.native
class Task protected () extends js.Object {
  /**
  		 * ~~Creates a new task.~~
  		 *
  		 * @deprecated Use the new constructors that allow specifying a scope for the task.
  		 *
  		 * @param definition The task definition as defined in the taskDefinitions extension point.
  		 * @param name The task's name. Is presented in the user interface.
  		 * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
  		 * @param execution The process or shell execution.
  		 * @param problemMatchers the names of problem matchers to use, like '$tsc'
  		 *  or '$eslint'. Problem matchers can be contributed by an extension using
  		 *  the `problemMatchers` extension point.
  		 */
  def this(taskDefinition: TaskDefinition, name: String, source: String) = this()
  def this(taskDefinition: TaskDefinition, name: String, source: String, execution: ProcessExecution) = this()
  def this(taskDefinition: TaskDefinition, name: String, source: String, execution: ShellExecution) = this()
  def this(taskDefinition: TaskDefinition, scope: Global, name: String, source: String) = this()
  def this(taskDefinition: TaskDefinition, scope: Workspace, name: String, source: String) = this()
  /**
  		 * Creates a new task.
  		 *
  		 * @param definition The task definition as defined in the taskDefinitions extension point.
  		 * @param scope Specifies the task's scope. It is either a global or a workspace task or a task for a specific workspace folder.
  		 * @param name The task's name. Is presented in the user interface.
  		 * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
  		 * @param execution The process or shell execution.
  		 * @param problemMatchers the names of problem matchers to use, like '$tsc'
  		 *  or '$eslint'. Problem matchers can be contributed by an extension using
  		 *  the `problemMatchers` extension point.
  		 */
  def this(taskDefinition: TaskDefinition, scope: WorkspaceFolder, name: String, source: String) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ProcessExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ShellExecution
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Global,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: Workspace,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ProcessExecution,
    problemMatchers: js.Array[String]
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: String
  ) = this()
  def this(
    taskDefinition: TaskDefinition,
    scope: WorkspaceFolder,
    name: String,
    source: String,
    execution: ShellExecution,
    problemMatchers: js.Array[String]
  ) = this()
  /**
  		 * The task's definition.
  		 */
  var definition: TaskDefinition = js.native
  /**
  		 * The task's execution engine
  		 */
  var execution: js.UndefOr[ProcessExecution | ShellExecution] = js.native
  /**
  		 * The task group this tasks belongs to. See TaskGroup
  		 * for a predefined set of available groups.
  		 * Defaults to undefined meaning that the task doesn't
  		 * belong to any special group.
  		 */
  var group: js.UndefOr[TaskGroup] = js.native
  /**
  		 * Whether the task is a background task or not.
  		 */
  var isBackground: Boolean = js.native
  /**
  		 * The task's name
  		 */
  var name: String = js.native
  /**
  		 * The presentation options. Defaults to an empty literal.
  		 */
  var presentationOptions: TaskPresentationOptions = js.native
  /**
  		 * The problem matchers attached to the task. Defaults to an empty
  		 * array.
  		 */
  var problemMatchers: js.Array[String] = js.native
  /**
  		 * Run options for the task
  		 */
  var runOptions: RunOptions = js.native
  /**
  		 * The task's scope.
  		 */
  val scope: js.UndefOr[Global | Workspace | WorkspaceFolder] = js.native
  /**
  		 * A human-readable string describing the source of this
  		 * shell task, e.g. 'gulp' or 'npm'.
  		 */
  var source: String = js.native
}

