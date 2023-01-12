package typings.webpack.anon

import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Added[T, R] extends StObject {
  
  var added: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions]
  
  var beforeAdd: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions]
  
  var beforeStart: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions]
  
  var result: SyncHook[js.Tuple3[T, js.Error, R], Unit, UnsetAdditionalOptions]
  
  var started: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions]
}
object Added {
  
  inline def apply[T, R](
    added: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions],
    beforeAdd: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions],
    beforeStart: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions],
    result: SyncHook[js.Tuple3[T, js.Error, R], Unit, UnsetAdditionalOptions],
    started: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions]
  ): Added[T, R] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], beforeAdd = beforeAdd.asInstanceOf[js.Any], beforeStart = beforeStart.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added[T, R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Added[?, ?], T, R] (val x: Self & (Added[T, R])) extends AnyVal {
    
    inline def setAdded(value: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setBeforeAdd(value: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions]): Self = StObject.set(x, "beforeAdd", value.asInstanceOf[js.Any])
    
    inline def setBeforeStart(value: AsyncSeriesHook[js.Array[T], UnsetAdditionalOptions]): Self = StObject.set(x, "beforeStart", value.asInstanceOf[js.Any])
    
    inline def setResult(value: SyncHook[js.Tuple3[T, js.Error, R], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: SyncHook[js.Array[T], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
