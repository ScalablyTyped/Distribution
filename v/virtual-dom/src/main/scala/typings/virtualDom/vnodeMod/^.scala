package typings.virtualDom.vnodeMod

import org.scalablytyped.runtime.TopLevel
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.VNodeConstructor
import typings.virtualDom.VirtualDOM.VProperties
import typings.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
@js.native
class ^ protected () extends VNode {
  def this(tagName: String, properties: VProperties, children: js.Array[VTree]) = this()
  def this(tagName: String, properties: VProperties, children: js.Array[VTree], key: String) = this()
  def this(
    tagName: String,
    properties: VProperties,
    children: js.Array[VTree],
    key: String,
    namespace: String
  ) = this()
  /* CompleteClass */
  override var children: js.Array[VTree] = js.native
  /* CompleteClass */
  override var count: Double = js.native
  /* CompleteClass */
  override var descendantHooks: js.Array[_] = js.native
  /* CompleteClass */
  override var hasThunks: Boolean = js.native
  /* CompleteClass */
  override var hasWidgets: Boolean = js.native
  /* CompleteClass */
  override var hooks: js.Array[_] = js.native
  /* CompleteClass */
  override var properties: VProperties = js.native
  /* CompleteClass */
  override var tagName: String = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var version: String = js.native
}

@JSImport("virtual-dom/vnode/vnode", JSImport.Namespace)
@js.native
object ^ extends TopLevel[VNodeConstructor]

