package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  import org.scalablytyped.runtime.StringDictionary

  type DataObject = js.Any
  type GUID = String
  type ObjectHash = String
  type RelationRule = RelationRuleDetail with RelationRuleDictionary
  type RelationRuleDictionary = StringDictionary[RelationRuleDetail]
}
