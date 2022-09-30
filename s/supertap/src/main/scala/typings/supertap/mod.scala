package typings.supertap

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supertap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finish(stats: Stats): String = ^.asInstanceOf[js.Dynamic].applyDynamic("finish")(stats.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def start(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[String]
  
  inline def test(title: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var comment: String | js.Array[String]
    
    var error: js.UndefOr[js.Error | (Record[String, Any])] = js.undefined
    
    var index: Double
    
    var passed: js.UndefOr[Boolean] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var todo: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(comment: String | js.Array[String], index: Double): Options = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setComment(value: String | js.Array[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentVarargs(value: String*): Self = StObject.set(x, "comment", js.Array(value*))
      
      inline def setError(value: js.Error | (Record[String, Any])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTodo(value: Boolean): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  trait Stats extends StObject {
    
    var crashed: js.UndefOr[Double] = js.undefined
    
    var failed: js.UndefOr[Double] = js.undefined
    
    var passed: js.UndefOr[Double] = js.undefined
    
    var skipped: js.UndefOr[Double] = js.undefined
    
    var todo: js.UndefOr[Double] = js.undefined
  }
  object Stats {
    
    inline def apply(): Stats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setCrashed(value: Double): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
      
      inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
      
      inline def setTodo(value: Double): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
}
