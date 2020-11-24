package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.typeorm.anon.CaseSensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition[T, P /* <: /* keyof T */ String */]
  extends /* key */ StringDictionary[js.Any] {
  
  @JSName("$and")
  var $and: js.UndefOr[
    js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.native
  
  @JSName("$bitsAllClear")
  var $bitsAllClear: js.UndefOr[js.Object] = js.native
  
  @JSName("$bitsAllSet")
  var $bitsAllSet: js.UndefOr[js.Object] = js.native
  
  @JSName("$bitsAnyClear")
  var $bitsAnyClear: js.UndefOr[js.Object] = js.native
  
  @JSName("$bitsAnySet")
  var $bitsAnySet: js.UndefOr[js.Object] = js.native
  
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[js.Object] = js.native
  
  @JSName("$eq")
  var $eq: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$expr")
  var $expr: js.UndefOr[js.Any] = js.native
  
  @JSName("$geoIntersects")
  var $geoIntersects: js.UndefOr[js.Object] = js.native
  
  @JSName("$geoWithin")
  var $geoWithin: js.UndefOr[js.Object] = js.native
  
  @JSName("$gt")
  var $gt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$gte")
  var $gte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$in")
  var $in: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.native
  
  @JSName("$jsonSchema")
  var $jsonSchema: js.UndefOr[js.Any] = js.native
  
  @JSName("$lt")
  var $lt: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$lte")
  var $lte: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.native
  
  @JSName("$ne")
  var $ne: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ] = js.native
  
  @JSName("$near")
  var $near: js.UndefOr[js.Object] = js.native
  
  @JSName("$nearSphere")
  var $nearSphere: js.UndefOr[js.Object] = js.native
  
  @JSName("$nin")
  var $nin: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.native
  
  @JSName("$not")
  var $not: js.UndefOr[
    (js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
  ] = js.native
  
  @JSName("$options")
  var $options: js.UndefOr[String] = js.native
  
  @JSName("$or")
  var $or: js.UndefOr[
    js.Array[
      (FilterQuery[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
      ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ]
  ] = js.native
  
  @JSName("$regex")
  var $regex: js.UndefOr[RegExp] = js.native
  
  @JSName("$size")
  var $size: js.UndefOr[scala.Double] = js.native
  
  @JSName("$text")
  var $text: js.UndefOr[CaseSensitive] = js.native
  
  @JSName("$where")
  var $where: js.UndefOr[js.Object] = js.native
}
object Condition {
  
  @scala.inline
  def apply[T, P /* <: /* keyof T */ String */](): Condition[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition[T, P]]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition[_, _], T, P /* <: /* keyof T */ String */] (val x: Self with (Condition[T, P])) extends AnyVal {
    
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
    def set$andVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = this.set("$and", js.Array(value :_*))
    
    @scala.inline
    def set$and(
      value: js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]
    ): Self = this.set("$and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$and: Self = this.set("$and", js.undefined)
    
    @scala.inline
    def set$bitsAllClear(value: js.Object): Self = this.set("$bitsAllClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAllClear: Self = this.set("$bitsAllClear", js.undefined)
    
    @scala.inline
    def set$bitsAllSet(value: js.Object): Self = this.set("$bitsAllSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAllSet: Self = this.set("$bitsAllSet", js.undefined)
    
    @scala.inline
    def set$bitsAnyClear(value: js.Object): Self = this.set("$bitsAnyClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAnyClear: Self = this.set("$bitsAnyClear", js.undefined)
    
    @scala.inline
    def set$bitsAnySet(value: js.Object): Self = this.set("$bitsAnySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$bitsAnySet: Self = this.set("$bitsAnySet", js.undefined)
    
    @scala.inline
    def set$elemMatch(value: js.Object): Self = this.set("$elemMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$elemMatch: Self = this.set("$elemMatch", js.undefined)
    
    @scala.inline
    def set$eq(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$eq: Self = this.set("$eq", js.undefined)
    
    @scala.inline
    def set$expr(value: js.Any): Self = this.set("$expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$expr: Self = this.set("$expr", js.undefined)
    
    @scala.inline
    def set$geoIntersects(value: js.Object): Self = this.set("$geoIntersects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$geoIntersects: Self = this.set("$geoIntersects", js.undefined)
    
    @scala.inline
    def set$geoWithin(value: js.Object): Self = this.set("$geoWithin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$geoWithin: Self = this.set("$geoWithin", js.undefined)
    
    @scala.inline
    def set$gt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gt: Self = this.set("$gt", js.undefined)
    
    @scala.inline
    def set$gte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$gte: Self = this.set("$gte", js.undefined)
    
    @scala.inline
    def set$inVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)*): Self = this.set("$in", js.Array(value :_*))
    
    @scala.inline
    def set$in(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]
    ): Self = this.set("$in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$in: Self = this.set("$in", js.undefined)
    
    @scala.inline
    def set$jsonSchema(value: js.Any): Self = this.set("$jsonSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$jsonSchema: Self = this.set("$jsonSchema", js.undefined)
    
    @scala.inline
    def set$lt(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lt: Self = this.set("$lt", js.undefined)
    
    @scala.inline
    def set$lte(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$lte: Self = this.set("$lte", js.undefined)
    
    @scala.inline
    def set$mod(value: js.Tuple2[scala.Double, scala.Double]): Self = this.set("$mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$mod: Self = this.set("$mod", js.undefined)
    
    @scala.inline
    def set$ne(value: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any): Self = this.set("$ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ne: Self = this.set("$ne", js.undefined)
    
    @scala.inline
    def set$near(value: js.Object): Self = this.set("$near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$near: Self = this.set("$near", js.undefined)
    
    @scala.inline
    def set$nearSphere(value: js.Object): Self = this.set("$nearSphere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nearSphere: Self = this.set("$nearSphere", js.undefined)
    
    @scala.inline
    def set$ninVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)*): Self = this.set("$nin", js.Array(value :_*))
    
    @scala.inline
    def set$nin(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]
    ): Self = this.set("$nin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$nin: Self = this.set("$nin", js.undefined)
    
    @scala.inline
    def set$notVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = this.set("$not", js.Array(value :_*))
    
    @scala.inline
    def set$not(
      value: (js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
    ): Self = this.set("$not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$not: Self = this.set("$not", js.undefined)
    
    @scala.inline
    def set$options(value: String): Self = this.set("$options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$options: Self = this.set("$options", js.undefined)
    
    @scala.inline
    def set$orVarargs(
      value: ((FilterQuery[
          /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any))*
    ): Self = this.set("$or", js.Array(value :_*))
    
    @scala.inline
    def set$or(
      value: js.Array[
          (FilterQuery[
            /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
          ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any)
        ]
    ): Self = this.set("$or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$or: Self = this.set("$or", js.undefined)
    
    @scala.inline
    def set$regex(value: RegExp): Self = this.set("$regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$regex: Self = this.set("$regex", js.undefined)
    
    @scala.inline
    def set$size(value: scala.Double): Self = this.set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$size: Self = this.set("$size", js.undefined)
    
    @scala.inline
    def set$text(value: CaseSensitive): Self = this.set("$text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$text: Self = this.set("$text", js.undefined)
    
    @scala.inline
    def set$where(value: js.Object): Self = this.set("$where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$where: Self = this.set("$where", js.undefined)
  }
}
