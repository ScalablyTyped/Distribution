package typings.virtualDom

import org.scalablytyped.runtime.Shortcut
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VNodeConstructor
import typings.virtualDom.VirtualDOM.VProperties
import typings.virtualDom.VirtualDOM.VTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vnodeMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with VNode {
    def this(tagName: String, properties: VProperties, children: js.Array[VTree]) = this()
    def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: String) = this()
    def this(
      tagName: String,
      properties: VProperties,
      children: js.Array[VTree],
      key: String,
      namespace: String
    ) = this()
    def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: Unit, namespace: String) = this()
    
    /* CompleteClass */
    var children: js.Array[VTree] = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    var descendantHooks: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var hasThunks: Boolean = js.native
    
    /* CompleteClass */
    var hasWidgets: Boolean = js.native
    
    /* CompleteClass */
    var hooks: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var properties: VProperties = js.native
    
    /* CompleteClass */
    var tagName: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  @JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VNodeConstructor = js.native
  
  type _To = js.Object & VNodeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vnodeMod.foo` */
  override def _to: js.Object & VNodeConstructor = ^
}
