package typings.vegaLite.anon

import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.srcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Test extends StObject {
  
  /**
    * Predicate for triggering the condition
    */
  var test: LogicalComposition[Predicate] = js.native
}
object Test {
  
  @scala.inline
  def apply(test: LogicalComposition[Predicate]): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTest(value: LogicalComposition[Predicate]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
