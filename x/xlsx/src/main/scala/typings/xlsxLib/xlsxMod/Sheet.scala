package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sheet
  extends /**
     * Indexing with a cell address string maps to a cell object
     * Special keys start with '!'
     */
/* cell */ org.scalablytyped.runtime.StringDictionary[CellObject | SheetKeys | js.Any] {
  /** Page Margins */
  var `!margins`: js.UndefOr[MarginInfo] = js.undefined
  /** Sheet Range */
  var `!ref`: js.UndefOr[java.lang.String] = js.undefined
  /** Sheet type */
  var `!type`: js.UndefOr[SheetType] = js.undefined
}

