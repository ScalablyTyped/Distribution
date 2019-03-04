package typings
package undertakerDashRegistryLib.undertakerDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndertakerRegistry extends js.Object {
  /**
    * Returns the task with that name or undefined if no task is registered with that name.
    * Useful for custom task storage.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    */
  def get[TTaskFunction](taskName: java.lang.String): TTaskFunction
  /**
    * No-op method that receives the undertaker instance.
    * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taker - Instance of undertaker.
    */
  def init(taker: js.Any): scala.Unit
  /**
    * Adds a task to the registry.
    * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
    * Useful for adding custom behavior to every task as it is registered in the system.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    * @param fn - Task function.
    */
  def set[TTaskFunction](taskName: java.lang.String, fn: TTaskFunction): TTaskFunction
  /**
    * Returns an object listing all tasks in the registry.
    * Necessary to override if the get method is overridden for custom task storage.
    * Custom registries can override this when when inheriting from this default registry.
    */
  def tasks(): org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
}

object UndertakerRegistry {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.Any],
    init: js.Function1[js.Any, scala.Unit],
    set: js.Function2[java.lang.String, js.Any, js.Any],
    tasks: js.Function0[
      org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
    ]
  ): UndertakerRegistry = {
    val __obj = js.Dynamic.literal(get = get, init = init, set = set, tasks = tasks)
  
    __obj.asInstanceOf[UndertakerRegistry]
  }
}

