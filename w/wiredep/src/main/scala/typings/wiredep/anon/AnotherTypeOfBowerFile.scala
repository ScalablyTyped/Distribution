package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnotherTypeOfBowerFile extends js.Object {
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: String = js.native
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: String): String = js.native
}

object AnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: String => String, typeOfBowerFile: String): AnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnotherTypeOfBowerFile]
  }
  @scala.inline
  implicit class AnotherTypeOfBowerFileOps[Self <: AnotherTypeOfBowerFile] (val x: Self) extends AnyVal {
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
    def setAnotherTypeOfBowerFile(value: String => String): Self = this.set("anotherTypeOfBowerFile", js.Any.fromFunction1(value))
    @scala.inline
    def setTypeOfBowerFile(value: String): Self = this.set("typeOfBowerFile", value.asInstanceOf[js.Any])
  }
  
}

