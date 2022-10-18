package typings.webdriverio

import typings.std.Animation
import typings.std.AnimationEvent
import typings.std.Attr
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.ClipboardEvent
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMStringMap
import typings.std.DOMTokenList
import typings.std.Document
import typings.std.DocumentAndElementEventHandlers
import typings.std.DragEvent
import typings.std.Element
import typings.std.ElementInternals
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FocusOptions
import typings.std.FormDataEvent
import typings.std.FullscreenOptions
import typings.std.GetAnimationsOptions
import typings.std.GetRootNodeOptions
import typings.std.GlobalEventHandlers
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
import typings.std.Keyframe
import typings.std.KeyframeAnimationOptions
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.OnErrorEventHandler
import typings.std.ParentNode
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.PropertyIndexedKeyframes
import typings.std.ScrollIntoViewOptions
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.webdriverio.anon.Fn1
import typings.webdriverio.anon.Fn2
import typings.webdriverio.anon.FnCallNamespaceURILocalName
import typings.webdriverio.anon.FnCallQualifiedName
import typings.webdriverio.anon.FnCallSelector
import typings.webdriverio.anon.FnCallSelectors
import typings.webdriverio.anon.FnCallTypeListenerOptions
import typings.webdriverio.anon.FnCallXY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementGetPropertyMod {
  
  @JSImport("webdriverio/build/commands/element/getProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(property: String): js.Promise[
    js.UndefOr[
      String | Double | Boolean | HTMLElement | Element | EventTarget | ChildNode | ParentNode | (js.Function0[js.Array[String] | Boolean | DOMRect | DOMRectList | ElementInternals | Unit]) | Document | (js.Function1[
        js.UndefOr[
          (/* attr */ Attr) | Boolean | (/* pointerId */ Double) | (/* event */ Event) | FocusOptions | FullscreenOptions | GetAnimationsOptions | GetRootNodeOptions | (/* node */ Node) | Null | ScrollIntoViewOptions | (/* init */ ShadowRootInit) | (/* qualifiedName */ String)
        ], 
        js.Array[Animation] | Attr | Boolean | Double | HTMLCollectionOf[Element] | Node | Null | js.Promise[Unit] | ShadowRoot | String | Unit
      ]) | (js.ThisFunction1[
        (/* this */ DocumentAndElementEventHandlers) | (/* this */ Element) | (/* this */ GlobalEventHandlers), 
        (/* ev */ AnimationEvent) | (/* ev */ ClipboardEvent) | (/* ev */ DragEvent) | (/* ev */ Event) | (/* ev */ FocusEvent) | (/* ev */ FormDataEvent) | (/* ev */ KeyboardEvent) | (/* ev */ MouseEvent) | (/* ev */ PointerEvent) | (/* ev */ ProgressEvent[EventTarget]) | (/* ev */ SecurityPolicyViolationEvent) | (/* ev */ SubmitEvent) | (/* ev */ TouchEvent) | (/* ev */ TransitionEvent) | (/* ev */ UIEvent) | (/* ev */ WheelEvent), 
        Any
      ]) | OnErrorEventHandler | FnCallTypeListenerOptions | Fn1 | NamedNodeMap | DOMTokenList | ShadowRoot | FnCallSelector | (js.Function2[
        js.Array[Keyframe] | (/* where */ InsertPosition) | (/* node */ Node) | Null | PropertyIndexedKeyframes | String, 
        js.UndefOr[
          Boolean | Double | (/* element */ Element) | KeyframeAnimationOptions | Node | Null | (/* localName */ String)
        ], 
        Animation | Attr | Boolean | Element | Node | Null | String | Unit
      ]) | FnCallQualifiedName | FnCallNamespaceURILocalName | FnCallXY | (js.Function3[/* namespace */ String | Null, /* qualifiedName */ String, /* value */ String, Unit]) | NodeListOf[ChildNode] | HTMLCollection | FnCallSelectors | Fn2 | HTMLSlotElement | CSSStyleDeclaration | DOMStringMap
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(property.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      String | Double | Boolean | HTMLElement | Element | EventTarget | ChildNode | ParentNode | (js.Function0[js.Array[String] | Boolean | DOMRect | DOMRectList | ElementInternals | Unit]) | Document | (js.Function1[
        js.UndefOr[
          (/* attr */ Attr) | Boolean | (/* pointerId */ Double) | (/* event */ Event) | FocusOptions | FullscreenOptions | GetAnimationsOptions | GetRootNodeOptions | (/* node */ Node) | Null | ScrollIntoViewOptions | (/* init */ ShadowRootInit) | (/* qualifiedName */ String)
        ], 
        js.Array[Animation] | Attr | Boolean | Double | HTMLCollectionOf[Element] | Node | Null | js.Promise[Unit] | ShadowRoot | String | Unit
      ]) | (js.ThisFunction1[
        (/* this */ DocumentAndElementEventHandlers) | (/* this */ Element) | (/* this */ GlobalEventHandlers), 
        (/* ev */ AnimationEvent) | (/* ev */ ClipboardEvent) | (/* ev */ DragEvent) | (/* ev */ Event) | (/* ev */ FocusEvent) | (/* ev */ FormDataEvent) | (/* ev */ KeyboardEvent) | (/* ev */ MouseEvent) | (/* ev */ PointerEvent) | (/* ev */ ProgressEvent[EventTarget]) | (/* ev */ SecurityPolicyViolationEvent) | (/* ev */ SubmitEvent) | (/* ev */ TouchEvent) | (/* ev */ TransitionEvent) | (/* ev */ UIEvent) | (/* ev */ WheelEvent), 
        Any
      ]) | OnErrorEventHandler | FnCallTypeListenerOptions | Fn1 | NamedNodeMap | DOMTokenList | ShadowRoot | FnCallSelector | (js.Function2[
        js.Array[Keyframe] | (/* where */ InsertPosition) | (/* node */ Node) | Null | PropertyIndexedKeyframes | String, 
        js.UndefOr[
          Boolean | Double | (/* element */ Element) | KeyframeAnimationOptions | Node | Null | (/* localName */ String)
        ], 
        Animation | Attr | Boolean | Element | Node | Null | String | Unit
      ]) | FnCallQualifiedName | FnCallNamespaceURILocalName | FnCallXY | (js.Function3[/* namespace */ String | Null, /* qualifiedName */ String, /* value */ String, Unit]) | NodeListOf[ChildNode] | HTMLCollection | FnCallSelectors | Fn2 | HTMLSlotElement | CSSStyleDeclaration | DOMStringMap
    ]
  ]]
}
