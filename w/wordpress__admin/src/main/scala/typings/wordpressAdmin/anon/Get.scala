package typings.wordpressAdmin.anon

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.wordpressAdmin.componentsMediaModelsMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  def get(props: Any, options: Any): Query
  
  def hasMore(): Boolean
  
  def initialize(models: js.Array[typings.wordpressAdmin.componentsMediaModelsMod.Attachment], options: Any): Unit
  
  def more(options: Any): js.Promise[Any]
  
  def sync(method: String, model: Model[Any, ModelSetOptions, Any], options: Any): Any
}
object Get {
  
  inline def apply(
    get: (Any, Any) => Query,
    hasMore: () => Boolean,
    initialize: (js.Array[typings.wordpressAdmin.componentsMediaModelsMod.Attachment], Any) => Unit,
    more: Any => js.Promise[Any],
    sync: (String, Model[Any, ModelSetOptions, Any], Any) => Any
  ): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), hasMore = js.Any.fromFunction0(hasMore), initialize = js.Any.fromFunction2(initialize), more = js.Any.fromFunction1(more), sync = js.Any.fromFunction3(sync))
    __obj.asInstanceOf[Get]
  }
  
  extension [Self <: Get](x: Self) {
    
    inline def setGet(value: (Any, Any) => Query): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setHasMore(value: () => Boolean): Self = StObject.set(x, "hasMore", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: (js.Array[typings.wordpressAdmin.componentsMediaModelsMod.Attachment], Any) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setMore(value: Any => js.Promise[Any]): Self = StObject.set(x, "more", js.Any.fromFunction1(value))
    
    inline def setSync(value: (String, Model[Any, ModelSetOptions, Any], Any) => Any): Self = StObject.set(x, "sync", js.Any.fromFunction3(value))
  }
}
