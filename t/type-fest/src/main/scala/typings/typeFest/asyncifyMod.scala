package typings.typeFest

import typings.std.Awaited
import typings.std.ReturnType
import typings.typeFest.setReturnTypeMod.SetReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncifyMod {
  
  type Asyncify[Fn /* <: js.Function1[/* repeated */ Any, Any] */] = SetReturnType[Fn, js.Promise[Awaited[ReturnType[Fn]]]]
}
