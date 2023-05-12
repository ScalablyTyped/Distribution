package typings.stylelint.anon

import typings.postcss.libWarningMod.WarningOptions
import typings.std.Node
import typings.stylelint.stylelintStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined postcss.postcss.Warning & {  stylelintType :string} */
@js.native
trait WarningstylelintTypestrin extends StObject {
  
  /**
    * Column for inclusive start position in the input file with this warning’s source.
    *
    * ```js
    * warning.column //=> 6
    * ```
    */
  var column: Double = js.native
  
  /**
    * Column for exclusive end position in the input file with this warning’s source.
    *
    * ```js
    * warning.endColumn //=> 4
    * ```
    */
  var endColumn: js.UndefOr[Double] = js.native
  
  /**
    * Line for exclusive end position in the input file with this warning’s source.
    *
    * ```js
    * warning.endLine //=> 6
    * ```
    */
  var endLine: js.UndefOr[Double] = js.native
  
  /**
    * Line for inclusive start position in the input file with this warning’s source.
    *
    * ```js
    * warning.line //=> 5
    * ```
    */
  var line: Double = js.native
  
  /**
    * Contains the CSS node that caused the warning.
    *
    * ```js
    * warning.node.toString() //=> 'color: white !important'
    * ```
    */
  var node: Node = js.native
  
  /**
    * The name of the plugin that created this warning.
    * When you call `Node#warn` it will fill this property automatically.
    *
    * ```js
    * warning.plugin //=> 'postcss-important'
    * ```
    */
  var plugin: String = js.native
  
  var stylelintType: String = js.native
  
  /**
    * The warning message.
    *
    * ```js
    * warning.text //=> 'Try to avoid !important'
    * ```
    */
  var text: String = js.native
  
  /**
    * Type to filter warnings from `Result#messages`.
    * Always equal to `"warning"`.
    */
  var `type`: warning = js.native
}
