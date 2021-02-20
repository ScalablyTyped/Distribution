package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsMod {
  
  @JSImport("typesettable/build/src/utils/methods", "Methods")
  @js.native
  class Methods () extends StObject
  /* static members */
  object Methods {
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    @JSImport("typesettable/build/src/utils/methods", "Methods.arrayEq")
    @js.native
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    
    /**
      * Shim for _.defaults
      */
    @JSImport("typesettable/build/src/utils/methods", "Methods.defaults")
    @js.native
    def defaults(target: js.Any, objects: js.Any*): js.Any = js.native
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    @JSImport("typesettable/build/src/utils/methods", "Methods.objEq")
    @js.native
    def objEq(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSImport("typesettable/build/src/utils/methods", "Methods.strictEq")
    @js.native
    def strictEq(a: js.Any, b: js.Any): Boolean = js.native
  }
}
