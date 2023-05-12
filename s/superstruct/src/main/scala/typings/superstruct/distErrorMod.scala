package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorMod {
  
  @JSImport("superstruct/dist/error", "StructError")
  @js.native
  open class StructError protected ()
    extends StObject
       with Error
       with /* x */ StringDictionary[Any] {
    def this(failure: Failure, failures: js.Function0[Generator[Failure, Any, Any]]) = this()
    
    var branch: js.Array[Any] = js.native
    
    def failures(): js.Array[Failure] = js.native
    
    var key: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: js.Array[Any] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: Any = js.native
  }
  
  trait Failure extends StObject {
    
    var branch: js.Array[Any]
    
    var explanation: js.UndefOr[String] = js.undefined
    
    var key: Any
    
    var message: String
    
    var path: js.Array[Any]
    
    var refinement: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var value: Any
  }
  object Failure {
    
    inline def apply(branch: js.Array[Any], key: Any, message: String, path: js.Array[Any], `type`: String, value: Any): Failure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: js.Array[Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchVarargs(value: Any*): Self = StObject.set(x, "branch", js.Array(value*))
      
      inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
      
      inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      inline def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
