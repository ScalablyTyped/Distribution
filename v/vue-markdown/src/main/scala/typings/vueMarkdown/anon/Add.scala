package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  var add: js.Any = js.native
  
  var `match`: js.Any = js.native
  
  var normalize: js.Any = js.native
  
  var pretest: js.Any = js.native
  
  var re: Emailfuzzy = js.native
  
  var set: js.Any = js.native
  
  var test: js.Any = js.native
  
  var testSchemaAt: js.Any = js.native
  
  var tlds: js.Any = js.native
}
object Add {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: js.Any): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretest(value: js.Any): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRe(value: Emailfuzzy): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: js.Any): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSchemaAt(value: js.Any): Self = StObject.set(x, "testSchemaAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlds(value: js.Any): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
  }
}
