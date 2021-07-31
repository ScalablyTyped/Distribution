package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.typeorm.anon.Type
import typings.typeorm.typeormBooleans.`true`
import typings.typeorm.typeormNumbers.`-1`
import typings.typeorm.typeormNumbers.`1`
import typings.typeorm.typeormStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQuery[T] extends StObject {
  
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  
  @JSName("$bit")
  var $bit: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? any}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[js.Any]
  ] = js.undefined
  
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? true | {  $type :'date' | 'timestamp'}}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | (StringDictionary[`true` | Type])
  ] = js.undefined
  
  @JSName("$each")
  var $each: js.UndefOr[Partial[T] | StringDictionary[js.Array[js.Any]]] = js.undefined
  
  @JSName("$inc")
  var $inc: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.undefined
  
  @JSName("$max")
  var $max: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.undefined
  
  @JSName("$min")
  var $min: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.undefined
  
  @JSName("$mul")
  var $mul: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? number}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
  ] = js.undefined
  
  @JSName("$pop")
  var $pop: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? -1 | 1}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | (StringDictionary[`-1` | `1`])
  ] = js.undefined
  
  @JSName("$pull")
  var $pull: js.UndefOr[Partial[T] | (StringDictionary[Condition[T, /* keyof T */ String]])] = js.undefined
  
  @JSName("$push")
  var $push: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  
  @JSName("$pushAll")
  var $pushAll: js.UndefOr[Partial[T] | StringDictionary[js.Array[js.Any]]] = js.undefined
  
  @JSName("$rename")
  var $rename: js.UndefOr[StringDictionary[/* keyof T */ String]] = js.undefined
  
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] | StringDictionary[js.Any]] = js.undefined
  
  @JSName("$unset")
  var $unset: js.UndefOr[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? ''}
    */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[_empty]
  ] = js.undefined
}
object UpdateQuery {
  
  @scala.inline
  def apply[T](): UpdateQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQuery[T]]
  }
  
  @scala.inline
  implicit class UpdateQueryMutableBuilder[Self <: UpdateQuery[?], T] (val x: Self & UpdateQuery[T]) extends AnyVal {
    
    @scala.inline
    def set$addToSet(value: Partial[T] | StringDictionary[js.Any]): Self = StObject.set(x, "$addToSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$addToSetUndefined: Self = StObject.set(x, "$addToSet", js.undefined)
    
    @scala.inline
    def set$bit(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? any}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[js.Any]
    ): Self = StObject.set(x, "$bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitUndefined: Self = StObject.set(x, "$bit", js.undefined)
    
    @scala.inline
    def set$currentDate(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? true | {  $type :'date' | 'timestamp'}}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | (StringDictionary[`true` | Type])
    ): Self = StObject.set(x, "$currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$currentDateUndefined: Self = StObject.set(x, "$currentDate", js.undefined)
    
    @scala.inline
    def set$each(value: Partial[T] | StringDictionary[js.Array[js.Any]]): Self = StObject.set(x, "$each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$eachUndefined: Self = StObject.set(x, "$each", js.undefined)
    
    @scala.inline
    def set$inc(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = StObject.set(x, "$inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$incUndefined: Self = StObject.set(x, "$inc", js.undefined)
    
    @scala.inline
    def set$max(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
    
    @scala.inline
    def set$min(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
    
    @scala.inline
    def set$mul(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? number}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[scala.Double]
    ): Self = StObject.set(x, "$mul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$mulUndefined: Self = StObject.set(x, "$mul", js.undefined)
    
    @scala.inline
    def set$pop(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? -1 | 1}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | (StringDictionary[`-1` | `1`])
    ): Self = StObject.set(x, "$pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popUndefined: Self = StObject.set(x, "$pop", js.undefined)
    
    @scala.inline
    def set$pull(value: Partial[T] | (StringDictionary[Condition[T, /* keyof T */ String]])): Self = StObject.set(x, "$pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pullUndefined: Self = StObject.set(x, "$pull", js.undefined)
    
    @scala.inline
    def set$push(value: Partial[T] | StringDictionary[js.Any]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pushAll(value: Partial[T] | StringDictionary[js.Array[js.Any]]): Self = StObject.set(x, "$pushAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$pushAllUndefined: Self = StObject.set(x, "$pushAll", js.undefined)
    
    @scala.inline
    def set$pushUndefined: Self = StObject.set(x, "$push", js.undefined)
    
    @scala.inline
    def set$rename(value: StringDictionary[/* keyof T */ String]): Self = StObject.set(x, "$rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$renameUndefined: Self = StObject.set(x, "$rename", js.undefined)
    
    @scala.inline
    def set$set(value: Partial[T] | StringDictionary[js.Any]): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsert(value: Partial[T] | StringDictionary[js.Any]): Self = StObject.set(x, "$setOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$setOnInsertUndefined: Self = StObject.set(x, "$setOnInsert", js.undefined)
    
    @scala.inline
    def set$setUndefined: Self = StObject.set(x, "$set", js.undefined)
    
    @scala.inline
    def set$unset(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? ''}
      */ typings.typeorm.typeormStrings.UpdateQuery & TopLevel[js.Any]) | StringDictionary[_empty]
    ): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$unsetUndefined: Self = StObject.set(x, "$unset", js.undefined)
  }
}
