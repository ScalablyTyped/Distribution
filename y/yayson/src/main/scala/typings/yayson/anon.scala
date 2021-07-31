package typings.yayson

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
    def render(instanceOrCollection: js.Object): js.Any = js.native
    def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
    /* static member */
    def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
    def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
    
    /* static member */
    def toJSON(instanceOrCollection: js.Object): js.Any = js.native
    def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
  }
}
