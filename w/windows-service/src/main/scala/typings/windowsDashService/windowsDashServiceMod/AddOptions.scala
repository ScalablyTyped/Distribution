package typings.windowsDashService.windowsDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends js.Object {
  /**
    * The services display name, defaults to the name parameter
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The fully qualified path to the node binary used to run the service (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    displayName: String = null,
    nodeArgs: js.Array[String] = null,
    nodePath: String = null,
    programArgs: js.Array[String] = null,
    programPath: String = null
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs)
    if (nodePath != null) __obj.updateDynamic("nodePath")(nodePath)
    if (programArgs != null) __obj.updateDynamic("programArgs")(programArgs)
    if (programPath != null) __obj.updateDynamic("programPath")(programPath)
    __obj.asInstanceOf[AddOptions]
  }
}

