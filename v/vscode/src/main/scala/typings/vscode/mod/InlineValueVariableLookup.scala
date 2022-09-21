package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlineValueVariableLookup")
@js.native
open class InlineValueVariableLookup protected ()
  extends StObject
     with InlineValue {
  /**
    * Creates a new InlineValueVariableLookup object.
    *
    * @param range The document line where to show the inline value.
    * @param variableName The name of the variable to look up.
    * @param caseSensitiveLookup How to perform the lookup. If missing lookup is case sensitive.
    */
  def this(range: Range) = this()
  def this(range: Range, variableName: String) = this()
  def this(range: Range, variableName: String, caseSensitiveLookup: Boolean) = this()
  def this(range: Range, variableName: Unit, caseSensitiveLookup: Boolean) = this()
  
  /**
    * How to perform the lookup.
    */
  val caseSensitiveLookup: Boolean = js.native
  
  /**
    * The document range for which the inline value applies.
    * The range is used to extract the variable name from the underlying document.
    */
  val range: Range = js.native
  
  /**
    * If specified the name of the variable to look up.
    */
  val variableName: js.UndefOr[String] = js.native
}
