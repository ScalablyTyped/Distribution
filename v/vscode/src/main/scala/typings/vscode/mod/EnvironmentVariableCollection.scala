package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentVariableCollection extends js.Object {
  
  /**
    * Append a value to an environment variable.
    *
    * Note that an extension can only make a single change to any one variable, so this will
    * overwrite any previous calls to replace, append or prepend.
    *
    * @param variable The variable to append to.
    * @param value The value to append to the variable.
    */
  def append(variable: String, value: String): Unit = js.native
  
  /**
    * Clears all mutators from this collection.
    */
  def clear(): Unit = js.native
  
  /**
    * Deletes this collection's mutator for a variable.
    *
    * @param variable The variable to delete the mutator for.
    */
  def delete(variable: String): Unit = js.native
  
  /**
    * Iterate over each mutator in this collection.
    *
    * @param callback Function to execute for each entry.
    * @param thisArg The `this` context used when invoking the handler function.
    */
  def forEach(
    callback: js.Function3[
      /* variable */ String, 
      /* mutator */ EnvironmentVariableMutator, 
      /* collection */ this.type, 
      _
    ]
  ): Unit = js.native
  def forEach(
    callback: js.Function3[
      /* variable */ String, 
      /* mutator */ EnvironmentVariableMutator, 
      /* collection */ this.type, 
      _
    ],
    thisArg: js.Any
  ): Unit = js.native
  
  /**
    * Gets the mutator that this collection applies to a variable, if any.
    *
    * @param variable The variable to get the mutator for.
    */
  def get(variable: String): js.UndefOr[EnvironmentVariableMutator] = js.native
  
  /**
    * Whether the collection should be cached for the workspace and applied to the terminal
    * across window reloads. When true the collection will be active immediately such when the
    * window reloads. Additionally, this API will return the cached version if it exists. The
    * collection will be invalidated when the extension is uninstalled or when the collection
    * is cleared. Defaults to true.
    */
  var persistent: Boolean = js.native
  
  /**
    * Prepend a value to an environment variable.
    *
    * Note that an extension can only make a single change to any one variable, so this will
    * overwrite any previous calls to replace, append or prepend.
    *
    * @param variable The variable to prepend.
    * @param value The value to prepend to the variable.
    */
  def prepend(variable: String, value: String): Unit = js.native
  
  /**
    * Replace an environment variable with a value.
    *
    * Note that an extension can only make a single change to any one variable, so this will
    * overwrite any previous calls to replace, append or prepend.
    *
    * @param variable The variable to replace.
    * @param value The value to replace the variable with.
    */
  def replace(variable: String, value: String): Unit = js.native
}
