package typings.typeorm

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinOptionsMod {
  
  trait JoinOptions extends StObject {
    
    /**
      * Alias of the main entity.
      */
    var alias: String
    
    /**
      * Array of columns to INNER JOIN.
      */
    var innerJoin: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Array of columns to INNER JOIN.
      */
    var innerJoinAndSelect: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Array of columns to LEFT JOIN.
      */
    var leftJoin: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Array of columns to LEFT JOIN.
      */
    var leftJoinAndSelect: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object JoinOptions {
    
    inline def apply(alias: String): JoinOptions = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinOptions]
    }
    
    extension [Self <: JoinOptions](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setInnerJoin(value: StringDictionary[String]): Self = StObject.set(x, "innerJoin", value.asInstanceOf[js.Any])
      
      inline def setInnerJoinAndSelect(value: StringDictionary[String]): Self = StObject.set(x, "innerJoinAndSelect", value.asInstanceOf[js.Any])
      
      inline def setInnerJoinAndSelectUndefined: Self = StObject.set(x, "innerJoinAndSelect", js.undefined)
      
      inline def setInnerJoinUndefined: Self = StObject.set(x, "innerJoin", js.undefined)
      
      inline def setLeftJoin(value: StringDictionary[String]): Self = StObject.set(x, "leftJoin", value.asInstanceOf[js.Any])
      
      inline def setLeftJoinAndSelect(value: StringDictionary[String]): Self = StObject.set(x, "leftJoinAndSelect", value.asInstanceOf[js.Any])
      
      inline def setLeftJoinAndSelectUndefined: Self = StObject.set(x, "leftJoinAndSelect", js.undefined)
      
      inline def setLeftJoinUndefined: Self = StObject.set(x, "leftJoin", js.undefined)
    }
  }
}
