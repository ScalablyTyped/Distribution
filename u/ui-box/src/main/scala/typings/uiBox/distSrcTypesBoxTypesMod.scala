package typings.uiBox

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import typings.uiBox.anon.AllowUnsafeHref
import typings.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesBoxTypesMod {
  
  type BoxComponent[P, D /* <: ElementType[Any] */] = js.Function1[/* props */ PolymorphicBoxProps[D, P], Element]
  
  type BoxOwnProps[E /* <: ElementType[Any] */, P] = (Without[EnhancerProps, /* keyof P */ String]) & AllowUnsafeHref[E]
  
  type BoxProps[E /* <: ElementType[Any] */] = (BoxOwnProps[E, js.Object]) & (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
  ])
  
  type PolymorphicBoxProps[E /* <: ElementType[Any] */, P] = (BoxOwnProps[E, P]) & (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany & P */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163, starting with typings.uiBox.uiBoxStrings.borderColor, typings.uiBox.uiBoxStrings.gridTemplate, typings.uiBox.uiBoxStrings.backgroundImage */ Any
  ]) & P
  
  type PropsOf[E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.uiBox.uiBoxStrings.a, typings.uiBox.uiBoxStrings.abbr, typings.uiBox.uiBoxStrings.address */ Any */] = LibraryManagedAttributes[E, ComponentPropsWithRef[E]]
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
