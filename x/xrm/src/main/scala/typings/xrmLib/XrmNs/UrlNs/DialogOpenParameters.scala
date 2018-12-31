package typings
package xrmLib.XrmNs.UrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters of a request to open a dialog with rundialog.aspx (as with
  * window.open).  Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  */
trait DialogOpenParameters extends js.Object {
  /**
    * The unique identifier of the dialog, in Guid format, which is valid for the entity described
    * by: {@link EntityName}
    */
  var DialogId: java.lang.String
  /**
    * The logical name of the entity.
    */
  var EntityName: java.lang.String
  /**
    * The unique identifier for the targeted record.
    */
  var ObjectId: java.lang.String
}

