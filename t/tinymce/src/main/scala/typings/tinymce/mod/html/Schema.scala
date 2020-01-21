package typings.tinymce.mod.html

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "html.Schema")
@js.native
class Schema protected () extends js.Object {
  def this(settings: js.Object) = this()
  def addCustomElements(custom_elements: String): Unit = js.native
  def addValidChildren(valid_children: String): Unit = js.native
  def addValidElements(valid_elements: String): Unit = js.native
  def getBlockElements(): StringDictionary[js.Object] = js.native
  def getBoolAttrs(): StringDictionary[js.Object] = js.native
  def getCustomElements(): StringDictionary[js.Object] = js.native
  def getElementRule(name: String): js.Object = js.native
  def getInvalidStyles(): Unit = js.native
  def getMoveCaretBeforeOnEnterElements(): StringDictionary[js.Object] = js.native
  def getNonEmptyElements(): StringDictionary[js.Object] = js.native
  def getSelfClosingElements(): StringDictionary[js.Object] = js.native
  def getShortEndedElements(): StringDictionary[js.Object] = js.native
  def getSpecialElements(): StringDictionary[js.Object] = js.native
  def getTextBlockElements(): StringDictionary[js.Object] = js.native
  def getTextInlineElements(): StringDictionary[js.Object] = js.native
  def getValidClasses(): Unit = js.native
  def getValidStyles(): Unit = js.native
  def getWhiteSpaceElements(): StringDictionary[js.Object] = js.native
  def isValid(name: String): Boolean = js.native
  def isValid(name: String, attr: String): Boolean = js.native
  def isValidChild(name: String, child: String): Boolean = js.native
  def setValidElements(valid_elements: String): Unit = js.native
}

