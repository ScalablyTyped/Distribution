package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskReference extends js.Object {
  var id: String
  var inputs: StringDictionary[String]
  var name: String
  var version: String
}

object TaskReference {
  @scala.inline
  def apply(id: String, inputs: StringDictionary[String], name: String, version: String): TaskReference = {
    val __obj = js.Dynamic.literal(id = id, inputs = inputs, name = name, version = version)
  
    __obj.asInstanceOf[TaskReference]
  }
}

