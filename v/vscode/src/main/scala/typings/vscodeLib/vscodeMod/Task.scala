package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Task")
@js.native
class Task protected () extends js.Object {
  /**
  		 * Creates a new task.
  		 *
  		 * @param definition The task definition as defined in the taskDefinitions extension point.
  		 * @param name The task's name. Is presented in the user interface.
  		 * @param source The task's source (e.g. 'gulp', 'npm', ...). Is presented in the user interface.
  		 * @param execution The process or shell execution.
  		 * @param problemMatchers the names of problem matchers to use, like '$tsc'
  		 *  or '$eslint'. Problem matchers can be contributed by an extension using
  		 *  the `problemMatchers` extension point.
  		 */
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ProcessExecution) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ShellExecution) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ProcessExecution, problemMatchers: java.lang.String) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ProcessExecution, problemMatchers: js.Array[java.lang.String]) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ShellExecution, problemMatchers: java.lang.String) = this()
  def this(taskDefinition: TaskDefinition, name: java.lang.String, source: java.lang.String, execution: ShellExecution, problemMatchers: js.Array[java.lang.String]) = this()
  /**
  		 * The task's definition.
  		 */
  var definition: TaskDefinition = js.native
  /**
  		 * The task's execution engine
  		 */
  var execution: ProcessExecution | ShellExecution = js.native
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
  var isBackground: scala.Boolean = js.native
  /**
  		 * The task's name
  		 */
  var name: java.lang.String = js.native
  /**
  		 * The presentation options. Defaults to an empty literal.
  		 */
  var presentationOptions: TaskPresentationOptions = js.native
  /**
  		 * The problem matchers attached to the task. Defaults to an empty
  		 * array.
  		 */
  var problemMatchers: js.Array[java.lang.String] = js.native
  /**
  		 * A human-readable string describing the source of this
  		 * shell task, e.g. 'gulp' or 'npm'.
  		 */
  var source: java.lang.String = js.native
}

