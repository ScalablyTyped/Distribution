package typings.trashable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](promise: js.Promise[T]): TrashablePromise[T] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[TrashablePromise[T]]
  
  @JSImport("trashable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait TrashablePromise[T]
    extends js.Promise[T] {
    
    def trash(): Unit = js.native
  }
}
