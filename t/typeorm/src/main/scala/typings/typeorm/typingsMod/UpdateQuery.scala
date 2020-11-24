package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.typeorm.anon.Type
import typings.typeorm.typeormBooleans.`true`
import typings.typeorm.typeormNumbers.`-1`
import typings.typeorm.typeormNumbers.`1`
import typings.typeorm.typeormStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQuery[T] extends js.Object {
  
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.native
  
  @JSName("$bit")
  var $bit: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[js.Any]
  ] = js.native
  
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? true | {  $type :'date' | 'timestamp'}}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | (StringDictionary[`true` | Type])
  ] = js.native
  
  @JSName("$each")
  var $each: js.UndefOr[Partial[T] | StringDictionary[js.Array[_]]] = js.native
  
  @JSName("$inc")
  var $inc: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.native
  
  @JSName("$max")
  var $max: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.native
  
  @JSName("$min")
  var $min: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.native
  
  @JSName("$mul")
  var $mul: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.native
  
  @JSName("$pop")
  var $pop: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? -1 | 1}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | (StringDictionary[`-1` | `1`])
  ] = js.native
  
  @JSName("$pull")
  var $pull: js.UndefOr[Partial[T] | (StringDictionary[Condition[T, /* keyof T */ String]])] = js.native
  
  @JSName("$push")
  var $push: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.native
  
  @JSName("$pushAll")
  var $pushAll: js.UndefOr[Partial[T] | StringDictionary[js.Array[_]]] = js.native
  
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[/* keyof T */ String]] = js.native
  
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.native
  
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.native
  
  @JSName("$unset")
  var $unset: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? ''}
    */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[_empty]
  ] = js.native
}
object UpdateQuery {
  
  @scala.inline
  def apply[T](): UpdateQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQuery[T]]
  }
  
  @scala.inline
  implicit class UpdateQueryOps[Self <: UpdateQuery[_], T] (val x: Self with UpdateQuery[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$addToSet(value: Partial[T] | StringDictionary[js.Any]): Self = this.set("$addToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$addToSet: Self = this.set("$addToSet", js.undefined)
    
    @scala.inline
    def set$bit(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? any}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[js.Any]
    ): Self = this.set("$bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bit: Self = this.set("$bit", js.undefined)
    
    @scala.inline
    def set$currentDate(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? true | {  $type :'date' | 'timestamp'}}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | (StringDictionary[`true` | Type])
    ): Self = this.set("$currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$currentDate: Self = this.set("$currentDate", js.undefined)
    
    @scala.inline
    def set$each(value: Partial[T] | StringDictionary[js.Array[_]]): Self = this.set("$each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$each: Self = this.set("$each", js.undefined)
    
    @scala.inline
    def set$inc(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = this.set("$inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$inc: Self = this.set("$inc", js.undefined)
    
    @scala.inline
    def set$max(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = this.set("$max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$max: Self = this.set("$max", js.undefined)
    
    @scala.inline
    def set$min(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = this.set("$min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$min: Self = this.set("$min", js.undefined)
    
    @scala.inline
    def set$mul(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = this.set("$mul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$mul: Self = this.set("$mul", js.undefined)
    
    @scala.inline
    def set$pop(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? -1 | 1}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | (StringDictionary[`-1` | `1`])
    ): Self = this.set("$pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$pop: Self = this.set("$pop", js.undefined)
    
    @scala.inline
    def set$pull(value: Partial[T] | (StringDictionary[Condition[T, /* keyof T */ String]])): Self = this.set("$pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$pull: Self = this.set("$pull", js.undefined)
    
    @scala.inline
    def set$push(value: Partial[T] | StringDictionary[js.Any]): Self = this.set("$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$push: Self = this.set("$push", js.undefined)
    
    @scala.inline
    def set$pushAll(value: Partial[T] | StringDictionary[js.Array[_]]): Self = this.set("$pushAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$pushAll: Self = this.set("$pushAll", js.undefined)
    
    @scala.inline
    def set$rename(value: StringDictionary[/* keyof T */ String]): Self = this.set("$rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$rename: Self = this.set("$rename", js.undefined)
    
    @scala.inline
    def set$set(value: Partial[T] | StringDictionary[js.Any]): Self = this.set("$set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$set: Self = this.set("$set", js.undefined)
    
    @scala.inline
    def set$setOnInsert(value: Partial[T] | StringDictionary[js.Any]): Self = this.set("$setOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$setOnInsert: Self = this.set("$setOnInsert", js.undefined)
    
    @scala.inline
    def set$unset(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? ''}
      */ typings.typeorm.typeormStrings.UpdateQuery with TopLevel[js.Any]) | StringDictionary[_empty]
    ): Self = this.set("$unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$unset: Self = this.set("$unset", js.undefined)
  }
}
