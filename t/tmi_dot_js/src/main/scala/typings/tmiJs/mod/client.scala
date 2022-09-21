package typings.tmiJs.mod

import typings.tmiJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("tmi.js", "client")
@js.native
open class client protected ()
  extends StObject
     with Client_ {
  def this(opts: Options) = this()
}
object client {
  
  inline def apply: ClientConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("client").asInstanceOf[ClientConstructor]
}
