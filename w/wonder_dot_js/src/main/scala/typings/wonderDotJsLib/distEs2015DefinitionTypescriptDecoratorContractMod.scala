package typings
package wonderDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/contract", JSImport.Namespace)
@js.native
object distEs2015DefinitionTypescriptDecoratorContractMod extends js.Object {
  def assert(cond: scala.Boolean): scala.Unit = js.native
  def assert(cond: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def describe(message: java.lang.String, func: js.Function): scala.Unit = js.native
  def describe(message: java.lang.String, func: js.Function, preCondition: js.Function): scala.Unit = js.native
  def describe(message: java.lang.String, func: js.Function, preCondition: js.Function, context: js.Any): scala.Unit = js.native
  def ensure(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetterAndSetter(outGetterFunc: js.Any, outSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureSetter(outFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def invariant(func: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def it(message: java.lang.String, func: js.Function): scala.Unit = js.native
  def it(message: java.lang.String, func: js.Function, context: js.Any): scala.Unit = js.native
  def requireCheck(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetterAndSetter(inGetterFunc: js.Any, inSetterFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireSetter(inFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
}

