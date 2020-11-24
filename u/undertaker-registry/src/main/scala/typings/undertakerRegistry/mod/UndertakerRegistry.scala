package typings.undertakerRegistry.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndertakerRegistry extends js.Object {
  
  /**
    * Returns the task with that name or undefined if no task is registered with that name.
    * Useful for custom task storage.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    */
  def get[TTaskFunction](taskName: String): TTaskFunction = js.native
  
  /**
    * No-op method that receives the undertaker instance.
    * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taker - Instance of undertaker.
    */
  def init(taker: js.Any): Unit = js.native
  
  /**
    * Adds a task to the registry.
    * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
    * Useful for adding custom behavior to every task as it is registered in the system.
    * Custom registries can override this method when inheriting from this default registry.
    * @param taskName - Name of task.
    * @param fn - Task function.
    */
  def set[TTaskFunction](taskName: String, fn: TTaskFunction): TTaskFunction = js.native
  
  /**
    * Returns an object listing all tasks in the registry.
    * Necessary to override if the get method is overridden for custom task storage.
    * Custom registries can override this when when inheriting from this default registry.
    */
  def tasks(): StringDictionary[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object UndertakerRegistry {
  
  @scala.inline
  def apply(
    get: String => js.Any,
    init: js.Any => Unit,
    set: (String, js.Any) => js.Any,
    tasks: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): UndertakerRegistry = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), init = js.Any.fromFunction1(init), set = js.Any.fromFunction2(set), tasks = js.Any.fromFunction0(tasks))
    __obj.asInstanceOf[UndertakerRegistry]
  }
  
  @scala.inline
  implicit class UndertakerRegistryOps[Self <: UndertakerRegistry] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: js.Any => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Any): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTasks(value: () => StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = this.set("tasks", js.Any.fromFunction0(value))
  }
}
