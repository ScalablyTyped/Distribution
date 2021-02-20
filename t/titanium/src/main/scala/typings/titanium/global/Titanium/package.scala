package typings.titanium.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Titanium {
  
  /**
    * The top level Yahoo module.  The Yahoo module is used for accessing Yahoo related API services.
    * @deprecated Use the standalone [Ti.Yahoo](https://github.com/appcelerator-modules/ti.yahoo) module instead.
    */
  @scala.inline
  def Yahoo: scala.Nothing = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].selectDynamic("Yahoo").asInstanceOf[scala.Nothing]
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @scala.inline
  def addEventListener(
    name: java.lang.String,
    callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, scala.Unit]
  ): scala.Unit = (typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Date of the Titanium build.
    */
  @scala.inline
  def buildDate: java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].selectDynamic("buildDate").asInstanceOf[java.lang.String]
  
  /**
    * Git hash of the Titanium build.
    */
  @scala.inline
  def buildHash: java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].selectDynamic("buildHash").asInstanceOf[java.lang.String]
  
  /**
    * Creates a new buffer based on the params.
    */
  @scala.inline
  def createBuffer(params: typings.titanium.CreateBufferArgs): typings.titanium.Titanium.Buffer = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("createBuffer")(params.asInstanceOf[js.Any]).asInstanceOf[typings.titanium.Titanium.Buffer]
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @scala.inline
  def fireEvent(name: java.lang.String): scala.Unit = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = (typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("fireEvent")(name.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Gets the value of the <Titanium.buildDate> property.
    * @deprecated Access <Titanium.buildDate> instead.
    */
  @scala.inline
  def getBuildDate(): java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("getBuildDate")().asInstanceOf[java.lang.String]
  
  /**
    * Gets the value of the <Titanium.buildHash> property.
    * @deprecated Access <Titanium.buildHash> instead.
    */
  @scala.inline
  def getBuildHash(): java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("getBuildHash")().asInstanceOf[java.lang.String]
  
  /**
    * Gets the value of the <Titanium.userAgent> property.
    * @deprecated Access <Titanium.userAgent> instead.
    */
  @scala.inline
  def getUserAgent(): java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[java.lang.String]
  
  /**
    * Gets the value of the <Titanium.version> property.
    * @deprecated Access <Titanium.version> instead.
    */
  @scala.inline
  def getVersion(): java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[java.lang.String]
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @scala.inline
  def removeEventListener(
    name: java.lang.String,
    callback: js.Function1[/* param0 */ typings.titanium.Titanium.Event, scala.Unit]
  ): scala.Unit = (typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Sets the value of the <Titanium.userAgent> property.
    * @deprecated Set the value using <Titanium.userAgent> instead.
    */
  @scala.inline
  def setUserAgent(userAgent: java.lang.String): scala.Unit = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].applyDynamic("setUserAgent")(userAgent.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * User-agent string used by Titanium.
    */
  @scala.inline
  def userAgent: java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].selectDynamic("userAgent").asInstanceOf[java.lang.String]
  @scala.inline
  def userAgent_=(x: java.lang.String): scala.Unit = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(x.asInstanceOf[js.Any])
  
  /**
    * Version of Titanium that is executing.
    */
  @scala.inline
  def version: java.lang.String = typings.titanium.global.Titanium.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
