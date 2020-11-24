package typings.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preactMod {
  
  type LinkProps[H /* <: typings.wouter.useLocationMod.BaseLocationHook */] = typings.wouter.anon.OmitHTMLAttributesEventTa with typings.wouter.preactMod.NavigationalProps[H]
  
  type NavigationalProps[H /* <: typings.wouter.useLocationMod.BaseLocationHook */] = (typings.wouter.anon.HrefTo | typings.wouter.anon.HrefPath) with typings.wouter.useLocationMod.HookNavigationOptions[H]
  
  type RedirectProps[H /* <: typings.wouter.useLocationMod.BaseLocationHook */] = typings.wouter.preactMod.NavigationalProps[H] with typings.wouter.anon.Children
}
