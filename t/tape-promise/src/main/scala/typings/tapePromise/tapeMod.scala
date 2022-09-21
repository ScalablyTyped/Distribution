package typings.tapePromise

import org.scalablytyped.runtime.Shortcut
import typings.std.ReturnType
import typings.tapePromise.mod.AsyncTapeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapeMod extends Shortcut {
  
  @JSImport("tape-promise/tape", JSImport.Namespace)
  @js.native
  val ^ : ReturnType[
    js.Function1[
      /* tapeTest */ Any, 
      AsyncTapeFunction & (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
    ]
  ] = js.native
  
  /**
    * Options for the createStream function.
    */
  type StreamOptions = typings.tape.mod.StreamOptions
  
  type Test = typings.tapePromise.mod.Test
  
  type TestCase = typings.tapePromise.mod.TestCase
  
  /**
    * Available opts options for the tape function.
    */
  type TestOptions = typings.tape.mod.TestOptions
  
  type _To = ReturnType[
    js.Function1[
      /* tapeTest */ Any, 
      AsyncTapeFunction & (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
    ]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `tapeMod.foo` */
  override def _to: ReturnType[
    js.Function1[
      /* tapeTest */ Any, 
      AsyncTapeFunction & (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
    ]
  ] = ^
}
