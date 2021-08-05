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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customErrorUmdMinMod {
  
  @JSImport("ts-custom-error/dist/custom-error.umd.min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-custom-error/dist/custom-error.umd.min", "CustomError")
  @js.native
  class CustomError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def customErrorFactory[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = ^.asInstanceOf[js.Dynamic].applyDynamic("customErrorFactory")(fn.asInstanceOf[js.Any]).asInstanceOf[CustomErrorConstructor[Properties]]
  inline def customErrorFactory[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = (^.asInstanceOf[js.Dynamic].applyDynamic("customErrorFactory")(fn.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CustomErrorConstructor[Properties]]
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */]
    extends StObject
       with ErrorConstructor {
    
    def apply(args: js.Any*): CustomErrorInterface & Properties = js.native
  }
  
  type CustomErrorInterface = Error
  
  type CustomErrorProperties = StringDictionary[js.Any]
  
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}
