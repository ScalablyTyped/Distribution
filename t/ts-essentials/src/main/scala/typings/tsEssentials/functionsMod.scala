package typings.tsEssentials

import typings.std.Error
import typings.tsEssentials.typesMod.Exact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("ts-essentials/dist/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-essentials/dist/functions", "UnreachableCaseError")
  @js.native
  open class UnreachableCaseError protected ()
    extends StObject
       with Error {
    def this(value: scala.Nothing) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def assert(condition: Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
  inline def assert(condition: Any, msg: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def createFactoryWithConstraint[Constraint](): js.Function1[/* value */ Constraint, Constraint] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactoryWithConstraint")().asInstanceOf[js.Function1[/* value */ Constraint, Constraint]]
  
  inline def isExact[ExpectedShape](): js.Function1[/* x */ Exact[Any, ExpectedShape], ExpectedShape] = ^.asInstanceOf[js.Dynamic].applyDynamic("isExact")().asInstanceOf[js.Function1[/* x */ Exact[Any, ExpectedShape], ExpectedShape]]
  
  inline def noop(_args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")(_args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
