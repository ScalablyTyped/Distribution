package typings.typeFest

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setReturnTypeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestBooleans.`false`
    - typings.typeFest.typeFestBooleans.`true`
  */
  trait IsAny[T] extends StObject
  
  // https://stackoverflow.com/a/49928360/3406963
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestBooleans.`false`
    - typings.typeFest.typeFestBooleans.`true`
  */
  trait IsNever[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestBooleans.`false`
    - typings.typeFest.typeFestBooleans.`true`
  */
  trait IsUnknown[T] extends StObject
  
  type SetReturnType[Fn /* <: js.Function1[/* repeated */ Any, Any] */, TypeToReturn] = (// This part should be unreachable, but we make it meaningful just in case…
  js.Function1[(/* args */ Any) | (/* args */ Parameters[Fn]), TypeToReturn]) | (js.ThisFunction1[/* this */ Any, /* args */ Any, TypeToReturn])
}
