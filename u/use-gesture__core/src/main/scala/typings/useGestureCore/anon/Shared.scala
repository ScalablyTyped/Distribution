package typings.useGestureCore.anon

import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.GenericOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shared extends StObject {
  
  var shared: GenericOptions
}
object Shared {
  
  inline def apply(shared: GenericOptions): Shared = {
    val __obj = js.Dynamic.literal(shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shared] (val x: Self) extends AnyVal {
    
    inline def setShared(value: GenericOptions): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
  }
}
