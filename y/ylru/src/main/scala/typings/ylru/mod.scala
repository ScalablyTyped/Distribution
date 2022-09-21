package typings.ylru

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ylru", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with YLRU {
    def this(max: Double) = this()
  }
  
  @js.native
  trait YLRU extends StObject {
    
    def get[T](key: Any): js.UndefOr[T] = js.native
    def get[T](key: Any, options: YLRUOptions): js.UndefOr[T] = js.native
    
    def keys(): js.Array[Any] = js.native
    
    def set[T](key: Any, value: T): Unit = js.native
    def set[T](key: Any, value: T, options: YLRUOptions): Unit = js.native
  }
  
  trait YLRUOptions extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object YLRUOptions {
    
    inline def apply(): YLRUOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YLRUOptions]
    }
    
    extension [Self <: YLRUOptions](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
}
