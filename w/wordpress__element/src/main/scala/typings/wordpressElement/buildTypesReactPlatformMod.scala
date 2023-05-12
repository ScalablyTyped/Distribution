package typings.wordpressElement

import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.reactDom.clientMod.HydrationOptions
import typings.reactDom.clientMod.Root
import typings.reactDom.clientMod.RootOptions
import typings.reactDom.mod.Renderer
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReactPlatformMod {
  
  @JSImport("@wordpress/element/build-types/react-platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPortal(children: ReactNode, container: DocumentFragment): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: DocumentFragment, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  inline def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
  
  inline def createRoot(container: DocumentFragment): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: DocumentFragment, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def createRoot(container: Element): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: Element, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  inline def findDOMNode(): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[Element | Null | Text]
  inline def findDOMNode(instance: ReactInstance): Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[Element | Null | Text]
  
  inline def flushSync[R](fn: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def flushSync[A, R](fn: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @JSImport("@wordpress/element/build-types/react-platform", "hydrate")
  @js.native
  val hydrate: Renderer = js.native
  
  inline def hydrateRoot(container: Document, initialChildren: ReactNode): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Document, initialChildren: ReactNode, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: ReactNode): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: ReactNode, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  @JSImport("@wordpress/element/build-types/react-platform", "render")
  @js.native
  val render: Renderer = js.native
  
  inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def unmountComponentAtNode(container: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
