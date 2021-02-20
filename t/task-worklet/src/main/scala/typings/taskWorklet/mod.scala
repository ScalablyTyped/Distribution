package typings.taskWorklet

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("task-worklet", JSImport.Namespace)
  @js.native
  class ^[T /* <: TaskDescriptor */] () extends TaskQueue[T] {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var size: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.taskWorklet.taskWorkletStrings.cancelled
    - typings.taskWorklet.taskWorkletStrings.completed
    - typings.taskWorklet.taskWorkletStrings.fulfilled
    - typings.taskWorklet.taskWorkletStrings.pending
    - typings.taskWorklet.taskWorkletStrings.scheduled
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def cancelled: typings.taskWorklet.taskWorkletStrings.cancelled = "cancelled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.cancelled]
    
    @scala.inline
    def completed: typings.taskWorklet.taskWorkletStrings.completed = "completed".asInstanceOf[typings.taskWorklet.taskWorkletStrings.completed]
    
    @scala.inline
    def fulfilled: typings.taskWorklet.taskWorkletStrings.fulfilled = "fulfilled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.fulfilled]
    
    @scala.inline
    def pending: typings.taskWorklet.taskWorkletStrings.pending = "pending".asInstanceOf[typings.taskWorklet.taskWorkletStrings.pending]
    
    @scala.inline
    def scheduled: typings.taskWorklet.taskWorkletStrings.scheduled = "scheduled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.scheduled]
  }
  
  @js.native
  trait Task[T] extends StObject {
    
    var id: Double = js.native
    
    var result: js.Promise[T] = js.native
    
    var state: State = js.native
  }
  object Task {
    
    @scala.inline
    def apply[T](id: Double, result: js.Promise[T], state: State): Task[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task[T]]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task[_], T] (val x: Self with Task[T]) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Promise[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaskDescriptor extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): js.Any = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait TaskQueue[T /* <: TaskDescriptor */] extends StObject {
    
    def addModule(moduleURL: String): js.Promise[Unit] = js.native
    
    @JSName("postTask")
    def postTask_name[U /* <: T */](
      taskName: /* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<U> is not an array type */ args: Parameters[U]
    ): Task[ReturnType[U]] = js.native
  }
  object TaskQueue {
    
    @scala.inline
    def apply[T /* <: TaskDescriptor */](
      addModule: String => js.Promise[Unit],
      postTask: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[js.Any]) => Task[ReturnType[js.Any]]
    ): TaskQueue[T] = {
      val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
      __obj.asInstanceOf[TaskQueue[T]]
    }
    
    @scala.inline
    implicit class TaskQueueMutableBuilder[Self <: TaskQueue[_], T /* <: TaskDescriptor */] (val x: Self with TaskQueue[T]) extends AnyVal {
      
      @scala.inline
      def setAddModule(value: String => js.Promise[Unit]): Self = StObject.set(x, "addModule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostTask(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[js.Any]) => Task[ReturnType[js.Any]]
      ): Self = StObject.set(x, "postTask", js.Any.fromFunction2(value))
    }
  }
}
