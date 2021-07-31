package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database_ extends StObject {
  
  var Geo: typings.wxServerSdk.mod.Geo = js.native
  
  def RegExp(options: RegExpOptions): DBRegExp = js.native
  
  def collection(name: String): Collection = js.native
  
  var command: Command = js.native
  
  var createCollection: js.Promise[CreateCollectionSuccess] = js.native
  
  def serverDate(): ServerDate = js.native
  def serverDate(options: js.Object): ServerDate = js.native
}
