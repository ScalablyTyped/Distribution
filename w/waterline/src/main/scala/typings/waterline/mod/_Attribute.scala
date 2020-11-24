package typings.waterline.mod

import typings.waterline.waterlineStrings.array
import typings.waterline.waterlineStrings.binary
import typings.waterline.waterlineStrings.boolean
import typings.waterline.waterlineStrings.date
import typings.waterline.waterlineStrings.datetime
import typings.waterline.waterlineStrings.email
import typings.waterline.waterlineStrings.float
import typings.waterline.waterlineStrings.integer
import typings.waterline.waterlineStrings.json
import typings.waterline.waterlineStrings.number
import typings.waterline.waterlineStrings.string
import typings.waterline.waterlineStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Attribute extends js.Object
object _Attribute {
  
  @scala.inline
  def BooleanAttribute(`type`: js.UndefOr[String] with boolean): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def ArrayAttribute(`type`: js.UndefOr[String] with array): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def EmailAttribute(`type`: js.UndefOr[String] with email): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def DateAttribute(`type`: js.UndefOr[String] with date): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def BinaryAttribute(`type`: js.UndefOr[String] with binary): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def TimeAttribute(`type`: js.UndefOr[String] with time): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def IntegerAttribute(`type`: js.UndefOr[String] with integer): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def JsonAttribute(`type`: js.UndefOr[String] with json): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def StringAttribute(`type`: js.UndefOr[String] with string): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def OneToOneAttribute(model: String): _Attribute = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def FloatAttribute(`type`: js.UndefOr[String] with float): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def OneToManyAttribute(collection: String, via: String): _Attribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def DatetimeAttribute(`type`: js.UndefOr[String] with datetime): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def ManyToManyAttribute(collection: String, via: String): _Attribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
  
  @scala.inline
  def NumberAttribute(`type`: js.UndefOr[String] with number): _Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Attribute]
  }
}
