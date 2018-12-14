package typings
package undertakerDashRegistryLib.undertakerDashRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("undertaker-registry", JSImport.Namespace)
@js.native
class namespaced () extends UndertakerRegistry {
  /**
       * Returns the task with that name or undefined if no task is registered with that name.
       * Useful for custom task storage.
       * Custom registries can override this method when inheriting from this default registry.
       * @param taskName - Name of task.
       */
  /* CompleteClass */
  override def get[TTaskFunction](taskName: java.lang.String): TTaskFunction = js.native
  /**
       * No-op method that receives the undertaker instance.
       * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
       * Custom registries can override this method when inheriting from this default registry.
       * @param taker - Instance of undertaker.
       */
  /* CompleteClass */
  override def init(taker: js.Any): scala.Unit = js.native
  /**
       * Adds a task to the registry.
       * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
       * Useful for adding custom behavior to every task as it is registered in the system.
       * Custom registries can override this method when inheriting from this default registry.
       * @param taskName - Name of task.
       * @param fn - Task function.
       */
  /* CompleteClass */
  override def set[TTaskFunction](taskName: java.lang.String, fn: TTaskFunction): TTaskFunction = js.native
  /**
       * Returns an object listing all tasks in the registry.
       * Necessary to override if the get method is overridden for custom task storage.
       * Custom registries can override this when when inheriting from this default registry.
       */
  /* CompleteClass */
  override def tasks(): org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */js.Any, _]] = js.native
}

