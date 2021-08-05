package typings.virtualDom

import typings.virtualDom.VirtualDOM.VChild
import typings.virtualDom.VirtualDOM.VNode
import typings.virtualDom.VirtualDOM.createProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hMod {
  
  inline def apply(tagName: String, children: String): VNode = (^.asInstanceOf[js.Dynamic].apply(tagName.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def apply(tagName: String, children: js.Array[VChild]): VNode = (^.asInstanceOf[js.Dynamic].apply(tagName.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def apply(tagName: String, properties: createProperties, children: String): VNode = (^.asInstanceOf[js.Dynamic].apply(tagName.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def apply(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = (^.asInstanceOf[js.Dynamic].apply(tagName.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  
  @JSImport("virtual-dom/h", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
