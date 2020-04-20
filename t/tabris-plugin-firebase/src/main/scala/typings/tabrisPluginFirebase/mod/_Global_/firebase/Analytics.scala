package typings.tabrisPluginFirebase.mod._Global_.firebase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.tabris.mod.NativeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics
  extends NativeObject
     with typings.tabrisPluginFirebase.mod._Global_.firebase.PropertyMixins.Analytics {
  def logEvent(eventName: String): Unit = js.native
  def logEvent(eventName: String, parameters: StringDictionary[String]): Unit = js.native
  def set(properties: AnalyticsProperties): this.type = js.native
  def set(property: String, value: js.Any): this.type = js.native
  def setUserProperty(propertyName: String, value: String): Unit = js.native
}

@JSGlobal("firebase.Analytics")
@js.native
object Analytics extends TopLevel[Analytics]

