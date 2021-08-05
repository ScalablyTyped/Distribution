package typings.vegaTypings

import typings.vegaTypings.vegaTypingsNumbers.`0`
import typings.vegaTypings.vegaTypingsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataflowMod {
  
  @JSImport("vega-typings/types/runtime/dataflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime/dataflow", "Operator")
  @js.native
  class Operator () extends StObject {
    def this(init: js.Any) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any]) = this()
    def this(init: Unit, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any]) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any], params: js.Any) = this()
    def this(init: js.Any, update: Unit, params: js.Any) = this()
    def this(init: Unit, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any], params: js.Any) = this()
    def this(init: Unit, update: Unit, params: js.Any) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: js.Any, update: Unit, params: js.Any, react: Boolean) = this()
    def this(init: js.Any, update: Unit, params: Unit, react: Boolean) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, js.Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: Unit, update: Unit, params: js.Any, react: Boolean) = this()
    def this(init: Unit, update: Unit, params: Unit, react: Boolean) = this()
    
    def evaluate(pulse: js.Any): js.Any = js.native
    
    def marshall(stamp: Double): js.Any = js.native
    
    def modified(): js.Function1[/* state */ js.Any, js.Any] = js.native
    
    def parameters(params: js.Object): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean, initonly: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Unit, initonly: Boolean): js.Array[Operator] = js.native
    
    def run(pulse: js.Any): js.Any = js.native
    
    def set(value: js.Any): `1` | `0` = js.native
    
    def skip(): js.Function1[/* state */ js.Any, js.Any] = js.native
    
    def targets(): js.Any = js.native
  }
  
  @JSImport("vega-typings/types/runtime/dataflow", "Transform")
  @js.native
  class Transform () extends Operator {
    def this(init: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
    def this(init: Unit, params: js.Any) = this()
    
    def transform(pulse: js.Any): js.Any = js.native
    def transform(pulse: js.Any, params: js.Any): js.Any = js.native
  }
  
  inline def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
  
  inline def ingest(datum: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def isTuple(t: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tupleid(t: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait Changeset_ extends StObject {
    
    def insert(tuples: js.Any): this.type = js.native
    
    def modify(tuple: js.Any): this.type = js.native
    def modify(tuple: js.Any, field: String): this.type = js.native
    def modify(tuple: js.Any, field: String, value: js.Any): this.type = js.native
    def modify(tuple: js.Any, field: Unit, value: js.Any): this.type = js.native
    
    def remove(tuples: js.Any): this.type = js.native
  }
}
