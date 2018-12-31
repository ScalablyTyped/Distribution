package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSpan extends js.Object {
  /** Column number in the .js file. */
  var emittedColumn: scala.Double
  /** Line number in the .js file. */
  var emittedLine: scala.Double
  /** Optional name (index into names array) associated with this span. */
  var nameIndex: js.UndefOr[scala.Double] = js.undefined
  /** Column number in the .ts file. */
  var sourceColumn: scala.Double
  /** .ts file (index into sources array) associated with this span */
  var sourceIndex: scala.Double
  /** Line number in the .ts file. */
  var sourceLine: scala.Double
}

