package typings.typescriptServices.global.TypeScript

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Errors")
@js.native
class Errors ()
  extends StObject
     with typings.typescriptServices.TypeScript.Errors
object Errors {
  
  @JSGlobal("TypeScript.Errors")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def `abstract`(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abstract")().asInstanceOf[Error]
  
  /* static member */
  @scala.inline
  def argument(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  @scala.inline
  def argument(argument: String, message: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("argument")(argument.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  /* static member */
  @scala.inline
  def argumentNull(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentNull")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  @scala.inline
  def argumentOutOfRange(argument: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("argumentOutOfRange")(argument.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  @scala.inline
  def invalidOperation(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")().asInstanceOf[Error]
  @scala.inline
  def invalidOperation(message: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidOperation")(message.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  /* static member */
  @scala.inline
  def notYetImplemented(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notYetImplemented")().asInstanceOf[Error]
}
