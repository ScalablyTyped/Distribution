package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectUtilsMod {
  
  @JSImport("typeorm/browser/util/ObjectUtils", "ObjectUtils")
  @js.native
  class ObjectUtils () extends StObject
  /* static members */
  object ObjectUtils {
    
    @JSImport("typeorm/browser/util/ObjectUtils", "ObjectUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source The source object from which to copy properties.
      */
    inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source1 The first source object from which to copy properties.
      * @param source2 The second source object from which to copy properties.
      */
    inline def assign[T, U, V](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source1 The first source object from which to copy properties.
      * @param source2 The second source object from which to copy properties.
      * @param source3 The third source object from which to copy properties.
      */
    inline def assign[T, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  }
}
