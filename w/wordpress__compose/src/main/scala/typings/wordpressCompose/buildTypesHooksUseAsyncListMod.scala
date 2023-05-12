package typings.wordpressCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseAsyncListMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-async-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * React hook returns an array which items get asynchronously appended from a source array.
    * This behavior is useful if we want to render a list of items asynchronously for performance reasons.
    *
    * @param list   Source array.
    * @param config Configuration object.
    *
    * @return Async array.
    */
  inline def default[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def default[T](list: js.Array[T], config: AsyncListConfig): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait AsyncListConfig extends StObject {
    
    var step: Double
  }
  object AsyncListConfig {
    
    inline def apply(step: Double): AsyncListConfig = {
      val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncListConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncListConfig] (val x: Self) extends AnyVal {
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
