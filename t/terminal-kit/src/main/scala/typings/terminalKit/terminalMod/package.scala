package typings.terminalKit.terminalMod

import typings.terminalKit.anon.G
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationArray = js.Array[String]

type AnimationOption = BuiltinAnimation | AnimationArray

type Autocompletion = (js.Function2[
/* inputString */ String, 
/* callback */ Callback[String | AutocompletionArray[String]], 
Unit]) | (js.Function1[/* inputString */ String, js.Promise[String | AutocompletionArray[String]]])

type CTerminal = Terminal & (js.Function1[/* repeated */ Any, Terminal])

type Callback[T] = js.Function2[/* err */ Any, /* arg */ T, Unit]

type Chainable[T] = T & ChainableInterface[T]

type Palette = js.Array[G]
