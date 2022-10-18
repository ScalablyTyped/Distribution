package typings.vegaTypings

import typings.vegaTypings.vegaTypingsInts.`0`
import typings.vegaTypings.vegaTypingsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeDataflowMod {
  
  @JSImport("vega-typings/types/runtime/dataflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-typings/types/runtime/dataflow", "Operator")
  @js.native
  open class Operator () extends StObject {
    def this(init: Any) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any]) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
    def this(init: Any, update: Unit, params: Any) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any) = this()
    def this(init: Unit, update: Unit, params: Any) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
    def this(init: Any, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Unit, react: Boolean) = this()
    def this(init: Any, update: Unit, params: Any, react: Boolean) = this()
    def this(init: Any, update: Unit, params: Unit, react: Boolean) = this()
    def this(init: Unit, update: js.Function2[/* obj */ Any, /* pulse */ Any, Any], params: Any, react: Boolean) = this()
    def this(
      init: Unit,
      update: js.Function2[/* obj */ Any, /* pulse */ Any, Any],
      params: Unit,
      react: Boolean
    ) = this()
    def this(init: Unit, update: Unit, params: Any, react: Boolean) = this()
    def this(init: Unit, update: Unit, params: Unit, react: Boolean) = this()
    
    def evaluate(pulse: Any): Any = js.native
    
    def marshall(stamp: Double): Any = js.native
    
    def modified(): js.Function1[/* state */ Any, Any] = js.native
    
    def parameters(params: js.Object): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean, initonly: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Unit, initonly: Boolean): js.Array[Operator] = js.native
    
    def run(pulse: Any): Any = js.native
    
    def set(value: Any): `1` | `0` = js.native
    
    def skip(): js.Function1[/* state */ Any, Any] = js.native
    
    var source: js.UndefOr[Operator] = js.native
    
    def targets(): Any = js.native
  }
  
  @JSImport("vega-typings/types/runtime/dataflow", "Transform")
  @js.native
  open class Transform () extends Operator {
    def this(init: Any) = this()
    def this(init: Any, params: Any) = this()
    def this(init: Unit, params: Any) = this()
    
    def transform(pulse: Any): Any = js.native
    def transform(pulse: Any, params: Any): Any = js.native
  }
  
  inline def changeset(): Changeset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("changeset")().asInstanceOf[Changeset_]
  
  inline def ingest(datum: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ingest")(datum.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isTuple(t: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTuple")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tupleid(t: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleid")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait Changeset_ extends StObject {
    
    def insert(tuples: Any): this.type = js.native
    
    def modify(tuple: Any): this.type = js.native
    def modify(tuple: Any, field: String): this.type = js.native
    def modify(tuple: Any, field: String, value: Any): this.type = js.native
    def modify(tuple: Any, field: Unit, value: Any): this.type = js.native
    
    def remove(tuples: Any): this.type = js.native
  }
}
