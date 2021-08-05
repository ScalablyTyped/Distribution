package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: js.Any
  
  var `match`: js.Any
  
  var normalize: js.Any
  
  var pretest: js.Any
  
  var re: Emailfuzzy
  
  var set: js.Any
  
  var test: js.Any
  
  var testSchemaAt: js.Any
  
  var tlds: js.Any
}
object Add {
  
  inline def apply(
    add: js.Any,
    `match`: js.Any,
    normalize: js.Any,
    pretest: js.Any,
    re: Emailfuzzy,
    set: js.Any,
    test: js.Any,
    testSchemaAt: js.Any,
    tlds: js.Any
  ): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], pretest = pretest.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], testSchemaAt = testSchemaAt.asInstanceOf[js.Any], tlds = tlds.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: js.Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: js.Any): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setPretest(value: js.Any): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
    
    inline def setRe(value: Emailfuzzy): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    inline def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setTest(value: js.Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestSchemaAt(value: js.Any): Self = StObject.set(x, "testSchemaAt", value.asInstanceOf[js.Any])
    
    inline def setTlds(value: js.Any): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
  }
}
