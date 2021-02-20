package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle[T] extends StObject {
  
  var bundle: js.Array[T] = js.native
}
object Bundle {
  
  @scala.inline
  def apply[T](bundle: js.Array[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle[_], T] (val x: Self with Bundle[T]) extends AnyVal {
    
    @scala.inline
    def setBundle(value: js.Array[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleVarargs(value: T*): Self = StObject.set(x, "bundle", js.Array(value :_*))
  }
}
