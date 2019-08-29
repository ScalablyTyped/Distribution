package typings.vegaDashTypings.typesRuntimeDataflowMod

import typings.vegaDashTypings.vegaDashTypingsNumbers.`0`
import typings.vegaDashTypings.vegaDashTypingsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/dataflow", "Operator")
@js.native
class Operator () extends js.Object {
  def this(init: js.Any) = this()
  def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
  def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _], params: js.Any) = this()
  def this(
    init: js.Any,
    update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
    params: js.Any,
    react: Boolean
  ) = this()
  def evaluate(pulse: js.Any): js.Any = js.native
  def marshall(stamp: Double): js.Any = js.native
  def modified(): js.Function1[/* state */ js.Any, _] = js.native
  def parameters(params: js.Object): js.Array[Operator] = js.native
  def parameters(params: js.Object, react: Boolean): js.Array[Operator] = js.native
  def parameters(params: js.Object, react: Boolean, initonly: Boolean): js.Array[Operator] = js.native
  def run(pulse: js.Any): js.Any = js.native
  def set(value: js.Any): `1` | `0` = js.native
  def skip(): js.Function1[/* state */ js.Any, _] = js.native
  def targets(): js.Any = js.native
}

