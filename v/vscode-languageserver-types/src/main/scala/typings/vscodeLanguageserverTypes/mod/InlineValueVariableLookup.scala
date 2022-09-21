package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValueVariableLookup
  extends StObject
     with InlineValue {
  
  /**
    * How to perform the lookup.
    */
  var caseSensitiveLookup: Boolean
  
  /**
    * The document range for which the inline value applies.
    * The range is used to extract the variable name from the underlying document.
    */
  var range: Range
  
  /**
    * If specified the name of the variable to look up.
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object InlineValueVariableLookup {
  
  inline def apply(caseSensitiveLookup: Boolean, range: Range): InlineValueVariableLookup = {
    val __obj = js.Dynamic.literal(caseSensitiveLookup = caseSensitiveLookup.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValueVariableLookup]
  }
  
  @JSImport("vscode-languageserver-types", "InlineValueVariableLookup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueText literal.
    */
  inline def create(range: Range, variableName: String, caseSensitiveLookup: Boolean): InlineValueVariableLookup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], variableName.asInstanceOf[js.Any], caseSensitiveLookup.asInstanceOf[js.Any])).asInstanceOf[InlineValueVariableLookup]
  inline def create(range: Range, variableName: Unit, caseSensitiveLookup: Boolean): InlineValueVariableLookup = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], variableName.asInstanceOf[js.Any], caseSensitiveLookup.asInstanceOf[js.Any])).asInstanceOf[InlineValueVariableLookup]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueVariableLookup */ Boolean]
  
  extension [Self <: InlineValueVariableLookup](x: Self) {
    
    inline def setCaseSensitiveLookup(value: Boolean): Self = StObject.set(x, "caseSensitiveLookup", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
