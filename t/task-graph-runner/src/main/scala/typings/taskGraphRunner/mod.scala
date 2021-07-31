package typings.taskGraphRunner

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[Item, Result](opts: Opts[Item, Result]): js.Promise[Results[Item, Result]] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results[Item, Result]]]
  
  @JSImport("task-graph-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Opts[Item, Result] extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var graph: Map[Item, js.Array[Item]]
    
    def task(item: Item): Result
  }
  object Opts {
    
    @scala.inline
    def apply[Item, Result](graph: Map[Item, js.Array[Item]], task: Item => Result): Opts[Item, Result] = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], task = js.Any.fromFunction1(task))
      __obj.asInstanceOf[Opts[Item, Result]]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts[?, ?], Item, Result] (val x: Self & (Opts[Item, Result])) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setGraph(value: Map[Item, js.Array[Item]]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: Item => Result): Self = StObject.set(x, "task", js.Any.fromFunction1(value))
    }
  }
  
  trait Results[Item, Result] extends StObject {
    
    var safe: Boolean
    
    var values: Map[Item, Result]
  }
  object Results {
    
    @scala.inline
    def apply[Item, Result](safe: Boolean, values: Map[Item, Result]): Results[Item, Result] = {
      val __obj = js.Dynamic.literal(safe = safe.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results[Item, Result]]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results[?, ?], Item, Result] (val x: Self & (Results[Item, Result])) extends AnyVal {
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Map[Item, Result]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
