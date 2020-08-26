package typings.windowsService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends js.Object {
  /**
    * The services display name, defaults to the name parameter
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fully qualified path to the node binary used to run the service (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setNodeArgsVarargs(value: String*): Self = this.set("nodeArgs", js.Array(value :_*))
    @scala.inline
    def setNodeArgs(value: js.Array[String]): Self = this.set("nodeArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeArgs: Self = this.set("nodeArgs", js.undefined)
    @scala.inline
    def setNodePath(value: String): Self = this.set("nodePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePath: Self = this.set("nodePath", js.undefined)
    @scala.inline
    def setProgramArgsVarargs(value: String*): Self = this.set("programArgs", js.Array(value :_*))
    @scala.inline
    def setProgramArgs(value: js.Array[String]): Self = this.set("programArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramArgs: Self = this.set("programArgs", js.undefined)
    @scala.inline
    def setProgramPath(value: String): Self = this.set("programPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramPath: Self = this.set("programPath", js.undefined)
  }
  
}

