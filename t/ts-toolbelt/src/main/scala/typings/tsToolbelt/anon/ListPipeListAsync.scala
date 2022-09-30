package typings.tsToolbelt.anon

import typings.tsToolbelt.awaitMod.Await
import typings.tsToolbelt.curryMod.Curry
import typings.tsToolbelt.functionMod.Function
import typings.tsToolbelt.listAsyncMod.PipeListAsync
import typings.tsToolbelt.pipeMultiAsyncMod.PipeMultiAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipeListAsync extends StObject {
  
  def list[R0, P /* <: js.Array[Any] */](fns: js.Array[(Function[P, R0]) | (Curry[Function[P, R0]])]): Function[P, js.Promise[Await[R0]]]
  def list[R0, R1, P /* <: js.Array[Any] */](
    fns: js.Tuple2[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]])
    ]
  ): Function[P, js.Promise[Await[R1]]]
  def list[R0, R1, R2, P /* <: js.Array[Any] */](
    fns: js.Tuple3[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]])
    ]
  ): Function[P, js.Promise[Await[R2]]]
  def list[R0, R1, R2, R3, P /* <: js.Array[Any] */](
    fns: js.Tuple4[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]])
    ]
  ): Function[P, js.Promise[Await[R3]]]
  def list[R0, R1, R2, R3, R4, P /* <: js.Array[Any] */](
    fns: js.Tuple5[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]])
    ]
  ): Function[P, js.Promise[Await[R4]]]
  def list[R0, R1, R2, R3, R4, R5, P /* <: js.Array[Any] */](
    fns: js.Tuple6[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]])
    ]
  ): Function[P, js.Promise[Await[R5]]]
  def list[R0, R1, R2, R3, R4, R5, R6, P /* <: js.Array[Any] */](
    fns: js.Tuple7[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]])
    ]
  ): Function[P, js.Promise[Await[R6]]]
  def list[R0, R1, R2, R3, R4, R5, R6, R7, P /* <: js.Array[Any] */](
    fns: js.Tuple8[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]])
    ]
  ): Function[P, js.Promise[Await[R7]]]
  def list[R0, R1, R2, R3, R4, R5, R6, R7, R8, P /* <: js.Array[Any] */](
    fns: js.Tuple9[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
      (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]])
    ]
  ): Function[P, js.Promise[Await[R8]]]
  def list[R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, P /* <: js.Array[Any] */](
    fns: js.Tuple10[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
      (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]]), 
      (Function[js.Array[Await[R8]], R9]) | (Curry[Function[js.Array[Await[R8]], R9]])
    ]
  ): Function[P, js.Promise[Await[R9]]]
  @JSName("list")
  var list_Original: PipeListAsync
  
  def multi[R0, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Array[(Function[P, R0]) | (Curry[Function[P, R0]])]
  ): Function[P, js.Promise[Await[R0]]]
  def multi[R0, R1, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>] is not an array type */ fns: js.Tuple2[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]])
    ]
  ): Function[P, js.Promise[Await[R1]]]
  def multi[R0, R1, R2, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>] is not an array type */ fns: js.Tuple3[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]])
    ]
  ): Function[P, js.Promise[Await[R2]]]
  def multi[R0, R1, R2, R3, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>] is not an array type */ fns: js.Tuple4[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]])
    ]
  ): Function[P, js.Promise[Await[R3]]]
  def multi[R0, R1, R2, R3, R4, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>] is not an array type */ fns: js.Tuple5[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]])
    ]
  ): Function[P, js.Promise[Await[R4]]]
  def multi[R0, R1, R2, R3, R4, R5, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>, Function<[Await<R4>], R5> | Curry<Function<[Await<R4>], R5>>] is not an array type */ fns: js.Tuple6[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]])
    ]
  ): Function[P, js.Promise[Await[R5]]]
  def multi[R0, R1, R2, R3, R4, R5, R6, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>, Function<[Await<R4>], R5> | Curry<Function<[Await<R4>], R5>>, Function<[Await<R5>], R6> | Curry<Function<[Await<R5>], R6>>] is not an array type */ fns: js.Tuple7[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]])
    ]
  ): Function[P, js.Promise[Await[R6]]]
  def multi[R0, R1, R2, R3, R4, R5, R6, R7, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>, Function<[Await<R4>], R5> | Curry<Function<[Await<R4>], R5>>, Function<[Await<R5>], R6> | Curry<Function<[Await<R5>], R6>>, Function<[Await<R6>], R7> | Curry<Function<[Await<R6>], R7>>] is not an array type */ fns: js.Tuple8[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]])
    ]
  ): Function[P, js.Promise[Await[R7]]]
  def multi[R0, R1, R2, R3, R4, R5, R6, R7, R8, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>, Function<[Await<R4>], R5> | Curry<Function<[Await<R4>], R5>>, Function<[Await<R5>], R6> | Curry<Function<[Await<R5>], R6>>, Function<[Await<R6>], R7> | Curry<Function<[Await<R6>], R7>>, Function<[Await<R7>], R8> | Curry<Function<[Await<R7>], R8>>] is not an array type */ fns: js.Tuple9[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
      (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]])
    ]
  ): Function[P, js.Promise[Await[R8]]]
  def multi[R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, P /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>, Function<[Await<R0>], R1> | Curry<Function<[Await<R0>], R1>>, Function<[Await<R1>], R2> | Curry<Function<[Await<R1>], R2>>, Function<[Await<R2>], R3> | Curry<Function<[Await<R2>], R3>>, Function<[Await<R3>], R4> | Curry<Function<[Await<R3>], R4>>, Function<[Await<R4>], R5> | Curry<Function<[Await<R4>], R5>>, Function<[Await<R5>], R6> | Curry<Function<[Await<R5>], R6>>, Function<[Await<R6>], R7> | Curry<Function<[Await<R6>], R7>>, Function<[Await<R7>], R8> | Curry<Function<[Await<R7>], R8>>, Function<[Await<R8>], R9> | Curry<Function<[Await<R8>], R9>>] is not an array type */ fns: js.Tuple10[
      (Function[P, R0]) | (Curry[Function[P, R0]]), 
      (Function[js.Array[Await[R0]], R1]) | (Curry[Function[js.Array[Await[R0]], R1]]), 
      (Function[js.Array[Await[R1]], R2]) | (Curry[Function[js.Array[Await[R1]], R2]]), 
      (Function[js.Array[Await[R2]], R3]) | (Curry[Function[js.Array[Await[R2]], R3]]), 
      (Function[js.Array[Await[R3]], R4]) | (Curry[Function[js.Array[Await[R3]], R4]]), 
      (Function[js.Array[Await[R4]], R5]) | (Curry[Function[js.Array[Await[R4]], R5]]), 
      (Function[js.Array[Await[R5]], R6]) | (Curry[Function[js.Array[Await[R5]], R6]]), 
      (Function[js.Array[Await[R6]], R7]) | (Curry[Function[js.Array[Await[R6]], R7]]), 
      (Function[js.Array[Await[R7]], R8]) | (Curry[Function[js.Array[Await[R7]], R8]]), 
      (Function[js.Array[Await[R8]], R9]) | (Curry[Function[js.Array[Await[R8]], R9]])
    ]
  ): Function[P, js.Promise[Await[R9]]]
  @JSName("multi")
  var multi_Original: PipeMultiAsync
}
object ListPipeListAsync {
  
  inline def apply(list: PipeListAsync, multi: PipeMultiAsync): ListPipeListAsync = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipeListAsync]
  }
  
  extension [Self <: ListPipeListAsync](x: Self) {
    
    inline def setList(value: PipeListAsync): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setMulti(value: PipeMultiAsync): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
  }
}
