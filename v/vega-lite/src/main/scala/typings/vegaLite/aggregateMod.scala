package typings.vegaLite

import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregateMod {
  
  @JSImport("vega-lite/build/src/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "AGGREGATE_OPS")
  @js.native
  val AGGREGATE_OPS: js.Array[AggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "COUNTING_OPS")
  @js.native
  val COUNTING_OPS: js.Array[NonArgAggregateOp] = js.native
  
  object MULTIDOMAIN_SORT_OP_INDEX {
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.count")
    @js.native
    def count: Double = js.native
    @scala.inline
    def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.max")
    @js.native
    def max: Double = js.native
    @scala.inline
    def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.min")
    @js.native
    def min: Double = js.native
    @scala.inline
    def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/aggregate", "SHARED_DOMAIN_OPS")
  @js.native
  val SHARED_DOMAIN_OPS: js.Array[AggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "SUM_OPS")
  @js.native
  val SUM_OPS: js.Array[NonArgAggregateOp] = js.native
  
  @scala.inline
  def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  @scala.inline
  def isAggregateOp(a: ArgmaxDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  @scala.inline
  def isAggregateOp(a: ArgminDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  
  @scala.inline
  def isArgmaxDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean]
  @scala.inline
  def isArgmaxDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean]
  
  @scala.inline
  def isArgminDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean]
  @scala.inline
  def isArgminDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean]
  
  @scala.inline
  def isCountingAggregateOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")().asInstanceOf[Boolean]
  @scala.inline
  def isCountingAggregateOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isCountingAggregateOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMinMaxOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")().asInstanceOf[Boolean]
  @scala.inline
  def isMinMaxOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isMinMaxOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined vega-lite.vega-lite/build/src/aggregate.NonArgAggregateOp | vega-lite.vega-lite/build/src/aggregate.ArgmaxDef | vega-lite.vega-lite/build/src/aggregate.ArgminDef */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.max
    - typings.vegaLite.vegaLiteStrings.q1
    - typings.vegaLite.vegaLiteStrings.median
    - typings.vegaLite.vegaLiteStrings.q3
    - typings.vegaLite.vegaLiteStrings.argmax
    - typings.vegaLite.vegaLiteStrings.mean
    - typings.vegaLite.vegaLiteStrings.sum
    - typings.vegaLite.vegaLiteStrings.variance
    - typings.vegaLite.vegaLiteStrings.stdev
    - typings.vegaLite.vegaLiteStrings.argmin
    - typings.vegaLite.vegaLiteStrings.min
    - typings.vegaLite.vegaLiteStrings.valid
    - typings.vegaLite.vegaLiteStrings.missing
    - typings.vegaLite.vegaLiteStrings.stdevp
    - typings.vegaLite.vegaLiteStrings.distinct
    - typings.vegaLite.vegaLiteStrings.ci0
    - typings.vegaLite.vegaLiteStrings.product
    - typings.vegaLite.vegaLiteStrings.stderr
    - typings.vegaLite.vegaLiteStrings.count
    - typings.vegaLite.vegaLiteStrings.ci1
    - typings.vegaLite.vegaLiteStrings.average
    - typings.vegaLite.vegaLiteStrings.values
    - typings.vegaLite.vegaLiteStrings.variancep
  */
  trait Aggregate extends StObject
  object Aggregate {
    
    @scala.inline
    def argmax: typings.vegaLite.vegaLiteStrings.argmax = "argmax".asInstanceOf[typings.vegaLite.vegaLiteStrings.argmax]
    
    @scala.inline
    def argmin: typings.vegaLite.vegaLiteStrings.argmin = "argmin".asInstanceOf[typings.vegaLite.vegaLiteStrings.argmin]
    
    @scala.inline
    def average: typings.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typings.vegaLite.vegaLiteStrings.average]
    
    @scala.inline
    def ci0: typings.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typings.vegaLite.vegaLiteStrings.ci0]
    
    @scala.inline
    def ci1: typings.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typings.vegaLite.vegaLiteStrings.ci1]
    
    @scala.inline
    def count: typings.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typings.vegaLite.vegaLiteStrings.count]
    
    @scala.inline
    def distinct: typings.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typings.vegaLite.vegaLiteStrings.distinct]
    
    @scala.inline
    def max: typings.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typings.vegaLite.vegaLiteStrings.max]
    
    @scala.inline
    def mean: typings.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typings.vegaLite.vegaLiteStrings.mean]
    
    @scala.inline
    def median: typings.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typings.vegaLite.vegaLiteStrings.median]
    
    @scala.inline
    def min: typings.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typings.vegaLite.vegaLiteStrings.min]
    
    @scala.inline
    def missing: typings.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typings.vegaLite.vegaLiteStrings.missing]
    
    @scala.inline
    def product: typings.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typings.vegaLite.vegaLiteStrings.product]
    
    @scala.inline
    def q1: typings.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typings.vegaLite.vegaLiteStrings.q1]
    
    @scala.inline
    def q3: typings.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typings.vegaLite.vegaLiteStrings.q3]
    
    @scala.inline
    def stderr: typings.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typings.vegaLite.vegaLiteStrings.stderr]
    
    @scala.inline
    def stdev: typings.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typings.vegaLite.vegaLiteStrings.stdev]
    
    @scala.inline
    def stdevp: typings.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typings.vegaLite.vegaLiteStrings.stdevp]
    
    @scala.inline
    def sum: typings.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typings.vegaLite.vegaLiteStrings.sum]
    
    @scala.inline
    def valid: typings.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typings.vegaLite.vegaLiteStrings.valid]
    
    @scala.inline
    def values: typings.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typings.vegaLite.vegaLiteStrings.values]
    
    @scala.inline
    def variance: typings.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typings.vegaLite.vegaLiteStrings.variance]
    
    @scala.inline
    def variancep: typings.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typings.vegaLite.vegaLiteStrings.variancep]
  }
  
  trait ArgmaxDef extends StObject {
    
    var argmax: String
  }
  object ArgmaxDef {
    
    @scala.inline
    def apply(argmax: String): ArgmaxDef = {
      val __obj = js.Dynamic.literal(argmax = argmax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmaxDef]
    }
    
    @scala.inline
    implicit class ArgmaxDefMutableBuilder[Self <: ArgmaxDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgmax(value: String): Self = StObject.set(x, "argmax", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArgminDef extends StObject {
    
    var argmin: String
  }
  object ArgminDef {
    
    @scala.inline
    def apply(argmin: String): ArgminDef = {
      val __obj = js.Dynamic.literal(argmin = argmin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgminDef]
    }
    
    @scala.inline
    implicit class ArgminDefMutableBuilder[Self <: ArgminDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgmin(value: String): Self = StObject.set(x, "argmin", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<vega.vega.AggregateOp, 'argmin' | 'argmax'> */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.max
    - typings.vegaLite.vegaLiteStrings.q1
    - typings.vegaLite.vegaLiteStrings.median
    - typings.vegaLite.vegaLiteStrings.q3
    - typings.vegaLite.vegaLiteStrings.mean
    - typings.vegaLite.vegaLiteStrings.sum
    - typings.vegaLite.vegaLiteStrings.variance
    - typings.vegaLite.vegaLiteStrings.stdev
    - typings.vegaLite.vegaLiteStrings.min
    - typings.vegaLite.vegaLiteStrings.valid
    - typings.vegaLite.vegaLiteStrings.missing
    - typings.vegaLite.vegaLiteStrings.stdevp
    - typings.vegaLite.vegaLiteStrings.distinct
    - typings.vegaLite.vegaLiteStrings.ci0
    - typings.vegaLite.vegaLiteStrings.product
    - typings.vegaLite.vegaLiteStrings.stderr
    - typings.vegaLite.vegaLiteStrings.count
    - typings.vegaLite.vegaLiteStrings.ci1
    - typings.vegaLite.vegaLiteStrings.average
    - typings.vegaLite.vegaLiteStrings.values
    - typings.vegaLite.vegaLiteStrings.variancep
  */
  trait NonArgAggregateOp extends StObject
  object NonArgAggregateOp {
    
    @scala.inline
    def average: typings.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typings.vegaLite.vegaLiteStrings.average]
    
    @scala.inline
    def ci0: typings.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typings.vegaLite.vegaLiteStrings.ci0]
    
    @scala.inline
    def ci1: typings.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typings.vegaLite.vegaLiteStrings.ci1]
    
    @scala.inline
    def count: typings.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typings.vegaLite.vegaLiteStrings.count]
    
    @scala.inline
    def distinct: typings.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typings.vegaLite.vegaLiteStrings.distinct]
    
    @scala.inline
    def max: typings.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typings.vegaLite.vegaLiteStrings.max]
    
    @scala.inline
    def mean: typings.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typings.vegaLite.vegaLiteStrings.mean]
    
    @scala.inline
    def median: typings.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typings.vegaLite.vegaLiteStrings.median]
    
    @scala.inline
    def min: typings.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typings.vegaLite.vegaLiteStrings.min]
    
    @scala.inline
    def missing: typings.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typings.vegaLite.vegaLiteStrings.missing]
    
    @scala.inline
    def product: typings.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typings.vegaLite.vegaLiteStrings.product]
    
    @scala.inline
    def q1: typings.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typings.vegaLite.vegaLiteStrings.q1]
    
    @scala.inline
    def q3: typings.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typings.vegaLite.vegaLiteStrings.q3]
    
    @scala.inline
    def stderr: typings.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typings.vegaLite.vegaLiteStrings.stderr]
    
    @scala.inline
    def stdev: typings.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typings.vegaLite.vegaLiteStrings.stdev]
    
    @scala.inline
    def stdevp: typings.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typings.vegaLite.vegaLiteStrings.stdevp]
    
    @scala.inline
    def sum: typings.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typings.vegaLite.vegaLiteStrings.sum]
    
    @scala.inline
    def valid: typings.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typings.vegaLite.vegaLiteStrings.valid]
    
    @scala.inline
    def values: typings.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typings.vegaLite.vegaLiteStrings.values]
    
    @scala.inline
    def variance: typings.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typings.vegaLite.vegaLiteStrings.variance]
    
    @scala.inline
    def variancep: typings.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typings.vegaLite.vegaLiteStrings.variancep]
  }
}
