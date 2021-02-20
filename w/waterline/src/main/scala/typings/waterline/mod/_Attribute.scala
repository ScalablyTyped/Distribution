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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Attribute extends StObject
object _Attribute {
  
  @scala.inline
  def ArrayAttribute(`type`: js.UndefOr[String] with array): typings.waterline.mod.ArrayAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.ArrayAttribute]
  }
  
  @scala.inline
  def BinaryAttribute(`type`: js.UndefOr[String] with binary): typings.waterline.mod.BinaryAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.BinaryAttribute]
  }
  
  @scala.inline
  def BooleanAttribute(`type`: js.UndefOr[String] with boolean): typings.waterline.mod.BooleanAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.BooleanAttribute]
  }
  
  @scala.inline
  def DateAttribute(`type`: js.UndefOr[String] with date): typings.waterline.mod.DateAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.DateAttribute]
  }
  
  @scala.inline
  def DatetimeAttribute(`type`: js.UndefOr[String] with datetime): typings.waterline.mod.DatetimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.DatetimeAttribute]
  }
  
  @scala.inline
  def EmailAttribute(`type`: js.UndefOr[String] with email): typings.waterline.mod.EmailAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.EmailAttribute]
  }
  
  @scala.inline
  def FloatAttribute(`type`: js.UndefOr[String] with float): typings.waterline.mod.FloatAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.FloatAttribute]
  }
  
  @scala.inline
  def IntegerAttribute(`type`: js.UndefOr[String] with integer): typings.waterline.mod.IntegerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.IntegerAttribute]
  }
  
  @scala.inline
  def JsonAttribute(`type`: js.UndefOr[String] with json): typings.waterline.mod.JsonAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.JsonAttribute]
  }
  
  @scala.inline
  def ManyToManyAttribute(collection: String, via: String): typings.waterline.mod.ManyToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.ManyToManyAttribute]
  }
  
  @scala.inline
  def NumberAttribute(`type`: js.UndefOr[String] with number): typings.waterline.mod.NumberAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.NumberAttribute]
  }
  
  @scala.inline
  def OneToManyAttribute(collection: String, via: String): typings.waterline.mod.OneToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.OneToManyAttribute]
  }
  
  @scala.inline
  def OneToOneAttribute(model: String): typings.waterline.mod.OneToOneAttribute = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.OneToOneAttribute]
  }
  
  @scala.inline
  def StringAttribute(`type`: js.UndefOr[String] with string): typings.waterline.mod.StringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.StringAttribute]
  }
  
  @scala.inline
  def TimeAttribute(`type`: js.UndefOr[String] with time): typings.waterline.mod.TimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.TimeAttribute]
  }
}
