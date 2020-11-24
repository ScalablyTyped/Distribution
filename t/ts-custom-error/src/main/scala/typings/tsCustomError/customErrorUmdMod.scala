package typings.tsCustomError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.ErrorConstructor
import typings.std.EvalErrorConstructor
import typings.std.RangeErrorConstructor
import typings.std.ReferenceErrorConstructor
import typings.std.SyntaxErrorConstructor
import typings.std.TypeErrorConstructor
import typings.std.URIErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-custom-error/dist/custom-error.umd", JSImport.Namespace)
@js.native
object customErrorUmdMod extends js.Object {
  
  def customErrorFactory[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = js.native
  def customErrorFactory[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = js.native
  
  @js.native
  class CustomError () extends Error {
    def this(message: String) = this()
  }
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */] extends ErrorConstructor {
    
    def apply(args: js.Any*): CustomErrorInterface with Properties = js.native
  }
  
  type CustomErrorInterface = Error
  
  type CustomErrorProperties = StringDictionary[js.Any]
  
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}
