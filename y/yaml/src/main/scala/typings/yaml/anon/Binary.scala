package typings.yaml.anon

import typings.yaml.distSchemaTypesMod.CollectionTag
import typings.yaml.distSchemaTypesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary extends StObject {
  
  var binary: ScalarTag
  
  var bool: ScalarTagtestRegExp
  
  var float: ScalarTag
  
  var floatExp: ScalarTag
  
  var floatNaN: ScalarTag
  
  var floatTime: ScalarTag
  
  var int: ScalarTag
  
  var intHex: ScalarTag
  
  var intOct: ScalarTag
  
  var intTime: ScalarTag
  
  var map: CollectionTag
  
  var `null`: ScalarTagtestRegExp
  
  var omap: CollectionTag
  
  var pairs: CollectionTag
  
  var seq: CollectionTag
  
  var set: CollectionTag
  
  var timestamp: ScalarTagtestRegExp
}
object Binary {
  
  inline def apply(
    binary: ScalarTag,
    bool: ScalarTagtestRegExp,
    float: ScalarTag,
    floatExp: ScalarTag,
    floatNaN: ScalarTag,
    floatTime: ScalarTag,
    int: ScalarTag,
    intHex: ScalarTag,
    intOct: ScalarTag,
    intTime: ScalarTag,
    map: CollectionTag,
    `null`: ScalarTagtestRegExp,
    omap: CollectionTag,
    pairs: CollectionTag,
    seq: CollectionTag,
    set: CollectionTag,
    timestamp: ScalarTagtestRegExp
  ): Binary = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], floatExp = floatExp.asInstanceOf[js.Any], floatNaN = floatNaN.asInstanceOf[js.Any], floatTime = floatTime.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], intHex = intHex.asInstanceOf[js.Any], intOct = intOct.asInstanceOf[js.Any], intTime = intTime.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], omap = omap.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: ScalarTag): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBool(value: ScalarTagtestRegExp): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: ScalarTag): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatExp(value: ScalarTag): Self = StObject.set(x, "floatExp", value.asInstanceOf[js.Any])
    
    inline def setFloatNaN(value: ScalarTag): Self = StObject.set(x, "floatNaN", value.asInstanceOf[js.Any])
    
    inline def setFloatTime(value: ScalarTag): Self = StObject.set(x, "floatTime", value.asInstanceOf[js.Any])
    
    inline def setInt(value: ScalarTag): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setIntHex(value: ScalarTag): Self = StObject.set(x, "intHex", value.asInstanceOf[js.Any])
    
    inline def setIntOct(value: ScalarTag): Self = StObject.set(x, "intOct", value.asInstanceOf[js.Any])
    
    inline def setIntTime(value: ScalarTag): Self = StObject.set(x, "intTime", value.asInstanceOf[js.Any])
    
    inline def setMap(value: CollectionTag): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setNull(value: ScalarTagtestRegExp): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setOmap(value: CollectionTag): Self = StObject.set(x, "omap", value.asInstanceOf[js.Any])
    
    inline def setPairs(value: CollectionTag): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: CollectionTag): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSet(value: CollectionTag): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: ScalarTagtestRegExp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
