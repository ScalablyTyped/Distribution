package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: scala.Any
  
  var `match`: scala.Any
  
  var normalize: scala.Any
  
  var pretest: scala.Any
  
  var re: Emailfuzzy
  
  var set: scala.Any
  
  var test: scala.Any
  
  var testSchemaAt: scala.Any
  
  var tlds: scala.Any
}
object Add {
  
  inline def apply(
    add: scala.Any,
    `match`: scala.Any,
    normalize: scala.Any,
    pretest: scala.Any,
    re: Emailfuzzy,
    set: scala.Any,
    test: scala.Any,
    testSchemaAt: scala.Any,
    tlds: scala.Any
  ): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], pretest = pretest.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], testSchemaAt = testSchemaAt.asInstanceOf[js.Any], tlds = tlds.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: scala.Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: scala.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: scala.Any): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setPretest(value: scala.Any): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
    
    inline def setRe(value: Emailfuzzy): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    inline def setSet(value: scala.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setTest(value: scala.Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestSchemaAt(value: scala.Any): Self = StObject.set(x, "testSchemaAt", value.asInstanceOf[js.Any])
    
    inline def setTlds(value: scala.Any): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
  }
}
