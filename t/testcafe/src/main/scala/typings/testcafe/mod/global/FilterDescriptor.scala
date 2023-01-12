package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterDescriptor extends StObject {
  
  var fixture: js.UndefOr[String] = js.undefined
  
  var fixtureGrep: js.UndefOr[String] = js.undefined
  
  var fixtureMeta: js.UndefOr[Metadata] = js.undefined
  
  var test: js.UndefOr[String] = js.undefined
  
  var testGrep: js.UndefOr[String] = js.undefined
  
  var testMeta: js.UndefOr[Metadata] = js.undefined
}
object FilterDescriptor {
  
  inline def apply(): FilterDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterDescriptor] (val x: Self) extends AnyVal {
    
    inline def setFixture(value: String): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
    
    inline def setFixtureGrep(value: String): Self = StObject.set(x, "fixtureGrep", value.asInstanceOf[js.Any])
    
    inline def setFixtureGrepUndefined: Self = StObject.set(x, "fixtureGrep", js.undefined)
    
    inline def setFixtureMeta(value: Metadata): Self = StObject.set(x, "fixtureMeta", value.asInstanceOf[js.Any])
    
    inline def setFixtureMetaUndefined: Self = StObject.set(x, "fixtureMeta", js.undefined)
    
    inline def setFixtureUndefined: Self = StObject.set(x, "fixture", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestGrep(value: String): Self = StObject.set(x, "testGrep", value.asInstanceOf[js.Any])
    
    inline def setTestGrepUndefined: Self = StObject.set(x, "testGrep", js.undefined)
    
    inline def setTestMeta(value: Metadata): Self = StObject.set(x, "testMeta", value.asInstanceOf[js.Any])
    
    inline def setTestMetaUndefined: Self = StObject.set(x, "testMeta", js.undefined)
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
