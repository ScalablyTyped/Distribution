package typings.w3cCssTypedObjectModelLevel1

import typings.std.CSSUnparsedSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSUnparsedValue
  extends StObject
     with CSSStyleValue {
  
  def forEach(
    callbackfn: js.Function3[/* value */ CSSUnparsedSegment, /* key */ Double, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ CSSUnparsedSegment, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  val length: Double = js.native
}
