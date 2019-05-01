package typings
package uiDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uiDashBoxMod {
  type Box = reactLib.reactMod.Component[BoxProps | CSSProps, js.Object, js.Any]
  type CSSProps = csstypeLib.csstypeMod.StandardProperties[java.lang.String | uiDashBoxLib.uiDashBoxLibNumbers.`0`]
  /** A prop defining which */
  type UIBoxIsProp = java.lang.String | reactLib.reactMod.ReactNode
  /** Placeholder type for UI box props */
  type UIBoxProp = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
