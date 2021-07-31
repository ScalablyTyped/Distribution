package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeLens extends StObject {
  
  /**
    * The command this code lens represents.
    */
  var command: js.UndefOr[Command] = js.undefined
  
  /**
    * An data entry field that is preserved on a code lens item between
    * a [CodeLensRequest](#CodeLensRequest) and a [CodeLensResolveRequest]
    * (#CodeLensResolveRequest)
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The range in which this code lens is valid. Should only span a single line.
    */
  var range: Range
}
object CodeLens {
  
  @scala.inline
  def apply(range: Range): CodeLens = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLens]
  }
  
  @JSImport("vscode-languageserver-types", "CodeLens")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new CodeLens literal.
    */
  @scala.inline
  def create(range: Range): CodeLens = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[CodeLens]
  @scala.inline
  def create(range: Range, data: js.Any): CodeLens = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[CodeLens]
  
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean]
  
  @scala.inline
  implicit class CodeLensMutableBuilder[Self <: CodeLens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
