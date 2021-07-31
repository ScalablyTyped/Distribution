package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Attribute extends StObject
object _Attribute {
  
  @scala.inline
  def ArrayAttribute(): typings.waterline.mod.ArrayAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.waterline.mod.ArrayAttribute]
  }
  
  @scala.inline
  def BinaryAttribute(): typings.waterline.mod.BinaryAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[typings.waterline.mod.BinaryAttribute]
  }
  
  @scala.inline
  def BooleanAttribute(): typings.waterline.mod.BooleanAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.waterline.mod.BooleanAttribute]
  }
  
  @scala.inline
  def DateAttribute(): typings.waterline.mod.DateAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typings.waterline.mod.DateAttribute]
  }
  
  @scala.inline
  def DatetimeAttribute(): typings.waterline.mod.DatetimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("datetime")
    __obj.asInstanceOf[typings.waterline.mod.DatetimeAttribute]
  }
  
  @scala.inline
  def EmailAttribute(): typings.waterline.mod.EmailAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("email")
    __obj.asInstanceOf[typings.waterline.mod.EmailAttribute]
  }
  
  @scala.inline
  def FloatAttribute(): typings.waterline.mod.FloatAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("float")
    __obj.asInstanceOf[typings.waterline.mod.FloatAttribute]
  }
  
  @scala.inline
  def IntegerAttribute(): typings.waterline.mod.IntegerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.waterline.mod.IntegerAttribute]
  }
  
  @scala.inline
  def JsonAttribute(): typings.waterline.mod.JsonAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("json")
    __obj.asInstanceOf[typings.waterline.mod.JsonAttribute]
  }
  
  @scala.inline
  def ManyToManyAttribute(collection: String, via: String): typings.waterline.mod.ManyToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.waterline.mod.ManyToManyAttribute]
  }
  
  @scala.inline
  def NumberAttribute(): typings.waterline.mod.NumberAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
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
  def StringAttribute(): typings.waterline.mod.StringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.waterline.mod.StringAttribute]
  }
  
  @scala.inline
  def TimeAttribute(): typings.waterline.mod.TimeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("time")
    __obj.asInstanceOf[typings.waterline.mod.TimeAttribute]
  }
}
