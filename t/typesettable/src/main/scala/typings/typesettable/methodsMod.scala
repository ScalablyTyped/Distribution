package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsMod {
  
  @JSImport("typesettable/build/src/utils/methods", "Methods")
  @js.native
  open class Methods () extends StObject
  /* static members */
  object Methods {
    
    @JSImport("typesettable/build/src/utils/methods", "Methods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Check if two arrays are equal by strict equality.
      */
    inline def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Shim for _.defaults
      */
    inline def defaults(target: Any, objects: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(target.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    inline def objEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("objEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def strictEq(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
