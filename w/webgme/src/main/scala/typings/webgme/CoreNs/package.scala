package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CoreNs {
  type DataObject = js.Any
  type GUID = String
  type ObjectHash = String
  type RelationRule = RelationRuleDetail with RelationRuleDictionary
  type RelationRuleDictionary = StringDictionary[RelationRuleDetail]
}
