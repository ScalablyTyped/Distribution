package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectorMod {
  
  @js.native
  trait Injector extends StObject {
    
    /**
      * Requires a component of the `webicon`-module.
      */
    def apply[T](name: String, injector: Injector): T = js.native
    
    /**
      * Checks whether a component with the specified `name` exists.
      *
      * @param name
      * The name of the component to check for existence.
      *
      * @return
      * A value indicating whether a component with the specified `name` exists.
      */
    def has(name: String): Boolean = js.native
  }
}
