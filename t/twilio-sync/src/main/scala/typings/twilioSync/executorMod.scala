package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  trait Job extends StObject {
    
    var arg: js.Any
    
    var context: js.Any
    
    def handle(arg: js.Any): js.Any
    
    def reject(arg: js.Any): js.Any
    
    def resolve(arg: js.Any): js.Any
    
    var task: Task
  }
  object Job {
    
    inline def apply(
      arg: js.Any,
      context: js.Any,
      handle: js.Any => js.Any,
      reject: js.Any => js.Any,
      resolve: js.Any => js.Any,
      task: Task
    ): Job = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], handle = js.Any.fromFunction1(handle), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve), task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    extension [Self <: Job](x: Self) {
      
      inline def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: js.Any => js.Any): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      inline def setReject(value: js.Any => js.Any): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: js.Any => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobExecutor extends StObject {
    
    def add(task: Task, context: js.Any, arg: js.Any, errorHandler: js.Any): js.Any
  }
  object JobExecutor {
    
    inline def apply(add: (Task, js.Any, js.Any, js.Any) => js.Any): JobExecutor = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction4(add))
      __obj.asInstanceOf[JobExecutor]
    }
    
    extension [Self <: JobExecutor](x: Self) {
      
      inline def setAdd(value: (Task, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    }
  }
  
  trait Task extends StObject
}
