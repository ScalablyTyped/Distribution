package typings
package stylenamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stylenamesMod {
  type StyleObject = stdLib.Partial[stdLib.Record[java.lang.String, StyleValue]]
  type StyleValue = js.UndefOr[scala.Null | java.lang.String | StyleValueObject]
  type StyleValueConditionFunction = js.Function0[js.UndefOr[scala.Boolean | scala.Null]]
  type StyleValueObject = stdLib.Record[java.lang.String | scala.Double, scala.Boolean | StyleValueConditionFunction]
}
