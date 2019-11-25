package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyBag extends js.Object {
  /**
    * Generic store for test session data
    */
  var bag: StringDictionary[String]
}

object PropertyBag {
  @scala.inline
  def apply(bag: StringDictionary[String]): PropertyBag = {
    val __obj = js.Dynamic.literal(bag = bag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyBag]
  }
}

