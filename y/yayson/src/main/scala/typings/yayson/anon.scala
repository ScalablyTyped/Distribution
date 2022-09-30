package typings.yayson

import typings.std.PromiseLike
import typings.yayson.mod.JsonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofPresenter extends StObject {
    
    /* static member */
    var adapter: String = js.native
    
    /* static member */
    def render(instanceOrCollection: js.Object): Any = js.native
    def render(instanceOrCollection: js.Object, options: JsonOptions): Any = js.native
    /* static member */
    def render[T](instanceOrCollection: PromiseLike[T]): PromiseLike[T] = js.native
    def render[T](instanceOrCollection: PromiseLike[T], options: JsonOptions): PromiseLike[T] = js.native
    
    /* static member */
    def toJSON(instanceOrCollection: js.Object): Any = js.native
    def toJSON(instanceOrCollection: js.Object, options: JsonOptions): Any = js.native
  }
}
