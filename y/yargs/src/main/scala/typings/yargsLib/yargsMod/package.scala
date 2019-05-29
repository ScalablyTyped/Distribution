package typings
package yargsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yargsMod {
  type Arguments[T] = T with yargsLib.Anon_
  type AsyncCompletionFunction = js.Function3[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    /* done */ js.Function1[/* completion */ js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  type Choices = js.Array[js.UndefOr[java.lang.String | yargsLib.yargsLibNumbers.`true`]]
  type CommandBuilder[T, U] = org.scalablytyped.runtime.StringDictionary[Options] | (js.Function1[/* args */ Argv[T], Argv[U]])
  /** Remove undefined as a possible value for keys K in T */
  type Defined[T, K /* <: java.lang.String */] = (Omit[T, K]) with yargsLib.yargsLibStrings.Defined with T
  type InferredOptionType[O /* <: Options | PositionalOptions */] = js.UndefOr[RequiredOptionType[O] | scala.Double]
  type InferredOptionTypes[O /* <: org.scalablytyped.runtime.StringDictionary[Options] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof O ]: yargs.yargs.InferredOptionType<O[key]>}
    */ yargsLib.yargsLibStrings.InferredOptionTypes with O
  type MiddlewareFunction[T] = js.Function1[/* args */ Arguments[T], scala.Unit]
  /** Remove keys K in T */
  type Omit[T, K] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof T, K> ]: T[key]}
    */ yargsLib.yargsLibStrings.Omit with T
  type ParseCallback[T] = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* argv */ Arguments[T], 
    /* output */ java.lang.String, 
    scala.Unit
  ]
  type PromiseCompletionFunction = js.Function2[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    js.Promise[js.Array[java.lang.String]]
  ]
  type RequiredOptionType[O /* <: Options | PositionalOptions */] = js.Any | java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String])
  type SyncCompletionFunction = js.Function2[/* current */ java.lang.String, /* argv */ js.Any, js.Array[java.lang.String]]
  /** Convert T to T[] and T | undefined to T[] | undefined */
  type ToArray[T] = (js.Array[stdLib.Exclude[T, js.UndefOr[scala.Nothing]]]) | (stdLib.Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives number[] if T is an array type, otherwise number. Preserves | undefined. */
  type ToNumber[T] = scala.Double | js.Array[scala.Double] | (stdLib.Extract[T, js.UndefOr[scala.Nothing]])
  /** Gives string[] if T is an array type, otherwise string. Preserves | undefined. */
  type ToString[T] = java.lang.String | js.Array[java.lang.String] | (stdLib.Extract[T, js.UndefOr[scala.Nothing]])
}
