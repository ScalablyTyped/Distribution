package typings.undertaker

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Process
import typings.node.streamMod.Duplex
import typings.undertaker.undertakerStrings.Tasks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("undertaker", JSImport.Namespace)
  @js.native
  class ^ () extends Undertaker {
    def this(registry: typings.undertakerRegistry.mod.^) = this()
  }
  
  trait Node extends StObject {
    
    var branch: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var nodes: js.Array[Node]
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Node {
    
    @scala.inline
    def apply(label: String, nodes: js.Array[Node]): Node = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: Boolean): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Task = String | TaskFunction
  
  type TaskFlags = StringDictionary[String]
  
  @js.native
  trait TaskFunction
    extends TaskFunctionBase
       with TaskFunctionParams {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit | Duplex | Process | js.Promise[scala.Nothing] | js.Any = js.native
  }
  
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
    Unit | Duplex | Process | js.Promise[scala.Nothing] | js.Any
  ]
  
  trait TaskFunctionParams extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[TaskFlags] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object TaskFunctionParams {
    
    @scala.inline
    def apply(): TaskFunctionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskFunctionParams]
    }
    
    @scala.inline
    implicit class TaskFunctionParamsMutableBuilder[Self <: TaskFunctionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setFlags(value: TaskFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait TaskFunctionWrapped extends TaskFunctionBase {
    
    var displayName: String = js.native
    
    def unwrap(): TaskFunction = js.native
  }
  
  trait TreeOptions extends StObject {
    
    /**
      * Whether or not the whole tree should be returned.
      * Default: false
      */
    var deep: js.UndefOr[Boolean] = js.undefined
  }
  object TreeOptions {
    
    @scala.inline
    def apply(): TreeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeOptions]
    }
    
    @scala.inline
    implicit class TreeOptionsMutableBuilder[Self <: TreeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  trait TreeResult extends StObject {
    
    var label: Tasks
    
    var nodes: js.Array[Node]
  }
  object TreeResult {
    
    @scala.inline
    def apply(nodes: js.Array[Node]): TreeResult = {
      val __obj = js.Dynamic.literal(label = "Tasks", nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeResult]
    }
    
    @scala.inline
    implicit class TreeResultMutableBuilder[Self <: TreeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: Tasks): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Undertaker extends EventEmitter {
    
    /**
      * Takes a string or function (task) and returns a timestamp of the last time the task was run successfully.
      * The time will be the time the task started.  Returns undefined if the task has not been run.
      * @param task - Task.
      * @param [timeResolution] - Time resolution.
      */
    def lastRun(task: Task): Double = js.native
    def lastRun(task: Task, timeResolution: Double): Double = js.native
    
    /**
      * Takes a variable amount of strings (taskName) and/or functions (fn)
      * and returns a function of the composed tasks or functions.
      * Any taskNames are retrieved from the registry using the get method.
      *
      * When the returned function is executed, the tasks or functions will be executed in parallel,
      * all being executed at the same time. If an error occurs, all execution will complete.
      * @param tasks - list of tasks.
      */
    def parallel(tasks: Task*): TaskFunction = js.native
    /**
      * Takes a variable amount of strings (taskName) and/or functions (fn)
      * and returns a function of the composed tasks or functions.
      * Any taskNames are retrieved from the registry using the get method.
      *
      * When the returned function is executed, the tasks or functions will be executed in parallel,
      * all being executed at the same time. If an error occurs, all execution will complete.
      * @param tasks - list of tasks.
      */
    def parallel(tasks: js.Array[Task]): TaskFunction = js.native
    
    /**
      * Returns the current registry object.
      */
    def registry(): typings.undertakerRegistry.mod.^ = js.native
    /**
      * The tasks from the current registry will be transferred to it
      * and the current registry will be replaced with the new registry.
      * @param registry - Instance of registry.
      */
    def registry(registry: typings.undertakerRegistry.mod.^): Unit = js.native
    
    /**
      * Takes a variable amount of strings (taskName) and/or functions (fn)
      * and returns a function of the composed tasks or functions.
      * Any taskNames are retrieved from the registry using the get method.
      *
      * When the returned function is executed, the tasks or functions will be executed in series,
      * each waiting for the prior to finish. If an error occurs, execution will stop.
      * @param tasks - List of tasks.
      */
    def series(tasks: Task*): TaskFunction = js.native
    /**
      * Takes a variable amount of strings (taskName) and/or functions (fn)
      * and returns a function of the composed tasks or functions.
      * Any taskNames are retrieved from the registry using the get method.
      *
      * When the returned function is executed, the tasks or functions will be executed in series,
      * each waiting for the prior to finish. If an error occurs, execution will stop.
      * @param tasks - List of tasks.
      */
    def series(tasks: js.Array[Task]): TaskFunction = js.native
    
    /**
      * Register the task by the name property of the function.
      * @param fn - Task function.
      */
    def task(fn: TaskFunction): Unit = js.native
    /**
      * Returns the wrapped registered function.
      * @param taskName - Task name.
      */
    def task(taskName: String): TaskFunctionWrapped = js.native
    /**
      * Register the task by the taskName.
      * @param taskName - Task name.
      * @param fn - Task function.
      */
    def task(taskName: String, fn: TaskFunction): Unit = js.native
    
    /**
      * Optionally takes an object (options) and returns an object representing the tree of registered tasks.
      * @param options - Tree options.
      */
    def tree(): TreeResult = js.native
    def tree(options: TreeOptions): TreeResult = js.native
  }
}
