package typings.wouter

import typings.react.mod.ComponentType
import typings.std.Partial
import typings.wouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wouterComponents extends wouterProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = typings.wouter.mod.Link.asInstanceOf[typings.react.mod.ComponentType[LinkProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = typings.wouter.mod.Redirect.asInstanceOf[typings.react.mod.ComponentType[RedirectProps]]
  @scala.inline
  def Router: ComponentType[Partial[RouterProps] with AnonChildren] = typings.wouter.mod.Router.asInstanceOf[typings.react.mod.ComponentType[
  typings.std.Partial[typings.wouter.mod.RouterProps] with typings.wouter.AnonChildren]]
  @scala.inline
  def Switch: ComponentType[SwitchProps] = typings.wouter.mod.Switch.asInstanceOf[typings.react.mod.ComponentType[SwitchProps]]
}

