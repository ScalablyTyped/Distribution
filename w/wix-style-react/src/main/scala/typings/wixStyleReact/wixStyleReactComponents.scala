package typings.wixStyleReact

import typings.react.mod.ComponentType
import typings.wixStyleReact.baseComponentsMod.WixComponentProps
import typings.wixStyleReact.baseComponentsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wixStyleReactComponents extends wixStyleReactProps {
  @scala.inline
  def BaseComponents[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[default[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[typings.wixStyleReact.buttonMod.default].asInstanceOf[ComponentType[ButtonProps]]
  @scala.inline
  def Loader: ComponentType[LoaderProps] = js.constructorOf[typings.wixStyleReact.loaderMod.default].asInstanceOf[ComponentType[LoaderProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.wixStyleReact.textMod.default.asInstanceOf[ComponentType[TextProps]]
  @scala.inline
  def WixComponent[T /* <: WixComponentProps */]: ComponentType[T] = js.constructorOf[typings.wixStyleReact.mod.WixComponent[T]].asInstanceOf[ComponentType[T]]
}

