package typings.atThemeDashUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atThemeDashUiComponentsMod {
  import typings.atThemeDashUiComponents.Anon_As
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.a
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.as
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.button
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.children
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.div
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.h2
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.img
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.input
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.label
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.name
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.progress
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.select
  import typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.textarea
  import typings.react.reactMod.ComponentProps
  import typings.react.reactMod.ComponentPropsWithRef
  import typings.react.reactMod.ElementType
  import typings.react.reactMod.ForwardRefExoticComponent
  import typings.react.reactMod.PropsWithoutRef
  import typings.react.reactMod.RefAttributes
  import typings.std.Omit

  type AlertProps = BoxProps
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typings.atThemeDashUiComponents.atThemeDashUiComponentsStrings.Assign with js.Any
  type BadgeProps = BoxProps
  type BoxProps = Assign[ComponentProps[div], BoxOwnProps]
  type ButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  type CardProps = BoxProps
  type CheckboxProps = Assign[ComponentProps[input], BoxOwnProps]
  type CloseProps = Omit[IconButtonProps, children]
  type ContainerProps = BoxProps
  type DividerProps = BoxProps
  type FieldProps[T /* <: ElementType[_] */] = FieldOwnProps with (Omit[ComponentProps[T], as | label | name]) with Anon_As[T]
  type FlexStyleProps = BoxOwnProps
  type ForwardRef[T, P] = ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]]
  type HeadingProps = Assign[ComponentPropsWithRef[h2], BoxOwnProps]
  type IconButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  type ImageProps = Assign[ComponentProps[img], BoxOwnProps]
  type InputProps = Assign[ComponentProps[input], BoxOwnProps]
  type LabelProps = Assign[ComponentProps[label], BoxOwnProps]
  type LinkProps = Assign[ComponentPropsWithRef[a], BoxOwnProps]
  type MenuButtonProps = IconButtonProps
  type MessageProps = BoxProps
  type NavLinkProps = LinkProps
  type ProgressProps = Assign[ComponentProps[progress], BoxOwnProps]
  type RadioProps = Assign[ComponentProps[input], BoxOwnProps]
  type SelectProps = Assign[ComponentProps[select], BoxOwnProps]
  type SliderProps = Assign[ComponentProps[input], BoxOwnProps]
  type TextProps = BoxProps
  type TextareaProps = Assign[ComponentProps[textarea], BoxOwnProps]
}
