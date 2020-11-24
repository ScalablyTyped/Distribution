package typings.trustedTypes.mod.global

import typings.std.Extract
import typings.std.Pick
import typings.trustedTypes.mod.FnNames
import typings.trustedTypes.trustedTypesStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedTypePolicyFactory extends js.Object {
  
  def createPolicy[Options /* <: TrustedTypePolicyOptions */](policyName: String): Pick[TrustedTypePolicy[Options], name | (Extract[/* keyof Options */ String, FnNames])] = js.native
  def createPolicy[Options /* <: TrustedTypePolicyOptions */](policyName: String, policyOptions: Options): Pick[TrustedTypePolicy[Options], name | (Extract[/* keyof Options */ String, FnNames])] = js.native
  
  val defaultPolicy: TrustedTypePolicy[TrustedTypePolicyOptions] | Null = js.native
  
  val emptyHTML: TrustedHTML = js.native
  
  val emptyScript: TrustedScript = js.native
  
  def getAttributeType(tagName: String, attribute: String): String | Null = js.native
  def getAttributeType(tagName: String, attribute: String, elementNs: js.UndefOr[scala.Nothing], attrNs: String): String | Null = js.native
  def getAttributeType(tagName: String, attribute: String, elementNs: String): String | Null = js.native
  def getAttributeType(tagName: String, attribute: String, elementNs: String, attrNs: String): String | Null = js.native
  
  def getPropertyType(tagName: String, property: String): String | Null = js.native
  def getPropertyType(tagName: String, property: String, elementNs: String): String | Null = js.native
  
  def isHTML(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedHTML */ Boolean = js.native
  
  def isScript(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScript */ Boolean = js.native
  
  def isScriptURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScriptURL */ Boolean = js.native
}
