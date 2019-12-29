package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yargsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Extract
  import typings.yargs.Anon_
  import typings.yargs.yargsBooleans.`true`

  type Arguments[T] = T with Anon_
  type AsyncCompletionFunction = js.Function3[
    /* current */ String, 
    /* argv */ js.Any, 
    /* done */ js.Function1[/* completion */ js.Array[String], Unit], 
    Unit
  ]
  type BuilderCallback[T, R] = js.Function1[/* args */ Argv[T], Argv[R] | Unit]
  type Choices = js.Array[js.UndefOr[String | Double | `true`]]
  type CommandBuilder[T, U] = StringDictionary[Options] | (js.Function1[/* args */ Argv[T], Argv[U]])
  /** Remove undefined as a possible value for keys K in T */
  type Defined[T, K /* <: String */] = (Omit[T, K]) with typings.yargs.yargsStrings.Defined with T
  type InferredOptionType[O /* <: Options | PositionalOptions */] = js.UndefOr[RequiredOptionType[O] | Double]
  type InferredOptionTypes[O /* <: StringDictionary[Options] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof O ]: yargs.yargs.InferredOptionType<O[key]>}
    */ typings.yargs.yargsStrings.InferredOptionTypes with O
  type MiddlewareFunction[T] = js.Function1[/* args */ Arguments[T], Unit]
  /** Remove keys K in T */
  type Omit[T, K] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof T, K> ]: T[key]}
    */ typings.yargs.yargsStrings.Omit with T
  type ParseCallback[T] = js.Function3[/* err */ js.UndefOr[Error], /* argv */ Arguments[T], /* output */ String, Unit]
  type PromiseCompletionFunction = js.Function2[/* current */ String, /* argv */ js.Any, js.Promise[js.Array[String]]]
  type RequiredOptionType[O /* <: Options | PositionalOptions */] = js.Any | String | Double | Boolean | (js.Array[Double | String])
  type SyncCompletionFunction = js.Function2[/* current */ String, /* argv */ js.Any, js.Array[String]]
  /** Convert T to T[] and T | undefined to T[] | undefined */
  type ToArray[T] = (js.Array[Exclude[T, js.UndefOr[scala.Nothing]]]) | (Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives number[] if T is an array type, otherwise number. Preserves | undefined. */
  type ToNumber[T] = Double | js.Array[Double] | (Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives string[] if T is an array type, otherwise string. Preserves | undefined. */
  type ToString[T] = String | js.Array[String] | (Extract[T, js.UndefOr[scala.Nothing]])
}
