package typings.wouter

import typings.react.reactMod.ComponentType
import typings.std.Partial
import typings.wouter.wouterMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wouterComponents extends wouterProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = typings.wouter.wouterMod.Link.asInstanceOf[typings.react.reactMod.ComponentType[LinkProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = typings.wouter.wouterMod.Redirect.asInstanceOf[typings.react.reactMod.ComponentType[RedirectProps]]
  @scala.inline
  def Route: ComponentType[RouteProps] = typings.wouter.wouterMod.Route.asInstanceOf[typings.react.reactMod.ComponentType[RouteProps]]
  @scala.inline
  def Router: ComponentType[Partial[RouterProps] with Anon_Children] = typings.wouter.wouterMod.Router.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.std.Partial[typings.wouter.wouterMod.RouterProps] with typings.wouter.Anon_Children]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = typings.wouter.wouterMod.Switch.asInstanceOf[typings.react.reactMod.ComponentType[SwitchProps]]
}

