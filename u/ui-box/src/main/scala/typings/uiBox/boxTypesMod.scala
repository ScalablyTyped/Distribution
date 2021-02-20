package typings.uiBox

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Exclude
import typings.std.Pick
import typings.uiBox.anon.AllowUnsafeHref
import typings.uiBox.typesEnhancersMod.EnhancerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxTypesMod {
  
  type BoxComponent[P, D /* <: ElementType[_] */] = js.Function1[/* props */ PolymorphicBoxProps[D, P], Element]
  
  type BoxOwnProps[E /* <: ElementType[_] */, P] = (Without[EnhancerProps, /* keyof P */ String]) with AllowUnsafeHref[E]
  
  type BoxProps[E /* <: ElementType[_] */] = (BoxOwnProps[E, js.Object]) with (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145 */ js.Any
  ])
  
  type PolymorphicBoxProps[E /* <: ElementType[_] */, P] = (BoxOwnProps[E, P]) with (Without[
    PropsOf[E], 
    /* keyof ui-box.anon.BoxOwnPropsElementTypeany & P */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 145 */ js.Any
  ]) with P
  
  type PropsOf[E /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = LibraryManagedAttributes[E, ComponentPropsWithRef[E]]
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
