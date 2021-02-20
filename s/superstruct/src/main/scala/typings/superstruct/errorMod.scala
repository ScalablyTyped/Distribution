package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("superstruct/lib/error", "StructError")
  @js.native
  class StructError protected ()
    extends Error
       with /* key */ StringDictionary[js.Any] {
    def this(failure: Failure, iterable: Iterable[Failure]) = this()
    
    var branch: js.Array[_] = js.native
    
    def failures(): IterableIterator[Failure] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var path: js.Array[Double | String] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  trait Failure extends StObject {
    
    var branch: js.Array[_] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var message: String = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  object Failure {
    
    @scala.inline
    def apply(
      branch: js.Array[_],
      message: String,
      path: js.Array[String | Double],
      `type`: String,
      value: js.Any
    ): Failure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    @scala.inline
    implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
