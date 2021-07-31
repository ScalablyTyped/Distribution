package typings.sweetalert

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("sweetalert/typings/modules/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNode(className: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(className.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  @scala.inline
  def insertAfter(newNode: Node, referenceNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isPlainObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def ordinalSuffixOf(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalSuffixOf")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def removeNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stringToNode(html: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToNode")(html.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  @scala.inline
  def throwErr(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwErr")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
