package typings.wordpressComponents.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Icon {
  // prettier-ignore
  type AdditionalProps[T] = js.Object | typings.react.mod.SVGProps[typings.std.SVGSVGElement]
  type IconType[P] = typings.wordpressComponents.dashiconMod.Dashicon.Icon | typings.react.mod.ComponentType[P] | typings.react.mod.global.JSX.Element
  type Props[P] = typings.wordpressComponents.iconMod.Icon.BaseProps[P] with typings.wordpressComponents.iconMod.Icon.AdditionalProps[typings.wordpressComponents.iconMod.Icon.IconType[P]]
}
