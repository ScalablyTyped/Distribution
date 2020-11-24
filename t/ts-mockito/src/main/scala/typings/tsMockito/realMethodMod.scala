package typings.tsMockito

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-mockito/lib/spy/RealMethod", JSImport.Namespace)
@js.native
object realMethodMod extends js.Object {
  
  @js.native
  class RealMethod protected () extends js.Object {
    def this(descriptor: PropertyDescriptor, instance: Boolean) = this()
    
    var descriptor: PropertyDescriptor = js.native
    
    var instance: Boolean = js.native
  }
}
