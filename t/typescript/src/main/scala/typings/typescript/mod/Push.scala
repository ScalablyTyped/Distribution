package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Array that is only intended to be pushed to, never read. */
@js.native
trait Push[T] extends StObject {
  
  def push(values: T*): Unit = js.native
}
object Push {
  
  @scala.inline
  def apply[T](push: /* repeated */ T => Unit): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push[T]]
  }
  
  @scala.inline
  implicit class PushMutableBuilder[Self <: Push[_], T] (val x: Self with Push[T]) extends AnyVal {
    
    @scala.inline
    def setPush(value: /* repeated */ T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
