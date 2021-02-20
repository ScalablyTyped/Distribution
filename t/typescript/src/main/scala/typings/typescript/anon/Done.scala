package typings.typescript.anon

import typings.typescript.typescriptBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Done[T] extends StObject {
  
  var done: js.UndefOr[`false`] = js.native
  
  var value: T = js.native
}
object Done {
  
  @scala.inline
  def apply[T](value: T): Done[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done[T]]
  }
  
  @scala.inline
  implicit class DoneMutableBuilder[Self <: Done[_], T] (val x: Self with Done[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
