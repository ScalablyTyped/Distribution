package typings.validatorjs

import org.scalablytyped.runtime.Shortcut
import typings.validatorjs.mod.ErrorMessages
import typings.validatorjs.mod.Rules
import typings.validatorjs.mod.ValidatorStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Validator extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Validator")
    @js.native
    open class ^[A] protected ()
      extends StObject
         with typings.validatorjs.mod.Validator[A] {
      def this(data: A, rules: Rules) = this()
      def this(data: A, rules: Rules, customMessages: ErrorMessages) = this()
    }
    
    @JSGlobal("Validator")
    @js.native
    val ^ : js.Object & ValidatorStatic = js.native
    
    type _To = js.Object & ValidatorStatic
    
    /* This means you don't have to write `^`, but can instead just say `Validator.foo` */
    override def _to: js.Object & ValidatorStatic = ^
  }
}
