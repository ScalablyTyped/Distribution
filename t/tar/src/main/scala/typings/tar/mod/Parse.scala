package typings.tar.mod

import typings.tar.tarStrings.close
import typings.tar.tarStrings.end
import typings.tar.tarStrings.entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse
  extends StObject
     with ParseStream {
  
  def on(event: end | close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_entry(event: entry, listener: js.Function1[/* entry */ ReadEntry, Unit]): this.type = js.native
}
