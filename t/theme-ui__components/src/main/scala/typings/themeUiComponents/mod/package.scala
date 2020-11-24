package typings.themeUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AlertProps = typings.themeUiComponents.mod.BoxProps
  
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typings.themeUiComponents.themeUiComponentsStrings.Assign with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type BadgeProps = typings.themeUiComponents.mod.BoxProps
  
  type BoxProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.div], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type ButtonProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentPropsWithRef[typings.themeUiComponents.themeUiComponentsStrings.button], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type CardProps = typings.themeUiComponents.mod.BoxProps
  
  type CheckboxProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.input], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type CloseProps = typings.themeUiComponents.mod.Omit[
    typings.themeUiComponents.mod.IconButtonProps, 
    typings.themeUiComponents.themeUiComponentsStrings.children
  ]
  
  type ContainerProps = typings.themeUiComponents.mod.BoxProps
  
  type DividerProps = typings.themeUiComponents.mod.BoxProps
  
  type FieldProps[T /* <: typings.react.mod.ElementType[_] */] = typings.themeUiComponents.mod.FieldOwnProps with (typings.themeUiComponents.mod.Omit[
    typings.react.mod.ComponentProps[T], 
    typings.themeUiComponents.themeUiComponentsStrings.as | typings.themeUiComponents.themeUiComponentsStrings.label | typings.themeUiComponents.themeUiComponentsStrings.name
  ]) with typings.themeUiComponents.anon.As[T]
  
  type FlexProps = typings.themeUiComponents.mod.BoxProps
  
  type FlexStyleProps = typings.themeUiComponents.mod.BoxOwnProps
  
  type ForwardRef[T, P] = typings.react.mod.ForwardRefExoticComponent[typings.react.mod.PropsWithoutRef[P] with typings.react.mod.RefAttributes[T]]
  
  type HeadingProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentPropsWithRef[typings.themeUiComponents.themeUiComponentsStrings.h2], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type IconButtonProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentPropsWithRef[typings.themeUiComponents.themeUiComponentsStrings.button], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type ImageProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.img], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type InputProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.input], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type LabelProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.label], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type LinkProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentPropsWithRef[typings.themeUiComponents.themeUiComponentsStrings.a], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type MenuButtonProps = typings.themeUiComponents.mod.IconButtonProps
  
  type MessageProps = typings.themeUiComponents.mod.BoxProps
  
  type NavLinkProps = typings.themeUiComponents.mod.LinkProps
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ProgressProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.progress], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type RadioProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.input], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type SelectProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.select], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type SliderProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.input], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
  
  type TextProps = typings.themeUiComponents.mod.BoxProps
  
  type TextareaProps = typings.themeUiComponents.mod.Assign[
    typings.react.mod.ComponentProps[typings.themeUiComponents.themeUiComponentsStrings.textarea], 
    typings.themeUiComponents.mod.BoxOwnProps
  ]
}
