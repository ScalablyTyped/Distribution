package typings.trustedDashTypes.trustedDashTypesMod._Global_

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
  def getAttributeType(tagName: String, attrName: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String): js.UndefOr[String] = js.native
  def getAttributeType(tagName: String, attrName: String, elemNs: String, attrNs: String): js.UndefOr[String] = js.native
  def getPolicyNames(): js.Array[String] = js.native
  def getPropertyType(tagName: String, propName: String): js.UndefOr[String] = js.native
  def getPropertyType(tagName: String, propName: String, elemNs: String): js.UndefOr[String] = js.native
  def isHTML(value: js.Any): /* is trusted-types.trusted-types._Global_.TrustedHTML */ Boolean = js.native
  def isScript(value: js.Any): /* is trusted-types.trusted-types._Global_.TrustedScript */ Boolean = js.native
  def isScriptURL(value: js.Any): /* is trusted-types.trusted-types._Global_.TrustedScriptURL */ Boolean = js.native
  def isURL(value: js.Any): /* is trusted-types.trusted-types._Global_.TrustedURL */ Boolean = js.native
}

