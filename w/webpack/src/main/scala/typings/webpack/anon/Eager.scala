package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eager extends StObject {
  
  var eager: Boolean
  
  var from: String
  
  def get(): js.Promise[Any]
  
  var loaded: js.UndefOr[typings.webpack.webpackInts.`1`] = js.undefined
}
object Eager {
  
  inline def apply(eager: Boolean, from: String, get: () => js.Promise[Any]): Eager = {
    val __obj = js.Dynamic.literal(eager = eager.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Eager]
  }
  
  extension [Self <: Eager](x: Self) {
    
    inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGet(value: () => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setLoaded(value: typings.webpack.webpackInts.`1`): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
  }
}
