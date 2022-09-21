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

object mod {
  
  @JSImport("ts-custom-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-custom-error", "CustomError")
  @js.native
  open class CustomError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def customErrorFactory[Properties /* <: CustomErrorProperties */](fn: CustomErrorFunction[Properties]): CustomErrorConstructor[Properties] = ^.asInstanceOf[js.Dynamic].applyDynamic("customErrorFactory")(fn.asInstanceOf[js.Any]).asInstanceOf[CustomErrorConstructor[Properties]]
  inline def customErrorFactory[Properties /* <: CustomErrorProperties */](fn: CustomErrorFunction[Properties], parent: GenericErrorConstructor): CustomErrorConstructor[Properties] = (^.asInstanceOf[js.Dynamic].applyDynamic("customErrorFactory")(fn.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[CustomErrorConstructor[Properties]]
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */]
    extends StObject
       with ErrorConstructor {
    
    def apply(args: Any*): js.Error & Properties = js.native
  }
  
  @js.native
  trait CustomErrorFunction[Properties] extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type CustomErrorInterface = js.Error
  
  type CustomErrorProperties = StringDictionary[Any]
  
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}
