package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/util/ObjectUtils", JSImport.Namespace)
@js.native
object utilObjectUtilsMod extends js.Object {
  
  @js.native
  class ObjectUtils () extends js.Object
  /* static members */
  @js.native
  object ObjectUtils extends js.Object {
    
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source The source object from which to copy properties.
      */
    def assign[T, U](target: T, source: U): T with U = js.native
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source1 The first source object from which to copy properties.
      * @param source2 The second source object from which to copy properties.
      */
    def assign[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
    /**
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * @param target The target object to copy to.
      * @param source1 The first source object from which to copy properties.
      * @param source2 The second source object from which to copy properties.
      * @param source3 The third source object from which to copy properties.
      */
    def assign[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
  }
}
