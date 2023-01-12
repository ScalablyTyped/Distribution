package typings.undertakerRegistry

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("undertaker-registry", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UndertakerRegistry {
    
    /**
      * Returns the task with that name or undefined if no task is registered with that name.
      * Useful for custom task storage.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taskName - Name of task.
      */
    /* CompleteClass */
    override def get[TTaskFunction](taskName: String): TTaskFunction = js.native
    
    /**
      * No-op method that receives the undertaker instance.
      * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taker - Instance of undertaker.
      */
    /* CompleteClass */
    override def init(taker: Any): Unit = js.native
    
    /**
      * Adds a task to the registry.
      * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
      * Useful for adding custom behavior to every task as it is registered in the system.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taskName - Name of task.
      * @param fn - Task function.
      */
    /* CompleteClass */
    override def set[TTaskFunction](taskName: String, fn: TTaskFunction): TTaskFunction = js.native
    
    /**
      * Returns an object listing all tasks in the registry.
      * Necessary to override if the get method is overridden for custom task storage.
      * Custom registries can override this when when inheriting from this default registry.
      */
    /* CompleteClass */
    override def tasks(): StringDictionary[js.Function1[/* repeated */ Any, Any]] = js.native
  }
  
  trait UndertakerRegistry extends StObject {
    
    /**
      * Returns the task with that name or undefined if no task is registered with that name.
      * Useful for custom task storage.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taskName - Name of task.
      */
    def get[TTaskFunction](taskName: String): TTaskFunction
    
    /**
      * No-op method that receives the undertaker instance.
      * Useful to set pre-defined tasks using the undertaker.task(taskName, fn) method.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taker - Instance of undertaker.
      */
    def init(taker: Any): Unit
    
    /**
      * Adds a task to the registry.
      * If set modifies a task, it should return the new task so Undertaker can properly maintain metadata for the task.
      * Useful for adding custom behavior to every task as it is registered in the system.
      * Custom registries can override this method when inheriting from this default registry.
      * @param taskName - Name of task.
      * @param fn - Task function.
      */
    def set[TTaskFunction](taskName: String, fn: TTaskFunction): TTaskFunction
    
    /**
      * Returns an object listing all tasks in the registry.
      * Necessary to override if the get method is overridden for custom task storage.
      * Custom registries can override this when when inheriting from this default registry.
      */
    def tasks(): StringDictionary[js.Function1[/* repeated */ Any, Any]]
  }
  object UndertakerRegistry {
    
    inline def apply(
      get: String => Any,
      init: Any => Unit,
      set: (String, Any) => Any,
      tasks: () => StringDictionary[js.Function1[/* repeated */ Any, Any]]
    ): UndertakerRegistry = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), init = js.Any.fromFunction1(init), set = js.Any.fromFunction2(set), tasks = js.Any.fromFunction0(tasks))
      __obj.asInstanceOf[UndertakerRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UndertakerRegistry] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setInit(value: Any => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setTasks(value: () => StringDictionary[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "tasks", js.Any.fromFunction0(value))
    }
  }
}
