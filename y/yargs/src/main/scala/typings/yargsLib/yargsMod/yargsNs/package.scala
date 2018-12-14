package typings
package yargsLib.yargsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yargsNs {
  type AsyncCompletionFunction = js.Function3[
    /* current */ java.lang.String, 
    /* argv */ js.Any, 
    /* done */ js.Function1[/* completion */ js.Array[java.lang.String], scala.Unit], 
    scala.Unit
  ]
  type Choices = js.Array[js.UndefOr[java.lang.String | yargsLib.yargsLibNumbers.`true`]]
  type CommandBuilder = org.scalablytyped.runtime.StringDictionary[Options] | (js.Function1[/* args */ Argv, Argv])
  type MiddlewareFunction = js.Function1[/* args */ Arguments, scala.Unit]
  type ParseCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* argv */ Arguments, 
    /* output */ java.lang.String, 
    scala.Unit
  ]
  type PositionalOptionsType = yargsLib.yargsLibStrings.boolean | yargsLib.yargsLibStrings.number | yargsLib.yargsLibStrings.string
  type SyncCompletionFunction = js.Function2[/* current */ java.lang.String, /* argv */ js.Any, js.Array[java.lang.String]]
}
