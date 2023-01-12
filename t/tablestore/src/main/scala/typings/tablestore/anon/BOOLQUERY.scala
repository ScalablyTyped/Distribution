package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`10`
import typings.tablestore.tablestoreInts.`11`
import typings.tablestore.tablestoreInts.`12`
import typings.tablestore.tablestoreInts.`13`
import typings.tablestore.tablestoreInts.`14`
import typings.tablestore.tablestoreInts.`15`
import typings.tablestore.tablestoreInts.`16`
import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import typings.tablestore.tablestoreInts.`4`
import typings.tablestore.tablestoreInts.`5`
import typings.tablestore.tablestoreInts.`6`
import typings.tablestore.tablestoreInts.`7`
import typings.tablestore.tablestoreInts.`8`
import typings.tablestore.tablestoreInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOOLQUERY extends StObject {
  
  var BOOL_QUERY: `6`
  
  var CONST_SCORE_QUERY: `7`
  
  var EXISTS_QUERY: `16`
  
  var FUNCTION_SCORE_QUERY: `8`
  
  var GEO_BOUNDING_BOX_QUERY: `12`
  
  var GEO_DISTANCE_QUERY: `13`
  
  var GEO_POLYGON_QUERY: `14`
  
  var MATCH_ALL_QUERY: `11`
  
  var MATCH_PHRASE_QUERY: `2`
  
  var MATCH_QUERY: `1`
  
  var NESTED_QUERY: `9`
  
  var PREFIX_QUERY: `5`
  
  var RANGE_QUERY: `4`
  
  var TERMS_QUERY: `15`
  
  var TERM_QUERY: `3`
  
  var WILDCARD_QUERY: `10`
}
object BOOLQUERY {
  
  inline def apply(): BOOLQUERY = {
    val __obj = js.Dynamic.literal(BOOL_QUERY = 6, CONST_SCORE_QUERY = 7, EXISTS_QUERY = 16, FUNCTION_SCORE_QUERY = 8, GEO_BOUNDING_BOX_QUERY = 12, GEO_DISTANCE_QUERY = 13, GEO_POLYGON_QUERY = 14, MATCH_ALL_QUERY = 11, MATCH_PHRASE_QUERY = 2, MATCH_QUERY = 1, NESTED_QUERY = 9, PREFIX_QUERY = 5, RANGE_QUERY = 4, TERMS_QUERY = 15, TERM_QUERY = 3, WILDCARD_QUERY = 10)
    __obj.asInstanceOf[BOOLQUERY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOOLQUERY] (val x: Self) extends AnyVal {
    
    inline def setBOOL_QUERY(value: `6`): Self = StObject.set(x, "BOOL_QUERY", value.asInstanceOf[js.Any])
    
    inline def setCONST_SCORE_QUERY(value: `7`): Self = StObject.set(x, "CONST_SCORE_QUERY", value.asInstanceOf[js.Any])
    
    inline def setEXISTS_QUERY(value: `16`): Self = StObject.set(x, "EXISTS_QUERY", value.asInstanceOf[js.Any])
    
    inline def setFUNCTION_SCORE_QUERY(value: `8`): Self = StObject.set(x, "FUNCTION_SCORE_QUERY", value.asInstanceOf[js.Any])
    
    inline def setGEO_BOUNDING_BOX_QUERY(value: `12`): Self = StObject.set(x, "GEO_BOUNDING_BOX_QUERY", value.asInstanceOf[js.Any])
    
    inline def setGEO_DISTANCE_QUERY(value: `13`): Self = StObject.set(x, "GEO_DISTANCE_QUERY", value.asInstanceOf[js.Any])
    
    inline def setGEO_POLYGON_QUERY(value: `14`): Self = StObject.set(x, "GEO_POLYGON_QUERY", value.asInstanceOf[js.Any])
    
    inline def setMATCH_ALL_QUERY(value: `11`): Self = StObject.set(x, "MATCH_ALL_QUERY", value.asInstanceOf[js.Any])
    
    inline def setMATCH_PHRASE_QUERY(value: `2`): Self = StObject.set(x, "MATCH_PHRASE_QUERY", value.asInstanceOf[js.Any])
    
    inline def setMATCH_QUERY(value: `1`): Self = StObject.set(x, "MATCH_QUERY", value.asInstanceOf[js.Any])
    
    inline def setNESTED_QUERY(value: `9`): Self = StObject.set(x, "NESTED_QUERY", value.asInstanceOf[js.Any])
    
    inline def setPREFIX_QUERY(value: `5`): Self = StObject.set(x, "PREFIX_QUERY", value.asInstanceOf[js.Any])
    
    inline def setRANGE_QUERY(value: `4`): Self = StObject.set(x, "RANGE_QUERY", value.asInstanceOf[js.Any])
    
    inline def setTERMS_QUERY(value: `15`): Self = StObject.set(x, "TERMS_QUERY", value.asInstanceOf[js.Any])
    
    inline def setTERM_QUERY(value: `3`): Self = StObject.set(x, "TERM_QUERY", value.asInstanceOf[js.Any])
    
    inline def setWILDCARD_QUERY(value: `10`): Self = StObject.set(x, "WILDCARD_QUERY", value.asInstanceOf[js.Any])
  }
}
