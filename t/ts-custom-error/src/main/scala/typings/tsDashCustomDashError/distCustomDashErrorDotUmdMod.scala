package typings.tsDashCustomDashError

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.ErrorConstructor
import typings.std.EvalErrorConstructor
import typings.std.RangeErrorConstructor
import typings.std.ReferenceErrorConstructor
import typings.std.SyntaxErrorConstructor
import typings.std.TypeErrorConstructor
import typings.std.URIErrorConstructor
import typings.tsDashCustomDashError.distCustomDashErrorDotUmdMod.CustomErrorConstructor
import typings.tsDashCustomDashError.distCustomDashErrorDotUmdMod.CustomErrorInterface
import typings.tsDashCustomDashError.distCustomDashErrorDotUmdMod.CustomErrorProperties
import typings.tsDashCustomDashError.distCustomDashErrorDotUmdMod.GenericErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-custom-error/dist/custom-error.umd", JSImport.Namespace)
@js.native
object distCustomDashErrorDotUmdMod extends js.Object {
  @js.native
  class CustomError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */] extends ErrorConstructor {
    def apply(args: js.Any*): CustomErrorInterface with Properties = js.native
  }
  
  def customErrorFactory[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = js.native
  def customErrorFactory[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = js.native
  type CustomErrorInterface = Error
  type CustomErrorProperties = StringDictionary[js.Any]
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}

