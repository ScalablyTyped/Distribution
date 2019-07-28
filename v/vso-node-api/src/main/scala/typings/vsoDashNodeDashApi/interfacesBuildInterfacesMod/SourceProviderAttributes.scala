package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProviderAttributes extends js.Object {
  /**
    * The name of the source provider.
    */
  var name: String
  /**
    * The capabilities supported by this source provider.
    */
  var supportedCapabilities: StringDictionary[Boolean]
  /**
    * The types of triggers supported by this source provider.
    */
  var supportedTriggers: js.Array[SupportedTrigger]
}

object SourceProviderAttributes {
  @scala.inline
  def apply(
    name: String,
    supportedCapabilities: StringDictionary[Boolean],
    supportedTriggers: js.Array[SupportedTrigger]
  ): SourceProviderAttributes = {
    val __obj = js.Dynamic.literal(name = name, supportedCapabilities = supportedCapabilities, supportedTriggers = supportedTriggers)
  
    __obj.asInstanceOf[SourceProviderAttributes]
  }
}

