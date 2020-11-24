package typings.vcf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vCard extends js.Object {
  
  /** Add a vCard property  */
  def add(key: String, value: String): vCard = js.native
  def add(key: String, value: String, params: StringDictionary[String | js.Array[String]]): vCard = js.native
  
  /** Add a vCard property  */
  def addProperty(prop: Property): vCard = js.native
  
  var data: StringDictionary[Property | js.Array[Property]] = js.native
  
  /** Get a vCard property */
  def get(key: String): Property | js.Array[Property] = js.native
  
  /** Parse a vcf formatted vCard */
  def parse(value: String): vCard = js.native
  def parse(value: Buffer): vCard = js.native
  
  /** Set a vCard property */
  def set(key: String, value: String): vCard = js.native
  def set(key: String, value: String, params: StringDictionary[String | js.Array[String]]): vCard = js.native
  
  /** Set a vCard property */
  def setProperty(prop: Property): vCard = js.native
  
  /** Returns a formatted jCard JSON object */
  def toJCard(): jCard = js.native
  def toJCard(version: CardVersion): jCard = js.native
  
  /** Returns a formatted jCard JSON object */
  def toJSON(): jCard = js.native
  
  def toString(version: js.UndefOr[scala.Nothing], charset: String): String = js.native
  def toString(version: CardVersion): String = js.native
  def toString(version: CardVersion, charset: String): String = js.native
  
  var version: CardVersion = js.native
}
