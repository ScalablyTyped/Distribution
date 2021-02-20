package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketKey extends StObject {
  
  var __bucketKey: js.Any = js.native
}
object BucketKey {
  
  @scala.inline
  def apply(__bucketKey: js.Any): BucketKey = {
    val __obj = js.Dynamic.literal(__bucketKey = __bucketKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketKey]
  }
  
  @scala.inline
  implicit class BucketKeyMutableBuilder[Self <: BucketKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__bucketKey(value: js.Any): Self = StObject.set(x, "__bucketKey", value.asInstanceOf[js.Any])
  }
}
