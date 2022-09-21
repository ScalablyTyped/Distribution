package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xhr extends StObject {
  
  def apply(url: String, callback: XhrCallback): Any = js.native
  def apply(url: String, options: XhrOptions, callback: XhrCallback): Any = js.native
  def apply(url: XhrOptions, callback: XhrCallback): Any = js.native
}
