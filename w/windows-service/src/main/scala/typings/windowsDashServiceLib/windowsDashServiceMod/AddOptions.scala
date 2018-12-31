package typings
package windowsDashServiceLib.windowsDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends js.Object {
  /**
    * The services display name, defaults to the name parameter
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The fully qualified path to the node binary used to run the service (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[java.lang.String] = js.undefined
}

