package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GroupMark extends Mark {
  /**
       * Axis definitions.
       */
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
  /**
       * Legend definitions.
       */
  var legends: js.UndefOr[js.Array[Legend]] = js.undefined
  /**
       * Groups differ from other mark types in their ability to contain children marks.
       * Marks defined within a group mark can inherit data from their parent group.
       * For inheritance to work each data element for a group must contain data elements of its own.
       * This arrangement of nested data is typically achieved by facetting the data, such that each group-level data element includes its own array of sub-elements
       */
  var marks: js.UndefOr[js.Array[Mark | GroupMark]] = js.undefined
   // "group"
  /**
       * Scale transform definitions.
       */
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
}

