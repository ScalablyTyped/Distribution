package typings.typeFest

import typings.std.Awaited
import typings.std.ReturnType
import typings.typeFest.sourceSetReturnTypeMod.SetReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceAsyncifyMod {
  
  type Asyncify[Fn /* <: js.Function1[/* repeated */ Any, Any] */] = SetReturnType[Fn, js.Promise[Awaited[ReturnType[Fn]]]]
}
