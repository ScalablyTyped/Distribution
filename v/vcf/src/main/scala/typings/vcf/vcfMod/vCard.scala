package typings.vcf.vcfMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait vCard extends js.Object {
  /** Add a vCard property  */
  def add(key: PropertyType, value: String): vCard = js.native
  def add(key: PropertyType, value: String, params: jCardParameters): vCard = js.native
  /** Add a vCard property  */
  def addProperty(prop: Property): vCard = js.native
  /** Get a vCard property */
  def get(key: PropertyType): Property | js.Array[Property] = js.native
  /** Parse a vcf formatted vCard */
  def parse(value: String): vCard = js.native
  def parse(value: Buffer): vCard = js.native
  /** Set a vCard property */
  def set(key: PropertyType, value: String): vCard = js.native
  def set(key: PropertyType, value: String, params: jCardParameters): vCard = js.native
  /** Set a vCard property */
  def setProperty(prop: Property): vCard = js.native
  /** Returns a formatted jCard JSON object */
  def toJCard(): jCard = js.native
  def toJCard(version: CardVersion): jCard = js.native
  /** Returns a formatted jCard JSON object */
  def toJSON(): jCard = js.native
  def toString(version: CardVersion): String = js.native
  def toString(version: CardVersion, charset: String): String = js.native
}

