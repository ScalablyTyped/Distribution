package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsMod {
  
  @JSImport("typesettable/build/src/utils/methods", "Methods")
  @js.native
  class Methods () extends StObject
  /* static members */
  object Methods {
    
    @JSImport("typesettable/build/src/utils/methods", "Methods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    @scala.inline
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Shim for _.defaults
      */
    @scala.inline
    def defaults(target: js.Any, objects: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(target.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    @scala.inline
    def objEq(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def strictEq(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
