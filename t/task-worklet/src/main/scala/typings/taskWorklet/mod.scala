package typings.taskWorklet

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("task-worklet", JSImport.Namespace)
  @js.native
  open class ^[T /* <: TaskDescriptor */] ()
    extends StObject
       with TaskQueue[T] {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def addModule(moduleURL: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    @JSName("postTask")
    override def postTask_name[U /* <: T */](
      taskName: /* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<U> is not an array type */ args: Parameters[U]
    ): Task[ReturnType[U]] = js.native
  }
  
  trait Options extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
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
    
    inline def cancelled: typings.taskWorklet.taskWorkletStrings.cancelled = "cancelled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.cancelled]
    
    inline def completed: typings.taskWorklet.taskWorkletStrings.completed = "completed".asInstanceOf[typings.taskWorklet.taskWorkletStrings.completed]
    
    inline def fulfilled: typings.taskWorklet.taskWorkletStrings.fulfilled = "fulfilled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.fulfilled]
    
    inline def pending: typings.taskWorklet.taskWorkletStrings.pending = "pending".asInstanceOf[typings.taskWorklet.taskWorkletStrings.pending]
    
    inline def scheduled: typings.taskWorklet.taskWorkletStrings.scheduled = "scheduled".asInstanceOf[typings.taskWorklet.taskWorkletStrings.scheduled]
  }
  
  trait Task[T] extends StObject {
    
    var id: Double
    
    var result: js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends std.PromiseLike<infer U> ? U : T */ js.Any
      ]
    
    var state: State
  }
  object Task {
    
    inline def apply[T](
      id: Double,
      result: js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends std.PromiseLike<infer U> ? U : T */ js.Any
        ],
      state: State
    ): Task[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task[?], T] (val x: Self & Task[T]) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setResult(
        value: js.Promise[
              /* import warning: importer.ImportType#apply Failed type conversion: T extends std.PromiseLike<infer U> ? U : T */ js.Any
            ]
      ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaskDescriptor extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Any = js.native
    
    var name: String = js.native
  }
  
  trait TaskQueue[T /* <: TaskDescriptor */] extends StObject {
    
    def addModule(moduleURL: String): js.Promise[Unit]
    
    @JSName("postTask")
    def postTask_name[U /* <: T */](
      taskName: /* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<U> is not an array type */ args: Parameters[U]
    ): Task[ReturnType[U]]
  }
  object TaskQueue {
    
    inline def apply[T /* <: TaskDescriptor */](
      addModule: String => js.Promise[Unit],
      postTask: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[Any]) => Task[ReturnType[Any]]
    ): TaskQueue[T] = {
      val __obj = js.Dynamic.literal(addModule = js.Any.fromFunction1(addModule), postTask = js.Any.fromFunction2(postTask))
      __obj.asInstanceOf[TaskQueue[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskQueue[?], T /* <: TaskDescriptor */] (val x: Self & TaskQueue[T]) extends AnyVal {
      
      inline def setAddModule(value: String => js.Promise[Unit]): Self = StObject.set(x, "addModule", js.Any.fromFunction1(value))
      
      inline def setPostTask(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: U['name'] */ js.Any, Parameters[Any]) => Task[ReturnType[Any]]
      ): Self = StObject.set(x, "postTask", js.Any.fromFunction2(value))
    }
  }
}
