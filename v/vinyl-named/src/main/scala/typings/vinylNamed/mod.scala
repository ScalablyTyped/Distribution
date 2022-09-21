package typings.vinylNamed

import typings.through.mod.ThroughStream
import typings.vinylNamed.anon.namedstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Give vinyl files arbitrary chunk names.
    *
    * @param opt A callback that returns a name of the given file
    */
  inline def apply(): ThroughStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ThroughStream]
  inline def apply(opt: Callback): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(opt.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  
  @JSImport("vinyl-named", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.ThisFunction1[/* this */ ThroughStream, /* file */ namedstring, js.UndefOr[String | Null | Unit]]
}
