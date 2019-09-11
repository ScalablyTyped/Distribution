package typings.trustedDashTypes.trustedDashTypesMod

import typings.std.Pick
import typings.trustedDashTypes.trustedDashTypesStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedTypePolicyFactory extends js.Object {
  var defaultPolicy: js.UndefOr[TrustedTypePolicy] = js.native
  var emptyHTML: TrustedHTML = js.native
  def createPolicy[Keys /* <: String */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys]): Pick[TrustedTypePolicy, name | Keys] = js.native
  def createPolicy[Keys /* <: String */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys], expose: Boolean): Pick[TrustedTypePolicy, name | Keys] = js.native
  def getAttributeType(tagName: String, attrName: String): String | Null = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String): String | Null = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String, attrNs: String): String | Null = js.native
  def getPolicyNames(): js.Array[String] = js.native
  def getPropertyType(tagName: String, propName: String): String | Null = js.native
  def getPropertyType(tagName: String, propName: String, elemNs: String): String | Null = js.native
  def isHTML(value: js.Any): /* is trusted-types.trusted-types.TrustedHTML */ Boolean = js.native
  def isScript(value: js.Any): /* is trusted-types.trusted-types.TrustedScript */ Boolean = js.native
  def isScriptURL(value: js.Any): /* is trusted-types.trusted-types.TrustedScriptURL */ Boolean = js.native
  def isURL(value: js.Any): /* is trusted-types.trusted-types.TrustedURL */ Boolean = js.native
}

