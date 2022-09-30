package typings.typeFest

import typings.std.Awaited
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncReturnTypeMod {
  
  @js.native
  trait AsyncFunction extends StObject {
    
    def apply(args: Any*): js.Promise[Any] = js.native
  }
  
  type AsyncReturnType[Target /* <: AsyncFunction */] = Awaited[ReturnType[Target]]
}
