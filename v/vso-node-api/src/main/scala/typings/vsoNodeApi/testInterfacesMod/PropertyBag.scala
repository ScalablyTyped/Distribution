package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBag extends js.Object {
  /**
    * Generic store for test session data
    */
  var bag: StringDictionary[String] = js.native
}

object PropertyBag {
  @scala.inline
  def apply(bag: StringDictionary[String]): PropertyBag = {
    val __obj = js.Dynamic.literal(bag = bag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyBag]
  }
  @scala.inline
  implicit class PropertyBagOps[Self <: PropertyBag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBag(value: StringDictionary[String]): Self = this.set("bag", value.asInstanceOf[js.Any])
  }
  
}

