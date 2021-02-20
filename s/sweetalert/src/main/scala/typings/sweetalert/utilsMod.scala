package typings.sweetalert

import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("sweetalert/typings/modules/utils", "getNode")
  @js.native
  def getNode(className: String): HTMLElement = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "insertAfter")
  @js.native
  def insertAfter(newNode: Node, referenceNode: Node): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "isPlainObject")
  @js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "ordinalSuffixOf")
  @js.native
  def ordinalSuffixOf(num: Double): String = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "removeNode")
  @js.native
  def removeNode(node: Node): Unit = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "stringToNode")
  @js.native
  def stringToNode(html: String): HTMLElement = js.native
  
  @JSImport("sweetalert/typings/modules/utils", "throwErr")
  @js.native
  def throwErr(message: String): scala.Nothing = js.native
}
