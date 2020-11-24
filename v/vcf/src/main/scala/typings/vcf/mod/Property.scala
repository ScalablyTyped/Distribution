package typings.vcf.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vcf", "Property")
@js.native
class Property protected () extends js.Object {
  def this(field: String, value: String) = this()
  def this(field: String, value: String, params: StringDictionary[String | js.Array[String]]) = this()
  
  /** Check if the property is of a given type */
  def is(`type`: String): Boolean = js.native
  
  /** Check whether the property is empty */
  def isEmpty(): Boolean = js.native
  
  /** Returns a jCard formatted JSON object of just this property */
  def toJSON(): jCardProperty = js.native
  
  def toString(version: CardVersion): String = js.native
}
/* static members */
@JSImport("vcf", "Property")
@js.native
object Property extends js.Object {
  
  /** Creates a property from a jCard formatted JSON object */
  def fromJSON(data: jCardProperty): Property = js.native
}
