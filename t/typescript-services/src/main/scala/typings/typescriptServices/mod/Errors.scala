package typings.typescriptServices.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Errors")
@js.native
class Errors ()
  extends StObject
     with typings.typescriptServices.TypeScript.Errors
object Errors {
  
  @JSImport("typescript-services", "Errors")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def `abstract`(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abstract")().asInstanceOf[Error]
  
  /* static member */
  inline def argument(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  inline def argument(argument: String, message: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  /* static member */
  inline def argumentNull(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentNull")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  inline def argumentOutOfRange(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentOutOfRange")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  inline def invalidOperation(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")().asInstanceOf[Error]
  inline def invalidOperation(message: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")(message.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  inline def notYetImplemented(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notYetImplemented")().asInstanceOf[Error]
}
