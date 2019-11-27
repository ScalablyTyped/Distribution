package typings.wixDashStyleDashReact

import typings.react.reactMod.ComponentType
import typings.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wixDashStyleDashReactComponents extends wixDashStyleDashReactProps {
  @scala.inline
  def BaseComponents[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixDashStyleDashReact.baseComponentsMod.default[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[typings.wixDashStyleDashReact.buttonMod.default].asInstanceOf[typings.react.reactMod.ComponentType[ButtonProps]]
  @scala.inline
  def Loader: ComponentType[LoaderProps] = js.constructorOf[typings.wixDashStyleDashReact.loaderMod.default].asInstanceOf[typings.react.reactMod.ComponentType[LoaderProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.wixDashStyleDashReact.textMod.default.asInstanceOf[typings.react.reactMod.ComponentType[TextProps]]
  @scala.inline
  def WixComponent[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixDashStyleDashReact.wixDashStyleDashReactMod.WixComponent[T]].asInstanceOf[typings.react.reactMod.ComponentType[T]]
}

