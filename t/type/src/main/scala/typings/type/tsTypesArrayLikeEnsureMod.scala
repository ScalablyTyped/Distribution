package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesArrayLikeEnsureMod {
  
  @JSImport("type/ts-types/array-like/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): js.Array[T] | String | LengthwiseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T] | String | LengthwiseObject]
  inline def default[T](
    value: Any,
    options: ArrayLikeEnsureOptions & EnsureBaseOptions & EnsureIsOptional & (EnsureDefault[js.Array[T] | String | LengthwiseObject])
  ): js.Array[T] | String | LengthwiseObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T] | String | LengthwiseObject]
  
  trait ArrayLikeEnsureOptions extends StObject {
    
    var allowString: js.UndefOr[Boolean] = js.undefined
  }
  object ArrayLikeEnsureOptions {
    
    inline def apply(): ArrayLikeEnsureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrayLikeEnsureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrayLikeEnsureOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowString(value: Boolean): Self = StObject.set(x, "allowString", value.asInstanceOf[js.Any])
      
      inline def setAllowStringUndefined: Self = StObject.set(x, "allowString", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait LengthwiseObject extends StObject {
    
    var length: Double
  }
  object LengthwiseObject {
    
    inline def apply(length: Double): LengthwiseObject = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthwiseObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LengthwiseObject] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
