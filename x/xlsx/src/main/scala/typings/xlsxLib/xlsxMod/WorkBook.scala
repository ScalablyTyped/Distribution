package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkBook extends js.Object {
  /** Custom workbook Properties */
  var Custprops: js.UndefOr[js.Object] = js.undefined
  /** Standard workbook Properties */
  var Props: js.UndefOr[FullProperties] = js.undefined
  /** Ordered list of the sheet names in the workbook */
  var SheetNames: js.Array[java.lang.String]
  /**
       * A dictionary of the worksheets in the workbook.
       * Use SheetNames to reference these.
       */
  var Sheets: org.scalablytyped.runtime.StringDictionary[WorkSheet]
  var Workbook: js.UndefOr[WBProps] = js.undefined
  var vbaraw: js.UndefOr[js.Any] = js.undefined
}

