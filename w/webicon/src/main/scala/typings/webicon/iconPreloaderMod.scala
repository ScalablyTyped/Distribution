package typings.webicon

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconPreloaderMod {
  
  @js.native
  trait IconPreloader
    extends StObject
       with Promise[Unit] {
    
    /**
      * The names of the icons to download.
      */
    var iconSets: js.Array[String] = js.native
  }
}
