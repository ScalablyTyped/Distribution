package typings.taskGraphRunner

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("task-graph-runner", JSImport.Namespace)
  @js.native
  def apply[Item, Result](opts: Opts[Item, Result]): js.Promise[Results[Item, Result]] = js.native
  
  @js.native
  trait Opts[Item, Result] extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
    
    var graph: Map[Item, js.Array[Item]] = js.native
    
    def task(item: Item): Result = js.native
  }
  object Opts {
    
    @scala.inline
    def apply[Item, Result](graph: Map[Item, js.Array[Item]], task: Item => Result): Opts[Item, Result] = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], task = js.Any.fromFunction1(task))
      __obj.asInstanceOf[Opts[Item, Result]]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts[_, _], Item, Result] (val x: Self with (Opts[Item, Result])) extends AnyVal {
      
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
  
  @js.native
  trait Results[Item, Result] extends StObject {
    
    var safe: Boolean = js.native
    
    var values: Map[Item, Result] = js.native
  }
  object Results {
    
    @scala.inline
    def apply[Item, Result](safe: Boolean, values: Map[Item, Result]): Results[Item, Result] = {
      val __obj = js.Dynamic.literal(safe = safe.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results[Item, Result]]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results[_, _], Item, Result] (val x: Self with (Results[Item, Result])) extends AnyVal {
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: Map[Item, Result]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
