package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterType.Object
import typings.typedoc.optionsDeclarationMod._KeyToDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typedoc.typedoc/dist/lib/utils/options/declaration.ObjectDeclarationOption & {validate (value : unknown): void} */
@js.native
trait ObjectDeclarationOptionva
  extends StObject
     with _KeyToDeclaration[Any] {
  
  /**
    * If not specified defaults to undefined.
    */
  var defaultValue: js.UndefOr[Any] = js.native
  
  /**
    * The help text to be displayed to the user when --help is passed.
    */
  var help: String = js.native
  
  /**
    * The option name.
    */
  var name: String = js.native
  
  var `type`: Object = js.native
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.native
  def validate(value: Any): Unit = js.native
}
