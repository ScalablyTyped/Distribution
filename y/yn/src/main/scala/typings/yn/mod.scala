package typings.yn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: Any): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def default(input: Any, options: Options): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def default(input: Any, options: OptionsWithDefault): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    /**
    	The default value if no match was found.
    	@default undefined
    	*/
    val default: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Use a key distance-based score to leniently accept typos of `yes` and `no`.
    	@default false
    	*/
    val lenient: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
      
      inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    }
  }
  
  trait OptionsWithDefault
    extends StObject
       with Options {
    
    @JSName("default")
    val default_OptionsWithDefault: Boolean
  }
  object OptionsWithDefault {
    
    inline def apply(default: Boolean): OptionsWithDefault = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithDefault]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithDefault] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
