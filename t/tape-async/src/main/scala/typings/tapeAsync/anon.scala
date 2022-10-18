package typings.tapeAsync

import typings.tapeAsync.mod.TestCase
import typings.tapeAsync.mod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  }
}
