package typings.vegaLite.anon

import typings.vegaLite.buildSrcLogicalMod.LogicalComposition
import typings.vegaLite.buildSrcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Test extends StObject {
  
  /**
    * Predicate for triggering the condition
    */
  var test: LogicalComposition[Predicate]
}
object Test {
  
  inline def apply(test: LogicalComposition[Predicate]): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
    
    inline def setTest(value: LogicalComposition[Predicate]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
