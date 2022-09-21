package typings.xstate

import typings.xstate.typegenTypesMod.AreAllImplementationsAssumedToBeProvided
import typings.xstate.typesMod.Equals
import typings.xstate.typesMod.IsNever
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xstateBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with AreAllImplementationsAssumedToBeProvided[Any, Any]
       with Equals[Any, Any]
       with IsNever[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with AreAllImplementationsAssumedToBeProvided[Any, Any]
       with Equals[Any, Any]
       with IsNever[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
