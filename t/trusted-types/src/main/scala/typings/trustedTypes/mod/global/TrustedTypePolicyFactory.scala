package typings.trustedTypes.mod.global

import typings.std.Pick
import typings.trustedTypes.trustedTypesStrings.createHTML
import typings.trustedTypes.trustedTypesStrings.createScript
import typings.trustedTypes.trustedTypesStrings.createScriptURL
import typings.trustedTypes.trustedTypesStrings.createURL
import typings.trustedTypes.trustedTypesStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedTypePolicyFactory extends js.Object {
  var defaultPolicy: js.UndefOr[TrustedTypePolicy] = js.native
  var emptyHTML: TrustedHTML = js.native
  def createPolicy[Keys /* <: /* keyof trusted-types.trusted-types.<global>.TrustedTypePolicyOptions */ createHTML | createScript | createScriptURL | createURL */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys]): Pick[TrustedTypePolicy, name | Keys] = js.native
  def createPolicy[Keys /* <: /* keyof trusted-types.trusted-types.<global>.TrustedTypePolicyOptions */ createHTML | createScript | createScriptURL | createURL */](name: String, policyOptions: Pick[TrustedTypePolicyOptions, Keys], expose: Boolean): Pick[TrustedTypePolicy, name | Keys] = js.native
  def getAttributeType(tagName: String, attrName: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String, attrNs: String): js.UndefOr[String] = js.native
  def getPolicyNames(): js.Array[String] = js.native
  def getPropertyType(tagName: String, propName: String): js.UndefOr[String] = js.native
  def getPropertyType(tagName: String, propName: String, elemNs: String): js.UndefOr[String] = js.native
  def isHTML(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedHTML */ Boolean = js.native
  def isScript(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScript */ Boolean = js.native
  def isScriptURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScriptURL */ Boolean = js.native
  def isURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedURL */ Boolean = js.native
}

