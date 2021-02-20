package typings.typeorm.anon

import typings.typeorm.typeormBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Synchronize extends StObject {
  
  var synchronize: `false` = js.native
}
object Synchronize {
  
  @scala.inline
  def apply(synchronize: `false`): Synchronize = {
    val __obj = js.Dynamic.literal(synchronize = synchronize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synchronize]
  }
  
  @scala.inline
  implicit class SynchronizeMutableBuilder[Self <: Synchronize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSynchronize(value: `false`): Self = StObject.set(x, "synchronize", value.asInstanceOf[js.Any])
  }
}
