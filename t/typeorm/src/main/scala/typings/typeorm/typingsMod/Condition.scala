package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.typeorm.anon.CaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition[T, P /* <: /* keyof T */ String */]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.undefined
  
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$eq")
  var $eq: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$gt")
  var $gt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$gte")
  var $gte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.undefined
  
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$lt")
  var $lt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$lte")
  var $lte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  
  @JSName("$ne")
  var $ne: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.undefined
  
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.undefined
  
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.undefined
  
  @JSName("$not")
  var $not: js.UndefOr[
    (js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
  ] = js.undefined
  
  @JSName("$options")
  var $options: js.UndefOr[String] = js.undefined
  
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.undefined
  
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp] = js.undefined
  
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.undefined
  
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.undefined
  
  @JSName("$where")
  var $where: js.UndefOr[js.Object] = js.undefined
}
object Condition {
  
  @scala.inline
  def apply[T, P /* <: /* keyof T */ String */](): Condition[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition[T, P]]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition[?, ?], T, P /* <: /* keyof T */ String */] (val x: Self & (Condition[T, P])) extends AnyVal {
    
    @scala.inline
    def set$and(
      value: js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]
    ): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
    
    @scala.inline
    def set$andVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = StObject.set(x, "$and", js.Array(value :_*))
    
    @scala.inline
    def set$bitsAllClear(value: js.Object): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
    
    @scala.inline
    def set$bitsAllSet(value: js.Object): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
    
    @scala.inline
    def set$bitsAnyClear(value: js.Object): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
    
    @scala.inline
    def set$bitsAnySet(value: js.Object): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
    
    @scala.inline
    def set$elemMatch(value: js.Object): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
    
    @scala.inline
    def set$eq(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
    
    @scala.inline
    def set$expr(value: js.Any): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
    
    @scala.inline
    def set$geoIntersects(value: js.Object): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
    
    @scala.inline
    def set$geoWithin(value: js.Object): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
    
    @scala.inline
    def set$gt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
    
    @scala.inline
    def set$in(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]
    ): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)*): Self = StObject.set(x, "$in", js.Array(value :_*))
    
    @scala.inline
    def set$jsonSchema(value: js.Any): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
    
    @scala.inline
    def set$lt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
    
    @scala.inline
    def set$mod(value: js.Tuple2[scala.Double, scala.Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
    
    @scala.inline
    def set$ne(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
    
    @scala.inline
    def set$near(value: js.Object): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nearSphere(value: js.Object): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
    
    @scala.inline
    def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
    
    @scala.inline
    def set$nin(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]
    ): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
    
    @scala.inline
    def set$ninVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)*): Self = StObject.set(x, "$nin", js.Array(value :_*))
    
    @scala.inline
    def set$not(
      value: (js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
    
    @scala.inline
    def set$notVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = StObject.set(x, "$not", js.Array(value :_*))
    
    @scala.inline
    def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
    
    @scala.inline
    def set$or(
      value: js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]
    ): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
    
    @scala.inline
    def set$orVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = StObject.set(x, "$or", js.Array(value :_*))
    
    @scala.inline
    def set$regex(value: RegExp): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
    
    @scala.inline
    def set$size(value: scala.Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    
    @scala.inline
    def set$text(value: CaseSensitive): Self = StObject.set(x, "$text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$textUndefined: Self = StObject.set(x, "$text", js.undefined)
    
    @scala.inline
    def set$where(value: js.Object): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
  }
}
