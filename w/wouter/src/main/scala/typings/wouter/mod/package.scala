package typings.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LinkProps[H /* <: typings.wouter.wouterUseLocationMod.BaseLocationHook */] = typings.wouter.anon.OmitAnchorHTMLAttributesH with typings.wouter.mod.NavigationalProps[H]
  type NavigationalProps[H /* <: typings.wouter.wouterUseLocationMod.BaseLocationHook */] = (typings.wouter.anon.Href | typings.wouter.anon.To) with typings.wouter.wouterUseLocationMod.HookNavigationOptions[H]
  type RedirectProps[H /* <: typings.wouter.wouterUseLocationMod.BaseLocationHook */] = typings.wouter.mod.NavigationalProps[H] with typings.wouter.anon.Children
}
