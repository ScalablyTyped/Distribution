package typings.sweetalert

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModulesUtilsMod {
  
  @JSImport("sweetalert/typings/modules/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNode(className: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNode")(className.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def insertAfter(newNode: Node, referenceNode: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(newNode.asInstanceOf[js.Any], referenceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ordinalSuffixOf(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalSuffixOf")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stringToNode(html: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToNode")(html.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def throwErr(message: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwErr")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
